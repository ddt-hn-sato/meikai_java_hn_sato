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
 *  同フォルダに、Accountのクラスのファイルもあります。
 *  そちらのプログラムも、併せてご参照ください。
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

//Scannerクラスをインポート
import java.util.Scanner;

//AccountTesterクラス
public class AccountTester{
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);	
		
		//年、月、日をそれぞれ入力値から変数へ代入し、一括でインスタンスを生成
		System.out.print("年を入力：");
		int firstYear = standardInput.nextInt();
		
		System.out.print("月を入力：");
		int firstMonth = standardInput.nextInt();
		
		System.out.print("日を入力：");
		int firstDate = standardInput.nextInt();
		
		//インスタンスをDayクラスで生成
		Day firstDay = new Day(firstYear, firstMonth, firstDate);
		
		//佐藤妃納さんの口座をAccountクラスで生成_口座名義_口座番号_預金残高_開設日の順
		Account hinaAccount = new Account("佐藤妃納", "1234567", 3333, firstDay);
		
		//口座開設日
		System.out.println(firstDay.toString());
		
		//終了
		System.out.println("終了");
	}
}