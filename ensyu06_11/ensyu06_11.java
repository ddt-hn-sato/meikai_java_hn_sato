/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-11 p199
 * 	異なる要素が同じ値を持つことのないように、演習6-9のプログラムを
 *  改良したプログラムを作成せよ。
 *  たとえば {1, 3, 5, 6, 1, 2}とならないようにすること。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_11
 * クラス名:ensyu06_11
 * 作成日:2022/11/28
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Randomクラスをインポート
import java.util.Random;
//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_11{

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数(10以下)：");
		//要素数を変数elementNumberへ代入
		int elementNumber = scannerInstance.nextInt();
		//配列を宣言する
		int[] intArray = new int[elementNumber];
		
		//乱数を生成する→前の要素とかぶらなければこれが要素の値になるはず
		int randomNumber = 1 + randomInstance.nextInt(10);
				
		for (int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
			
			for (int checkNumber = 0; checkNumber < indexNumber; checkNumber++){
			//以前の要素に被りがあったら、

				if (randomNumber == intArray[checkNumber]){						
					//乱数生成をやり直したうえでもう一度確認
					{
						randomNumber = 1 + randomInstance.nextInt(10);
						checkNumber = -1;
					}
				}
			}
			
			//要素に代入
			intArray[indexNumber] = randomNumber;
			
			//配列の要素を、コンソールでの見かけ上でも代入する。
			System.out.println("intArray[" + indexNumber + "] = " + randomNumber);
		}	
	}
}