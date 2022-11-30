/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-15 p121
 * 	身長と標準体重の対応表を表示するプログラムを作成せよ。
 *  表示する身長の範囲（開始値 / 終了値 / 増分）は、
 *  整数値として読み込むこと。
 *
 *  ※ 例
 *   何㎝から：150
 *   何㎝まで：153
 *   何㎝ごと：1
 *   →結果として下記が表示される
 *
 *   身長   標準体重
 *    150   45
 *    151   45
 *    152   46
 *    153   47
 *
 *  ※ 標準体重は（身長 - 100） * 0.9 によって求めよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_15
 * クラス名:ensyu04_15
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_15;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_15 {

	public static void main(String[] args) {

		//インスタンスを作成
		Scanner ins = new Scanner(System.in);

		//説明
		System.out.println("身長と体重の対応表を作成します。");

		//from, to, byを初期化
		int from, to, by;

		do {
			//注意書き
			System.out.println("\n※何㎝から ＜= 何㎝まで となるように入力してください：");

			//何㎝から、の入力を促す
			System.out.print("\n・何㎝から：");
			//fromに代入
			from = ins.nextInt();

			//何㎝まで、の入力を促す
			System.out.print("・何㎝まで：");
			//toに代入
			to = ins.nextInt();
		} while (from > to);

		do {
			//注意書き
			System.out.println("\n※何㎝から ～ 何㎝まで の 範囲以下の\n値で入力してください：");

			//何センチごと、の入力を促す
			System.out.print("\n・何㎝ごと：");
			//byに代入
			by = ins.nextInt();
			//to - from >= by かどうか、trueなら以降進める
			//つまり    <     ならループするように書く
		} while (to - from < by);

		//表の1行目
		System.out.println("\n身長" + "     "+ "体重");

		for (double weight ; from < to; from += by) {
		//表の2行目
		weight = (from - 100) * 0.9;
		System.out.println(" " + from + "     " + weight);
		}

		//表の最終行に表示
		System.out.println("\n- - - - - 以上 - - - - -");
	}
}
