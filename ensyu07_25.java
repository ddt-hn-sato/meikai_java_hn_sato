/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_25 p257
 *  配列 a から要素 a[idx] を先頭とするn個の要素を削除した配列を
 *  返却するメソッド arrayRmvOfN を作成せよ。
 *  
 *  	int[] arrayRmvOfN(int[] a, int idx, int n)
 *  
 *  削除は a[idx] より後ろの全要素をn個前方にずらすことによって行うこと。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_25
 * クラス名:ensyu07_25
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_25 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//配列 a から要素 a[idx] を先頭とするn個の要素を削除した配列を返却するメソッド
	static int[] arrayRmvOfN(int[] a, int idx, int n) {
		
		//返却する配列を初期化。要素の個数は、aからnつ削除するので(a.length - n)
		int[] removedArray = new int[a.length - n];
		
		//削除する要素以外の要素を、aからremovedArrayへコピーする
		//indexNumberA がaのインデックス、indexNumberRがremovedArrayのインデックスを表す
		for (int indexNumberA = 0, indexNumberR = 0; indexNumberR < a.length - n; indexNumberA++, indexNumberR++) {
			
			//削除する要素のインデックスはコピーしない。
			//かつ、indexNumberをデクリメントする
			if (indexNumberA >= idx && indexNumberA <= idx + n - 1) {
				indexNumberR--;
				continue;
			}
			//削除する要素以外をコピーしてくる
			removedArray[indexNumberR] = a[indexNumberA];
			
		}
		
		//返却する配列
		return removedArray;
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
		
		//削除するインデックスの入力を促す
		System.out.print("削除したいインデックス（始点）: ");
		//入力値で変数を初期化する
		int idx = scannerInstance.nextInt();
		
		//削除したい範囲の入力を促す
		System.out.print("削除したいインデックスの幅（範囲）: ");
		//入力値で変数を初期化する
		int n = scannerInstance.nextInt();
		
		//配列 a から要素 a[idx] を削除した配列を返却するメソッド arrayRmvOf を、呼び出す
		int[] removedArray = arrayRmvOfN(a, idx, n); 
		
		//結果の説明
		System.out.println("\n配列 a [ " + elementNumberA + " ] から、"
				+ "インデックスが" + idx + "～" + (idx + n - 1) + "までの"
				+ "インデックスを削除した、\n新しい配列 removedArray [ " + removedArray.length + " ] を表示します。");
		
		//見やすさのため改行
		System.out.println();
		
		//配列removedArrayを表示
		for(int indexNumberR = 0; indexNumberR < removedArray.length; indexNumberR++) {
			//配列removedArrayの要素の値の値を表示
			System.out.println(" removedArray [ " + indexNumberR + " ] = " + removedArray[indexNumberR]);
		}
	}
}


