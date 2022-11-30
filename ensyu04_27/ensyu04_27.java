/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-27 p132
 * 	List 4-3 の数当てゲームのプレーヤが入力できる回数に制限を設けたプログラムを作成せよ。
 *  制限回数に当てはまらなかった場合は、正解を表示してゲームを終了すること。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * 教本の内容を反映させた点:
 * 	●
 *
 * パッケージ名:ensyu0●_0●
 * クラス名:ensyu0●_0●
 * 作成日:2022/11/●
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_27;

//Randomクラスをインポートする
import java.util.Random;
//Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu04_27 {

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		//インスタンスを用いて変数randomInstanceへ、正解の値を代入
		int randomNumber = randomInstance.nextInt(100);

		//当てるまでの回数制限を変数guessingLimitとおく
		int guessingLimit = 10;

		//入力値を変数guessingNumberとおき、初期化のため0を入れる。
		int guessingNumber = 0;

		//ゲーム開始の表示
		System.out.println("＜数当てゲーム開始！＞\n");
		//回数制限を表示
		System.out.println("0～99の数を、【" + guessingLimit + "回】以内に当ててください。");

		//「guessingLimit回以内で、guessingNumberとrandomNumberの大小関係を判定する」for文に
		//Outerラベルを付ける。
		Outer:
			//現在何回目の数当てをしているかのカウンタを変数guessingCounterとおき、初期値を1とする。
			for (int guessingCounter = 1; guessingCounter <= guessingLimit; guessingCounter++) {
				//入力を促す
				System.out.print("いくつかな？:");
				//インスタンスを用いて変数guessingNumberへ、入力値を代入
				guessingNumber = scannerInstance.nextInt();

				while (guessingCounter ==guessingLimit && guessingNumber != randomNumber) {
					//guessingLimit回目にも、guessingNumberとrandomNumberが一致しなかった場合に
					//正解を表示してゲーム終了する。
					System.out.println(guessingLimit + "回以内に正解することが" +
						"できませんでした。\n正解は" + randomNumber + "でした。");
					//このwhile文ではなく外のfor文をbreak; するため記述
					break Outer;
				}
				//guessingNumberとrandomNumberの大小関係を判定
				if (guessingNumber > randomNumber) {
					//正解の値は入力値よりも小さい旨表示
					System.out.print("それよりは小さいです。");

				} else if (guessingNumber < randomNumber) {
					//正解の値は入力値よりも大きい旨表示
					System.out.print("それよりは大きいです。");

				} else {
					//guessingLimit回以内に正解した場合。正解の旨表示する。
					System.out.println("正解です。");
					//ゲーム自体を終了するため、Outerラベルのfor文をbreakする。
					//このとき「Outer」の記載は必須ではないが、練習のためつけた。
					break Outer;
				}

			}
		//ゲーム終了のしるし
		System.out.println("\n＜ゲーム終了です！＞");
	}
}
