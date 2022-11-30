/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-13 p73
 * キーボードから読み込んだ3つの整数値の中央値を求めて表示するプログラムを作成せよ。
 * たとえば2,3,1の中央値は2で、1,2,1の中央値は1で、3,3,3の中央値は3である。
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_13
 * クラス名:ensyu03_13
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_13;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_13 {

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

		// キーボード入力を促す
		System.out.println("3つめの整数値を：");
		// インスタンスを用いて、Thirdに代入する
		int Third = ins.nextInt();

		// ★条件演算子でやってみる
		// まず変数２つの大小を比較し、
		// その大きい方と、３つめの変数の大小関係を比較することで中央値を算出。
		int Med = First < Second ? (Second < Third ? Second : (First < Third ? First : Second)) :
									(First < Third ? First : (Second < Third ? Second : Third)) ;

		System.out.println("★条件演算子で：3つの整数値の中央値は" + Med + "です。");

		// ☆if文でやってみる
		// Medに、Firstを代入して初期化
		Med = First;

		// まず変数２つの大小を比較し、
		// その大きい方と、３つめの変数の大小関係を比較することで中央値を算出。
		if (First < Second)
			if (Second < Third)
				Med = Second;
			else
				if (First < Third)
					Med = Third;
				else
					Med = First;
		else
			if (First < Third)
				Med = First;
			else
				if (Second < Third)
					Med = Third;
				else
					Med = Second;

		System.out.println("☆if文で：3つの整数値の中央値は" + Med + "です。");
	}
}

