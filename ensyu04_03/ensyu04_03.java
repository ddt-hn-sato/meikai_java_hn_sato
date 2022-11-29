/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-03 p99
 * 	右に示すように、2つの整数値を読み込んで、
 * 小さい方の数以上で大きい方の数以下の全整数を
 * 小さい方から順に、表示するプログラムを作成せよ。（右図省略）
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_03
 * クラス名:ensyu04_03
 * 作成日:2022/11/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_03;

//Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu04_03 {

	public static void main(String[] args) {

		//キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		//整数Aの入力を促す
		System.out.println("整数A：");
		//インスタンスを用いて変数numAへ、入力された値を代入
		int numA = ins.nextInt();

		//整数Bの入力を促す
		System.out.println("整数B：");
		//インスタンスを用いて変数numBへ、入力された値を代入
		int numB = ins.nextInt();

		//以下のプログラムの便宜上、numA <= numB と大小関係を指定する
		if (numA <= numB)
			; //そのままif文を終了し、54行目へ行ってよい
		else {
			//強制的に、numA <= numB の大小関係となるよう変数の中身を交換する
			int t = numA;
			numA = numB;
			numB = t;
		}

		//結果として表示する変数をNUMと宣言する
		int NUM = numA;

		do {
			//見やすさのため"NUM" "半角スペース" "NUM+1" ・・・と表示
			System.out.print(NUM + " ");
			//NUM = NUM + 1 の式で、NUMの値をループ処理のたびに1ずつ加える
			++NUM;
		//整数A以上、整数B以下の範囲で表示する指定のため、整数B以下の条件下で繰り返す。
		} while (NUM <= numB);

	}
}
