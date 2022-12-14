/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-06 p191
 * 	テストの点数の合計点、平均点、最高点、最低点を表示するプログラムを作成せよ。
 *  人数と点数は、キーボードから読み込むこと。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_06
 * クラス名:ensyu06_06
 * 作成日:2022/11/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter06_archive;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_06 {

	public static void main(String[] args) {


		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//人数の入力を促す
		System.out.print("人数を入力せよ。");

		//インスタンスを用いて、入力値を変数peopleNumberへ代入
		int peopleNumber = scannerInstance.nextInt();

		//合計点、平均値、最高点、最低点をそれぞれ初期化
		//平均値のみ、小数になる可能性があるため、double型で初期化しておく。
		int sumScores = 0, maxScores = 0, minimumScores = 0;
		double averageScores = 0;

		//配列の生成
		int[] intArray = new int[peopleNumber];

		//配列のインデックスを変数indexNumberと宣言
		int indexNumber;

		//点数を、要素数intArray.lengthぶん入力させるループ。
		//兼、要素の合計点、平均点を求めるループ
		//兼、要素の最高点、最低点を求めるループ
		for(indexNumber = 0, maxScores = 0, minimumScores = 0;indexNumber < intArray.length; indexNumber++) {
			//点数の入力を促す
			System.out.print(indexNumber + 1 + "番目の点数を入力：");

			//入力値を変数personScoreへ代入
			int personScore = scannerInstance.nextInt();

			//入力値を配列要素として代入
			intArray[indexNumber] = personScore;

			//ここまでの要素の合計を求める
			sumScores += intArray[indexNumber];

			//ここまでの要素の平均を求める
			averageScores = sumScores / ((double)indexNumber + 1);

			//最大値と最小値を求める過程で、値の入れ替えが全く起きなかったときでも
			//デフォルトの値（0）が出力されてしまわないよう、任意の要素の値を代入しておく。
			maxScores = intArray[0];
			minimumScores = intArray[0];


			//現在のindexNumberの要素の値が、配列の1つ前の要素の値より大きい場合、
			//現在の要素を最大値として、maxScoresが入れ替わる条件分岐。
			if (intArray[indexNumber] > maxScores) {
				maxScores = intArray[indexNumber];
			}

			//現在のindexNumberの要素の値が、配列の1つ前の要素の値未満の大きさの場合、
			//現在の要素を最小値として、minimumScoresが入れ替わる条件分岐。
			if (intArray[indexNumber] < minimumScores) {
				minimumScores = intArray[indexNumber];
			}
		}

		//合計点、平均点、最高点、最低点を表示する
		System.out.print("合計は" + sumScores + "、平均は");
		System.out.printf("%2.2f", averageScores);
		System.out.print("、最高は" + maxScores + "、最低は" + minimumScores + "です。");
	}
}