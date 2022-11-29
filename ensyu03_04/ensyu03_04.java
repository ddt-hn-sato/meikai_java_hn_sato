/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-04 p61
 * 	2つの変数a, bに値を読み込んで、その大小関係を以下のいずれかで表示するプログラムを作成せよ。
 *  ・aの方が大きいです
 *  ・bの方が大きいです
 *  ・aとbは同じ値です
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_04
 * クラス名:ensyu03_04
 * 作成日:2022/11/4
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_04;

import java.util.Scanner;

public class ensyu03_04 {

	public static void main(String[] args){

		//キーボード入力から値を取得するインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

		//変数aの入力を促す
		System.out.print("整数値 a：");
		//インスタンスを用いて、キーボード入力の値を、変数aに代入
		int a = stdIn.nextInt();

		//変数aの入力を促す
		System.out.print("整数値 b：");
		//インスタンスを用いて、キーボード入力の値を、変数bに代入
		int b = stdIn.nextInt();

		//「a >= b」か、「a < b」かでまず条件分岐
		if (a >= b)
			//「a >= b」がtrueの場合、次に「a>b」か、「a=b」かで条件分岐
			//「a > b」の場合
			if (a > b)
				System.out.print("aの方が大きいです。");
			//「a = b」の場合
			else
				System.out.print("aとbは同じ値です。");
		else
			//「a >= b」がfalseの場合（必ず「a < b」である）。
			System.out.print("bの方が大きいです。");
	}
}
