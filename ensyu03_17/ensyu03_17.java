/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-17 p83
 *  0,1,2のいずれかの値の乱数を生成し、0であれば"グー"を、1であれば"チョキ"を
 *  2であれば"パー"を表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_17
 * クラス名:ensyu03_17
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_17;

//Randomクラスをインポートする
import java.util.Random;

public class ensyu03_17 {

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random rand = new Random();

		//インスタンスを用いて変数HANDへ乱数を代入
		int HAND = rand.nextInt(3);

		//switch文を用いた条件分岐
		switch (HAND) {
			//case 0から2
			case 0: System.out.println("グー");
				break;
			case 1: System.out.println("チョキ");
				break;
			case 2: System.out.println("パー");
				break;
		}
	}
}
