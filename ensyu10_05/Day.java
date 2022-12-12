//演習問題10-5で使う用のDayクラス

package workspace0.chapter10_archive.ensyu10_05;

//Dayクラス
public class Day {
	
	//インスタンスの宣言、初期化を行う
	private int firstYear = 1;
	private int firstMonth = 1;
	private int firstDate = 1;
	
	//コンストラクタ
	public Day(int firstYear, int firstMonth, int firstDate ) {
		//yearを初期化
		this.firstYear = firstYear;

		//monthを初期化
		this.firstMonth = firstMonth;

		//dateを初期化
		this.firstDate = firstDate;
	}
	
	// - - - 年月日を取得するメソッド - - -
	public int getYear() {
		//その時点でのyearを返す
		return firstYear;
	}
	public int getMonth() {
		//その時点でのmonthを返す
		return firstMonth;
	}
	public int getDate() {
		//その時点でのdateを返す
		return firstDate;
	}
	
	//曜日を求めるメソッド
	public int dayOfWeek() {
		
		int y = firstYear;
		int m = firstMonth;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + firstDate) % 7;
	}
	
	//文字列表現を返却
	public String toString() {
		String[] wd = {
			"日", "月", "火", "水", "木", "金", "土"
		};
		
		return String.format("%04d年%02d月%02d日(%s)",
				firstYear, firstMonth, firstDate, wd[dayOfWeek()]);
	}
	
}