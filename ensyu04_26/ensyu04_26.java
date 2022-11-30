/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-26 p129
 * 	合計だけでなく平均も求めるように List 4-19 のプログラムを書き換えよ。
 *  なお、読み込んだ負の数の個数は平均を求める際の分母から除外すること。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_26
 * クラス名:ensyu04_26
 * 作成日:2022/11/14
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_26;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_26 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//加算する個数の入力を促す
		System.out.println("整数を加算します。");
		System.out.println("何個加算しますか？：");

		//インスタンスを用いて、入力値を変数upToへ代入
		int upTo = scannerInstance.nextInt();

		//合計値を加算する先の変数をsumNumbersとおき、初期化のため0を入れる。
		int sumNumbers = 0;

		//平均値を変数averageNumbersとおき、初期化のため0を入れる。
		int averageNumbers = 0;

		//入力値のうち、負の数の個数を変数negativeNumberと置き、初期化のため0を入れる。
		int negativeNumber = 0;

		//ループの回数カウンタを変数countNumberとおく
		//ループごとにcountNumberをインクリメントし、upTo個加算するために、upTo回ループを繰り返す
		for (int countNumber = 1; countNumber <= upTo; countNumber++) {

			//countNumberがupToになっていなくても、負の数を入力すると加算せず飛ばす旨を表示し、
			//加算する整数の入力を促す
			System.out.print("整数（負の数は加算しません）：");

			//入力値を変数positiveNumberに代入
			int positiveNumber = scannerInstance.nextInt();

			//positiveNumberが負の数ならば、加算しない条件分岐を書く
			if(positiveNumber < 0) {
				//変数negativeNumberを1インクリメントする
				negativeNumber++;
				//平均値を求める式を書く（ 合計値 / 加算した数字の個数 )
				averageNumbers = sumNumbers / countNumber;
				//ループの「sumNumberへ入力値を加算する」ところを飛ばす。
				continue;
			}
			//positiveNumberが正の数であれば、加算しそのままループを継続
			sumNumbers += positiveNumber;
			//平均値を求める式を書く（ 合計値 / (加算した数字の個数 - 負の数の個数) )
			averageNumbers = sumNumbers / (countNumber - negativeNumber);
		}
		//合計値を表示
		System.out.println("合計は" + sumNumbers + "です。");
		//平均値を表示
		System.out.println("平均は" + averageNumbers + "です。");

	}

}
