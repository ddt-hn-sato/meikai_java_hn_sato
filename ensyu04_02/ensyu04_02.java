/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-02 p99
 * 	2桁の整数値（10-99）を当てさせる＜数当てゲーム＞を作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_02
 * クラス名:ensyu04_02
 * 作成日:2022/11/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_02;

//Randomクラスをインポートする
import java.util.Random;
//Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu04_02 {

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random Rins = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner ins = new Scanner(System.in);

		//インスタンスを用いて変数Rinsへ、乱数を代入
		int Rnum = Rins.nextInt(90) + 10;

		//ゲーム開始の表示
		System.out.println("数当てゲーム開始！");
		System.out.println("10～99の数を当ててください。");

		//ループ処理で何度も宣言することはできないので、一度初期化する
		int x;
		do {
			//キーボード入力を促す
			System.out.println("いくつかな？");
			//入力された値を、インスタンスを用いて代入
			x = ins.nextInt();

			if (x > Rnum)
				//入力された値が正解よりも小さい場合
				System.out.println("もっと小さな数です");
			else if (x < Rnum)
				//入力された値が正解よりも	大きい場合
				System.out.println("もっと大きな数です");
			else
				; //空文
		} while (x != Rnum);

		System.out.println("正解です。");
	}
}

