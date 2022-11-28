/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_12 p199
 * 	配列の並びをシャッフルする（ランダムな順となるようにかき混ぜる）プログラムを完成せよ
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_12
 * クラス名:ensyu06_12
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

public class ensyu06_12{

	public static void main(String[] args) {

		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//要素数の入力を促す
		System.out.print("要素数：");
		//要素数を変数elementNumberへ代入
		int elementNumber = scannerInstance.nextInt();
		//配列を宣言する
		int[] intArray = new int[elementNumber];

		//表示の一部
		System.out.println("最初のintArray[" + elementNumber + "]は▼▼▼");
		//乱数を初期化
		int randomNumber = 0;

		//拡張for文で代入
		for (int elementItself : intArray) {
			//indexNumberをインクリメントするfor文
			for(int indexNumber = 0; indexNumber < elementNumber; indexNumber++) {
				
				randomNumber = 1 + randomInstance.nextInt(10);
				elementItself = randomNumber;
				
				//配列の要素を、実際に代入する。
				intArray[indexNumber] = elementItself;
				
				//配列の要素を、コンソールでの見かけ上でも代入する。
				System.out.println("intArray[" + indexNumber + "] = " + elementItself);
			}
		break;
		}
		
		//表示の一部
		System.out.println("最初のintArray[" + elementNumber + "]は▲▲▲\n");
		
		//配列2を宣言する
		int[] intArray2 = new int[elementNumber];
		
		//表示の一部
		System.out.println("シャッフル後のintArray2[" + elementNumber + "]は▼▼▼");

		//シャッフル後のインデックスの初期値をindexNumber2に格納する
		int indexNumber2 = randomInstance.nextInt(intArray.length);
		
		//表示のためのループ
		for (int indexCounter = 0; indexCounter < elementNumber;indexCounter++) {
				
			for (int checkNumber = 0, copyIndex = 0; checkNumber < elementNumber; checkNumber++){
				
				copyIndex = indexNumber2;
				
				//乱数生成をやり直す
				while (copyIndex == indexNumber2){
					indexNumber2 = randomInstance.nextInt(intArray.length);
				}
				
				intArray2[indexNumber2] = intArray[checkNumber];
				
			}
		
			//配列の要素を、コンソールでの見かけ上でも代入する。
			System.out.println("intArray2[" + indexCounter + "] = " + intArray2[indexCounter]);
		}
		//表示の一部
		System.out.println("シャッフル後のintArray2[" + elementNumber + "]は▲▲▲");

	}
}