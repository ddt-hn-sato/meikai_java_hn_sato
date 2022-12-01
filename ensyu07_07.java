/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_07 p235
 * 	List 7-7 に示したnこの '*' を連続表示するメソッドputStarsを
 *  内部で List 7-8 のメソッドputStarsを呼び出すことによって、表示を行うように書き換えよ。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_07
 * クラス名:ensyu07_07
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_07 {
	
	//呼び出されたら '*' を表示するメソッドを作成
	static void newLine(int callCounter, char asteriskSign) {
		
		//呼ばれている回数ぶんだけ実行するループ
		for(int loopCounter = 1; loopCounter <= callCounter; loopCounter++) {
			// *を表示
			System.out.print(asteriskSign);
		}
	}
	
	//n回分 newLineメソッド呼び出す、メソッドを作成
	static void putStars(int callMethod) {
		
		//stairsNumber = callMethod回、newLineメソッドを呼び出す
		for (int callCounter = 1 ; callCounter <= callMethod; callCounter++) {
			
			//newLineメソッドを呼び出す
			newLine(callCounter, '*');
			//改行
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//表示する三角形の段数を入力させる
		System.out.print("段数は：");
		//入力値を変数へ代入
		int stairsNumber = scannerInstance.nextInt();

		//結果を表示
		putStars(stairsNumber);

	}
}