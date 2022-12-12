/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10_05
 * 	インスタンスが生成されるたびに「明解銀行での口座開設ありがとうございます。」と表示する
 *  ように、銀行口座クラスAccountを変更せよ。表示はインスタンス初期化子で行うこと。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu10_05
 * クラス名: Account
 * 作成日:2022/12/12
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter10_archive.ensyu10_05;

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
	//口座開設日
	private Day firstDay;
	
	//★インスタンス初期化子で挨拶文を表示（コンストラクタの使用のたびに表示するため）
	{
		System.out.println("明解銀行での口座開設ありがとうございます。");
	}
	
	// - - - コンストラクタ
	public Account(String accountName, String accountNumber, long balance, Day firstDay){
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
		//口座開設日
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
	
	//口座開設日を調べるメソッド
	//日付インスタンス
	Day getFirstDay() {
		//日付インスタンスへの参照をコピー
		firstDay = new Day(firstYear, firstMonth, firstDate);
		//そのコピーを返却
		return firstDay;
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
	
	//文字列表現を返却するメソッド（口座開設日の表現に使う）
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