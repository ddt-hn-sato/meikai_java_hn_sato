/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_04 p329
 *  演習8-1で作成した《人間クラス》に、誕生日のフィールドと
 *  toStringメソッドを追加せよ。
 *  ※コンストラクタを変更したり、誕生日のゲッタなどのメソッドを追加したりすること。
 *  
 * 回答:
 *  同フォルダに、演習問題09_04に関する、HumanTester4クラス, Humanクラスのファイルがあります。
 *  そちらのプログラムも併せてご参照ください。
 *  
 * パッケージ名:ensyu09_04_classHuman3
 * クラス名: Day
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_04_classHuman3;

//Dayクラス
public class Day {
	
	//インスタンスの宣言、初期化を行う
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	//①year, month, dateがカラであれば、代入（上で初期化はされてるので）を行わない、
	//というコンストラクタ
	public Day() {
		
	}
	
	//②yearだけ入力されたとき
	public Day(int year) {
	
		//yearのみその入力値を代入するコンストラクタ
		this.year = year;
	}
	
	//③year, monthだけ入力されたとき
	public Day(int year, int month) {
		
		//yearとmonthのみ、その入力値を代入するコンストラクタ
		//なお、yearの代入にはひとつ上のコンストラクタを呼び出して使う
		this(year);
		this.month = month;
	}
	
	//④year, month, dateが入力されたとき
	public Day(int year, int month, int date) {
		
		//yearとmonthとdateに、その入力値を代入するコンストラクタ
		//なお、yearとmonthの代入にはひとつ上のコンストラクタを呼び出して使う
		this(year, month);
		this.date = date;
	}
	
	//⑤すでに別の年月日が生成されており、year, month, dateが入力されているとき
	//比較するコンストラクタ
	public Day(Day d) {
		this(d.year, d.month, d.date);
	};
	
	// - - - 年月日を取得するメソッド - - -
	public int getYear() {
		//その時点でのyearを返す
		return year;
	}
	public int getMonth() {
		//その時点でのmonthを返す
		return month;
	}
	public int getDate() {
		//その時点でのdateを返す
		return date;
	}
	
	// - - - 年月日を1つずつ代入するメソッド - - -
	public void setYear(int year) {
		//yearを初期化
		this.year = year;
	}
	public void setMonth(int month) {
		//monthを初期化
		this.month = month;
	}
	public void setDate(int date) {
		//dateを初期化
		this.date = date;
	}
	
	// - - - 年月日を3つ一度に代入するメソッド - - -
	public void set(int year, int month, int date) {
		
		//this.year = year;
		setYear(year);
		//this.month = month;
		setMonth(month);
		//this.date = date;
		setDate(date);
	}
	
	//曜日を求めるメソッド
	public int dayOfWeek() {
		
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	//日付Dと等しいかどうか
	public boolean equalTo(Day d) {
		
		return year == d.year && month == d.month && date == d.date;
	}
	
	//文字列表現を返却
	public String toString() {
		String[] wd = {
			"日", "月", "火", "水", "木", "金", "土"
		};
		
		return String.format("%04d年%02d月%02d日(%s)",
				year, month, date, wd[dayOfWeek()]);
	}
	
}