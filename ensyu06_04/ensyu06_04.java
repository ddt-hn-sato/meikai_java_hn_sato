/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-04 p187
 * 	List6-5を書き換えて、右に示すように縦向きの棒グラフで表示するプログラムを作成せよ。
 *  最下段には、インデックスを10で割った剰余を表示すること。（右図省略）
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_04
 * クラス名:ensyu06_04
 * 作成日:2022/11/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_04;

//Randomクラスをインポート
import java.util.Random;
//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_04 {

	public static void main(String[] args) {

		//Randomクラスのインスタンスを作成
		Random randomInstance = new Random();

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		//入力を促す
		System.out.println("要素数はいくつにしますか？：");
		//インスタンスを用いて、入力値を変数へ代入
		int howmanyElements = scannerInstance.nextInt();

		//配列を生成し、初期化する
		int[] intArray = new int[howmanyElements];

		int indexNumber = 0;

		//配列の要素に乱数を代入していく.
		//このとき、インデックスとして、変数indexNumberをループごとにインクリメントし、要素を取得する
		for(indexNumber = 0; indexNumber < howmanyElements; indexNumber++) {
			//定数1 + 0以上9以下の乱数 つまり、1以上10以下の乱数を生成し、配列の要素として代入する
			intArray[indexNumber] = 1 + randomInstance.nextInt(9);
		}

		//乱数の幅
		int randomRange = 10;

		//外側for分の回転数カウンタを変数outerCounterとおく
		int outerCounter = 0;

		//内側for分の回転数カウンタを変数innerCounterとおく
		int innerCounter = 0;

		//内側for文が、intArray.length回、回り切ったら、改行し、

		//乱数の幅分（つまり10回）外側for文を回り切ったら、
		//出力結果の最下部を表示するためfor文を抜ける
		for(outerCounter = randomRange; outerCounter > 0 ; outerCounter--) {

			for(innerCounter = 0, randomRange = 10; innerCounter < intArray.length ; innerCounter++) {

				//見やすさのためスペース表示
				System.out.print(' ');

				//要素が一定の値であれば * を表示し、以下であればスペースを表示

				if(intArray[innerCounter] >= outerCounter) {
					// * を、見かけ上タテの棒グラフの一部として表示
					System.out.print("*");
				} else {
					//スペースを表示する（見かけ上タテの棒グラフが、表示されない）
					System.out.print(' ');
				}

				//見やすさのためスペース表示
				System.out.print(' ');

			}

			//改行
			System.out.println();

		}

		//最下部の表示。見やすさのため、要素の数に応じて---線を増やす
		for(int underlineCounter = 0; underlineCounter < intArray.length; underlineCounter++) {
		System.out.print("---");
		}
		//みやすさのため改行
		System.out.println();
		//最下行を表示するループ
		for(int underlineCounter = 0; underlineCounter < intArray.length; underlineCounter++) {
			System.out.print(" " + intArray[underlineCounter] % 10 + " ");
		}

	}
}

