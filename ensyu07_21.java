/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_21 p255
 *  配列 a と配列 b の全要素の値を交換するメソッド aryExchng を作成せよ。
 *  	
 *  	void aryExchng(int[] a, int[] b)
 *  
 *  2つの配列の要素スが等しくない場合は、小さいほうの要素数分の要素を交換すること。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_21
 * クラス名:ensyu07_21
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_21 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//配列 a の要素と、配列 b の要素を、入れ替えるメソッド
	static void aryExchng(int[] a, int [] b) {
		
		//返却する配列変数を、まずaで初期化する
		int[] arrayShorter = a;
		
		//もう一つの配列変数をbで初期化する
		int[] arrayLonger = b;
		
		
		//配列の長さが a > b であれば、aとbを置き換える
		if (a.length > b. length) {
			arrayShorter = b;
			arrayLonger = a;
		}
		
		//indexNumberがarrayShorterの要素数ぶん回り、交換を行うループ
		for( int indexNumber = 0; indexNumber < arrayShorter.length ; indexNumber++ ) {
			
			//変数exchangeNumberを用いて値の交換を行う
			int exchangeNumber = arrayShorter[indexNumber];
			
			//arrayLongerの値をarrayShorterへコピー
			arrayShorter[indexNumber] = arrayLonger[indexNumber];
			
			//exchangeNumberの値をarrayLogerへコピーし、交換完了
			arrayLonger[indexNumber] = exchangeNumber;
		}
		
		//配列の長さが a > b であれば、aにlonger, bにshorterの配列を格納
		if (a.length > b. length) {
			b = arrayShorter;
			a = arrayLonger;
		} else{
			//配列の長さが a < b もしくは、a = b であれば、bにlonger, aにshorterの配列を格納
			a = arrayShorter;
			b = arrayLonger;
		}
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
		
		// - - - 配列bの作成 - - -
		//入力を促す
		System.out.print("配列bの要素数：");
		//入力値で変数を初期化する
		int elementNumberB = scannerInstance.nextInt();
		//要素数がelementsNumberの配列aを生成
		int[] b = new int[elementNumberB];
		
		//入力値を値として、要素に格納していく
		for(int indexNumber = 0; indexNumber < elementNumberB; indexNumber++) {
			//配列bの要素の値の入力を促す
			System.out.print("  b [ " + indexNumber + " ] = ");
			//入力値を要素に格納する
			b[indexNumber] = scannerInstance.nextInt();
		}
		
		//値を入れ替えるメソッド
		aryExchng(a, b);
		
		//結果の説明
		System.out.println("\n配列 a [ " + elementNumberA + " ] と "
				+ "配列 b [ " + elementNumberB + " ] を置換しました。");
		
		//見やすさのため改行
		System.out.println();
		
		
		//配列aを表示
		for(int indexNumber = 0; indexNumber < a.length; indexNumber++) {
			//配列aの要素の値の値を表示
			System.out.println("  a [ " + indexNumber + " ] = " + a[indexNumber]);
		}
		
		//見やすさのため改行
		System.out.println();
		
		//配列bを表示
		for(int indexNumber = 0; indexNumber < b.length; indexNumber++) {
			//配列aの要素の値の値を表示
			System.out.println("  b [ " + indexNumber + " ] = " + b[indexNumber]);
		}
	}
}


