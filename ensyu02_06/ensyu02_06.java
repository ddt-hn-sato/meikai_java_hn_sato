/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-6 p.41
 * 	三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu2_6
 * クラス名:ensyu2_6
 * 作成日:2022/11/2
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */
package ensyu02_06;

import java.util.Scanner;

public class ensyu02_06 {

	public static void main(String[] args) {

		//キーボードへ入力された値を受け取るインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//三角形の面積を求める旨を説明
		System.out.println("三角形の面積を求めます。");

		//底辺の値の入力を促す
		System.out.print("底辺：");

		//インスタンスが受け取った、変数xの値をdouble型と宣言し、実数値を読み込む
		double width = stdIn.nextDouble();

		//高さの値の入力を促す
		System.out.print("高さ：");

		//インスタンスが受け取った、変数yの値をdouble型と宣言し、実数値を読み込む
		double height = stdIn.nextDouble();

		//（底辺*高さ）/ 2 の式で三角形の面積を求める。
		System.out.println("三角形の面積は" + (width * height) / 2 + "です。");

	}

}
