/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_08 P.501
 *  コマンドライン引数で指定された月のカレンダーを表示するプログラムを作成せよ。
 *  コマンドラインから年のみが与えられた場合は、その年の1月から12月までのカレンダーを表示して、
 *  年と月が与えられた場合は、その月のカレンダーを表示して、年も月も与えられなかったら、現在の月のカレンダーを表示すること。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu15_08
 * クラス名: ensyu15_08
 * 作成日:2022/12/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter15_archive;

//Calendarクラスをインポート
import java.util.Calendar;
//スキャナクラスをインポート
import java.util.Scanner;

class ensyu15_08{
	
	
	
	// - - - メソッド群
	//月～日の文字列を表示するメソッド
	public static void JapaneseDayname() {
		
		//表示する
		System.out.println("\n   日   月   火   水   木   金   土");
	}
	
	//1日の曜日を求めるメソッド（描画に用いるため）→教本にあったロジック
	public static int dayOfWeek(int year, int month) {
		//1日の曜日を求めるのでdateにはあらかじめ1を入れる
		int date = 1;
		
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
		//returnが 0 = 日曜日, ・・・6 = 土曜日
	}
	
	//年と月が与えられた場合、その月のカレンダーを表示するメソッド
	public static void ShowCalendar(int year, int month) {

		//年と月を表示
		System.out.println("\n - - - - - - " + year + "年 " + month + "月 - - - - - -");
		//1行目を表示
		JapaneseDayname();
		
		//- - - dayOfWeek()の返り値に応じて1行目に、「1」の前までのスペースを表示
		//スペース表示するループ
		for (int i = 0; i < dayOfWeek(year, month) * 5; i++) {
			System.out.print(' ');
		}
		
		//Calendarクラスでオブジェクトを生成
		Calendar lastDay = Calendar.getInstance();

		//月末までの日にちを表示するための変数を宣言
		int s = 7 - dayOfWeek(year, month); //改行のタイミングを決める変数
		int u = 0; //1からその月の末日まで1ずつインクリメントする、日にちの変数
		
		for(u = 1; u <= lastDay.getActualMaximum(Calendar.DAY_OF_MONTH); s = 7) {
			//1以降月末までの日にちを表示
			for (; s > 0; s--, u++) {
				System.out.printf("%5d", u);
			}
			//1行表示したら改行
			System.out.println();
		}
	}
	
	//年のみが与えられた場合、その年の1月から12月までのカレンダーを表示するメソッド
	public static void ShowCalendar(int year) {
		
		for (int month = 1; month <= 12;month++) {
			//月のカレンダーを表示するメソッドを呼ぶ
			ShowCalendar(year, month);
		}
		
	}
	
	//年も月も与えられなかった場合、現在の月のカレンダーを表示するメソッド
	public static void ShowCalendar() {
		
		//Calendarクラスでオブジェクトを生成
		Calendar today = Calendar.getInstance();
		//現在の日付を取得し、表示
		System.out.println("¥n - - - - - - - " + today.get(Calendar.MONTH) + "月 - - - - - - - -");
		//1行目を表示
		JapaneseDayname();
	}
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//コマンドラインから年や月が入力されるのを、配列の値として格納
		//parseIntメソッドはクラスメソッドなのでクラス名からアクセスし取得
		
		//年を入力するかどうか
		System.out.print("コマンドライン引数で、年を指定しましたか？ [ YES = 1, NO = 0 ]");
		//変数に値を代入
		int yesNo = standardInput.nextInt();

		if (yesNo == 1) {
			//入力する場合、年をコマンドライン引数から取得
			int year = Integer.parseInt(args[0]);
		
			//月を入力するかどうか
			System.out.print("コマンドライン引数で、月を指定しましたか？ [ YES = 1, NO = 0 ]");
			//変数に値を代入
			yesNo = standardInput.nextInt();

			if (yesNo == 1) {
				//入力する場合、月をコマンドライン引数から取得
				int month = Integer.parseInt(args[1]);
				
				//その月のカレンダーを表示する
				System.out.println("その月のカレンダーを表示します。");	
				ShowCalendar(year, month);
				
			} else {
			
			//年のみが与えられた場合、その年の1月から12月までのカレンダーを表示する
			System.out.println("その年のカレンダーを表示します。");	
			ShowCalendar(year);
			}
		
		} else {
				
			//年も月も与えられなかった場合(年を与えないと自動的にここへ)
			
			//現在の月のカレンダーを表示する
			System.out.println("現在の月のカレンダーを表示します。\n");		
			ShowCalendar();
		}
		
		//終了表示
		System.out.println("          - - - 終了 - - -          ");
	}
}