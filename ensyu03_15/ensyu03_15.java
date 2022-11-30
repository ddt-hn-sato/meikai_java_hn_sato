/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-15 p77
 *  二つの整数値を読み込んで、降順（大きい順）にソートするプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお、同値の場合の条件分岐も加えました。
 *
 * パッケージ名:ensyu03_15
 * クラス名:ensyu03_15
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_15;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_15 {

	public static void main(String[] args) {

		// キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		// キーボード入力を促す
		System.out.println("1つめの整数値First：");
		// インスタンスを用いて、Firstに代入する
		int First = ins.nextInt();

		// キーボード入力を促す
		System.out.println("2つめの整数値Second：");
		// インスタンスを用いて、Secondに代入する
		int Second = ins.nextInt();

		// 順を交換するための変数tをintで宣言
		int t;

		// 変数２つの大小を比較する。
		if (First > Second) {
		// Firstが大きく、Secondが小さい場合、順序を変えなくてよい
			System.out.println("整数値Firstは、" + First + "で、\n整数値Secondは、" + Second + "です。");
		// Firstが小さく、Secondが大きい場合、tを用いて順序を変える
		} else if (First < Second) {
			t = Second;
			Second = First;
			First = t;
			System.out.println("First > Second となるように並べ替えました。"
					+ "\n整数値Firstは、" + First + "で、\n整数値Secondは、" + Second + "です。");
		} else {
			System.out.println("2つの値は同じです。");
		}
	}
}
