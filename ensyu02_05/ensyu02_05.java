/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-5 p.41
 * 	2つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu2_5
 * クラス名:ensyu2_5
 * 作成日:2022/11/2
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */
package ensyu02_05;

import java.util.Scanner;

public class ensyu02_05 {

	public static void main(String[] args) {

		//キーボードへ入力された値を受け取るインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//xの値の入力を促す
		System.out.print("xの値：");

		//インスタンスが受け取った、変数xの値をdouble型と宣言し、実数値を読み込む
		double x = stdIn.nextDouble();

		//変数yの値の入力を促す
		System.out.print("yの値：");

		//インスタンスが受け取った、変数yの値をdouble型と宣言し、実数値を読み込む
		double y = stdIn.nextDouble();

		//変数xとyの値の和を求める。
		System.out.println("合計は" + (x + y) + "です。");

		//変数xとyの値の平均を求める。
		System.out.println("平均は" + (x + y) / 2 + "です。");
	}

}
