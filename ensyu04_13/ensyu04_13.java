/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-13 p121
 * 	1 から n までの和を求める List 4-10 をfor文で実現せよ。
 *
 * 回答:
 *  下記プログラム（//★演習04-13回答 以降）をご参照ください。
 *
 * パッケージ名:ensyu04_13
 * クラス名:ensyu04_13
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_13;

//Scannerクラスをインポート
import java.util.Scanner;


public class ensyu04_13 {

	public static void main(String[] args) {
		//インスタンスを作成
		Scanner ins = new Scanner(System.in);

		//説明
		System.out.println("1からnまでの和を求めます");

		//nを初期化
		int n;

		do {
			//入力を促す
			System.out.println("nの値：");
			//nに入力値を代入
			n = ins.nextInt();
		} while (n <= 0);

		//n>0が以降の処理に入る

		//List4-10のプログラム
/*		int sum = 0; //合計
		int i = 1; //回数

		while (i <= n) {
			//iが1～nになるまで足していくループ
			sum += i;
			i++;
		}
*/
		int sum = 0; //合計
		int i = 1; //回数

		//★演習04-13回答
		for (; n >= i; i++) {
			sum+= i;
		}
		//結論
		System.out.println("1から" + n + "までの和は" + sum + "です");
	}
}
