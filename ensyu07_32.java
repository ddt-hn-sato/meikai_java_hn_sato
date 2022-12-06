/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_32 p263
 *  List 7 - 12 (p.241)のメソッド printBitsは、int型整数値の内部のビットを表示するものであった。
 *  他の整数型に対しても同様の働きを行う、多重定義されたメソッド群を作成せよ。 
 *  
 *  	void printBits(byte x)
 *  	void printBits(short x)
 *  	void printBits(int x)
 *  	void printBits(long x)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_32
 * クラス名:ensyu07_32
 * 作成日:2022/12/6
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_32 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//byte型整数値の内部のビットを表示するメソッド
	static void printBits(byte x) {
		
		for (int digitCounter = 7; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((x >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
		
	}
	
	//short型整数値の内部のビットを表示するメソッド
	static void printBits(short x) {
		
		for (int digitCounter = 15; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((x >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
		
	}
	
	//int型整数値の内部のビットを表示するメソッド
	static void printBits(int x) {
		
		for (int digitCounter = 31; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((x >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
		
	}
	
	//long型整数値の内部のビットを表示するメソッド
	static void printBits(long x) {
		
		for (int digitCounter = 63; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((x >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
		
	}
	
	public static void main(String args[]) {
		
		//整数byteAの入力を促す
		System.out.print("整数byteA：");
		//入力値で変数を初期化する
		byte byteA = scannerInstance.nextByte();
		
		//整数shortAの入力を促す
		System.out.print("整数shortA：");
		//入力値で変数を初期化する
		short shortA = scannerInstance.nextShort();
		
		//整数intAの入力を促す
		System.out.print("整数intA：");
		//入力値で変数を初期化する
		int intA = scannerInstance.nextInt();
		
		//整数longAの入力を促す
		System.out.print("整数longA：");
		//入力値で変数を初期化する
		long longA = scannerInstance.nextLong();
		
		System.out.println(" - - - ビット構成の表示開始 - - - ");
		
		//byteAのビット表示
		System.out.print("byteAのビット構成：");
		printBits(byteA);
		//見やすさのため改行
		System.out.println();
				
		//shortAのビット表示
		System.out.print("shortAのビット構成：");
		printBits(shortA);
		//見やすさのため改行
		System.out.println();
		
		//intAのビット表示
		System.out.print("intAのビット構成：");
		printBits(intA);
		//見やすさのため改行
		System.out.println();
		
		//longAのビット表示
		System.out.print("longAのビット構成：");
		printBits(longA);
		//見やすさのため改行
		System.out.println();
	}
}