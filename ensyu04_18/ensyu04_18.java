/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-18 p121
 * 	右に示すように、1 から n までの整数値の2乗値を
 *  表示するプログラムを作成せよ。（右図省略）
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_18
 * クラス名:ensyu04_18
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_18;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_18 {

	public static void main(String[] args) {

		//インスタンスを作成
		Scanner ins = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("nの値：");

		//入力値を変数nに代入
		int n = ins.nextInt();

		//nが1以上ならば通過、1未満ならば再入力を促す
		while (n < 1) {
			System.out.print("※ nは1以上の値を入力すること：");
			//nに入力値を代入
			n = ins.nextInt();
		}

		//以下のfor文では、iは1以上n以下の範囲の中で、初期値1としループごとにインクリメントされる
		//squにはiの2乗を初期値として入れ、iのインクリメントに応じ増加する
		for(int i = 1, squ = i * i; i <= n; ++i, squ = i * i) {
			//「iの2乗はsqu」と表示し見やすさのため改行
			System.out.println(i + "の2乗は" + squ);
		}
	}

}
