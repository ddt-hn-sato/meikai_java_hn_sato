/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_33 p263
 *  int型の１次元配列とint型の2次元配列（行によって列数が異なる可能性がある）の全要素の
 *  値を表示する、多重定義されたメソッド群を作成せよ。 
 *  
 *  	void printArray(int[] a)
 *  	void printArray(int[][] a)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_33
 * クラス名:ensyu07_33
 * 作成日:2022/12/6
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_33 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//１次元配列の全要素を表示するメソッド
	static void printArray(int[] a) {
		
		//表示する配列を初期化
		int[] intArray = a;
		
		//全要素を表示する
		for (int indexNumber = 0; indexNumber < intArray.length; indexNumber++) {
			//indexNumberが0から、(配列の長さ - 1)まで動く
			System.out.print(intArray[indexNumber] + ", ");
		}
	}

	//２次元配列の全要素を表示するメソッド
	static void printArray(int[][] a) {
		
		//表示する配列を初期化
		int[][] intArray = a;
		
		//各行で、全要素を表示する
		for(int lineCounter = 0; lineCounter < intArray.length ; lineCounter++) {
			for (int indexNumber = 0; indexNumber < intArray[lineCounter].length; indexNumber++) {
				//indexNumberが0から、(lineCounter行の配列の長さ - 1)まで動く
				System.out.print("a[" + lineCounter + "][" + indexNumber + "] = " + intArray[lineCounter][indexNumber] + ", ");
			}
			//見やすさのため改行
			System.out.println();
		}
	}
	
	public static void main(String args[]) {
		
		
		//要素の値を格納する変数を初期化
		//配列a1dの要素
		int elementA1d = 0;
		//配列a2dの要素
		int elementA2d = 0;
		
		// - - - 配列a1d[]の作成 - - -
		
		System.out.print("配列a1dの要素数：");
		//入力値で変数を初期化する
		int elementNumber = scannerInstance.nextInt();
		//配列a1dを宣言
		int[] a1d = new int[elementNumber];
		
		for (int elementCounter = 0; elementCounter < elementNumber; elementCounter++) {
			//入力を促す
			System.out.print("a1d[" + elementCounter + "] = ");
			//入力値を変数へ代入
			elementA1d = scannerInstance.nextInt();
			//配列自体に格納
			a1d[elementCounter] = elementA1d;
		}

		// - - - 配列a2d[][]の作成 - - -
		
		//行数の入力を促す
		System.out.print("配列a2dの行数：");
		//入力値を変数へ代入する
		int lineNumber = scannerInstance.nextInt();
		
		//配列の初期化
		int[][] a2d = new int[lineNumber][];
		
		//入力値の変数を初期化
		int elementNumber2 = 0;
		
		//入力値の変数を初期化
		int element = 0;
		
		//要素数の入力を促すループ
		for(int lineCounter = 0; lineCounter < lineNumber; lineCounter++) {
			System.out.print((lineCounter + 1) + "行目の要素数：");
			//入力値を変数へ代入する
			elementNumber2 = scannerInstance.nextInt();
			
			//各行で、要素を代入していく
			for (int loopCounter = 0; loopCounter < elementNumber2; loopCounter++) {
			
				//要素の値を代入させる
				System.out.print((lineCounter + 1) + "行目、" + (loopCounter + 1) + "個めの要素の値：");
				//入力値を変数へ代入する
				element = scannerInstance.nextInt();
				
				//配列の長さを、行が変わるごとに初期化
				if(loopCounter == 0) {
					a2d[lineCounter] = new int[elementNumber2];
				}
				//配列自体に格納
				a2d[lineCounter][loopCounter] = element;
			}
		}
		
		System.out.println(" - - - 表示開始 - - - ");
		
		//a1dの全要素表示
		System.out.println("↓a1dの全要素↓");
		printArray(a1d);
		//見やすさのため改行
		System.out.println();
		
		//a2dの全要素表示
		System.out.println("↓a2dの全要素↓");
		printArray(a2d);
		//見やすさのため改行
		System.out.println();
		
	}
}