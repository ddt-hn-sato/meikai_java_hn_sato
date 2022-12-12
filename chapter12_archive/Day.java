//自動車クラスCar 第2版 (p.324) 用のDayクラス

package workspace0.chapter12_archive;

//Dayクラス
public class Day {
	
	//インスタンスの宣言、初期化を行う
	private int year = 1;
	private int month = 1;
	private int date = 1;
	
	//yearだけ入力されたとき
	public Day(int year) {
	
		//yearのみその入力値を代入するコンストラクタ
		this.year = year;
	}
	
	//year, monthだけ入力されたとき
	public Day(int year, int month) {
		
		//yearとmonthのみ、その入力値を代入するコンストラクタ
		//なお、yearの代入にはひとつ上のコンストラクタを呼び出して使う
		this(year);
		this.month = month;
	}
	
	//year, month, dateが入力されたとき
	public Day(int year, int month, int date) {
		
		//yearとmonthとdateに、その入力値を代入するコンストラクタ
		//なお、yearとmonthの代入にはひとつ上のコンストラクタを呼び出して使う
		this(year, month);
		this.date = date;
	}
	
	//Day型の値が入力されたら
	public Day(Day d) {
		//その年月日で初期化
		this(d.year, d.month, d.date);
	}
	
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
	
	//文字列表現を返却
	public String toString() {
		String[] wd = {
			"日", "月", "火", "水", "木", "金", "土"
		};
		
		return String.format("%04d年%02d月%02d日(%s)",
				year, month, date, wd[dayOfWeek()]);
	}
	
}