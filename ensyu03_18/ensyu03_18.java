/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-18 p83
 *  月を1～12の整数値として読み込んで、それに
 *  対応する季節を表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu03_18
 * クラス名:ensyu03_18
 * 作成日:2022/11/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_18;

//Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_18 {

	public static void main(String[] args) {

		//キーボード入力から値を取得するインスタンスを作成
		Scanner key = new Scanner(System.in);

		//入力を促す
		System.out.println("1から12の月を入力：");

		//インスタンスを用いて変数monthへ、キーボード入力から値を代入
		int month = key.nextInt();

		//switch文を用いた条件分岐
		switch (month) {
			//case 1から12を、季節と対応させた。
			//12,1,2月を冬 3,4,5月を春 6,7,8月を夏 9,10,11月を秋とする
			case 1: System.out.println("冬");
				break;
			case 2: System.out.println("冬");
				break;
			case 3: System.out.println("春");
				break;
			case 4: System.out.println("春");
				break;
			case 5: System.out.println("春");
				break;
			case 6: System.out.println("夏");
				break;
			case 7: System.out.println("夏");
				break;
			case 8: System.out.println("夏");
				break;
			case 9: System.out.println("秋");
				break;
			case 10: System.out.println("秋");
				break;
			case 11: System.out.println("秋");
				break;
			case 12: System.out.println("冬");
				break;
			default: System.out.println("その月は存在しません");
				break;
		}
	}
}
