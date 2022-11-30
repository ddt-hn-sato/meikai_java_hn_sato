/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習05-01 p149
 * 	10進整数を読み込んで、その値を8進数と16進数で
 *  表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu05_01
 * クラス名:ensyu05_01
 * 作成日:2022/11/14
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu05_01;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu05_01 {

	public static void main(String[] args) {
		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//入力を促す
		System.out.println("10進整数を読み込みます：");

		//インスタンスを用いて、入力値を変数decimalNumberへ代入
		int decimalNumber = scannerInstance.nextInt();

		//8進数での表記を表示
		System.out.print("8進数では");
		//書式を8進数で指定する
		System.out.printf("%o", decimalNumber);
		System.out.print("です。\n");

		//16進数での表記を表示
		System.out.print("16進数では");
		//書式を16進数で指定する
		System.out.printf("%x", decimalNumber);
		System.out.print("です。");
	}

}
