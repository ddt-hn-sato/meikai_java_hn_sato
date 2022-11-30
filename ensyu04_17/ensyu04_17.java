/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-17 p121
 * 	読み込んだ整数値のすべての約数を表示する List 4-13 を書き換えて、
 *  約数の表示が終わった後に、約数の個数を表示するプログラムを作成せよ
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_17
 * クラス名:ensyu04_17
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

//読み込んだ整数の約数を表示

package ensyu04_17;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_17 {

	public static void main(String[] args) {

		//インスタンスを作成
		Scanner ins = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("整数値：");

		//入力値を変数nに代入
		int n = ins.nextInt();

		//for文を用いて実現
		for(int i = 1, count = 1; n >= i; ++i) {
			//nをiで割り切れる場合だけ以下を実現するため
			//if文で分岐させる
			if(n % i == 0) {
				//約数を表示したら改行する
				System.out.println(i);
				//約数を表示した場合だけcountに加算する
				++count;
					//n = iの段階で、増減式は終わるため
					if(n == i) {
					System.out.println("約数は" + count + "こです。");
					}
			}
		}
	}

}
