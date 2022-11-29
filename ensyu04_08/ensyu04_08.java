/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-08 p113
 * 	右に示すように、正の整数値を読み込んで、その桁数を出力する
 *  プログラムを出力せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_08
 * クラス名:ensyu04_08
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_08;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_08 {

	public static void main(String[] args) {

		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//入力を促す
		System.out.println("桁数を求めます。");
		System.out.println("正の整数値：");
		//入力値を変数nとして宣言
		int n = ins.nextInt();

		//nが正の整数でないとき、もう一度入力させる
		do{
			if (n < 0) {
				//負の整数が入力されているため、正の整数を入れるよう促す
				System.out.println("※「正」の整数を入力してください。：");
				//入力値を変数nとして代入
				n = ins.nextInt();
			} else {
					; //空文。桁数カウンターの話へ進んでよい
			}
		} while (n < 0);

		//桁数カウンターとしての変数countを初期化
		int count = 0;

		//入力値を10で割った商を変数xとし、型を宣言
		int x = n / 10;

		//xが0より大きい限り（つまり桁数が2以上）10で割り続けるループ
		while (x > 0) {
			++count;
			x = x / 10;
		}

		//x <= 0の場合の条件分岐を
		//countの加算を終えたのか、nが負の整数か、nが0以上9以下かで場合分け
		if (count > 0) {
			System.out.println("桁数は" + count + "桁です。");
		} else {
			if (n > 0) {
				++count;
				System.out.println("桁数は" + count + "桁です。");
			} else {
				; //有り得ないはずなので空文
			}
		}
	}
}
