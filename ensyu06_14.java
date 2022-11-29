/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_14 p205
 * 	月を1-12の数値として表示して、その英語表現を入力させる英単語学習プログラムを
 *  作成せよ。
 *  	・出題する月の値は乱数で生成する。
 *  	・学習者が望む限り、納戸でも繰り返せる。
 *  	・同一月を連続して出題しない。
 *  文字列 s1 と s2 が等しい（すべての文字が等しい）かどうかの判定は、
 *  s1.equals(s2)によって行える。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_14
 * クラス名:ensyu06_14
 * 作成日:2022/11/29
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Randomクラスをインポート
import java.util.Random;
//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_14{

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//月名の文字列での配列を作成
		String[] stringArray = {
				"January", "February", "March", "April", "May", "June", "July",
				"August", "September", "October", "November", "December"
		};
		
		//説明
		System.out.println("英語の月名を入力してください。"
				+ "\nなお、先頭は大文字で、2文字目以降は小文字とします。");
		
		//1-12の乱数を生成
		int randomMonth = 1 + randomInstance.nextInt(12);
		//次の問題の変数を宣言しておく
		int randomMonthRe;

		//入力値を代入する変数guessingMonthを宣言
		String guessingMonth;
		
		//変数wannaLoopを宣言
		int wannaLoop = 0;
		
		do {
			//月名の英語入力を促す
			System.out.print(randomMonth + "月を英語で？：");
			//入力値を変数guessingMonthに代入
			guessingMonth = scannerInstance.next();
			
			//入力された月名文字列が、配列の要素と一致するか評価
			if(guessingMonth.equals(stringArray[randomMonth - 1])) {
				//一致するので「正解」とする
				System.out.println("正解！");
				//もし次回行うとして、次回用の問題を作成しておく
				randomMonthRe = 1 + randomInstance.nextInt(12);
				
				//この問題が前回と被らないかどうか調査し、被らないようにしてから
				while(randomMonthRe == randomMonth) {
					randomMonthRe = 1 + randomInstance.nextInt(12);
				}
				//randomMothにrandomMonthReを代入
				randomMonth = randomMonthRe;
			} else 
				System.out.println("おしい！");
			//もう一度問題を解きたいかどうか
			System.out.println("もう一度？　0 = YES, 1 = NO");
			wannaLoop = scannerInstance.nextInt();
			
		} while (wannaLoop == 0);
	}
}