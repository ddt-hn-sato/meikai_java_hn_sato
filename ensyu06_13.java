/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_13 p203
 * 	配列aの全要素を配列bに対して逆順にコピーするプログラムを作成せよ。
 *  なお、２つの配列の要素数は同一であると仮定してよい。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_13
 * クラス名:ensyu06_13
 * 作成日:2022/11/29
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_13{

	public static void main(String[] args) {

		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//要素数を変数elementNumberへ代入
		int elementNumber = scannerInstance.nextInt();
		//配列をA,Bと宣言する
		int[] intArrayA = new int[elementNumber];
		int[] intArrayB = new int[elementNumber];
		
		//配列Aに、値を代入
		for (int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
			
			//要素の値の入力を促す
			System.out.print(" intArrayA[" + indexNumber + "] = ");
			//入力値を変数arrayElementへ代入
			int arrayElement = scannerInstance.nextInt();
			//配列Aに値を代入
			intArrayA[indexNumber] = arrayElement;
		}
		
		//見やすさのため改行
		System.out.println();
		
		//配列Bに、配列Aの要素の値を代入
		for (int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
			
			intArrayB[elementNumber - indexNumber - 1] = intArrayA[indexNumber];
		}
		
		//表示
		System.out.println("intArrayAの全要素を「逆順に」intArrayBにコピーしました。");
		
		//配列Bの値を表示
		for (int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {

			System.out.println(" intArrayB[" + indexNumber + "] = " + intArrayB[indexNumber]);
		}
	}
}