/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_27 p257
 *  List 7-20のプログラムは、３つの配列 x. y, z の行数及び
 *  列数が同一であることを前提としている。
 *  ３つの配列の要素数が等しければ加算を行って true を返し、
 *  等しくなければ加算を行わずに false を返すメソッドに書き換えよ。
 *  
 *  	boolean addMatrix(int[][] x, int[][] y, int[][] z)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお、問題に指定がなかったため、穴ぼこのある配列
 *  （「構成要素の配列」ごとの要素数が一律でない多次元配列）ではないと仮定しました。
 *  また、問題文に指定がなかったため、配列の生成に関してはメソッドは用いていません。
 *  
 * パッケージ名:ensyu07_27
 * クラス名:ensyu07_27
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_27 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//３つの配列の要素数が等しければ加算を行って true を返し、
	//等しくなければ加算を行わずに false を返す。
	static boolean addMatrix(int[][] x, int[][] y, int[][] z, int lineA) {
	
		//配列 a, b, cの加算を行って値を格納する変数を初期化
		int[][] total = new int[lineA][x.length]; 
		
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				total[i][j] = x[i][j] + y[i][j] + z[i][j];
			}
		}
		
		//trueを返す
		return true;
	}
	
	//任意の行列の全要素を表示するメソッド
	static void printMatrix (int[][] m) {
		
		for(int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + "  ");
			System.out.println();			
			}
		}
	}
	
	//boolean型で、値が相互に等しいかどうか答えてくれるメソッド
	static boolean equal(int a, int b, int c) {
		
		if(a == b && b == c) {
			return true;
		} else {
			return false;
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
		//入力を促す
		System.out.print("配列bの要素数（ヨコ）：");
		//入力値で変数を初期化する
		int elementNumberB = scannerInstance.nextInt();
		//入力を促す
		System.out.print("配列bの要素数（タテ）：");
		//入力値で変数を初期化する
		int lineNumberB = scannerInstance.nextInt();
		
		//配列bを生成
		int[][] b = new int[lineNumberB][elementNumberB];
		
		//入力値を値として、要素に格納していく
		for(int lineNumber = 1; lineNumber <= lineNumberB; lineNumber++) {
			for(int indexNumber = 0; indexNumber < elementNumberB; indexNumber++) {
				//配列bの要素の値の入力を促す
				System.out.print("  b [ " + (lineNumber - 1)  + " ][ " + indexNumber + " ] = ");
				//入力値を要素に格納する
				b[lineNumber - 1][indexNumber] = scannerInstance.nextInt();
			}
		}
		
		// - - - 配列cの作成と表示 - - -
		//入力を促す
		System.out.print("配列cの要素数（ヨコ）：");
		//入力値で変数を初期化する
		int elementNumberC = scannerInstance.nextInt();
		//入力を促す
		System.out.print("配列cの要素数（タテ）：");
		//入力値で変数を初期化する
		int lineNumberC = scannerInstance.nextInt();
		
		//配列cを生成
		int[][] c = new int[lineNumberC][elementNumberC];
		
		//入力値を値として、要素に格納していく
		for(int lineNumber = 1; lineNumber <= lineNumberC; lineNumber++) {
			for(int indexNumber = 0; indexNumber < elementNumberC; indexNumber++) {
				//配列cの要素の値の入力を促す
				System.out.print("  c [ " + (lineNumber - 1) + " ][ " + indexNumber + " ] = ");
				//入力値を要素に格納する
				c[lineNumber - 1][indexNumber] = scannerInstance.nextInt();
			}
		}
		
		//配列 a と b と c の要素数を調べ変数を初期化
		int elementTotalA = lineNumberA * elementNumberA;
		int elementTotalB = lineNumberB * elementNumberB;
		int elementTotalC = lineNumberC * elementNumberC;
		
		//配列 a と b と c の要素数を調べ、等しくなければfalseが返ってくるので修了。
		//等しければ、加算を行ってtrueを返すメソッドを用いる
		if ( equal(elementTotalA, elementTotalB, elementTotalC) == true) {
			
			//メソッドからtrueかfalseを受け取る
			addMatrix(a, b, c, lineNumberA);
			System.out.print(" - - - 加算完了 - - - ");
			
		} else if ( equal(elementTotalA, elementTotalB, elementTotalC) == false) {
			
			System.out.print(" - - - 終了 - - - ");
			
		} else {
			; //有り得ないはず
		}

	}
}