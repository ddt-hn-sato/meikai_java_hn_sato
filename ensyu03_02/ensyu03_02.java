/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-02 p59
 * 	二つの正の整数値を読み込んで、後者が前者の約数であれば「BはAの約数です。」と表示し、
 * そうでなければ「BはAの約数ではありません。」と表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_02
 * クラス名:ensyu03_02
 * 作成日:2022/11/4
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_02;

//Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_02 {

	public static void main(String[] args) {

		//キーボード入力された値を受け取るインスタンスを作成
		Scanner num = new Scanner(System.in);

		//変数priAの入力を促す
		System.out.print("整数値A：");

		//インスタンスを用いて、変数にキーボードからの入力値を代入する
		int priA = num.nextInt();

		//変数secBの入力を促す
		System.out.print("整数値B：");

		//インスタンスを用いて、変数にキーボードからの入力値を代入する
		int secB = num.nextInt();

		//後者が前者の約数であれば→secBがpriAの約数であれば(true)
		//つまり、「priA % secB == 0 がtrueなら」「BはAの約数である、と表示する」
		if (priA % secB == 0)
			System.out.print("BはAの約数である。");

		//そうでなければ→secBがpriAの約数でないならば(false)
		//つまり、「priA % secB == 0 がfalseなら」「BはAの約数でない、と表示する」
		else
			System.out.print("BはAの約数でない。");
	}
}
