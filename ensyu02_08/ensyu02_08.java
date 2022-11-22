/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-8 p45
 * 	キーボードから読み込んだ整数値プラスマイナス5の範囲の
 *  整数値をランダムに生成して表示するプログラムを作成せよ。
 * 回答:
 *  以下プログラムをご参照ください。
 *
 * パッケージ名:ensyu2_8
 * クラス名:ensyu2_8
 * 作成日:2022/11/2
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu02_08;

//Randomクラスをインポートする
import java.util.Random;
//Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu02_08 {

	public static void main(String[] args) {

		// Randomクラスを使って、抽出装置としてrdm（任意の変数）を使うことを宣言
		Random rdm = new Random();

		//キーボード入力を促す
		System.out.print("整数値：");

		// Scannerクラスを使って、抽出装置としてinput（任意の変数）を使うことを宣言し
		// キーボードへ入力された値を受け取るインスタンスを作成
		Scanner input = new Scanner(System.in);

		// キーボードから読み込んだinputの+-5の範囲の乱数
		// つまり【  「input-5」以上、    「input+6」未満】をluckyへ代入する。
		// つまり【0+「input-5」以上、 11+「input-5」未満】
		int lucky = input.nextInt() + rdm.nextInt(11) -5;

		// 代入された乱数を表示
		System.out.println("その値の±5の乱数を生成しました。" + "それは" + lucky + "です。");

	}

}