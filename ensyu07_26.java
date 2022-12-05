/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_26 p257
 *  配列 a の要素 a[idx] に値xを挿入した配列を返却する
 *  メソッド arrayInsOf を作成せよ。
 *  
 *  	int[] arrayInsOf(int[] a, int idx, int x)
 *  
 *  挿入に伴って、a[idx] より後ろの全要素を1つずつ後方にずらすこと。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_26
 * クラス名:ensyu07_26
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_26 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//配列 a から要素 a[idx] に値xを挿入した配列を返却するメソッド
	static int[] arrayInsOf(int[] a, int idx, int x) {
		
		//返却する配列を初期化。要素の個数は、aから1つずつずらすので(a.length + 1)
		int[] arrayModified = new int[a.length + 1];
		
		//挿入したxも込みで、aからarrayModifiedへコピーする
		//indexNumberA がaのインデックス、indexNumberMがarrayModifiedのインデックスを表す
		for (int indexNumberA = 0, indexNumberM = 0; indexNumberM < a.length + 1; indexNumberA++, indexNumberM++) {
			
			//挿入する要素のある、インデックス番号idxにおいてだけ、
			//a[indexNumberA]をコピーせず、arrayModified[indexNumberM] = x とする
			//かつ、indexNumberMをデクリメントすることで
			//arrayModifiedの、[idx]以降のコピーを行えるようにする
			if (indexNumberM == idx) {
				arrayModified[indexNumberM] = x;
				indexNumberA--;
				continue;
			}
			//挿入する要素以外は以下の式でコピーしてくる
			arrayModified[indexNumberM] = a[indexNumberA];
			
		}
		
		//返却する配列
		return arrayModified;
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
		
		//挿入するインデックスの入力を促す
		System.out.print("挿入したいインデックス: ");
		//入力値で変数を初期化する
		int idx = scannerInstance.nextInt();
		
		//挿入したい値の入力を促す
		System.out.print("挿入したい値: ");
		//入力値で変数を初期化する
		int x = scannerInstance.nextInt();
		
		//配列 a から要素 a[idx] に値xを挿入した配列を返却するメソッドを、呼び出す
		int[] arrayModified = arrayInsOf(a, idx, x); 
		
		//結果の説明
		System.out.println("\n配列 a [ " + elementNumberA + " ] から、"
				+ "要素 a [ " + idx + " ] に値xを挿入した新しい配列 "
						+ "arrayModified [ " + arrayModified.length + " ] を表示します。");
		
		//見やすさのため改行
		System.out.println();
		
		//配列arrayModifiedを表示
		for(int indexNumberM = 0; indexNumberM < arrayModified.length; indexNumberM++) {
			//配列arrayModifiedの要素の値の値を表示
			System.out.println(" arrayModified [ " + indexNumberM + " ] = " + arrayModified[indexNumberM]);
		}
	}
}