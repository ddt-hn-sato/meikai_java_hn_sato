/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_10 p239
 * 	List 7 - 11 を拡張して、以下の４つの問題をランダムに出題するプログラムを作成せよ。
 *  
 *  	式0 x + y + z
 *  	式1 x + y - z
 *  	式2 x - y + z
 *  	式3 x - y - z
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_10
 * クラス名:ensyu07_10
 * 作成日:2022/12/01
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

public class ensyu07_10 {

	//続行の確認
	static boolean confirmRetry() {
		
		//0か1を代入する変数を置く
		int retryOr;
		
		do {
			//キーボードから値を取得するインスタンスを作成
			Scanner scannerInstance = new Scanner(System.in);
			//もう一度遊ぶか
			System.out.print("もう一度？ YES = 1, NO = 0：");
			//0か1が代入される
			retryOr = scannerInstance.nextInt();
		} while (retryOr != 1 && retryOr != 0);
		
		//返却値はboolean型
		return retryOr == 1;
	}
	
	//実引数に応じて式を割り当て計算結果を算出し、返却するメソッド
	static int trueAnswer(int signs4, int x, int y, int z) {
		
		//返却する値を宣言
		int answerNumber;
		
		//signs4が0なら式0・・・の条件分岐
		if (signs4 == 0) {
			//answerNumberを計算
			answerNumber = x + y + z;
			
		} else if (signs4 == 1) {
			//answerNumberを計算
			answerNumber = x + y - z;
			
		} else if (signs4 == 2) {
			//answerNumberを計算
			answerNumber = x - y + z;
			
		} else {
			//answerNumberを計算
			answerNumber = x - y - z;
		}
		
		//式の値を返却
		return answerNumber;
	}
	
	//signs4の値に応じて必要な式（ユーザーに入力を促す式）を表示するメソッド
	static void answerSentence(int signs4) {
		
		//signs4が0なら式0・・・の条件分岐
		if (signs4 == 0) {
			//式を表示
			System.out.print(" x + y + z = ");
			
		} else if (signs4 == 1) {
			//式を表示
			System.out.print(" x + y - z = ");
			
		} else if (signs4 == 2) {
			//式を表示
			System.out.print(" x - y + z = ");
			
		} else {
			//式を表示
			System.out.print(" x - y - z = ");
		}
	}
	
	public static void main(String args[]) {
			
		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボードから値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//暗算トレーニング
		do {
			//3つの乱数を生成
			int x = randomInstance.nextInt(900) + 100;
			int y = randomInstance.nextInt(900) + 100;
			int z = randomInstance.nextInt(900) + 100;
			
			//3つの乱数を表示
			System.out.println(" x = " + x + ", y = " + y + ", z = " + z + " です。");
			
			while (true) {
				//ランダムな式を出題するため、
				//式0 = 0
				//式1 = 1
				//式2 = 2
				//式3 = 3 のいずれかをランダムに変数へ代入
				int signs4 = randomInstance.nextInt(4);
				
				//式を割り当てたうえで答えを算出するメソッドでの計算結果を、
				//代入する
				int trueAnswer = trueAnswer(signs4, x, y, z);
				
				//答えを入力させる文字列を表示するメソッドを呼ぶ
				answerSentence(signs4);
				
				//答えをキーボードから読み込み、変数へ代入
				int usersAnswer = scannerInstance.nextInt();
				
				//正解するとbreak;
				if(usersAnswer == trueAnswer)
					break;
				
				//不正解の場合ここに到達するので、不正解メッセージを表示
				System.out.println("不正解！");
				
			}
		//「もう一度？」で「YES」つまり1が入力されたときはループを繰り返す
		} while(confirmRetry());
			
	}
}

