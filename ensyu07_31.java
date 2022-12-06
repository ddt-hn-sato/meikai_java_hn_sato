/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_31 p259
 *  int型整数xの絶対値、long型整数xの絶対値、float型整数xの絶対値、
 *  double型整数xの絶対値を求める、以下に示す多重定義されたメソッド群を作成せよ。
 *  
 *  	int absolute(int x)
 *  	long absolute(long x)
 *  	float absolute(float x)
 *  	double absolute(double x)
 *  
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_31
 * クラス名:ensyu07_31
 * 作成日:2022/12/6
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_31 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//int型整数xの絶対値を求めるメソッド
	static int absolute(int x) {
		
		//返却する変数を初期化
		
		int absoluteInt = x;
		
		//absoluteIntが負の数だった場合は、符号を逆転する
		if (absoluteInt < 0) {
			//符号をマイナスからプラスにする
			absoluteInt = - absoluteInt;
		}
		
		//返却する値
		return absoluteInt;
		
	}
	//long型整数xの絶対値を求めるメソッド
	static long absolute(long x) {
		
		//返却する変数を初期化
		
		long absoluteLong = x;
		
		//absoluteLongが負の数だった場合は、符号を逆転する
		if (absoluteLong < 0) {
			//符号をマイナスからプラスにする
			absoluteLong = - absoluteLong;
		}
		
		//返却する値
		return absoluteLong;
	}
	//float型整数xの絶対値を求めるメソッド
	static float absolute(float x) {
		
		//返却する変数を初期化
		
		float absoluteFloat = x;
		
		//absoluteFloatが負の数だった場合は、符号を逆転する
		if (absoluteFloat < 0f) {
			//符号をマイナスからプラスにする
			absoluteFloat = - absoluteFloat;
		}
		
		//返却する値
		return absoluteFloat;
	}
	//double型整数xの絶対値を求めるメソッド
	static double absolute(double x) {
		
		//返却する変数を初期化
		
		double absoluteDouble = x;
		
		//absoluteDoubleが負の数だった場合は、符号を逆転する
		if (absoluteDouble < 0) {
			//符号をマイナスからプラスにする
			absoluteDouble = - absoluteDouble;
		}
		
		//返却する値
		return absoluteDouble;
	}

	public static void main(String args[]) {
		
		//整数intAの入力を促す
		System.out.print("整数intA：");
		//入力値で変数を初期化する
		int numberInt = scannerInstance.nextInt();
		
		//整数longAの入力を促す
		System.out.print("整数longA：");
		//入力値で変数を初期化する
		long numberLong = scannerInstance.nextLong();
		
		//実数floatAの入力を促す
		System.out.print("実数floatA：");
		//入力値で変数を初期化する
		float numberFloat = scannerInstance.nextFloat();
		
		//実数doubleAの入力を促す
		System.out.print("実数doubleA：");
		//入力値で変数を初期化する
		double numberDouble = scannerInstance.nextDouble();
		
		System.out.println(" - - - 絶対値の算出開始 - - - ");
		
		//intAの絶対値
		System.out.println("intAの絶対値：" + absolute(numberInt));
		
		//longAの絶対値
		System.out.println("longAの絶対値：" + absolute(numberLong));
		
		//floatAの絶対値
		System.out.println("floatAの絶対値：" + absolute(numberFloat));
				
		//doubleAの絶対値
		System.out.println("doubleAの絶対値：" + absolute(numberDouble));
	}
}