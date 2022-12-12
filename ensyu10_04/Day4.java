/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10_04 p357
 *  日付クラス第4版を以下のように改良せよ。
 *  
 *  ●引数を受け取らないコンストラクタによるインスタンスの生成時は、
 *  　西暦１年１月１日で初期化するのではなく、プログラム実行時の日付で初期化する。
 *  ●引数を受け取るコンストラクタに不正な値が指定された場合は、適当な値に調整する
 *  　（たとえば１３月が指定されたときは１２月とする。
 *  　　９月３１日と指定された場合は９月３０日とする。）。
 *  
 *  さらに、以下に示すメソッドを追加すること：
 *  
 *  ★①年内での経過日数（その年の元旦から数えて何日目であるか）を求めるメソッド、
 *  ・年内の残り日数を求めるメソッド、
 *  ・他の日付との前後関係（より）前の日付か / 同じ日付か / より後ろの日付か）を判定する
 *  　インスタンスメソッド、
 *  ★②２つの日付の前後関係を判定するメソッド、
 *  ★③日付を１つ後ろに進めるメソッド（日付が2012年12月31日であれば、2013年1月1日に更新）、
 *  ・次の日の日付を返却するメソッド、
 *  ・日付を１つ前の戻すメソッド、
 *  ・日付をn日前に戻すメソッド、n日前の日付を返却するメソッド… etc.
 *  
 * 回答:
 *  下記をご参照ください。
 *  なお、本社で竹本さんと相談させていただき、研修の進捗・他研修スケジュール等との
 *  兼ね合いから、★のついたメソッド３つのみを実装しました。
 *  
 * パッケージ名:ensyu10_04
 * クラス名: Day4
 * 作成日:2022/12/12
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter10_archive.ensyu10_04;

//GregorianCalendarクラスをインポート
import static java.util.Calendar.*;

import java.util.GregorianCalendar;
//Scannerクラスをインポート
import java.util.Scanner;

//Day4クラス
public class Day4{

	//Scannerクラスの変数を作成
	static Scanner standardInput = new Scanner(System.in);
	//GregorianCalendarクラスの変数を作成
	static GregorianCalendar today = new GregorianCalendar();
	
	//各変数を宣言
	private int yearInput;
	private int monthInput;
	private int dateInput;
	
	// - - - コンストラクタ
	//●引数を受け取らないコンストラクタによるインスタンスの生成時は、
	//  西暦１年１月１日で初期化するのではなく、プログラム実行時の日付で初期化する。
	//public Day4(int year, int month, int date) {
	public Day4(int year, int month, int date) {
		//プログラム実行時の日付で初期化
		this.yearInput = today.get(YEAR);
		this.monthInput = today.get(MONTH) + 1;
		this.dateInput = today.get(DATE);
		
		//不正な値があった際は、代入によって修正（初期化しなおすイメージ）
		//不正な値:◎年月日→1未満の年月日
		//　　　　 ◎年　　→今年より後
		//　　　　 ◎日にち→その月の日数より大きい日にち（うるう年の2月も検討）
		
		//　　　　 ◎月　　→13より大
		//◎年月日
		if ( year < 1 )  this.yearInput = 1;
		if ( month < 1 ) this.monthInput = 1;
		if ( date < 1 )  this.dateInput = 1;
		
		//◎年
		if ( year > 2022 ) this.yearInput = 2022;	

		//◎日にち
		//うるう年でないのに2月に28日より大きい値が入力された場合
		if ( month == 2 && date > 28 && !(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ) {
			this.dateInput = 28;
		}
		//monthが1,3,5,7,8,10,12ならdateが31より大きいと不正
		if ( date > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) )
			this.dateInput = 31;
		//monthが4,6,9,11ならdateが30より大きいと不正
		if ( date > 30 && (month == 4 || month == 6 || month == 9 || month == 11))
			this.dateInput = 30;		
		//うるう年の2月なら、dateが29より大きいと不正
		if ( month == 2 && date > 29 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ) {
			this.dateInput = 29;
		}
	}
	
