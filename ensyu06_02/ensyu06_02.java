/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-02 p185
 * 	要素型がint型で要素数が5の配列の要素に対して、
 *  先頭から順に 5, 4, 3, 2, 1 を代入して、表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_02
 * クラス名:ensyu06_02
 * 作成日:2022/11/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_02;

public class ensyu06_02 {

	public static void main(String[] args) {
		//要素型がint型で要素数が5の配列を配列変数intArrayへ初期化
		int[] intArray = new int[5];

		//インデックスを変数arrayIndexとおき、0以上4以下まで1ずつインクリメントさせるループ
		//かつ、各要素の値を変数componentNumberとおき、5以下1以上まで1ずつデクリメントさせるループ。
		for(int arrayIndex = 0, componentNumber = 5; arrayIndex <= 4; arrayIndex++, componentNumber--) {

			//インデックス0以上4以下まで順に5以上1以下の値を代入する。
			intArray[arrayIndex] = componentNumber;

			//intArrayから、インデックスごとに値を取り出し表示する
			System.out.println("intArray[" + arrayIndex + "] = " + intArray[arrayIndex]);
		}
	}
}
