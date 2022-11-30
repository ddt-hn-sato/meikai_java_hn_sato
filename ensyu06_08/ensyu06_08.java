/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-08 p197
 * 	double型の配列の全要素の合計値と平均値を求めるプログラムを作成せよ。
 *	要素数と全要素の値はキーボードから読み込むこと。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_08
 * クラス名:ensyu06_08
 * 作成日:2022/11/21
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_08;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_08 {

	public static void main(String[] args) {

		//Scannerクラスのインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//配列の要素数の入力を促す
		System.out.print("配列の要素数は？：");

		//入力値を、変数elementsNumberへ代入
		int elementsNumber = scannerInstance.nextInt();

		//配列変数doubleArrayを宣言
		double doubleArray[] = new double[elementsNumber];

		//インスタンスを使って配列変数doubleArrayへ配列の要素の値を入力させるループ
		for (int indexNumber = 0; indexNumber < elementsNumber; indexNumber++) {
			//要素の値の入力を促す
			System.out.print("\tdoubleArray[" + indexNumber + "] = ");
			//インスタンスを使って配列変数doubleArray[elementNumber]へ配列の要素の値を代入
			doubleArray[indexNumber] = scannerInstance.nextDouble();
		}

		//合計値と平均値の変数を初期化
		double sumNumber = 0;
		double averageNumber = 0;

		//合計値と平均値を求めるループ
		for (double elementItself : doubleArray) {
			sumNumber += elementItself;
		}

		//平均値の計算
		averageNumber = sumNumber / (double)elementsNumber;

		System.out.println("全要素の合計値は" + sumNumber + "です。");
		System.out.print("全要素の平均値は");
		System.out.printf("%2.2f", averageNumber);
		System.out.print("です。");
	}
}
