/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-25-02 p129
 * 	合計だけでなく平均も求めるように List 4-18（p. 127）のプログラムを書き換えよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * 回答の補足:
 * 	sumNumbersが1000を超えた原因となった数字は加算せず、
 *  averageNumbersの計算もその数字は（加算の個数としても）除外して、平均値を出すプログラムにしています。
 * 	つまり、例えば、sumNumbers = 300 + 500 + 700 ←この700で1000を超えた場合
 *    ・sumNumbers = 800
 *    ・averageNumbers = (300 + 500) / 2 と計算されるようになっています。
 *
 * パッケージ名:ensyu04_25
 * クラス名:ensyu04_25_02
 * 作成日:2022/11/11
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_25;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_25_02 {

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

		//ループの回数カウンタを変数countNumberとおく
		//ループごとにcountNumberをインクリメントし、upTo個加算するために、upTo回ループを繰り返す
		for (int countNumber = 1; countNumber <= upTo; countNumber++) {

			//加算する整数の入力を促す
			System.out.println("整数：");
			//入力値を変数ifThousandに代入
			int ifThousand = scannerInstance.nextInt();

			//countNumberがupToになっていなくても、sumNumbers + ifThousand が1000を超えていれば
			//強制終了するという条件分岐
			if(sumNumbers + ifThousand > 1000) {
				//合計が1000を超えた旨表示する
				System.out.println("合計が1,000を超えました");
				System.out.println("最後の数値は無視します");
				//最後の数値を無視するのに伴い、加算する数字の個数としても無視するため
				//counNumberを1デクリメントする。
				countNumber--;
				//平均を求める式をかく
				averageNumbers = sumNumbers / countNumber;
				//ループを強制終了
				break;
			}
			//sumNumbers + ifThousand が1000を超えていなければ加算しそのままループを継続
			sumNumbers += ifThousand;
			//平均を求める式をかく
			averageNumbers = sumNumbers / countNumber;
		}
		//合計値を表示する
		System.out.println("合計は" + sumNumbers + "です。");
		//平均値を表示する
		System.out.println("平均は" + averageNumbers + "です。");
	}
}
