/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-07 p109
 * 	読み込んだ値の個数だけ記号文字を表示するプログラムを作成せよ。
 *  表示は * と + を交互に行うこと。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_07
 * クラス名:ensyu04_07
 * 作成日:2022/11/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_07;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_07 {

	public static void main(String[] args) {

		//インスタンスを作成
		Scanner ins = new Scanner(System.in);

		//入力を促す
		System.out.println("記号を何個表示しますか？：");

		//インスタンスを用いて変数に入力値を代入
		int n = ins.nextInt();

		//iを初期化
		int i = 1;

		while (i <= n) {
			if (i % 2 == 1){
				System.out.print('*');
			} else {
				System.out.print('+');
			}
			++i;
		}
		System.out.print("");
	}
}
