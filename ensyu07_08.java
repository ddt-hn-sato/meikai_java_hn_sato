/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_08 p235
 * 	a以上b未満の乱数を生成して、その値を返却するメソッドrandomを作成せよ。
 *  内部で乱数を生成する標準ライブラリを呼び出すこと。
 *  
 *  	int random(int a, int b)
 *  
 *  なお、bの値がaより小さい場合には、aの値をそのまま返却すること。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_08
 * クラス名:ensyu07_08
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

public class ensyu07_08 {
	
	//呼び出されたら、a以上b未満の乱数を生成するメソッドを作成
	static int random(int numberA, int numberB) {
		
		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		
		//bの値がaより小さい場合には
		if ( numberB < numberA ) {
			//aの値をそのまま返却。
			return numberA;
		}
		
		//a以上b未満の乱数を生成
		int randomNumber = numberA + randomInstance.nextInt(numberB);
		
		//a以上b未満の乱数を返却
		return randomNumber;
	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//説明
		System.out.println("a以上b未満の乱数を生成して、その値を返却します。");
		
		//整数値を入力させる
		System.out.print("aを入力：");
		//入力値を変数へ代入
		int numberA = scannerInstance.nextInt();
		
		//整数値を入力させる
		System.out.print("bを入力：");
		//入力値を変数へ代入
		int numberB = scannerInstance.nextInt();

		//結果を表示
		System.out.print(random( numberA, numberB ));

	}
}