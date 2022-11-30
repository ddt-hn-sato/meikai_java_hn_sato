/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-14 p77
 *  List 3-13と同様に、二つの整数値を読み込んで、小さい方の値と大きいほうの値の両方を
 *  表示するプログラムを作成せよ。
 *  ただし、ふたつの整数値が等しい場合は「2つの値は同じです」と表示すること。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_14
 * クラス名:ensyu03_14
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_14;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_14 {

	public static void main(String[] args) {

		// キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		// キーボード入力を促す
		System.out.println("1つめの整数値を：");
		// インスタンスを用いて、Firstに代入する
		int First = ins.nextInt();

		// キーボード入力を促す
		System.out.println("2つめの整数値を：");
		// インスタンスを用いて、Secondに代入する
		int Second = ins.nextInt();

		// minとmaxの変数をintで宣言
		int min, max;

		// まず変数２つの大小を比較する。
		if (First < Second) {
			min = First;
			max = Second;
			System.out.println("小さい方の値は、" + min + "で、\n大きい方の値は、" + max + "です。");
		} else if (First > Second) {
			min = Second;
			max = First;
			System.out.println("小さい方の値は、" + min + "で、\n大きい方の値は、" + max + "です。");
		} else {
			System.out.println("2つの値は同じです。");
		}

	}
}
