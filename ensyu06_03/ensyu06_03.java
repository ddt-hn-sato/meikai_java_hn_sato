/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-03 p185
 * 	要素型がdouble型で要素数が5の配列の要素に対して、
 *  先頭から順に 1.1 2.2 3.3 4.4 5.5 を代入して、表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_03
 * クラス名:ensyu06_03
 * 作成日:2022/11/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_03;

public class ensyu06_03 {

	public static void main(String[] args) {
		//要素型がdouble型で要素数が5の配列を配列変数doubleArrayへ初期化
		double[] doubleArray = new double[5];

		//要素の値を変数componentNumberと宣言する。
		double componentNumber;

		//インデックスを変数arrayIndexとおき、0以上5未満まで、
		//つまり0,1,2,3,4と、1ずつインクリメントさせるループ
		for(int arrayIndex = 0; arrayIndex < doubleArray.length; arrayIndex++) {

			//arrayIndexの、0以上4以下へのループごとの増加に伴い
			//componentNumberが1.1以上5.5以下の値をとるよう、componentNumberを初期化
			componentNumber = 1.1 + (double)arrayIndex * 1.1;

			//arrayIndexが0以上4以下までループごとに増加するので、
			//componentNumberが1.1以上5.5以下の値をとり、arrayNumberへ代入される。
			doubleArray[arrayIndex] = componentNumber;

			//intArrayから、インデックスごとに値を取り出し表示する
			System.out.print("doubleArray[" + arrayIndex + "] = ");
			System.out.printf("%1.1f\n" , doubleArray[arrayIndex]);

			//componentNumberを1.1から5.5ずつデクリメントさせる
			componentNumber += 1.1;
		}
	}
}
