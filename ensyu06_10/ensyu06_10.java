/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-10 p199
 * 	連続する要素が同じ値を持つことのないように、演習6-9のプログラムを
 *  改良したプログラムを作成せよ。
 *  たとえば {1, 3, 5, 5, 3, 2}とならないようにすること。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_10
 * クラス名:ensyu06_10
 * 作成日:2022/11/21
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_10;

//Randomクラスをインポート
import java.util.Random;
//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_10 {

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//要素数を変数elementNumberへ代入
		int elementNumber = scannerInstance.nextInt();
		//配列を宣言する
		int[] intArray = new int[elementNumber];

		//配列の要素へ、1+0以上、1+10未満の整数（つまり1以上11未満、つまり1以上10以下）を代入するループ
		for (int indexNumber = 0; indexNumber < elementNumber ; indexNumber++) {

			//乱数を生成する
			int randomNumber = 1 + randomInstance.nextInt(10);

			//indexNumberを1つデクリメントし、1つ前の要素の値を参照し、この値をrandomNumberと比較する。
			indexNumber--;

			//もし1つ前のインデックスの要素と、この要素(randomNumber)が同じ値をとる場合、
			//乱数をもう一度生成させる
			while(indexNumber >= 0 && randomNumber == intArray[indexNumber]) {
				randomNumber = 1 + randomInstance.nextInt(10);
			};

			//randomNumberがintArray[indexNumber]（1つ前のインデックスの値）と異なる値を取るようになったら、
			//indexNumberを1つインクリメント（戻す）し、配列の要素を、コンソールでの見かけ上代入する。
			indexNumber++;
			System.out.println("intArray[" + indexNumber + "] = " + randomNumber);

			//配列の要素として実質的にも代入
			intArray[indexNumber] = randomNumber;
		}
	}
}
