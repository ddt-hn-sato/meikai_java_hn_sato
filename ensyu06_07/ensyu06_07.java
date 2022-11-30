/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06-07 p195
 * 	List 6-9は探索するキー値と同じ値の要素が複数個存在する場合、
 *  もっとも先頭に位置する要素を見つけるプログラムである。
 *  もっとも末尾側に位置する要素を見つけるプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu06_07
 * クラス名:ensyu06_07
 * 作成日:2022/11/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package ensyu06_07;

//Randomクラスをインポート
import java.util.Random;
//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_07 {

	public static void main(String[] args) {
		//乱数を生成するインスタンスを作成
		Random randomInstance = new Random();
		//キーボードからの入力値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//要素数
		final int elementsNumber = 12;
		//インスタンスを用いて、入力値を配列変数intArrayへ代入
		int[] intArray = new int[elementsNumber];

		//配列intArrayの全要素の値を、Randomクラスで入れていくループ
		for (int indexCounter = 0; indexCounter < elementsNumber; indexCounter++) {
			intArray[indexCounter] = randomInstance.nextInt(10);
		}

		//配列intArrayの全要素の値を、表示するループ
		System.out.print("配列IntArrayの全要素の値\n{ ");
		//変数indexCounterでループ回数をカウント
		for(int indexCounter = 0; indexCounter < elementsNumber; indexCounter++) {
			//
			System.out.print(intArray[indexCounter] + " ");
		}
		//最後のとじかっこを表示
		System.out.println("}");

		//探したい数値の入力を促す
		System.out.print("探したい数値：");
		//インスタンスを用いて、入力値を変数searchNumberへ代入
		int searchNumber = scannerInstance.nextInt();

		//配列から探したい数値を探すループ
		int searchCounter;

		for (searchCounter = elementsNumber - 1; searchCounter >= 0; searchCounter--) {
			//indexNumberが大きい順に探索し、探しているのと同じ値が
			//配列の要素にあった場合だけ、break; で、他は何もしない
			if (intArray[searchCounter] == searchNumber) {
				break;
			}
		}

		//探索成功
		if (searchCounter > 0) {
			System.out.println("それは intArray[" + searchCounter + "]にあります。");
		} else { //探索失敗
			System.out.println("それはありません。");
		}

	}

}
