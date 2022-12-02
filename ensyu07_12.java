/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_12 p246
 *  整数xを右にnビット回転した値を返すメソッドrightRotateと、
 *  左にnビット回転した値を返すメソッドleftRotateを作成せよ。
 *  
 *  	int rightRotate(int x, int n)
 *  	int leftRotate(int x, int n)
 *  
 *  ※回転とは、最下位ビットと最上位ビットがつながっていると
 *  みなして、シフトすることである。
 *  たとえば右に5ビット回転した場合は、
 *  シフトによってはじき出されることになる下位5ビットを、
 *  上位に持ってこなければならない。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_12
 * クラス名:ensyu07_12
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_12 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//入力値をビット構成に書き換えるメソッド
	static void printBit(int integerNumber) {
		
		for (int digitCounter = 31; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((integerNumber >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
	}
	
	//入力値をビット演算で左に回転し、表示するメソッド
	static void leftRotate(int integerNumber, int rotateNumber) {
		
		//変数を入力値で初期化
		int leftShifting = integerNumber;
		
		//シフトしたことで、左にずれる（右前には移動しない）部分を記述する
		for (int digitCounter = (31 - rotateNumber) ; digitCounter >= 0 ; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((leftShifting >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
		
		//シフトしたことで、新しくなる右部分を記述する
		//実際に表示する右部分（シフトすると消えてしまう、左rotateNumberケタ部分）を算出
		for (int digitCounter = (rotateNumber - 1), leftPart; digitCounter >= 0 ; digitCounter--) {
			//leftPartに、シフトすると消えるrotateNumber桁のうちの1桁ずつ代入
			leftPart = leftShifting % ((int)Math.pow(2, digitCounter));
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((leftPart >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
		
		//見やすさのため改行
		System.out.println();
	}
	
	//入力値をビット演算で右に回転し、表示するメソッド
	static void rightRotate(int integerNumber, int rotateNumber) {
		
		//実際に表示する左部分（シフトすると消えてしまう、右rotateNumberケタ部分）を
		//10進数で記録しておく
		//2をrotateNumber乗する標準メソッドを使う。扱いやすさのためintで取得。
		int rightPart = integerNumber % ((int)Math.pow(2, rotateNumber));
		
		int rightShifting = integerNumber;
		//integerNumberをrotateNumber回ぶん右にシフトする
		//シフトしてあいた分の左部分は、一旦0で埋める
		rightShifting = rightShifting >>> rotateNumber;
		
		//シフトしたことで、新しくなった左部分だけまず記述する
		for (int digitCounter = rotateNumber - 1; digitCounter >= 0 ; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((rightPart >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
		
		//シフトしたことで、右にずれた（左前には移動しない）部分を記述する
		for (int digitCounter = (31 - (rotateNumber - 1)) ; digitCounter >= 0; digitCounter--) {
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
		System.out.println("     ↓入力値のビット構成↓     ");
		printBit(integerNumber);
		//改行
		System.out.println();
		
		//左に何回回転するか入力させる
		System.out.print("左に何回、回転しますか？：");
		
		//入力値を変数に代入
		int rotateNumber = scannerInstance.nextInt();
		
		//入力値のビット構成を、左にシフトしたものを表示する
		System.out.println("      ↓左に" + rotateNumber +"回転すると↓      ");
		leftRotate(integerNumber, rotateNumber);

		//改行
		System.out.println();
		
		//右に何回回転するか入力させる
		System.out.print("右に何回、回転しますか？：");
		
		//入力値を変数に代入
		rotateNumber = scannerInstance.nextInt();
		
		//入力値のビット構成を、右にシフトしたものを表示する
		System.out.println("      ↓右に" + rotateNumber + "回転すると↓      ");
		rightRotate(integerNumber, rotateNumber);
		
		//改行
		System.out.println();
		
	}
}


