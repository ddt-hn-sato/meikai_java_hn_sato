/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_05 p233
 * 	「こんにちは。」と表示して改行するメソッドhelloを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_05
 * クラス名:ensyu07_05
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_05 {
	
	//「こんにちは。」と表示して改行するメソッドhelloを作成
	static void hello(String aWord) {
		
		//表示したうえで改行するメソッドを作成
		System.out.print(aWord + "\n");

	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//表示したい言葉を入力させる
		System.out.print("表示したい言葉を入力：");
		//入力値を変数へ代入
		String aWord = scannerInstance.next();

		//結果を表示
		System.out.print("★"); hello(aWord);
		
		//改行されているかチェック
		System.out.print("メソッドによって改行されていれば、この行は、★から始まる行の1つ下の行に表示されます。");
	}
}