/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_15 p205
 * 	曜日を表示して、その英語表現を入力させる英単語学習プログラムを
 *  作成せよ。
 *  	・出題する曜日は乱数で生成する。
 *  	・学習者が望む限り、納戸でも繰り返せる。
 *  	・同一曜日を連続して出題しない。
 *  文字列 s1 と s2 が等しい（すべての文字が等しい）かどうかの判定は、
 *  s1.equals(s2)によって行える。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_15
 * クラス名:ensyu06_15
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

public class ensyu06_15{

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//曜日の日本語名での、文字列での配列を作成
		String[] stringJapanese = {
				"月", "火", "水", "木", "金", "土", "日"
		};
		
		//曜日の英語名での、配列を作成
		String[] stringEnglish = {
				"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"
		};
		
		//説明
		System.out.println("英語の曜日名を小文字で入力してください。");
		
		//0-6の乱数を生成（配列のインデックスを乱数で取り出す）
		int randomDay = randomInstance.nextInt(7);
		//次の問題の変数を宣言しておく
		int randomDayRe;

		//入力値を代入する変数guessingDayを宣言
		String guessingDay;
		
		//変数wannaLoopを宣言
		int wannaLoop = 0;
		
		do {
			//曜日名の英語入力を促す
			System.out.print(stringJapanese[randomDay] + "曜日を英語で？：");
			//入力値を変数guessingDayに代入
			guessingDay = scannerInstance.next();
			
			//入力されたインデックスで取り出した要素が、配列の要素と一致するか評価
			if(guessingDay.equals(stringEnglish[randomDay])) {
				//一致するので「正解」とする
				System.out.println("正解！");
				//もし次回行うとして、次回用の問題を作成しておく
				randomDayRe = randomInstance.nextInt(7);
				//この問題が前回と被らないかどうか調査し、被らないようにしてから
				while(randomDayRe == randomDay) {
					randomDayRe = randomInstance.nextInt(7);
				}
				//randomDayにrandomDayReを代入
				randomDay = randomDayRe;
			} else 
				System.out.println("おしい！");
			//もう一度問題を解きたいかどうか
			System.out.println("もう一度？　0 = YES, 1 = NO");
			wannaLoop = scannerInstance.nextInt();
			
		} while (wannaLoop == 0);
	}
}