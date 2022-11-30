/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習05-07 p169
 * 	0.0から1.0まで0.001おきに、その値と、その値の2乗を
 *  表示するプログラムを作成せよ。
 *
 * 補足:
 *  見え方の指定がなかったので前問である05_06に倣いました
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu05_07
 * クラス名:ensyu05_07
 * 作成日:2022/11/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu05_07;

public class ensyu05_07 {

	public static void main(String[] args) {

		//出力結果1行目を表示
		System.out.println("     値      |     値の2乗     ");
		//出力結果2行目を表示
		System.out.println("-------------+-----------------");

		//表示に用いる変数を変数floatNumberとおき、初期化する。
		float floatNumber = 0f;
		//その値の2乗の表示に用いる変数を変数numberSquaredとおき、★floatNumberの2乗で初期化する。
		float numberSquared = floatNumber * floatNumber;

		//0以上1000以下の範囲でインクリメントされる、ループ回数のカウンタを変数loopsCounterとおく。
		//正確にnumberSquaredを算出するため、loopsCounterはintで置き、floatNumberに代入の際にキャストする。
		//loopsCounterは1001回回ってループを抜けるよう設定、初期値はループの中で使いやすいよう0とする。
		for (int loopsCounter = 0; loopsCounter <= 1000; loopsCounter++) {

			//正確にnumberSquaredを算出するため loopsCounter / 1000 をfloatNumberとおく
			floatNumber = (float)loopsCounter / 1000;
			//floatNumberの計算結果の表示で、見やすさのためスペースを挿入
			System.out.print("    ");
			//floatNumberの計算結果を表示
			System.out.printf("%4.3f" ,floatNumber);
			//見やすさのためスペースを挿入
			System.out.print("    ");

			//numberSquared = floatNumberの2乗、の計算をfloat型で計算
			numberSquared = floatNumber * floatNumber;
			//intNumberの計算結果の表示で、見やすさのためスペースを挿入
			System.out.print("|    ");
			//intNumberの計算結果を表示
			System.out.printf("%8.7f" ,numberSquared);
			//見やすさのためスペースを挿入し、次の行のため改行
			System.out.println("    ");
		}

		//出力結果終了を表示
		System.out.println("-------------+-----------------");
	}
}
