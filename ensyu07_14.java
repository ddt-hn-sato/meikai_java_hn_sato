/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_14 p246
 *  整数xの posビット目を、最下位として連続する n 個のビットを、(n個のビットすべて)
 *  1にした値を返すメソッドsetNと
 *  0にした値を返すメソッドresetN, 
 *  反転した値を返すメソッドinverseNを作成せよ。
 *  
 *  	int setN(    int x, int pos, int n)
 *  	int resetN(  int x, int pos, int n)
 *  	int inverseN(int x, int pos, int n)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_14
 * クラス名:ensyu07_14
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_14 {
	
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
	
	//整数xの posビット目から数えてnビットを、1にした値を返すメソッド
	static int setN(int integerX, int pos, int n) {
		
		//返す値を初期化
		int setX = integerX;
		
		//posケタ目が0か1か判定する変数を宣言する
		int posWhich;
		
		//bitCounterをループのカウンターとする。
		//これを、posビットから数えてnビット分のビットを(0の場合のみ)1にする、n回まわるループ
		for (int bitCounter = pos; bitCounter < pos + n; bitCounter++) {
			//すでにbitCounterケタ目が1ならそのままでよく、0の場合にのみ変換を行う.
			//その判定に用いる変数をposWhichとする。
			posWhich = (integerX / ((int)Math.pow(2, bitCounter))) % 2;
			
			if ( posWhich == 0 ) {
				//bitCounterケタ目を0→1にするには、integerXに2のpos乗を足せばよい
				setX += ((int)Math.pow(2, bitCounter));
			} else {
				; //すでにbitCounterケタ目が1なので、そのままintegerXの値を返す
			}
		}
		
		//返却は10進数
		return setX;
	}
	
	//整数xの posビット目から数えてnビットを、0にした値を返すメソッド
	static int resetN(int integerX, int pos, int n) {
		
		//返す値を初期化
		int resetX = integerX;
		
		//posケタ目が0か1か判定する変数を宣言する
		int posWhich;
		
		//bitCounterをループのカウンターとする。
		//これを、posビットから数えてnビット分のビットを(0の場合のみ)1にする、n回まわるループ
		for (int bitCounter = pos; bitCounter < pos + n ; bitCounter++) {
			//すでにbitCounterケタ目が0ならそのままでよく、1の場合にのみ変換を行う.
			//その判定に用いる変数をposWhichとする。
			posWhich = (integerX / ((int)Math.pow(2, bitCounter))) % 2;
			
			if (posWhich == 1 ) {
				//bitCounterケタ目を1→0にするには、integerXから2のpos乗を引けばよい
				resetX -= ((int)Math.pow(2, bitCounter));
			} else {
				; //すでにbitCounterケタ目が0なので、そのままintegerXの値を返す
			}
		}
		
		//返却は10進数
		return resetX;
	}
	
	//整数xの posビット目から数えてnビットを、反転した値を返すメソッド
	static int inverseN(int integerX, int pos, int n) {
		
		//返す値を初期化
		int inversedX = integerX;
		
		//posケタ目が0か1か判定する変数を宣言する
		int posWhich;
		
		//bitCounterをループのカウンターとする。
		//これを、posビットから数えてnビット分のビットを(0の場合のみ)1にする、n回まわるループ
		for (int bitCounter = pos; bitCounter < pos + n ; bitCounter++) {
		
			//bitCounterケタめが0なら1へ、1なら0へ変換を行う
			//その判定に用いる変数をposWhichとする。
			posWhich = (integerX / ((int)Math.pow(2, bitCounter))) % 2;
			
			if (posWhich == 1 ) {
				//bitCounterケタ目を1→0にするには、integerXから2のpos乗を引けばよい
				inversedX -= ((int)Math.pow(2, bitCounter));
			} else {
				//bitCounterケタ目を0→1にするには、integerXに2のpos乗を足せばよい
				inversedX += ((int)Math.pow(2, bitCounter));
			}
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
		//入力値のビット構成を、表示する
		System.out.println("↓入力値のビット構成↓");
		printBit(integerX);
		
		//何ビット目を最下位として、1, 0, 反転 をしたいか、入力を促す
		System.out.print("\n    何ビット目を最下位として、1に / 0に / 反転 しますか？");
		//入力値で変数を初期化する
		int pos = scannerInstance.nextInt();

		//そこから何個のビットを 1, 0, 反転 をしたいか、入力を促す
		System.out.print("↑そこから数えて何ビット分を、1に / 0に / 反転 しますか？");
		//入力値で変数を初期化する
		int n = scannerInstance.nextInt();
		
		//見やすさのため改行
		System.out.println();
				
		//整数xのposビット目をそれぞれ、1に / 0に / 反転 した値と、ビット構成の表示
		System.out.println("↓整数" + integerX +"の" + pos + "から数えて" + n + "ビット目までを1にした値");
		System.out.println(setN(integerX, pos, n));
		
		System.out.println("\n↓そのビット構成");
		printBit(setN(integerX, pos, n));
		
		//見やすさのため
		System.out.println("\n++++++++++++++++++++++++++++++++\n");
		
		System.out.println("↓整数" + integerX +"の" + pos + "から数えて" + n + "ビット目までを0にした値");
		System.out.println(resetN(integerX, pos, n));
		
		System.out.println("\n↓そのビット構成");
		printBit(resetN(integerX, pos, n));
		
		//見やすさのため
		System.out.println("\n++++++++++++++++++++++++++++++++\n");
		
		System.out.println("↓整数" + integerX +"の" + pos + "から数えて" + n + "ビット目までを反転した値");
		System.out.println(inverseN(integerX, pos, n));
		
		System.out.println("\n↓そのビット構成");
		printBit(inverseN(integerX, pos, n));
	}
}


