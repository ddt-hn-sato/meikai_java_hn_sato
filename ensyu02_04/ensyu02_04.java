/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-4 p.40
 * 	右に示すように、キーボードから読み込んだ整数値に
 *  10を加えた値と10を乗じた値を出力するプログラムを作成せよ。(右図省略)
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu2_4
 * クラス名:ensyu2_4
 * 作成日:2022/11/2
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */
package ensyu02_04;

import java.util.Scanner;

public class ensyu02_04 {

	public static void main(String[] args) {

		//キーボードへ入力された値を読み込む
		Scanner stdIn = new Scanner(System.in);

		//Scannerクラスが取り込んだ値をInt型と宣言する
		System.out.print("整数値を入力し、Enterを押してください：");
		int num = stdIn.nextInt();

		//変数numに代入された値に、10を加えて表示させる
		System.out.println("10を加えた値は" + (num + 10) + "です。");

		//変数numに代入された値から、10を減じて表示させる
		System.out.println("10を減じた値は" + (num - 10) + "です。");

	}

}
