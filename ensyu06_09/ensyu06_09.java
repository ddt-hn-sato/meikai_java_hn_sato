/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-09 p199
 * 	要素型がint型である配列を作り、全要素を 1 ～ 10の乱数で埋めつくす
 * （1以上10以下の値を代入する）プログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_09
 * クラス名:ensyu06_09
 * 作成日:2022/11/21
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_09;

//Randomクラスをインポート
import java.util.Random;
//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_09 {

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//要素数を変数elementNumberへ代入
		int elementNumber = scannerInstance.nextInt();
		//配列を初期する
		int[] intArray = new int[elementNumber];

		//配列の要素へ、1+0以上、1+10未満の整数（つまり1以上11未満、つまり1以上10以下）を代入するループ
		for (int indexNumber = 0; indexNumber < elementNumber ; indexNumber++) {
			//乱数を生成
			int randomNumber =  1 + randomInstance.nextInt(10);
			//配列の中身を、実質的に代入
			intArray[indexNumber] = randomNumber;
			//配列の中身をコンソールで見かけ上表示
			System.out.println("intArray[" + indexNumber + "] = " + randomNumber);
		}
	}
}
