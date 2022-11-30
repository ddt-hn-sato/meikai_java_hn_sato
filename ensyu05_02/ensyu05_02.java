/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習05-02 p
 * 	float型の変数とdouble型の変数に値を読み込んで表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 *
 * パッケージ名:ensyu05_02
 * クラス名:ensyu05_02
 * 作成日:2022/11/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu05_02;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu05_02 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//変数 x と y の説明
		System.out.println("変数 x はfloat型で、変数 y はdouble型です。");

		//変数 x の入力を促す
		System.out.print("x :");
		//インスタンスを用いて、入力値を変数variableXへ代入
		float variableX = scannerInstance.nextFloat();

		//変数 y の入力を促す
		System.out.print("y :");
		//インスタンスを用いて、入力値を変数variableYへ代入
		double variableY = scannerInstance.nextDouble();

		//variableXを表示
		System.out.printf("x =%f\n", variableX);
		//variableYを表示
		System.out.print("y =" + variableY);

	}

}
