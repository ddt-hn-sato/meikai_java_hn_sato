/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-16 p121
 * 	読み込んだ数だけ * を表示する List 4-11 を書き換えて、
 *  5こ表示するごとに改行するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_16
 * クラス名:ensyu04_16
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_16;

import java.util.Scanner;

public class ensyu04_16 {

	public static void main(String[] args) {
		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//入力を促す
		System.out.println("何個 * を表示しますか？");
		//インスタンスを用いて、入力値をnへ代入
		int n = ins.nextInt();

		//for文で実現(List 4-11)
/*		for (int i = 0; i < n; i++)
			System.out.print('*');
		System.out.println();
*/
		//for文で実現 ★演習04-16 回答
		for (int i = 1; i <= n; i++) {
			System.out.print('*');
			//iが5の倍数になるたびに改行する
			if (i % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println();

	}
}
