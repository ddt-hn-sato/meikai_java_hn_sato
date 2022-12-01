/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_04 p231
 * 	1からnまでの全整数の和を求めて返却するメソッドを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_04
 * クラス名:ensyu07_04
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_04 {
	
	//1から、入力された値が代入された変数nまでの、全整数の和を求めるメソッドを作成
	static int sumUp(int maxNumber) {
		
		//返却する値を変数evaluatedMinimumとおき、1つの入力値で初期化
		int totalNumbers = maxNumber;
		
		while (maxNumber-- > 0)
			totalNumbers += maxNumber;
		
		return totalNumbers;
	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//整数値を入力させる
		System.out.print("整数値 n を入力：");
		//入力値を変数へ代入
		int numberN = scannerInstance.nextInt();

		//結果を表示 numberNの値自体は変わらない
		System.out.println("1から" + numberN + "までの合計値は" + sumUp(numberN) + "です。");
	}
}

