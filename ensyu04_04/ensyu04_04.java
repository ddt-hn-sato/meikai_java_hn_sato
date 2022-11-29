/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-04 p99
 * 	List4-4のwhile文終了時にxの値が「-1」になることを確認するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラム（//★演習4-4回答 ・・・）をご参照ください。
 *
 * パッケージ名:ensyu04_04
 * クラス名:ensyu04_04
 * 作成日:2022/11/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_04;

import java.util.Scanner;

public class ensyu04_04 {

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
			System.out.println(x);
			x--;
		}
		//★演習4-4回答 while文終了時にxの値が-1になることを確認するプログラムを作成
		System.out.println("while文終了時のxの値は、" + x);
	}

}
