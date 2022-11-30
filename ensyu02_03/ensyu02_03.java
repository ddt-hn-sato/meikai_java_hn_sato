/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-3 p.40
 * 	右に示すように、キーボードから読み込んだ整数値を
 *  そのまま反復して表示するプログラムを作成せよ。(右図省略)
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu2_3
 * クラス名:ensyu2_3
 * 作成日:2022/11/2
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */
package ensyu02_03;

import java.util.Scanner;

public class ensyu02_03 {

	public static void main(String[] args) {

		//キーボードへ入力された値を読み込む
		Scanner stdIn = new Scanner(System.in);

		//Scannerクラスが取り込んだ値をInt型と宣言する
		System.out.print("整数値を入力し、Enter：");
		int a = stdIn.nextInt();

		//1つ上の行で代入された値を、そのまま反復して表示させる
		System.out.println(a + "と入力しましたね。");
	}

}