/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習05-03 p157
 * 	論理型の変数にtrueやfalseを代入して、
 *  その値を表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu05_03
 * クラス名:ensyu05_03
 * 作成日:2022/11/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu05_03;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu05_03 {

	public static void main(String[] args) {
		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//数字Aの入力を促す
		System.out.print("数字Aを入力：");
		//インスタンスを用いて、入力値を変数numberAへ代入
		int numberA = scannerInstance.nextInt();

		//数字Bの入力を促す
		System.out.print("数字Bを入力：");
		//インスタンスを用いて、入力値を変数numberBへ代入
		int numberB = scannerInstance.nextInt();

		//数字Bの入力を促す
		System.out.print("数字Cを入力：");
		//インスタンスを用いて、入力値を変数numberCへ代入
		int numberC = scannerInstance.nextInt();

		//numberA == numberB がtrueか
		System.out.println("数字Aは数字Bと等しい場合 trueと表示 →" + (numberA == numberB));

		//numberB == numberC がtrueか
		System.out.println("数字Bは数字Cと等しい場合 trueと表示 →" + (numberB == numberC));

		//numberA == numberC がtrueか
		System.out.println("数字Aは数字Cと等しい場合 trueと表示 →" + (numberA == numberC));
	}

}
