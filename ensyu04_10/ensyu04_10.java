/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-10 p121
 * 	読み込んだ値が1未満であれば改行文字を出力しないように List 4-11 を
 * 書き換えたプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラム(//★演習04-10回答 以降)をご参照ください。
 *
 * パッケージ名:ensyu04_10
 * クラス名:ensyu04_10
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_10;

import java.util.Scanner;

public class ensyu04_10 {

	public static void main(String[] args) {
		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//入力を促す
		System.out.println("何個 * を表示しますか？");
		//インスタンスを用いて、入力値をnへ代入
		int n = ins.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print('*');
		}
		//★演習04-10回答
		//読み込んだ値が1未満であれば改行文字を出力しないように
		//List 4-11 を書き換えたプログラムを作成せよ。
		if (n >= 1) {
		System.out.println();
		}
	}
}
