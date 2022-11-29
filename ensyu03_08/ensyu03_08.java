/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-08 p69
 * キーボードから読み込んだ点数に応じて、優・良・可・不可を判定して
 * 表示するプログラムを作成せよ。判定は以下のように行うこと。
 *
 *  0-59 → 不可 / 60-69 → 可 / 70-79 → 良 / 80-100 → 優
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_08
 * クラス名:ensyu03_08
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_08;

//Scannerをインポートする
import java.util.Scanner;

public class ensyu03_08 {

	public static void main (String[] args) {

		// キーボードから値を取得するインスタンスを作成する
		Scanner ins = new Scanner(System.in);

		// 点数の入力を促す
		System.out.println("0～100の数字を入力してください。\n判定を返します。");

		// インスタンスを用いて変数scoreに値を入力
		int score = ins.nextInt();

		// 以下のif-else文で、scoreが優・良・可・不可のどれなのか条件分岐させる
		// 0-59 → 不可
		if (score >= 0 && score <= 59)
			System.out.println("不可です");
		// 60-69 → 可
		else if (score >= 60 && score <= 69)
			System.out.println("可です");
		// 70-79 → 良
		else if (score >= 70 && score <= 79)
			System.out.println("良です");
		// 80-100 → 優
		else if (score >= 80 && score <= 100)
			System.out.println("優です");
		else
			System.out.println("存在しない点数です");

	}
}
