/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題: 演習10_05
 * 	インスタンスが生成されるたびに「明解銀行での口座開設ありがとうございます。」と表示する
 *  ように、銀行口座クラスAccountを変更せよ。表示はインスタンス初期化子で行うこと。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  Accountクラス、Dayクラスも併せて同フォルダに格納しました。
 *  なお、「生成されるたびに」という要件を満たしているか確認のための最低限の要件を
 *  満たすよう、2名の銀行口座を作成し、氏名や残高の入力のプロセスを省きました。
 *  
 * パッケージ名:ensyu10_05
 * クラス名: AccountTester
 * 作成日:2022/12/12
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter10_archive.ensyu10_05;

//Scannerクラスをインポート
import java.util.Scanner;

//AccountTesterクラス
public class AccountTester{
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);	
		
		//年、月、日をそれぞれ入力値から変数へ代入し、一括でインスタンスを生成
		System.out.print("開設年を入力：");
		int firstYear = standardInput.nextInt();
		
		System.out.print("開設月を入力：");
		int firstMonth = standardInput.nextInt();
		
		System.out.print("開設日を入力：");
		int firstDate = standardInput.nextInt();
		
		//インスタンスをDayクラスで生成
		Day firstDay = new Day(firstYear, firstMonth, firstDate);
		
		//佐藤妃納さんの口座をAccountクラスで生成。口座名義_口座番号_預金残高_開設日の順
		Account hinaAccount = new Account("佐藤妃納", "1234567", 3333, firstDay);
		
		//口座開設日
		System.out.println("佐藤妃納さんの口座開設日は、" + firstDay.toString() +"です。");
		
		//見やすさのため改行
		System.out.println();
		
		//年、月、日をそれぞれ入力値から変数へ代入し、一括でインスタンスを生成
		System.out.print("開設年を入力：");
		firstYear = standardInput.nextInt();
		
		System.out.print("開設月を入力：");
		firstMonth = standardInput.nextInt();
		
		System.out.print("開設日を入力：");
		firstDate = standardInput.nextInt();
		
		//インスタンスをDayクラスで生成
		firstDay = new Day(firstYear, firstMonth, firstDate);
		
		//太郎さんの口座をAccountクラスで生成。口座名義_口座番号_預金残高_開設日の順
		Account TaroAccount = new Account("太郎", "1357900", 8888, firstDay);
		
		//口座開設日
		System.out.println("太郎さんの口座開設日は、" + firstDay.toString() +"です。");
		
		//終了
		System.out.println(" - - - 終了 - - - ");
	}
}