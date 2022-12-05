/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_20 p253
 *  配列 a の要素 a[idx] に x を挿入するメソッド aryRmv を作成せよ。
 *  	
 *  	void aryIns(int[] a, int idx, int x)
 *  
 *  挿入に伴って a[idx] から a[a.length - 2]を1つ後方にずらさなければならない。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_20
 * クラス名:ensyu07_20
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_11to20;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_20 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//配列 a の要素 a[idx] に x を挿入するメソッド
	static int[] aryIns(int[] a, int idx, int n) {
		
		//返却する配列変数を初期化する
		int[] partlyswitchingA = a;
		//置換する要素のインデックスを宣言する
		int switchingIdx;
		
		for(switchingIdx = a.length - 1; switchingIdx > idx ; switchingIdx--) {
			
			//一番うしろの要素に、その前の要素の値を上書きする
			partlyswitchingA[switchingIdx] = partlyswitchingA[switchingIdx - 1];
		}
		
		//置換する要素だけ、さいごに置換する
		partlyswitchingA[idx] = n;
		
		//要素をずらし終わった配列を返却する
		return partlyswitchingA;
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
		
		//挿入したいインデックスの箇所の入力を促す
		System.out.print("挿入したい箇所を、インデックスで入力：");
		//入力値を変数へ代入
		int idx = scannerInstance.nextInt();
		
		//挿入したい数値の入力を促す
		System.out.print("挿入したい数値を入力：");
		//入力値を変数へ代入
		int n = scannerInstance.nextInt();
		
		//配列 a の要素 a[idx] を削除するメソッドを呼び出し、その配列で、aの参照先を置換する
		a = aryIns(a, idx, n);
		
		//要素を削除した配列を表示する
		System.out.println("要素 a [ " + idx + " ] を、" + n + "で置換しました。");
		
		for(int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
			//配列aの要素の値の値を表示
			System.out.println("  a [ " + indexNumber + " ] = " + a[indexNumber]);
		}
	}
}


