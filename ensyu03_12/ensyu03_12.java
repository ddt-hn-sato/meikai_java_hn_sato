/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-12 p73
 * キーボードから読み込んだ3つの整数値の最小値を求めて表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_12
 * クラス名:ensyu03_12
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_12;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_12 {

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

		// 最終的に表示するMinに、まずはFirstを代入する
		int Min = First;

		// Minへ、FirstとSecondのうち、より小さい値を代入する。
		Min = (Min < Second) ? First : Second;

		// Minへ、1つ上のコードの結果と、Thirdをくらべて、より小さい値を代入する。
		Min = (Min < Third) ? Min : Third;

		System.out.println("★条件演算子で：3つの整数値の最小値は" + Min + "です。");

		// 最終的に表示するMinに、Firstを代入して初期化
		Min = First;

		// SecondがMinより小さい場合をtrueとする。
		if (Min > Second)
			Min = Second;

		// ThirdがMinより小さい場合をtrueとする。
		if (Min > Third)
			Min = Third;

		System.out.println("☆if文で：3つの整数値の最小値は" + Min + "です。");
	}
}

