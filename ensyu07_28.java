/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_28 p259
 *  行列 x と y の和を格納した2次元配列を返すメソッドを作成せよ。
 *  行数及び列数が同一の配列をxとyに受け取ることを前提としてよい。
 *  
 *  	int[][] addMatrix(int[][] x, int[][] y)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_28
 * クラス名:ensyu07_28
 * 作成日:2022/12/6
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_28 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//行列 x と y の和を格納した2次元配列を返すメソッド
  	static int[][] addMatrix(int[][] x, int[][] y){
	
		//配列 x, yの加算を行って値を格納する変数を初期化
		int[][] total = x; 
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				total[i][j] = x[i][j] + y[i][j];
			}
		}
		
		//配列を返す
		return total;
	}
	
	//任意の行列の全要素を表示するメソッド
	static void printMatrix (int[][] m) {
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				//配列a + bを表示するので以下
				System.out.println("(a + b) [ " + i + " ] = " + m[i][j]);			
			}
		}
	}

	public static void main(String args[]) {
		
		// - - - 配列aの作成と表示 - - -
		//入力を促す
		System.out.print("配列aの要素数（ヨコ）：");
		//入力値で変数を初期化する
		int elementNumberA = scannerInstance.nextInt();
		//入力を促す
		System.out.print("配列aの要素数（タテ）：");
		//入力値で変数を初期化する
		int lineNumberA = scannerInstance.nextInt();

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
		
		// - - - 配列bの作成と表示 - - -
		//配列aと同じカラム数のため、以下の表示
		System.out.println("配列bの要素数（ヨコ）：" + elementNumberA);
		//配列aと同じ行数のため、以下の表示
		System.out.println("配列bの要素数（タテ）：" + lineNumberA);
		
		//配列bを生成
		int[][] b = new int[lineNumberA][elementNumberA];
		
		//入力値を値として、要素に格納していく
		for(int lineNumber = 1; lineNumber <= lineNumberA; lineNumber++) {
			for(int indexNumber = 0; indexNumber < elementNumberA; indexNumber++) {
				//配列bの要素の値の入力を促す
				System.out.print("  b [ " + (lineNumber - 1)  + " ][ " + indexNumber + " ] = ");
				//入力値を要素に格納する
				b[lineNumber - 1][indexNumber] = scannerInstance.nextInt();
			}
		}
		
		System.out.println(" - - - 加算完了 - - - ");
		
		//配列a, bを加算するメソッドを呼び出す
		printMatrix(addMatrix( a, b));
		
		System.out.println(" - - - 終了 - - - ");

	}
}