/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-21 p125
 * 	List 4-16 は左下側が直角の直角三角形を表示するプログラムであった。
 * 直角が左上側、右下側、右上側の三角形を表示するプログラムをそれぞれ作成せよ。
 *
 * 注：
 *  ★本クラス 演習04-21-01：左上側
 *             演習04-21-02：右下側
 *             演習04-21-03：右上側 の三角形を表示するプログラムを作成しております。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_21
 * クラス名:ensyu04_21_01
 * 作成日:2022/11/10
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_21;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_21_01 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner (System.in);

		//左上直角の三角形を表示する旨
		System.out.println("左上直角の三角形を表示します。");

		//段数の入力を促す
		System.out.println("段数は：");

		//入力値を変数upperLeftへ代入
		int upperLeft = scannerInstance.nextInt();

		//外側for文：内側for文がupperLeft回ループするごとに、改行するループ
		for (int countNumber = upperLeft; countNumber > 0; countNumber--) {

			//内側for文：AsteriskNumberはcountNumberから1まで、ループごとに1ずつデクリメントされる
			//1行にAsteriskNumber個の * が表示され、AsteriskNumberの中身が0以下になった時点で、
			//内側for文の処理が終了する。
			for (int AsteriskNumber = countNumber; AsteriskNumber > 0 ; AsteriskNumber--) {
				System.out.print('*');
			}
			//AsteriskNumber !> 0すなわち、AsteriskNumberが0になった時点で
			//内側for文を抜けこの改行処理が入る。
			System.out.println();
		}
	}
}
