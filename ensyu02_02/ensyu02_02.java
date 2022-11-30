/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-2 p.33
 * 	3つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 * 回答:
 *  以下プログラムをご参照ください。
 *
 * パッケージ名:ensyu2_2
 * クラス名:ensyu2_2
 * 作成日:2022/11/2
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu02_02;

public class ensyu02_02 {
	public static void main (String[] args) {

		//3つのint型変数を宣言します。
		int a;
		int b;
		int c;

		//3つの変数すべてに整数を代入します。
		a = 4;
		b = 5;
		c = 6;

		//3つの変数の合計を求めます。
		System.out.println("合計は" + (a + b + c) + "です。");

		//3つの変数の平均を求めます。
		System.out.println("平均は" + (a + b + c) / 3 + "です。");

	}

}
