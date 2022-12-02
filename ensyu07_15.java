/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_15 p251
 *  配列aの全要素の合計を求めるメソッド sumOf を作成せよ。
 *  	int sumOf(int[] a)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_15
 * クラス名:ensyu07_15
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_15 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//配列aの全要素の合計を求めるメソッド
	static int sumOf(int[] a) {
		
		//全要素の合計を求める、配列を、初期化する。
		int[] sumUp = a;
		//配列の全要素の合計値を初期化する
		int sumNumber = 0;
		
		//配列の要素を合計する
		for (int indexCounter = 0; indexCounter < sumUp.length; indexCounter++) {
			
			sumNumber += sumUp[indexCounter];
		}
		
		//合計値を返却
		return sumNumber;
	}

	public static void main(String args[]) {
		
		//入力を促す
		System.out.print("配列aの要素数：");
		//入力値で変数を初期化する
		int elementNumber = scannerInstance.nextInt();
		//要素数がelementsNumberの配列aを生成
		int[] a = new int[elementNumber];
		
		//入力値を値として、要素に格納していく
		for(int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
			//配列aの要素の値の入力を促す
			System.out.print("  a [ " + indexNumber + " ] = ");
			//入力値を要素に格納する
			a[indexNumber] = scannerInstance.nextInt();
		}
		
		//合計を求めるメソッドを呼び出し、計算結果を表示する。
		System.out.print("  → この配列 a の要素の合計値は" + sumOf(a) + "です。");	
	}
}


