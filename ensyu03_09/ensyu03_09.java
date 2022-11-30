/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-09 p71
 * ２つの実数値を読み込んで、大きいほうの値を
 * 表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお練習のため①、②の二つの方法で書いています。
 *
 * パッケージ名:ensyu03_09
 * クラス名:ensyu03_09
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_09;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_09 {

	public static void main(String[] args) {

		// キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		// キーボード入力を促す
		System.out.println("実数値Aを入力：");
		// インスタンスを用いて、実数値Aを変数AAに代入する
		double AA = ins.nextDouble();

		// キーボード入力を促す
		System.out.println("実数値Bを入力：");
		// インスタンスを用いて、実数値Aを変数AAに代入する
		double BB = ins.nextDouble();

		// ①if文で書く場合
		// BBが大きい場合
		if (AA < BB)
			System.out.println(BB + "のほうが大きいです。※if文での判定");
		// AAが大きい場合
		else if (AA > BB)
			System.out.println(AA + "のほうが大きいです。※if文での判定");
		// AAとBBが同じ値の場合
		else
			System.out.println(AA + "と" + BB + "は同じ値です。※if文での判定");

		// ②条件演算子で書く場合
		// AAとBBを比較して、AAが大きい場合をtrueとする
		System.out.println("大きいほうの値は"
			+ (AA > BB ? AA : (AA < BB ? BB : "なく、2つの値は同値"))
			+ "です。★条件演算子を用いた判定");
	}
}
