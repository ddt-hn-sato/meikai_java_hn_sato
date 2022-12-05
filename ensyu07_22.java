/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_22 p257
 *  配列 a と同じ配列（要素数が同じで、すべての要素の値が同じ配列）を生成して
 *  返却するメソッドafrrayCloneを作成せよ。 
 *  	
 *  	void arrayClone(int[] a)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_22
 * クラス名:ensyu07_22
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_22 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//配列 a と同じ配列（要素数が同じで、すべての要素の値が同じ配列）を
	//生成して返却するメソッド
	static int[] arrayClone(int[] a) {
		
		//返却する配列の長さを、まずa.lengthで初期化する
		int cloneLength = a.length;
		
		//返却する配列を生成、初期化する
		int[] cloneA = new int[cloneLength];
		
		//配列cloneAの要素に、配列aの要素を格納していく
		for(int indexNumber = 0; indexNumber < cloneLength; indexNumber++) {
			//入力値を要素に格納する
			cloneA[indexNumber] = a[indexNumber];
		}
		
		//cloneAを返却する
		return cloneA;
	}

	public static void main(String args[]) {
		
		// - - - 配列aの作成 - - -
		//入力を促す
		System.out.print("配列aの要素数：");
		//入力値で変数を初期化する
		int elementNumberA = scannerInstance.nextInt();
		//要素数がelementsNumberの配列aを生成
		int[] a = new int[elementNumberA];
		
		//入力値を値として、要素に格納していく
		for(int indexNumber = 0; indexNumber < elementNumberA; indexNumber++) {
			//配列aの要素の値の入力を促す
			System.out.print("  a [ " + indexNumber + " ] = ");
			//入力値を要素に格納する
			a[indexNumber] = scannerInstance.nextInt();
		}
		
		//全く同一の配列を作るメソッド
		arrayClone(a);
		
		//結果の説明
		System.out.println("\n配列 a [ " + elementNumberA + " ] と "
				+ "同一の配列 cloneA [ " + elementNumberA + " ] を作成しました。");
		
		//見やすさのため改行
		System.out.println();
		
		
		//配列aを表示
		for(int indexNumber = 0; indexNumber < a.length; indexNumber++) {
			//配列aの要素の値の値を表示
			System.out.println("  a [ " + indexNumber + " ] = " + a[indexNumber]);
		}
		
		//見やすさのため改行
		System.out.println();
		
		//同一の配列cloneAを表示
		for(int indexNumber = 0; indexNumber < arrayClone(a).length; indexNumber++) {
			//配列aの要素の値の値を表示
			System.out.println("  cloneA [ " + indexNumber + " ] = " + arrayClone(a)[indexNumber]);
		}
	}
}


