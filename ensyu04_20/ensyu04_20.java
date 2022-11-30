/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-20 p125
 * 	n段の正方形を表示するプログラムを作成せよ。
 * 右に示すのは、nが3のときの実行結果である。（右図省略）
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_20
 * クラス名:ensyu04_20
 * 作成日:2022/11/10
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_20;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_20 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//入力を促す
		System.out.println("何段の正方形を作成しますか？：");

		//インスタンスを用いて、入力値を変数howManyへ代入
		//これは列内の * の入力回数上限でもあり、* の行数上限としても使う
		int howMany = scannerInstance.nextInt();

		//1段の中の * の数を変数stairsNumberと宣言。
		//あとのループの中で繰り返し代入できるよう宣言のみしておく。
		int stairsNumber;

		//段数を変数newLineと宣言。
		//あとのループの中で繰り返し代入できるよう宣言のみしておく。
		int newLine;

		//内側：1段の * の数が入力値より大きい場合にfor文から抜け、外側ループの処理へ移る。
		//外側：改行することで、1段の * の数を、入力値以下に保つ。
		for (newLine = 1; howMany >= newLine; newLine ++ ) {

			for (stairsNumber = 1; howMany >= stairsNumber; stairsNumber++) {
				//改行せずに * を表示
				System.out.print('*');
			}
			//1段の * の数が入力値よりも大きい場合にこの処理が行われる（改行する）
			System.out.println();
		}
	}
}
