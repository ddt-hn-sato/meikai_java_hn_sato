/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_13 p246
 *  整数xの posビット目（最下位から0, 1, 2, ...と数える）を、1にした値を返すメソッドsetと
 *  0にした値を返すメソッドreset, 反転した値を返すメソッドinverseを作成せよ。
 *  
 *  	int set(    int x, int pos)
 *  	int reset(  int x, int pos)
 *  	int inverse(int x, int pos)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_13
 * クラス名:ensyu07_13
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_13 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//入力値をビット構成に書き換えるメソッド
	static void printBit(int changedX) {
		
		int changedNumber = changedX;
		
		for (int digitCounter = 31; digitCounter >= 0; digitCounter--) {
			//ビット演算の結果、最小の括弧内の値が1であれば1が表示され、0であれば0が表示される
			System.out.print((((changedNumber >>> digitCounter) & 1 ) == 1) ? '1' : '0');
		}
	}
	
	//整数xの posビット目（最下位から0, 1, 2, ...と数える）を、1にした値を返すメソッド
	static int set(int integerX, int pos) {
		
		//返す値を初期化
		int setX = integerX;
		
		//すでにposケタ目が1ならそのままでよく、0の場合にのみ変換を行う.
		//その判定に用いる変数をposWhichとする。
		int posWhich = (integerX / ((int)Math.pow(2, pos))) % 2;
		
		if (posWhich == 0 ) {
			//posケタ目を0→1にするには、integerXに2のpos乗を足せばよい
			setX += ((int)Math.pow(2, pos));
		} else {
			; //すでにposケタ目が1なので、そのままintegerXの値を返す
		}
		
		//返却は10進数
		return setX;
	}
	
	//整数xの posビット目（最下位から0, 1, 2, ...と数える）を、0にした値を返すメソッド
	static int reset(int integerX, int pos) {
		
		//返す値を初期化
		int resetX = integerX;
		
		//すでにposケタ目が0ならそのままでよく、1の場合にのみ変換を行う.
		//その判定に用いる変数をposWhichとする。
		int posWhich = (integerX / ((int)Math.pow(2, pos))) % 2;
		
		if (posWhich == 1 ) {
			//posケタ目を1→0にするには、integerXから2のpos乗を引けばよい
			resetX -= ((int)Math.pow(2, pos));
		} else {
			; //すでにposケタ目が0なので、そのままintegerXの値を返す
		}
		
		//返却は10進数
		return resetX;
	}
	
	//整数xの posビット目（最下位から0, 1, 2, ...と数える）を、反転した値を返すメソッド
	static int inverse(int integerX, int pos) {
		
		//返す値を初期化
		int inversedX = integerX;
		
		//posケタめが0なら1へ、1なら0へ変換を行う
		//その判定に用いる変数をposWhichとする。
		int posWhich = (integerX / ((int)Math.pow(2, pos))) % 2;
		
		if (posWhich == 1 ) {
			//posケタ目を1→0にするには、integerXから2のpos乗を引けばよい
			inversedX -= ((int)Math.pow(2, pos));
		} else {
			//posケタ目を0→1にするには、integerXに2のpos乗を足せばよい
			inversedX += ((int)Math.pow(2, pos));
		}
		
		//返却は10進数
		return inversedX;
	}

	public static void main(String args[]) {
	
		//キーボードから値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//入力を促す
		System.out.print("整数x：");
		//入力値で変数を初期化する
		int integerX = scannerInstance.nextInt();
		
		//何ビット目を1, 0, 反転したいか入力を促す
		System.out.print("何ビット目を 1に / 0に / 反転 しますか？");
		//入力値で変数を初期化する
		int pos = scannerInstance.nextInt();

		//見やすさのため改行
		System.out.println();
				
		//整数xのposビット目をそれぞれ、1に / 0に / 反転 した値と、ビット構成の表示
		System.out.println("↓整数" + integerX +"の" + pos + "ビット目を1にした値");
		System.out.println(set(integerX, pos));
		
		System.out.println("\n↓そのビット構成");
		printBit(set(integerX, pos));
		
		//見やすさのため
		System.out.println("\n++++++++++++++++++++++++++++++++\n");
		
		System.out.println("↓整数" + integerX +"の" + pos + "ビット目を0にした値");
		System.out.println(reset(integerX, pos));
		
		System.out.println("\n↓そのビット構成");
		printBit(reset(integerX, pos));
		
		//見やすさのため
		System.out.println("\n++++++++++++++++++++++++++++++++\n");
		
		System.out.println("↓整数" + integerX +"の" + pos + "ビット目を反転した値");
		System.out.println(inverse(integerX, pos));
		
		System.out.println("\n↓そのビット構成");
		printBit(inverse(integerX, pos));
	}
}


