/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習2-10 p47
 *  右に示すように、名前の姓と名とを個別にキーボードから読み込んで、
 *  挨拶を行うプログラムを生成せよ。（右図省略）
 *
 * 回答:
 *  以下プログラムをご参照ください。
 *
 * パッケージ名:ensyu2_10
 * クラス名:ensyu2_10
 * 作成日:2022/11/4
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu2_10;

import java.util.Scanner;

public class ensyu2_10 {

	public static void main(String[] args) {

		//キーボード入力から値を取得するインスタンスを作成
		Scanner stdIn = new Scanner(System.in);

        //名前の入力を促す（姓のみ_上の名前）
		System.out.print("お名前は？\n" + "姓のみ。スペースなしで：");
		//名前を変数seiへ代入する
		String sei = stdIn.next();

		//名前の入力を促す（名のみ_下の名前）
		System.out.print("お名前は？\n" + "名のみ。スペースなしで：");
		//名前を変数meiへ代入する
		String mei = stdIn.next();

		//seimeiさんに挨拶を表示
		System.out.println("こんにちは。" + sei + mei + "さん！");

	}
}
