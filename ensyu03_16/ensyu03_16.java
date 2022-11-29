/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-16 p77
 *  三つの整数値を読み込んで、昇順（小さい順）にソートするプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお、同値の場合の条件分岐も加えました。
 *
 * パッケージ名:ensyu03_16
 * クラス名:ensyu03_16
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_16;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_16 {

	public static void main(String[] args) {

		// キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		// キーボード入力を促す
		System.out.println("1つめの整数値：");
		// インスタンスを用いて、Firstに代入する
		int First = ins.nextInt();

		// キーボード入力を促す
		System.out.println("2つめの整数値：");
		// インスタンスを用いて、Secondに代入する
		int Second = ins.nextInt();

		// キーボード入力を促す
		System.out.println("3つめの整数値：");
		// インスタンスを用いて、Thirdに代入する
		int Third = ins.nextInt();

		//最小値、中間の値、最大値の変数を宣言。
		int min, mid, max;

		// まず変数２つの大小を比較し、
		// その大きい方と、３つめの変数の大小関係を比較する。
		if (First < Second) {
			if (Second < Third) {
				min = First;
				mid = Second;
				max = Third;
			} else {
				if (First > Third) {
					min = First;
					mid = Third;
					max = Second;
				} else {
					min = Third;
					mid = First;
					max = Second;
				}
			}
		} else {
			if (First < Third) {
				min = Second;
				mid = First;
				max = Third;
			} else {
				if (Second < Third) {
					min = Second;
					mid = Third;
					max = First;
				} else {
					min = Third;
					mid = Second;
					max = First;
				}
			}
		}
		System.out.println("昇順に並べると、" + min + "・"  + mid + "・"+ max + "です。");
	}
}