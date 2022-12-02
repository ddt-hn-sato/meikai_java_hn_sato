/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_19 p253
 *  配列 a から要素 a[idx] を先頭とする n 個の要素を
 *  削除するメソッド aryRmv を作成せよ。
 *  	
 *  	void aryRmvN(int[] a, int idx, int n)
 *  
 *  削除は a[idx] より後ろの全要素をn個前方に、上書きによってずらし行うこと。
 *  なお、移動せずに余ってしまう要素の値は変更しなくてよい。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_19
 * クラス名:ensyu07_19
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_19 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//TODO
	
	//配列 a から要素 a[idx] を削除するメソッド
	static int[] aryRmv(int[] a, int idx, int n) {
		
		//返却する配列変数を初期化する
		int[] partlyremovingA = a;
		//削除する要素のインデックスを初期化する
		int removingIdx = idx;
		//削除する幅を初期化する
		int removeWidth = n;
		
		//指定の幅ぶん桁数を削除するループ
		for(; removingIdx + n < partlyremovingA.length; removingIdx++) {
			//上書き
			partlyremovingA[removingIdx] = partlyremovingA[removingIdx + n];
		}
		
		//要素をずらし終わった配列を返却する
		return partlyremovingA;
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
		
		//消したいインデックスの入力を促す
		System.out.print("消したい要素を、インデックスで入力：");
		//入力値を変数へ代入
		int idx = scannerInstance.nextInt();
		
		//そこから数えて何桁を消したいのか入力を促す
		System.out.print("↑ここから数えて、何ケタを消したいか、入力：");
		//入力値を変数へ代入
		int n= scannerInstance.nextInt();
		
		//配列 a から要素 a[idx] を削除するメソッドを呼び出し、その配列で、aの参照先を置換する
		a = aryRmv(a, idx, n);
		
		//要素を削除した配列を表示する
		System.out.println("要素 a [ " + idx + " ] から" + n + "ケタを、削除しました。");
		
		//要素を削除した後の配列aを表示
		for(int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
			//配列aの要素の値を表示
			System.out.println("  a [ " + indexNumber + " ] = " + a[indexNumber]);
		}
	}
}


