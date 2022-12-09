/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_05 p330
 *  開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
 *  フィールドは以下のようになる。
 *  	
 *  	class Period {
 *  		private Day from; //開始日
 *  		private Day to;   //終了日
 *  	}
 *  
 *  コンストラクタやメソッドを自由に定義すること。
 *  
 * 回答:
 *  下記ご参照ください。
 *  
 * パッケージ名:ensyu09_05_classPeriod
 * クラス名: Day
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_05_classPeriod;

//Dayクラス
public class Day {
	
	// - - - - - インスタンスの宣言を行う
	//開始日の年・月・日
	private int yearFrom = 0;
	private int monthFrom = 0;
	private int dateFrom = 0;
	
	//終了日の年・月・日
	private int yearTo = 0;
	private int monthTo = 0;
	private int dateTo = 0;
	
	//0年からの日数をint型で表すときに使う変数. 開始日の年月日を数値にしたもので初期化
	private int daysCounter = countDays(yearTo, monthTo, dateTo);
	
	// - - - - - コンストラクタ
	
	//year, month, dateがnewされたときに、各インスタンスをDayクラスの中に確保するコンストラクタ
	public Day(int year, int month, int date) {

	}

	//year, month, dateが入力されたときに、
	public Day(int yearFrom, int monthFrom, int dateFrom, int yearTo, int monthTo, int dateTo) {
		
		//各インスタンスを初期化するコンストラクタ
		this.yearFrom = yearFrom;
		this.monthFrom = monthFrom;
		this.dateFrom = dateFrom;
		this.yearTo = yearTo;
		this.monthTo = monthTo;
		this.dateTo = dateTo;
	}
	
	// - - - - - メソッド
	// - - - 曜日を求めるメソッド
	public int dayOfWeek(int year, int month, int date) {
		
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	// - - - 文字列表現を返却
	public String toString(int year, int month, int date) {
		String[] wd = {
			"日", "月", "火", "水", "木", "金", "土"
		};
		
		return String.format("%04d年%02d月%02d日(%s)",
				year, month, date, wd[dayOfWeek(year, month, date)]);
	}
	
	// - - - 1年1月1日から日数を数えるメソッド
	public int countDays(int year, int month, int date) {
		
		//返却する値を宣言、初期化する
		int daysCount = 0;
		
		//日付の変数を作成_打ち間違いをなくすため
		int days28 = 28;
		int days29 = 29;
		int days30 = 30;
		int days31 = 31;
		
		//メモ：うるう年を含め、4年で1461日
		//　　　うるう年を抜いたら3年で1095日
		//まずはyear年の前の年12/31までの合計値
		daysCount += ((year - 4) / 4)*(365*3 + 366) + (365*3);
		//●月が何日あるかメモ
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
		if (year % 4 == 0) {
			
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
	
}