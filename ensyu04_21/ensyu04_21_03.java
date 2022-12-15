/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-21 p125
 * 	List 4-16 は左下側が直角の直角三角形を表示するプログラムであった。
 * 直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ。
 *
 * 注：
 *             演習04-21-01：左上側
 *             演習04-21-02：右下側
 *  ★本クラス 演習04-21-03：右上側 の三角形を表示するプログラムを作成しております。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_21
 * クラス名:ensyu04_21_03
 * 作成日:2022/11/10
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_21;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_21_03 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner (System.in);

		//右上直角の三角形を表示する旨
		System.out.println("右上直角の三角形を表示します。");

		//段数の入力を促す
		System.out.println("段数は：");

		//入力値を変数upperRightへ代入
		int upperRight = scannerInstance.nextInt();

		// * 入力のループで、ループ繰り返しの可否判定に使用する値を
		//変数asteriskCounterとおく
		int asteriskCounter;

		//スペース入力のループで、ループ繰り返しの可否判定に使用する値を
		//変数spaceCounterとおく。
		int spaceCounter;


		//改行のためのループを作成
		//改行するかどうかの判定に使用し、いま何行目かを表す値を変数nowLineとおく
		//つまり改行する場合は、改行したのち、次の行での * 入力の下準備をするループ。
		//つまりループのたびに、いま何行目かを表すnowLineを1インクリメント。
		for(int nowLine = 1; nowLine <= upperRight; nowLine++) {

			//スペース入力のためのループを作成。
			//spaceCounterの初期値は(nowLine - 1)とし、0より大きい場合に
			//このループへ入る。
			//最外のループのたびに、その行に表示するスペース（を入力するループ回数）は1つ増える。
			//※nowLineが最外のループごとに増えるので、表示する * 自体は、
			//  spaceCounterをこのループごとにデクリメントするだけで、増やせる。
			//  spaceCounterのデクリメントはあくまでもこのループを脱するための処理
			for(spaceCounter = nowLine - 1; spaceCounter > 0 ; spaceCounter--) {
				System.out.print(' ');
			}

			// * 入力のためのループを作成。
			//asteriskCounterの初期値はupperRightとし、
			//このループのたびにデクリメントする。
			for(asteriskCounter = upperRight - nowLine; asteriskCounter >= 0; asteriskCounter--) {
			//asteriskCounter > 0 が true の場合に * を入力
				System.out.print('*');
			}

			//改行する
			System.out.println();
		}
	}
}