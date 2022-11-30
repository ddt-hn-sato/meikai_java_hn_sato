/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-19 p125
 * 	季節を求めるList 4-1 の月の読み込みにおいて、
 *  1 - 12 以外の値が入力された場合は、
 *  再入力させるように修正したプログラムを作成せよ。
 *  （do文の中にdo文が入る2重ループとなる。）
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_19
 * クラス名:ensyu04_19
 * 作成日:2022/11/10
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_19;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_19 {

	public static void main(String[] args) {

		// キーボードから値を取得するインスタンスを作成する
		Scanner scannerInstance = new Scanner(System.in);

		// 使う場所の近くでなく、ループ文の外という離れた場所でわざわざ宣言している理由としては
		// 代入はループごとに繰り返せるが、宣言を繰り返すことはできないため。
		// 以降のループ文の中で、入力値をmonthとおくが、その宣言のみここで行う。
		int month;

		// 同上の理由で、ここで、「もう一度季節の判定をするかどうかの判定に用いるための変数」を
		// retryOrNotとし宣言。
		int retryOrNot;


		do {

			// 月の入力を促す
			System.out.println("月を入力してください。\n春・夏・秋・冬を返します。");

			// インスタンスを用いて入力値をmonthに代入
			month = scannerInstance.nextInt();

			// monthが1未満、または、12より大きい場合は、注意文を表示し、再入力させる
			do {
				if(month < 1 || month >12) {
					//monthが1以上12以下である場合は注意文を表示する
					System.out.println("1 ～ 12 月のうちで入力してください：");
				// インスタンスを用いて入力値をmonthに代入
				month = scannerInstance.nextInt();
				}
			} while(month < 1 || month >12);

			// monthが1以上かつ12以下となったら以降の処理に移るため、
			// 以降ではmonthが春・夏・秋・冬の4つのうちどれなのかという条件分岐をする
			// monthが1以上かつ12以下かつ3以上5以下の値、つまり3か4か5の場合は春と表示
			if (month >= 3 && month <= 5)
				System.out.println("春です");
			// monthが1以上かつ12以下かつ6以上8以下の値、つまり6か7か8の場合は夏と表示
			else if (month >= 6 && month <= 8)
				System.out.println("夏です");
			// monthが1以上かつ12以下かつ9以上11以下の値、つまり9か10か11の場合は秋と表示
			else if (month >= 9 && month <= 11)
				System.out.println("秋です");
			// monthが1以上かつ12以下かつ3～11以外の値、つまり1か2か12の場合は冬と表示
			else
				System.out.println("冬です");

			// もう一度季節の判定をするかどうか入力を促す
			System.out.println("もう一度？ 1…Yes / 0…No：");

			// もう一度季節の判定をするかどうかの判定に用いるための変数retryOrNotに、入力値を代入
			retryOrNot = scannerInstance.nextInt();

		// retryOrNotが1である限り、繰り返し季節の判定を行う
		} while (retryOrNot == 1);

		// 繰り返さず終了する旨表示
		System.out.println("終了します。");
	}
}
