/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-25-01 p129
 * 	合計だけでなく平均も求めるように List 4-17（p. 126）のプログラムを書き換えよ。
 *
 * 疑問：問題文中に指定がなかったため以下の①と②とで解釈に迷ったのですが
 *  例えば、sumNumbers = x + y + 0 の場合（3つ目の数字が0のため強制終了した場合）、
 *  	①平均値は (x + y + 0)/3 となる想定でプログラムを作成するという意味か
 *  	②(x + y)/2となる想定だったのか
 *  分かりませんでした。
 *
 * 一旦の対策:一般的な、平均値を求めたいときの考え方から推測すると
 * 	②の、平均値は (x + y)/2 となる想定が妥当かと思います。
 * 	また、0は単に「ループを強制終了するかどうかの意思表示」のような意味合いで使われていると
 *  捉えられるので、以下ではそのようにプログラムを作成しました。
 *
 * 【質問】
 * このプログラムの場合、変数averageNumbersに関しては、
 * 「sumNumbers / countNumber」とシンプルに書くこともできるため
 * わざわざ改めて置かなくてもよい変数かと存じますが
 * 一般的に、変数は置けば置くほど良いものでしょうか？
 * それとも、極力変数の数は増やさない方がよいものでしょうか？
 *
 * 回答:
 *  以下プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_25
 * クラス名:ensyu04_25_01
 * 作成日:2022/11/11
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_25;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_25_01 {

	public static void main(String[] args) {

		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//加算する個数の入力を促す
		System.out.println("整数を加算します。");
		System.out.println("何個加算しますか？：");

		//インスタンスを用いて、入力値を変数upToへ代入
		int upTo = scannerInstance.nextInt();

		//合計値を加算する先の変数をsumNumbersとおき、初期化のため0を入れる。
		int sumNumbers = 0;

		//平均値を変数averageNumbersとおき、初期化のため0を入れる。
		int averageNumbers = 0;

		//ループの回数カウンタを変数countNumberとおく
		//ループごとにcountNumberをインクリメントし、upTo個加算するために、upTo回ループを繰り返す
		for (int countNumber = 1; countNumber <= upTo; countNumber++) {

			//countNumberがupToになっていなくても、0を入力すると強制終了できる旨を表示し、
			//加算する整数の入力を促す
			System.out.print("整数（0を入力すると終了）：");

			//入力値を変数ifZeroに代入
			int ifZero = scannerInstance.nextInt();

			//ifZeroが0ならばループを強制終了する条件分岐の詳細を書く
			if(ifZero == 0) {
				//ifZeroが0ならば、その0は、加算する数字の個数としてカウントする必要はないため
				//countNumberを1デクリメントする。
				countNumber--;
				//平均値を求める式を書く（ 合計値 / 加算した数字の個数 )
				averageNumbers = sumNumbers / countNumber;
				//ループを強制終了する。
				break;
			}
			//ifZeroが0でなければ、加算しそのままループを継続
			sumNumbers += ifZero;
			//平均値を求める式を書く（ 合計値 / 加算した数字の個数 )
			averageNumbers = sumNumbers / countNumber;
		}
		//合計値を表示
		System.out.println("合計は" + sumNumbers + "です。");
		//平均値を表示
		System.out.println("平均は" + averageNumbers + "です。");
	}
}
