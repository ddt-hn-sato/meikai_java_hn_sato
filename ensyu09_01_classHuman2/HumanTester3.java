/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_01 p313
 *  演習8-1で作成した《人間クラス》の配列を生成するプログラムを作成せよ。
 *  生成時に要素を初期化するもの、生成後の要素に値を代入するものなど
 *  複数のパターンを作ること。
 *  
 * 回答:
 *  下記ご参照ください。
 *  生成後の要素に値を代入するコードです。
 *  
 *  また、同フォルダ「ensyu09_01_classHuman2」に、Human2クラスファイルがあります。
 *  そちらのプログラムもご参照ください。
 *  
 * パッケージ名:ensyu09_01_classHuman2
 * クラス名: HumanTester3
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_01_classHuman2;

//Scannerクラスをインポート
import java.util.Scanner;

public class HumanTester3 {
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);

		//クラス（の中のコンストラクタ）を用いて、まずインスタンスを生成。
		Human2[] peopleInformation2 = new Human2[3];
		//↓にも交換可能。
		//Human2[] peopleInformation2;
		
		//つぎに生成後の要素に値を代入する
		peopleInformation2 = new Human2[]{
			new Human2("ひな", 155, 45),
			new Human2("ともか", 157, 45),
			new Human2("マイル", 70, 8)
		};
	}
}
