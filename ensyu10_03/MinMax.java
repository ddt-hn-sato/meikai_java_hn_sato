/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10_03 p353
 *  2値/3値/配列の最大値を求めるメソッドや最小値を求めるメソッドを集めた
 *  ユーティリティクラス(クラス変数、クラスメソッドのみのクラス)MinMaxを作成せよ。
 *  
 * 回答:
 *  下記をご参照ください。
 *  指定がなかったため、mainメソッドでint型だけが入力されると仮定して作成しました。
 *  
 * パッケージ名:ensyu10_03
 * クラス名: ExId
 * 作成日:2022/12/11
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter10_archive.ensyu10_03;

//Scannerクラスをインポート
import java.util.Scanner;

//MinMaxクラス
public class MinMax{

	//スキャナクラスの変数を作成
	static Scanner standardInput = new Scanner(System.in);
	
	// - - - クラス変数
	static int numberA;
	static int numberB;
	static int numberC;
	static int[] arrayA;
	
	// - - - コンストラクタ
	public MinMax(int numberA, int numberB, int numberC, int[] arrayA) {
		
		this.numberA = numberA;
		this.numberB = numberA;
		this.numberC = numberA;
		this.arrayA = arrayA;

	}
	
	// - - - クラスメソッド
	//2値の最大値を求めるメソッド
	static int Max(int a, int b) {
		
		//返却値を初期化
		int max = a;
		
		if (b > a) {
			//b > aの場合入れ替え
			max = b;
		}
		//返却する
		return max;
		
	}
	
	//2値の最小値を求めるメソッド
	static int Min(int a, int b) {
		
		//返却値を初期化
		int min = a;
		
		if (b < a) {
			//b < aの場合入れ替え
			min = b;
		}
		//返却する
		return min;
		
	}
	
	//3値の最大値を求めるメソッド
	static int Max(int a, int b, int c) {
		
		//返却値を初期化
		int max = a;
		
		if (c >= a && c >= b) {
			//この場合cに入れ替え
			max = c;
		} else if (b >= a && b >= c) {
			//この場合bに入れ替え
			max = b;
		}
		//返却する
		return max;
	}
	
	//3値の最小値を求めるメソッド
	static int Min(int a, int b, int c) {
		
		//返却値を初期化
		int min = a;
		
		if (c <= a && c <= b) {
			//この場合cに入れ替え
			min = c;
		} else if (b <= a && b <= c) {
			//この場合bに入れ替え
			min = b;
		}
		//返却する
		return min;
	}
	
	//配列の要素の最大値を求めるメソッド
	static int Max(int[] arrayA) {
		
		//インデックスを初期化
		int indexNumber = 0;
		//返却値を初期化
		int max = arrayA[indexNumber];
		
		//順に比較し最大値をどんどん入れ替える
		for (indexNumber = 1; indexNumber < arrayA.length; indexNumber++) {

			if ( arrayA[indexNumber] > max ) {
				//最大値を入れ替える
				max = arrayA[indexNumber];
			};
		}
		//返却する
		return max;
	}
	
	
	//配列の要素の最小値を求めるメソッド
	static int Min(int[] arrayA) {
			
		//インデックスを初期化
		int indexNumber = 0;
		//返却値を初期化
		int min = arrayA[indexNumber];
		
		//順に比較し最小値をどんどん入れ替える
		for (indexNumber = 1; indexNumber < arrayA.length; indexNumber++) {

			if ( arrayA[indexNumber] < min ) {
				//最小値を入れ替える
				min = arrayA[indexNumber];
			};
		}
		//返却する
		return min;
	}
	
	// - - - メインメソッド
	public static void main(String args[]) {
		
		//3つの整数値を宣言
		int numberA, numberB, numberC;
		
		//配列を宣言
		int[] arrayA;
		//配列の要素数を宣言
		int indexNumber;
		
		// - - - 入力を促し、4つの変数にそれぞれ代入
		
		System.out.print("numberA：");
		//入力値
		numberA = standardInput.nextInt();
		
		System.out.print("numberB：");
		//入力値
		numberB = standardInput.nextInt();
		
		System.out.print("numberC：");
		//入力値
		numberC = standardInput.nextInt();
		
		//配列の初期化のため入力を促す
		System.out.print("配列の要素数：");
		//入力値
		indexNumber = standardInput.nextInt();
		//配列の初期化
		arrayA = new int[indexNumber];
		
		//配列に要素を代入していく
		for(int i = 0; i < indexNumber; i++) {
			
			System.out.print("配列の要素[" + i + "]の値：");
			arrayA[i] = standardInput.nextInt();

		}
		
		//クラスでインスタンス化する
		new MinMax(numberA, numberB, numberC, arrayA);
		
		//２値の最大値を求めて表示
		System.out.println("2値の最大値：" + Max(numberA, numberB));
		//２値の最小値を求めて表示
		System.out.println("2値の最小値：" + Min(numberA, numberB));
		//３値の最大値を求めて表示
		System.out.println("3値の最大値：" + Max(numberA, numberB, numberC));
		//３値の最小値を求めて表示
		System.out.println("3値の最小値：" + Min(numberA, numberB, numberC));
		//配列の要素の最大値を求めて表示
		System.out.println("配列の要素の最大値：" + Max(arrayA));
		//配列の要素の最小値を求めて表示
		System.out.println("配列の要素の最小値：" + Min(arrayA));
	}
	
	
}