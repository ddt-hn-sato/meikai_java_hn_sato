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

//Scannerクラスをインポート
import java.util.Scanner;

//TimeAccountTesterクラス
public class TimeAccountTester {
	
	//本ファイル下部のif文の、どの条件分岐でもつかえるように、TimeAccount型, Account型の変数をフィールド変数でおく
	private static TimeAccount firstTimeAccount;
	private static Account firstAccount;
	private static TimeAccount secondTimeAccount;
	private static Account secondAccount;
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);	
		
		//定期預金残高の変数を宣言する。以下のコードでa, bが、定期預金残高を入力する、しないに関わらず
		//代入を可能にするため、if文の外で宣言する
		long timeBalance;
		
		//- - - a名義の口座を開設
		
		//口座名義の入力を促す。今回は問題のため"a"と入力指定
		System.out.print("口座名義を入力（aと入力する）:");
		//入力値を変数へ代入
		String accountName = standardInput.next();
		
		//普通預金残高の入力を促す
		System.out.print("普通預金残高を入力：");
		//入力値を変数へ代入
		long balance = standardInput.nextLong();
		
		//定期預金の残高を入力するかどうか入力させる
		System.out.print("定期預金の残高を入力しますか？[Yes:1, No:0]:");
		//入力値を変数へ代入
		int yesNo = standardInput.nextInt();
		
		//定期預金の残高を入力するならば、
		if(yesNo == 1) {
		
			//定期預金残高の入力を促す
			System.out.print("定期預金残高を入力：");
			//入力値を変数へ代入
			timeBalance = standardInput.nextLong();
			
			//変数firstTimeAccountへ代入するインスタンスを、TimeAccountクラスで生成。口座名義_普通預金残高_定期預金残高の順
			firstTimeAccount = new TimeAccount(accountName, balance, timeBalance);
		
		//定期預金の残高を入力しないならば、	
		} else if (yesNo == 0) {
		
			//変数firstAccountへ代入するインスタンスを、Accountクラスで生成。口座名義_普通預金残高の順
			firstAccount = new Account(accountName, balance);
		}
		
		//- - - b名義の口座を開設
		
		//口座名義の入力を促す。今回は問題のため"b"と入力指定
		System.out.print("口座名義を入力（bと入力する）:");
		//入力値を変数へ代入
		accountName = standardInput.next();
		
		//普通預金残高の入力を促す
		System.out.print("普通預金残高を入力：");
		//入力値を変数へ代入
		balance = standardInput.nextLong();
		
		//定期預金残高を入力するかどうか、という変数の値がそのままなので
		//定期預金の残高を入力するならば、
		if(yesNo == 1) {

			//定期預金残高の入力を促す
			System.out.print("定期預金残高を入力：");
			//入力値を変数へ代入
			timeBalance = standardInput.nextLong();
			
			//変数secondTimeAccountへ代入するインスタンスを、TimeAccountクラスで生成。口座名義_普通預金残高_定期預金残高の順
			secondTimeAccount = new TimeAccount(accountName, balance, timeBalance);
			
			//- - - a, bの預金額合計を比較する。
			//a, b をTimeAccountクラスでインスタンス化した場合（普通預金＋定期預金）
			System.out.println("↓a, bの預金額合計を比較したとき、a のほうが多ければ 1、等しければ 0、b のほうが多ければ -1 を"
					+ "返します。\n" + firstTimeAccount.compBalance(firstTimeAccount, secondTimeAccount));
		
		//定期預金の残高を入力しないならば、
		} else if (yesNo == 0) {
			
			//変数secondAccountへ代入するインスタンスを、Accountクラスで生成。口座名義_普通預金残高の順
			secondAccount = new Account(accountName, balance);
			
			//- - - a, bの預金額合計を比較する。
			//a, b をAccountクラスでインスタンス化した場合（普通預金のみ）
			System.out.println("↓a, bの普通預金額を比較したとき、a のほうが多ければ 1、等しければ 0、b のほうが多ければ -1 を"
					+ "返します。\n" + firstTimeAccount.compBalance(firstAccount, secondAccount));
		}
	}
}