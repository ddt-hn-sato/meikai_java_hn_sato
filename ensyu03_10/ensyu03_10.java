/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-10 p71
 * ２つの実数値を読み込んで、大きいほうの値を
 * 表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  if文を使わない書き方の練習がしたく、条件演算子で書いています。
 *
 * パッケージ名:ensyu03_10
 * クラス名:ensyu03_10
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_10;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_10 {

	public static void main(String[] args) {

		// キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		// キーボード入力を促す
		System.out.println("1つめの整数値を入力：");
		// インスタンスを用いて、変数Firstに代入する
		int First = ins.nextInt();

		// キーボード入力を促す
		System.out.println("2つめの整数値を入力：");
		// インスタンスを用いて、変数Secondに代入する
		int Second = ins.nextInt();

		//First-Secondの計算結果を変数SAと置く
		int SA = First - Second;

		// 条件演算子で書く。
		// First引くSecondの計算結果 (= 変数SA)が負の場合をtrueとし、
		// trueの場合は、その差に(-1)をかけ、差の絶対値を算出。
		System.out.println("2つの整数値の差は"
			+ (SA < 0 ? SA * (-1) : (SA > 0 ? SA : "なく、2つの値は同値"))
			+ "です。");
	}
}

