/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習05-06 p169
 * 	List 5- 9 のように、float型の変数を0.0から1.0まで0.001ずつ増やしていく様子と、
 *  List 5-10 のように、int型の変数を0から1000までインクリメントした値を1000で割った値を
 *  求める様子を、横に並べて表示するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu05_06
 * クラス名:ensyu05_06
 * 作成日:2022/11/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu05_06;

public class ensyu05_06 {

	public static void main(String[] args) {

		//出力結果1行目を表示
		System.out.println("      float      |       int       ");
		//出力結果2行目を表示
		System.out.println("-----------------+-----------------");

		//表示に用いる、float型の変数を変数floatNumberとおき、初期化する。
		float floatNumber = 0f;
		//表示に用いる、int型の変数を変数intNumberとおき、初期化する。
		int intNumber = 0;

		//0以上1000以下の範囲でインクリメントされる、ループ回数のカウンタを変数loopsCounterとおき
		//floatNumberとintNumberのインクリメントを増減式に書く。
		//intNumberは、問題での指定の通り、「0から1000までインクリメントした値」を1000で割り求める。
		//その「」内を増減式の中で作る。
		//loopsCounterは1001回回ってループを抜けるよう設定、初期値はループの中で使いやすいよう0とする。
		for (int loopsCounter = 0; loopsCounter <= 1000; loopsCounter++, floatNumber += 0.001f, intNumber++) {

			//floatNumberの計算結果の表示で、見やすさのためスペースを挿入
			System.out.print("    ");
			//floatNumberの計算結果を表示
			System.out.printf("%8.7f" ,floatNumber);
			//見やすさのためスペースを挿入
			System.out.print("    ");

			//intNumberの計算結果の表示で、見やすさのためスペースを挿入
			System.out.print("|    ");
			//intNumberの計算結果を表示
			System.out.printf("%8.7f" ,((float)intNumber) / 1000);
			//見やすさのためスペースを挿入し、次の行のため改行
			System.out.println("    ");
		}

		//出力結果終了を表示
		System.out.println("-----------------+-----------------");
	}
}
