/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_30 p259
 *  ２つのint型整数 a, b の最小値、３つのint型整数 a, b, c の最小値、
 *  配列aの要素の最小値を求める、以下に示す多重定義されたメソッド群を作成せよ。
 *  
 *  	int min( int a, int b)
 *  	int min( int a, int b, int c)
 *  	int min( int[] a )
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_30
 * クラス名:ensyu07_30
 * 作成日:2022/12/6
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_30 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//メソッドで用いる、配列aの行数・カラム数を初期化
	static int elementNumberA = 0;
	static int lineNumberA = 0;
	
	//２つのint型整数 a, b の最小値を返却するメソッド
  	static int min( int a, int b){
	
  		//返却する変数を初期化
  		int min = a;
  		
  		// b < a の場合にのみ値を入れ替え
  		if (b < a) {
  			min = b;
  		}
  		
  		//返却する値
  		return min;

	}
  	
	//３つのint型整数 a, b, c の最小値を返却するメソッド
  	static int min( int a, int b, int c){
	
  		//返却する変数を初期化
  		int min = a;
  		
  		// b < a の場合、min = b に入れ替え（仮の最小）
  		if (b < a) {
  			min = b;
  			// b < a かつ c < b の場合さらに、min = c に入れ替え（確定）
  			if (c < b) {
  				min = c;
  			}
  		// c < a かつ b < c の場合さらに、min = b に入れ替え（確定）
  		} else if (c < a) {
  			if (b < c) {
  				min = b;
  			}
  		}
  		
  		//返却する値
  		return min;
	}
  	
  	//配列aの要素のうち、最小値を返却するメソッド
	static int min( int[] a ) {
		
  		//返却する変数を初期化
  		int min = a[0];
  		
  		//返却する値
  		return min;
	}

	public static void main(String args[]) {
		
		//変数aを作成
		//入力を促す
		System.out.print("変数a：");
		//入力値で変数を初期化する
		int numberA = scannerInstance.nextInt();
		
		//変数bを作成
		//入力を促す
		System.out.print("変数b：");
		//入力値で変数を初期化する
		int numberB = scannerInstance.nextInt();
		
		//変数cを作成
		System.out.print("変数c：");
		//入力値で変数を初期化する
		int numberC = scannerInstance.nextInt();
		
		// - - - 配列aの作成と表示 - - -
		//入力を促す
		System.out.print("配列aの要素数（ヨコ）：");
		//入力値で変数を初期化する
		elementNumberA = scannerInstance.nextInt();

		//配列Aを生成
		int[] a = new int[elementNumberA];
		
		//入力値を値として、要素に格納していく
		for(int indexNumber = 0; indexNumber < elementNumberA; indexNumber++) {
			//配列aの要素の値の入力を促す
			System.out.print("  a [ " + indexNumber + " ] = ");
			//入力値を要素に格納する
			a[indexNumber] = scannerInstance.nextInt();
		}
		
		System.out.println(" - - - 最小値の算出開始 - - - ");
		
		//2値の最小値
		System.out.println("aとbの最小値：" + min(numberA, numberB));
		
		//3値の最小値
		System.out.println("aとbとcの最小値：" + min(numberA, numberB, numberC));
		
		//配列の要素の中の最小値
		System.out.println("配列 a[" + elementNumberA + "] の要素の中で、最小値：" + min(a));

	}
}