/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習05-04 p161
 *	3つの整数値を読み込んで、その合計と平均を表示するプログラムを作成せよ。
 *  平均は実数として表示すること。
 *
 * 補足:
 * 55-58行目、合計については型の指定がなかったためint型、double型の2通りで表示しました。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu05_04
 * クラス名:ensyu05_04
 * 作成日:2022/11/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu05_04;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu05_04 {

	public static void main(String[] args) {
		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//整数値Aの入力を促す
		System.out.print("整数値A：");
		//インスタンスを用いて、入力値を変数numberAへ代入
		int numberA = scannerInstance.nextInt();

		//整数値Bの入力を促す
		System.out.print("整数値B：");
		//インスタンスを用いて、入力値を変数numberBへ代入
		int numberB = scannerInstance.nextInt();

		//整数値Cの入力を促す
		System.out.print("整数値C：");
		//インスタンスを用いて、入力値を変数numberCへ代入
		int numberC = scannerInstance.nextInt();

		//見やすさのため改行
		System.out.println();

		//numberAとnumberBとnumberCの合計を、double型でおく。
		double sumABC = numberA + numberB + numberC;

		//合計を示す（intで示す場合）
		System.out.println("int型で合計を示すと、" + (numberA + numberB + numberC));
		//合計を示す（doubleで示す場合）
		System.out.println("double型で合計を示すと、" + sumABC);

		//平均を示す(doubleで示す)
		System.out.print("double型で平均を示すと、" + sumABC / 3);

	}

}
