/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_03 p329
 *  第８章で作成した銀行口座クラス（第2版）に、口座開設日のフィールドと
 *  toStringメソッドを追加せよ。
 *  ※コンストラクタを変更したり、口座開設日のゲッタ（口座開設日フィールドが参照する、
 *  日付インスタンスのコピーを返す）などのメソッドを追加したりすること。
 *  
 * 回答:
 *  同フォルダに、AccountTesterのクラスのファイルもあります。
 *  そちらのプログラムも併せてご参照ください。
 *  
 * パッケージ名:ensyu09_03_classAccount
 * クラス名: Account, AccountTester
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_03_classAccount;

//Accountクラス
public class Account {
	
	// - - - インスタンスを生成
	//口座名義
	private String accountName;
	//口座番号
	private String accountNumber;
	//預金残高
	private long balance;
	//口座開設年
	private int firstYear;
	//口座開設月
	private int firstMonth;
	//口座開設日
	private int firstDate;
	//★口座開設日
	private Day firstDay;
	
	// - - - コンストラクタ //★Day firstDayを追記
	public Account(String accountName, String accountNumber, long balance, Day firstDay){
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		//★口座開設日の初期化を追記
		//AccountTesterクラスで、Dayクラスを用いて作成したインスタンスへの、参照を代入
		this.firstDay = firstDay;
	}
	
	// - - - メソッド
	//口座名義を調べるメソッド
	String getAccountName() {
		return accountName;
	}
	
	//口座番号を調べるメソッド
	String getNo() {
		return accountNumber;
	}
	
	//預金残高を調べるメソッド
	long getBalance() {
		return balance;
	}
	
	//★口座開設日を調べるメソッド
	//日付インスタンス
	Day getFirstDay() {
		//日付インスタンスへの参照をコピー
		firstDay = new Day(firstYear, firstMonth, firstDate);
		//そのコピーを返却
		return firstDay;
	}
	
	//★曜日を求めるメソッド
	public int dayOfWeek() {
		
		int y = firstYear;
		int m = firstMonth;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + firstDate) % 7;
	}
	
	//★（口座開設日の）文字列表現を返却するメソッド
	public String toString() {
		String[] wd = {
			"日", "月", "火", "水", "木", "金", "土"
		};
		
		return String.format("%04d年%02d月%02d日(%s)",
				firstYear, firstMonth, firstDate, wd[dayOfWeek()]);
	}
	
	//moneyMoving円預けるメソッド
	void deposit(long moneyMoving) {
		balance += moneyMoving;
	}
	
	//moneyMoving円おろすメソッド
	void withdraw(long moneyMoving) {
		balance -= moneyMoving;
	}
}