	// - - - ★①年内での経過日数（その年の元旦から数えて何日目であるか）を求めるメソッド
	//       つまり、(入力値)年1月1日から、同年(入力値)月(入力値)日までの日数を数えるメソッド
	public static long countDays(int year, int month, int date) {
		
		//返却する値を宣言、初期化する
		long daysCount = 0;
		
		//日付の変数を作成_打ち間違いをなくすため
		int days28 = 28;
		int days29 = 29;
		int days30 = 30;
		int days31 = 31;
		
		//メモ：うるう年の、各月の日数をメモ。ある月が、何日まであるか。
		//1 31, 2 29(平年28), 3 31, 4 30, 5 31, 6 30, 7 31, 8 31, 9 30, 10 31, 11 30, 12 31。
		
		//1/1から、2月末日までの変数を作成
		int JanEnd = days31;
		int FebEnd = days31 + days28;
		int irregularFebEnd = days31 + days29;
		
		//3/1から、3月以降12月末日までの変数を作成
		int MarToMarEnd = days31;
		int MarToAprEnd = MarToMarEnd + days30;
		int MarToMayEnd = MarToAprEnd + days31;
		int MarToJunEnd = MarToMayEnd + days30;
		int MarToJulEnd = MarToJunEnd + days31;
		int MarToAugEnd = MarToJulEnd + days31;
		int MarToSepEnd = MarToAugEnd + days30;
		int MarToOctEnd = MarToSepEnd + days31;
		int MarToNovEnd = MarToOctEnd + days30;
		int MarToDecEnd = MarToNovEnd + days31;
		
		//この年がうるう年かどうかで場合分け
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			
			//monthの前月までの日数と、今月の日数を、たす
			if (month == 2) {
				//＋前月までの日数＋今月の日数
				daysCount += JanEnd + date; 
			} else if (month == 3) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + date; 
			} else if (month == 4) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToMarEnd + date;
			} else if (month == 5) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToAprEnd + date;
			} else if (month == 6) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToMayEnd + date;
			} else if (month == 7) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToJunEnd + date;
			} else if (month == 8) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToJulEnd + date;
			} else if (month == 9) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToAugEnd + date;
			} else if (month == 10) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToSepEnd + date;
			} else if (month == 11) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToOctEnd + date;
			} else if (month == 12) {
				//＋前月までの日数＋今月の日数
				daysCount += irregularFebEnd + MarToNovEnd + date;
			} else if (month == 1) {
				//＋今月の日数
				daysCount += date; 
			}
			
		} else {
			//monthの前月までの日数と、今月の日数を、たす
			if (month == 2) {
				//＋前月までの日数＋今月の日数
				daysCount += JanEnd + date; 
			} else if (month == 3) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + date; 
			} else if (month == 4) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToMarEnd + date;
			} else if (month == 5) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToAprEnd + date;
			} else if (month == 6) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToMayEnd + date;
			} else if (month == 7) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToJunEnd + date;
			} else if (month == 8) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToJulEnd + date;
			} else if (month == 9) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToAugEnd + date;
			} else if (month == 10) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToSepEnd + date;
			} else if (month == 11) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToOctEnd + date;
			} else if (month == 12) {
				//＋前月までの日数＋今月の日数
				daysCount += FebEnd + MarToNovEnd + date;
			} else if (month == 1) {
				//＋今月の日数
				daysCount += date; 
			}
		}
		
		return daysCount;
	}
	
	// - - - ★②２つの日付の前後関係を判定するメソッド
	public static void whichLater( int year, int month, int date, int year2, int month2, int date2 ) {
		//返す変数をおく
		//int dayLaterer = dayA;
		
		if ( year > year2 ) {
			//year, ...のほうがあと
			System.out.println("1つ目の日付のほうがあとです。");
		} else if ( year2 > year ) {
			//year2, ...のほうがあと
			System.out.println("2つ目の日付のほうがあとです。");
		} else {
			if (countDays(year, month, date) > countDays(year2, month2, date2)) {
				//year, ...のほうがあと
				System.out.println("1つ目の日付のほうがあとです。");
			} else if (countDays(year, month, date) < countDays(year2, month2, date2)){
				//year2, ...のほうがあと
				System.out.println("2つ目の日付のほうがあとです。");
			} else {
				System.out.println("1つ目の日付と、2つ目の日付は同じです。");
			}
		}
	}
	
	// - - - ★③日付を１つ後ろに進めるメソッド
	//        （日付が2012年12月31日であれば、2013年1月1日に更新)
	public static void crossDate(int year, int month, int date) {
		
		//まず日にちを1日進める
		date++;
		
		//うるう年でないのに2月に28日より大きい値が入力された場合
		if ( month == 2 && date > 28 && !(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ) {
			//monthを3月にして、dateを1にする
			month = 3; //インクリメントでもよいが煩雑なので明示的に3を代入する
			date = 1;
			
		//monthが1,3,5,7,8,10,12ならdateが31より大きいと不正
		} else if ( date > 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
			//monthをインクリメントして、dateを1にする
			month++;
			date = 1;
			
			//この状態だと、●年13月1日が紛れているので
			if ( month > 12 ) {
				//yearを+1し(●+1)年、monthを1月にする（来年の1/1にする）
				year++;
				month = 1;
			}
			
		//monthが4,6,9,11ならdateが30より大きいと不正
		} else if ( date > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
			//うるう年の2月なら、dateが29より大きいときに不正
			if ( month == 2 && date > 29 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ) {
				//monthを3月にして、dateを1にする
				month = 3; //インクリメントでもよいが煩雑なので明示的に3を代入する
				date = 1;
			}
		}
		
		//
		System.out.println(year + "年" + month + "月" + date + "日になります。");
	}
	
	public static void main(String args[]) {
	//ここからメインメソッド
		
		//year, month, dateの入力を促す
		System.out.print("year：");
		int year = standardInput.nextInt();
		System.out.print("month：");
		int month = standardInput.nextInt();
		System.out.print("date：");
		int date = standardInput.nextInt();
		
		//インスタンス化する
		Day4 inputDate = new Day4(year, month, date);
		
		//★①年内での経過日数（その年の元旦から数えて何日目であるか）を求める
		System.out.println("年内での経過日数：" + inputDate.countDays( year, month, date ));
		
		//２つ目の年月日year2, month2, date2の入力を促す
		System.out.print("year2：");
		int year2 = standardInput.nextInt();
		System.out.print("month2：");
		int month2 = standardInput.nextInt();
		System.out.print("date2：");
		int date2 = standardInput.nextInt();
		
		//インスタンス化する
		Day4 inputDate2 = new Day4(year2, month2, date2);
		
		//★②２つの日付の前後関係を判定する
		whichLater( year, month, date, year2, month2, date2 );
		
		//★③日付を１つ後ろに進める（日付が2012年12月31日であれば、2013年1月1日に更新）
		System.out.print("2つ目の日付を1つ後ろに進めると→");
		crossDate( year2, month2, date2 );
	}
}
