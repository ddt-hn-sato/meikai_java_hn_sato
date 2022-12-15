/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-12 p121
 * 	演習04-11とは逆に、0から正の整数値まで
 * カウントアップするプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_12
 * クラス名:ensyu04_12
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_12;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_12 {

	public static void main(String[] args) {
		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//入力を促す
		System.out.println("0からカウントアップします。正の整数値を入力：");

		//xを初期化
		int x;

		//xが0以下の場合、正の整数値を入力させる
		do {
			System.out.print("正の整数値：");
			x = ins.nextInt();
		} while (x <= 0);

/*		//★演習04-12回答 ※while文で実現
        //  xが正の整数値の場合、i をループごとにインクリメントし、ゼロ～xまで表示
		int i = 0;
		while (x > 0 && x >= i) {
			System.out.println(i);
			i++;
		}
*/
		//★演習04-12回答 ※for文で実現
		//  xが正の整数値の場合、i をループごとにインクリメントし、ゼロ～xまで表示
		int i = 0;
		for (x = x; x >= i; i++) {
			System.out.println(i);
		}
 	}
}
