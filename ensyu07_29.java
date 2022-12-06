/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_29 p259
 *  ２次元配列aと同じ配列（要素数が同じで、すべての要素の値が同じ配列）を生成して
 *  返却するメソッド aryClone2 を作成せよ。
 *  
 *  	int[][] aryClone2(int[][] a)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_29
 * クラス名:ensyu07_29
 * 作成日:2022/12/6
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_29 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//メソッドで用いる、配列aの行数・カラム数を初期化
	static int elementNumberA = 0;
	static int lineNumberA = 0;
	
	//２次元配列aと同じ配列（要素数が同じで、すべての要素の値が同じ配列）を生成して返却するメソッド
  	static int[][] aryClone2(int[][] a){
	
		//返却する配列を初期化
		int[][] cloneA = a; 
		
		for(int lineCounter = 0; lineCounter < cloneA.length; lineCounter++) {
			for(int columnCounter = 0; columnCounter < cloneA[lineCounter].length; columnCounter++) {
				//cloneAの要素の値として、aの要素の値をすべて代入する
				cloneA[lineCounter][columnCounter] = a[lineCounter][columnCounter];
			}
		}
		
		//配列を返す
		return cloneA;
	}
	
	//任意の行列の全要素を表示するメソッド
	static void printMatrix (int[][] m) {
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				//配列cloneAを表示するので以下
				System.out.println("cloneA [ " + i + " ] = " + m[i][j]);			
			}
		}
	}

	public static void main(String args[]) {
		
		// - - - 配列aの作成と表示 - - -
		//入力を促す
		System.out.print("配列aの要素数（ヨコ）：");
		//入力値で変数を初期化する
		elementNumberA = scannerInstance.nextInt();
		//入力を促す
		System.out.print("配列aの要素数（タテ）：");
		//入力値で変数を初期化する
		lineNumberA = scannerInstance.nextInt();

		//配列Aを生成
		int[][] a = new int[lineNumberA][elementNumberA];
		
		//入力値を値として、要素に格納していく
		for(int lineNumber = 1; lineNumber <= lineNumberA; lineNumber++) {
			for(int indexNumber = 0; indexNumber < elementNumberA; indexNumber++) {
				//配列aの要素の値の入力を促す
				System.out.print("  a [ " + (lineNumber - 1) + " ][ " + indexNumber + " ] = ");
				//入力値を要素に格納する
				a[lineNumber - 1][indexNumber] = scannerInstance.nextInt();
			}
		}
		
		System.out.println(" - - - クローン完了 - - - ");
		
		//配列cloneAを表示する
		printMatrix(aryClone2(a));
		
		System.out.println(" - - - 終了 - - - ");

	}
}