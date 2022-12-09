/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_04 p329
 *  演習8-1で作成した《人間クラス》に、誕生日のフィールドと
 *  toStringメソッドを追加せよ。
 *  ※コンストラクタを変更したり、誕生日のゲッタなどのメソッドを追加したりすること。
 *  
 * 回答:
 *  同フォルダに、演習問題09_04に関するHuman2クラス、Dayクラスのファイルがあります。
 *  そちらのプログラムも併せてご参照ください。
 *  
 * パッケージ名:ensyu09_04_classHuman3
 * クラス名: HumanTester4
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_04_classHuman3;

//Scannerクラスをインポート
import java.util.Scanner;

import workspace0.chapter09_archive.ensyu09_03_classAccount.Day;

public class HumanTester4 {
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//年、月、日をそれぞれ入力値から変数へ代入し、一括でインスタンスを生成
		System.out.print("誕生年を入力：");
		int firstYear = standardInput.nextInt();
		
		System.out.print("誕生月を入力：");
		int firstMonth = standardInput.nextInt();
		
		System.out.print("誕生日を入力：");
		int firstDate = standardInput.nextInt();
		
		//インスタンスをDayクラスで生成
		Day birthDay = new Day(firstYear, firstMonth, firstDate);
		
		//佐藤妃納さんの誕生日をクラスで生成_名前_身長_体重_誕生日の順
		Human2 hinaBirthday = new Human2("佐藤妃納", 155 , 45 , birthDay);
		
		//誕生日
		System.out.println(birthDay.toString());
		
		//終了
		System.out.println("終了");


	}
}
