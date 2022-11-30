/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習03-01 p59
 * 	右に示すように、整数値を読み込んで、その絶対値を求めて
 *  表示するプログラムを作成せよ。（右図省略）
 *
 * 回答:
 *  下記プログラムを参照ください。
 *
 * パッケージ名:ensyu03_01
 * クラス名:ensyu03_01
 * 作成日:2022/11/4
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu03_01;

//Scannerクラスをインポートする
import java.util.Scanner;

public class ensyu03_01 {

	public static void main(String[] args) {

		//キーボード入力された値を受け取るインスタンスを作成
		Scanner seisuIns = new Scanner(System.in);

		//整数値の入力を促す
		System.out.print("整数値：");
		//入力された値をnumへ代入
		int num = seisuIns.nextInt();

		//以下の条件文まとめ：
		//numが0以上であれば絶対値はnum、numが0未満であれば絶対値は「num*(-1)」。

		//numが0以上であるか
		if (num >= 0)
			//numが0以上の場合、絶対値はnum。
			System.out.print("その絶対値は" + num + "です。");

		//「numが0以上」以外のケース、つまり「numが0未満」の場合
		else
			//numが0未満の場合、絶対値は「num*(-1)」。
			System.out.print("その絶対値は" + num*(-1) + "です。");
	}

}
