/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-05 p189
 * 	配列の要素数と、個々の要素の値を読み込んで、
 *  右のように各要素の値を表示するプログラムを作成せよ。（右図省略）
 *  表示の形式は、初期化子と同じ形式、すなわち、
 *  各要素の値をコンマで区切って { } で囲んだ形式とすること。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_05
 * クラス名:ensyu06_05
 * 作成日:2022/11/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_05;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_05 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//要素数を入力させる
		System.out.print("要素数：");

		//インスタンスを用いて、入力値を変数howmanyElementsへ代入
		int howmanyElements = scannerInstance.nextInt();

		//配列変数intArrayとして、要素数がhowmanyElementsの配列を生成。
		int[] intArray = new int[howmanyElements];

		//要素を入力させるループで、入力値を代入する変数を変数inputNumberとおく。
		int inputNumber;

		//要素を入力させるループ
		for(int indexNumber = 0; indexNumber < howmanyElements; indexNumber++) {

			//インデックスがindexNumberの要素を、入力させる
			System.out.print("intArray [" + indexNumber + "] = ");

			//インスタンスを用いて、入力値を変数inputNumberへ代入
			inputNumber= scannerInstance.nextInt();

			//入力値を配列の要素として代入する
			intArray[indexNumber] = inputNumber;
		}

		//以下は、配列の中身を表示させる部分
		System.out.print("intArray = {");

		//配列の中身である、要素を表示させるループ
		for(int loopCounter = 0; loopCounter < intArray.length; loopCounter++) {

			//要素を表示させるループ
			System.out.print(intArray[loopCounter]);

			//要素を表示させた後、「,」を表示するかどうかで条件分岐
			//つまり配列の最後尾の要素かどうかを判定する。
			if (loopCounter + 1 != intArray.length) {

				//最後尾の要素ではないので、「,」を表示する
				System.out.print(',');
			}
		}

		//下記にて、配列の中身を表示させる部分は終了
		System.out.println("}");


	}

}
