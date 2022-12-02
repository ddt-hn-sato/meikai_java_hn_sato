/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_17 p251
 *  前出のメソッドlinearSerachは、探索するキーと同じ値の要素が複数個存在する場合
 *  もっとも先頭に位置する要素を見つける元である。
 *  最も末尾側に位置する要素を見つけるメソッド linearSearchRを作成せよ。
 *  
 *  	int linearSearchR(int[] a, int key)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_17
 * クラス名:ensyu07_17
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_17 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//配列aの最も末尾側に位置する、keyと値が一致する要素を見つけるメソッド
	static int linearSearchR(int[] a, int key) {
		
		//「最も末尾側に位置する、keyと値が一致する要素」を求める配列を、初期化する。
		int[] possibleArray = a;
		//一致する要素があった場合、そのインデックスとして、返却する値を、
		//possibleArrayの末尾のインデックスで初期化する
		int possibleIndex = possibleArray.length - 1;
		
		//配列の要素を線形探索する
		for (; possibleIndex >= 0; possibleIndex--) {
			
			//keyと一致する要素があった場合、そのindexCounterでbreak
			if ( possibleArray[possibleIndex] == key) {
				
				//keyと一致する要素の中で、配列のもっとも末尾にあるインデックスを返却
				return possibleIndex;
			}
		}
		//一致する要素がなかった場合にのみこの処理
		return -1;
	}
	
	//linearSearchメソッドの返却値から判断し、ありません、か、あります、を返すメソッド
	static void yesNo(int[] a, int key) {
		
		if (linearSearchR(a, key) == -1) {
			System.out.print("ありません。");
		} else {
			System.out.print("あります。");
		}
	}

	public static void main(String args[]) {
		
		//入力を促す
		System.out.print("配列aの要素数：");
		//入力値で変数を初期化する
		int elementNumber = scannerInstance.nextInt();
		//要素数がelementsNumberの配列aを生成
		int[] a = new int[elementNumber];
		
		//入力値を値として、要素に格納していく
		for(int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
			//配列aの要素の値の入力を促す
			System.out.print("  a [ " + indexNumber + " ] = ");
			//入力値を要素に格納する
			a[indexNumber] = scannerInstance.nextInt();
		}
		
		//探したい整数の入力を促す
		System.out.print("探したい整数を入力：");
		//入力値を変数へ代入
		int key = scannerInstance.nextInt();
		
		//yesNoメソッドを呼び出し、計算結果を表示する。
		System.out.print("この配列 a の中に、" + key + "は");
		yesNo(a, key);
		
		//あれば、どこにあったか、linearSearchRメソッドを呼び出し、示す
		System.out.print("そして、それは a [ " + linearSearchR(a, key) + " ] にあります。");
	}
}


