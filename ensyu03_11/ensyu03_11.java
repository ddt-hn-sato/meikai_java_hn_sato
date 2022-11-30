/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-11 p71
 * 右に示すように、二つの整数値を読み込んで、
 * それらの値の差が10以下であれば「それらの差は10以下です。」と表示し、
 * そうでなければ「それらの差は11以上です。」と表示するプログラムを作成せよ。
 * （右図省略）
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  if文を使わない書き方の練習がしたく、条件演算子で書いています。
 *
 * 補足:
 * 	50行目で変数SAに絶対値を入れる理由：もし単に、First-Secondの計算結果を変数SAと置いた場合
 *  例えばFirstが30、Secondが100といった、差の絶対値が10より大きい場合であっても、
 *  「それらの差は10以下です」と判定されてしまうので、これを防ぐため。
 *
 * パッケージ名:ensyu03_11
 * クラス名:ensyu03_11
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_11;

// Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_11 {

	public static void main(String[] args) {

		// キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		// キーボード入力を促す
		System.out.println("1つめの整数値：");
		// インスタンスを用いて、変数Firstに代入する
		int First = ins.nextInt();

		// キーボード入力を促す
		System.out.println("2つめの整数値：");
		// インスタンスを用いて、変数Secondに代入する
		int Second = ins.nextInt();

		// First-Secondの計算結果を変数SAと置くが
		// このとき、変数SAには厳密には絶対値を入れたいため、もし計算結果が負であれば（-1）をかける。
		int SA = First - Second < 0 ? (First - Second) * (-1) : First - Second;

		// 変数SA（First-Secondの計算結果の絶対値）が10以下の場合をtrueとする。
		System.out.println("それらの差は" + (SA <= 10 ? "10以下" : "11以上") + "です。");
	}
}

