/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-05 p105
 * 	List4-5の「x--」が「--x」となっていたら、
 * どのような出力が得られるかを確認するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラム（//★演習4-5回答 ・・・）をご参照ください。
 *
 * パッケージ名:ensyu04_05
 * クラス名:ensyu04_05
 * 作成日:2022/11/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_05;

import java.util.Scanner;

public class ensyu04_05 {

	public static void main(String[] args){
		//キーボードから値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		System.out.println("カウントダウンします。");

		int x;

		do {
			System.out.print("正の整数値：");
			x = ins.nextInt();
		} while (x <= 0); //つまりxが負の値のときは（xに正の値が入らない限り）カウントダウンされず
						   //「正の整数値：」が表示されることが反復される
		while (x >= 0) {
			//List4-5の場合
//			System.out.println(x--);
			//★演習4-5回答の場合。「x--」を「--x」とする。
			System.out.println("「--x」を出力すると：" + --x);
//			System.out.println("「x--」を出力すると：" + x--);
		}
	}

}
