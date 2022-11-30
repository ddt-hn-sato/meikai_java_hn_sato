/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-24 p127
 * 	正の整数値を読込み、それが素数であるかどうかを判定するプログラムを作成せよ。
 * 素数とは、2以上n未満のいずれの数でも割り切ることができない整数nのことである。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_24
 * クラス名:ensyu04_24
 * 作成日:2022/11/11
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu04_24;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_24 {

	public static void main(String[] args) {

	 	//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//入力を促す
		System.out.println("入力した値が素数かどうか判定します。整数値：");

		//インスタンスを用いて、入力値を変数integerNumberへ代入
		int integerNumber = scannerInstance.nextInt();

		//約数の候補となる整数値を変数divisorCandidateとおく
		//なおintegerNumberを1で割った答えは自明なので、
		//divisorCandidateの初期値は1を飛ばして2と設定してよいと判断した
		for(int divisorCandidate = 2; divisorCandidate < integerNumber; divisorCandidate++) {
			//integerNumberがdivisorCandidateで割り切れる場合
			if (integerNumber % divisorCandidate == 0) {
				//integerNumberは素数ではない旨表示し、break
				System.out.println(integerNumber + "は、素数ではありません。");
				break;
			}
			//divisorCandidateが(integerNumber - 1)までインクリメントされてもなお、
			//1つ上のfor文でfalse判定であり続けた場合、integerNumberは素数であるといえる
			if(divisorCandidate == integerNumber - 1) {
				System.out.println(integerNumber + "は、素数です。");
			}
			//なおこの後、for文の初めに戻り divisorCandidateがインクリメントされると
			//divisorCandidate < integerNumber というfor文の条件式に当てはまらなくなり、処理が終了
		}
	}
}
