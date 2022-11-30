/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-06-01 p109
 * 	読み込んだ値が1未満であれば改行文字を出力しないように
 * 「List4-7」を書き換えたプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_06_01
 * クラス名:ensyu04_06_01
 * 作成日:2022/11/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_06_01;

import java.util.Scanner;

public class ensyu04_06_01 {

	public static void main(String[] args) {
		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//入力を促す
		System.out.println("何個 * を表示しますか？");
		//インスタンスを用いて、入力値をnへ代入
		int n = ins.nextInt();

		//変数iの初期化
		int i = 0;

		while (i < n) {
			System.out.print('*');
			i++;
		}
		//★演習4_6_1回答：1未満なら改行文字を出力しない
		if (1 > n) {
			;
		} else {
			System.out.println();
		}
	}
}
