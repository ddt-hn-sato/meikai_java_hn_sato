/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_02 p229
 * 	3つのint型引数a, b, cの最小値を求めるメソッド min を作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお、問題に従ったため、変数の命名がコード規約からは逸れています。本回答でいうと、
 *  int型引数を、「a, b, c」というように、キャメルケースに従わない命名をしています。
 *  
 * パッケージ名:ensyu07_02
 * クラス名:ensyu07_02
 * 作成日:2022/11/30
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_02 {
	
	//入力された値が代入された変数a, b, cの、最小値を求めるメソッドを作成
	static int min(int a, int b, int c) {
		
		//返却する値を変数evaluatedMinimumとおき、1つの入力値で初期化
		int evaluatedMinimum = a;
		
		//int bがint aより小さければ
		if ( b < evaluatedMinimum )
			//返却値はbになる（仮）
			evaluatedMinimum = b;
		
		//int cがeveluatedMinimunより小さければ
		if ( c < evaluatedMinimum)
			//返却値はcになる（仮）
			evaluatedMinimum = c;
		//上記のいずれでもなければ返却値はaになる（仮）
		return evaluatedMinimum;
	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//整数値を入力させる
		System.out.print("整数値aを入力：");
		//入力値を変数へ代入
		int a = scannerInstance.nextInt();
		
		//整数値を入力させる
		System.out.print("整数値bを入力：");
		//入力値を変数へ代入
		int b = scannerInstance.nextInt();
		
		//整数値を入力させる
		System.out.print("整数値cを入力：");
		//入力値を変数へ代入
		int c = scannerInstance.nextInt();

		//結果を表示
		System.out.println("最小値は" + min( a, b, c) + "です。");
	}
}

