/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-22 p125
 * 	n段のピラミッドを表示するプログラムを作成せよ。
 *  第1行目には (i - 1) * 2 + 1 個の '*' 記号を表示して、
 *  最終行である第n行目には (n - 1) * 2 + 1 個の '*' 記号を表示すること。
 *
 *  ※コード規約にのっとり、「n段」＝「stairsNumber段」と読み替えています。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_22
 * クラス名:ensyu04_22
 * 作成日:2022/11/11
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_22;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_22 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//入力を促す
		System.out.println("何段のピラミッドを表示しますか？：");

		//インスタンスを用いて、入力値を変数stairsNumberへ代入
		int stairsNumber = scannerInstance.nextInt();

		//改行するためのループを作成。改行しない場合処理を終了。
		//現在の行数を変数nowLineとおく
		for(int nowLine = 1; nowLine <= stairsNumber; nowLine++) {

			//スペースを表示するループ。繰り返し判定に用いる変数を
			//変数spaceCounterとおく
			for(int spaceCounter = stairsNumber - nowLine; spaceCounter > 0 ; spaceCounter--) {
				System.out.print(' ');
			}

			// * を表示するループ。繰り返し判定に用いる変数を
			//変数asteriskCounterとおく
			for(int asteriskCounter = 1; asteriskCounter <= (nowLine - 1) * 2 + 1; asteriskCounter++) {
				System.out.print('*');
			}

			//改行
			System.out.println();
		}
	}

}
