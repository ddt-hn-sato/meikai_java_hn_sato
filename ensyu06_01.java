/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-01 p183
 * 	要素型がdouble型で要素数が5の配列をを生成して、
 *  その全要素の値を表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_01
 * クラス名:ensyu06_01
 * 作成日:2022/11/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter06_archive;

public class ensyu06_01 {

	public static void main(String[] args) {
		//配列変数名をdoubleArrayとおき、構成要素数を5として初期化する。
		double[] doubleArray = new double[5];

		//インデックス0から4の値を、配列doubleArrayから取得し表示する。
		System.out.print("インデックス0は" + doubleArray[0]
			+ "、インデックス1は" + doubleArray[1]
			+ "、インデックス2は" + doubleArray[2]
			+ "、インデックス3は" + doubleArray[3]
			+ "、インデックス4は" + doubleArray[4]);
	}

}