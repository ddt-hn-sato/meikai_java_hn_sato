/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_23 p257
 *  配列 a の要素の中で値が x である全要素のインデックスを先頭から順に格納した
 *  配列を返却するメソッド arraySrchIdx を作成せよ。
 *  
 *  	int[]  arraySrchIdx(int[] a, int x)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_23
 * クラス名:ensyu07_23
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_23 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//メソッドから返却する配列xArrayの要素の数をxLengthとおき初期化
	static int xLength = 0;
	
	//配列 a の要素の中で値が x である全要素のインデックスを
	//先頭から順に格納した配列を、返却するメソッド
	static int[] arraySrchIdx(int[] a, int x) {
		
		//xArrayの要素数を決めるため、配列aの要素と、xとがいくつ一致するかどうか、調べる
		for(int indexNumber = 0; indexNumber < a.length; indexNumber++) {
			if ( x == a[indexNumber]) {
				xLength++;
			}
		}
		
		//返却する配列xArrayを初期化
		int[] xArray = new int[xLength];
		
		//xArrayのインデックスを初期化する
		int xIndex = 0;
		
		//配列aの要素と、xとが一致するかどうか、調べ、
		//一致する場合は、xArrayに値を格納する
		for(int indexNumber = 0; indexNumber < a.length; indexNumber++) {
			
			if ( x == a[indexNumber]) {
				xArray[xIndex] = indexNumber;
				xIndex++;
			} else{
				; //一致しない場合は、なにもせず、indexNumberのインクリメントへ進む
			}
		}
		
		//返却する配列
		return xArray;
	}

	public static void main(String args[]) {
		
		// - - - 配列aの作成 - - -
		//入力を促す
		System.out.print("配列aの要素数：");
		//入力値で変数を初期化する
		int elementNumberA = scannerInstance.nextInt();
		//要素数がelementsNumberの配列aを生成
		int[] a = new int[elementNumberA];
		
		//入力値を値として、要素に格納していく
		for(int indexNumber = 0; indexNumber < elementNumberA; indexNumber++) {
			//配列aの要素の値の入力を促す
			System.out.print("  a [ " + indexNumber + " ] = ");
			//入力値を要素に格納する
			a[indexNumber] = scannerInstance.nextInt();
		}
		
		//値x（←この値と等しい要素をすべて抜き出す）の入力を促す
		System.out.print("値 x : ");
		//入力値で変数を初期化する
		int x = scannerInstance.nextInt();
		
		//配列 a の要素の中で値が x である全要素のインデックスを
		//先頭から順に格納した配列を、返却するメソッドを呼び出す
		int[] xArray = arraySrchIdx( a, x );
		
		//一致する値が配列の中にない場合は、
		if( xLength == 0) {
			//xがaのなかに要素としてないことを示す
			System.out.print( x + "は、配列 a の中にはありませんでした。");
		} else {
		
			//一致する値が配列の中にある場合は、
			//結果の説明
			System.out.println("\n配列 a [ " + elementNumberA + " ] の要素の中で値が" + x + "である"
					+ "インデックスを 配列 xArray [ " + xLength + " ] に表示します。");
			
			//見やすさのため改行
			System.out.println();
			
			//配列xArrayを表示
			for(int indexNumber = 0; indexNumber < xLength; indexNumber++) {
				//配列xArrayの要素の値の値を表示
				System.out.println(" xArray [ " + indexNumber + " ] = " + xArray[indexNumber]);
			}
		}
	}
}


