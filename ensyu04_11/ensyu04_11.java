/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-11 p121
 * 	正の整数値を0までカウントダウンするList 4-4 を
 *  for文で実現せよ。
 *
 * 回答:
 *  下記プログラム（//★演習04-11回答）をご参照ください。
 *
 * パッケージ名:ensyu04_11
 * クラス名:ensyu04_11
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_11;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_11 {

 	public static void main(String[] args) {
		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//入力を促す
		System.out.println("カウントダウンします。正の整数値を入力：");

		//xを初期化
		int x;

		//xが0以下の場合、正の整数値を入力させる
		do {
			System.out.print("正の整数値：");
			x = ins.nextInt();
		} while (x <= 0);

		//xが正の整数値の場合、ループごとにデクリメント
/*		while (x > 0) {
			System.out.println(x);
			x--;
		}
*/
		//★演習04-11回答
		//↑をfor文で実現
		for (; x >= 0; x--) {
			System.out.println(x);
		}
 	}
}
