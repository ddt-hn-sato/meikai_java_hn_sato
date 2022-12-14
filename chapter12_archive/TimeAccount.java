/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12_02 P.415
 * 	定期預金付き銀行口座クラス型(TimeAccount型)変数 a, b の普通預金と定期預金残高の
 *  合計額を比較した結果を、返却するメソッド compBalance を作成せよ。
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

//TimeAccountクラス
public class TimeAccount extends Account{
	
	//★定期預金残高
	private long timeBalance;
	
	// - - - コンストラクタ
	TimeAccount(String accountName, long balance, long timeBalance){
		//継承
		super( accountName, balance);
		//★定期預金残高
		this.timeBalance = timeBalance;
	}
	
	// - - - メソッド
	//口座名義を調べるメソッドを、Accountクラスから継承したメソッド
	@Override String getAccountName() {
		
		//スーパークラスであるAccountで生成したaccountNameのインスタンスを
		//参照したいので、Accountクラスから継承
		return super.getAccountName();
	}

	//預金残高を調べるメソッドを、Accountクラスから継承したメソッド
	@Override long getBalance() {	

		//スーパークラスであるAccountで生成したbalanceのインスタンスを
		//参照したいので、Accountクラスから継承
		return super.getBalance();
	}
	
	//★定期預金残高を調べるメソッド
	long getTimeBalance() {	
		
		//定期預金残高を返却
		return timeBalance;
	}

	//変数 a, b の普通預金と定期預金残高の合計額を比較した結果、
	// a のほうが多ければ 1、等しければ 0、b のほうが多ければ -1 を返却するメソッド compBalance 
	int compBalance(TimeAccount a, TimeAccount b) {

		//返却値を宣言する。1,0,-1のどれとも被らない任意の整数値
		int whichBigger = -2;
		
		//このメソッドでは、a や b の参照先は、普通預金と定期預金を持つTimeAccount型のインスタンスなので
		//普通預金と定期預金の合計金額を比較の対象とする。
		
		if (a.getBalance() + a.getTimeBalance() > b.getBalance() + b.getTimeBalance() ) {
			//返却値に結果を代入する
			whichBigger = 1;
		} else if (a.getBalance() + a.getTimeBalance() == b.getBalance() + b.getTimeBalance() ) {
			//返却値に結果を代入する
			whichBigger = 0;
		} else if (a.getBalance() + a.getTimeBalance() < b.getBalance() + b.getTimeBalance() ) {
			//返却値に結果を代入する
			whichBigger = -1;
		}
		
		//返却する
		return whichBigger;
	}
	
	//変数 a, b の普通預金を比較した結果、
	// a のほうが多ければ 1、等しければ 0、b のほうが多ければ -1 を返却するメソッド compBalance 
	int compBalance(Account a, Account b) {

		//返却値を宣言する。1,0,-1のどれとも被らない任意の整数値
		int whichBigger = -2;
		
		//このメソッドでは、a や b の参照先は、定期預金を持たないAccount型のインスタンスなので
		//普通預金の金額を比較の対象とする。
		
		if ( a.getBalance() > b.getBalance() ) {
			//返却値に結果を代入する
			whichBigger = 1;
		} else if ( a.getBalance() == b.getBalance() ) {
			//返却値に結果を代入する
			whichBigger = 0;
		} else if ( a.getBalance() < b.getBalance() ) {
			//返却値に結果を代入する
			whichBigger = -1;
		}
		
		//返却する
		return whichBigger;
	}
}