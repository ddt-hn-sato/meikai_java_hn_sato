/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12_02 P.415
 * 	定期預金付き銀行口座クラス型変数 a, b の普通預金と定期預金残高の
 *  合計額を比較した結果を返却するメソッド compBalance を作成せよ。
 *  
 *  	static int comBalance(Account a, Account b)
 *  
 *  合計額を比較して、a のほうが多ければ 1、等しければ 0、b のほうが多ければ -1 を
 *  返却すること。もし a や b の参照先が、定期預金を持たないAccount型のインスタンスで
 *  あれば、普通預金の金額を比較の対象とすること。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu12_02
 * クラス名: Account
 * 作成日:2022/12/13
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter12_archive;

//Accountクラス
public class Account {
	
	// - - - インスタンスを生成
	//口座名義
	private String accountName;
	//預金残高
	private long balance;
	
	//インスタンス初期化子で挨拶文を表示（コンストラクタの使用のたびに表示するため）
	{
		System.out.println( "明解銀行での口座開設ありがとうございます。");
	}
	
	// - - - コンストラクタ
	public Account(String accountName, long balance){
		//口座名義
		this.accountName = accountName;
		//預金残高
		this.balance = balance;
	}
	
	// - - - メソッド
	//口座名義を調べるメソッド
	String getAccountName() {
		//accountNameを返却
		return accountName;
	}
	
	//預金残高を調べるメソッド
	long getBalance() {
		//balanceを返却
		return balance;
	}
}