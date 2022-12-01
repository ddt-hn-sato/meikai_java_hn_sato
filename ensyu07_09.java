/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_09 p239
 * 	「正の整数値：」と表示して、キーボードから正の整数値を読み込んで、
 *  その値を返却するメソッドreadPlusIntを作成せよ。
 *  0や負の値が入力されたら再入力させること。右の例であれば、15を返却する。
 *  
 *  	int readPlusInt()
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_09
 * クラス名:ensyu07_09
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_09 {
	
	//キーボードから正の整数値を読み込んで、
	//その値を返却するメソッドreadPlusIntを作成
	static int readPlusInt(int integerNumber) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//キーボードからの入力値が正の値であれば
		if (integerNumber > 0) {
			; //値をそのまま返すためこのif文を抜ける
		} else {
			do {
			//キーボードからの入力値が0か、負の値であれば
			//再入力が必要な旨表示する
			System.out.print("再入力が必要です。：");
			//新しい入力値を変数へ代入
			integerNumber = scannerInstance.nextInt();
			} while ( integerNumber <= 0 );
		}
		return integerNumber;
	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//正の整数値を入力させる
		System.out.print("正の整数値：");
		//入力値を変数へ代入
		int plusInteger = scannerInstance.nextInt();

		//結果を表示
		System.out.print(readPlusInt(plusInteger));
	}
}

