/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_11 p246
 *  整数を左右にシフトした値が、2のべき乗での乗算や除算と等しくなることを
 *  確認するプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_11
 * クラス名:ensyu07_11
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_11 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//入力値をビット構成に書き換えるメソッド
	static void printBit(int integerNumber) {
		
		for (int digitCounter = 31; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((integerNumber >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
	}
	
	//入力値をビット演算で左にシフトし、表示するメソッド
	static void leftShifted(int integerNumber) {
		//入力値を、ビット演算で、1ビット左にシフトしてから、ビットで表示
		int leftShifting = integerNumber; //初期化
		leftShifting <<= 1; //代入
		
		for (int digitCounter = 31; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((leftShifting >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
	}
	
	//入力値をビット演算で右にシフトし、表示するメソッド
	static void rightShifted(int integerNumber) {
		//入力値を、ビット演算で、1ビット右にシフトしてから、ビットで表示
		int rightShifting = integerNumber; //初期化
		rightShifting >>>= 1; //代入
		
		for (int digitCounter = 31; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((rightShifting >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
	}
	
	public static void main(String args[]) {
	
		//キーボードから値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//入力を促す
		System.out.print("整数値：");
		
		//入力値で変数を初期化する
		int integerNumber = scannerInstance.nextInt();
		
		//入力値のビット構成を、表示する
		System.out.print("   入力値のビット構成→");
		printBit(integerNumber);
		//改行
		System.out.println();
		
		//入力値のビット構成を、左にシフトしたものを表示する
		System.out.print("     左にシフトすると→");
		leftShifted(integerNumber);
		//改行
		System.out.println();
		
		//入力値を2倍した数のビット構成を表示する
		System.out.print("  入力値を2倍した数は→");
		int number2 = integerNumber * 2;
		printBit(number2);
		//改行
		System.out.println();
		
		//入力値のビット構成を、右にシフトしたものを表示する
		System.out.print("     右にシフトすると→");
		rightShifted(integerNumber);
		//改行
		System.out.println();
		
		//入力値を2で割った数のビット構成を表示する
		System.out.print("入力値を2で割った数は→");
		int numberHalf = integerNumber / 2;
		printBit(numberHalf);
		
	}
}


