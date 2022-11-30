/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_03 p229
 * 	3つのint型引数a, b, cの中央値を求めるメソッド med を作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお、問題に従ったため、変数の命名がコード規約からは逸れています。本回答でいうと、
 *  int型引数を、「a, b, c」というように、キャメルケースに従わない命名をしています。
 *  
 * パッケージ名:ensyu07_03
 * クラス名:ensyu07_03
 * 作成日:2022/11/30
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_03 {
	
	//入力された値が代入された変数a, b, cの、
	//中央値（つまり、2番目に大きい値）を求めるメソッドを作成
	static int med(int a, int b, int c) {
		
		//返却する値を変数evaluatedMedianとおき、1つの入力値で初期化
		int evaluatedMedian = a;
		
		//いずれか2つの数が等しいときは、もう1つの数がどんな大小関係であっても
		//中央値はその2つの数の値であり、返却値が確定する。
		if ( a == b || a == c){
			; // evaluatedMedianは、aのままでok
		} else if ( b == c) {
			evaluatedMedian = b; //bでもcでも可
		
		//a < b ならば
		} else if ( a < b ) {
			//bは2番目に大きい値である（仮）
			evaluatedMedian = b;
				
			//a < b && c < aの場合、aが2番目に大きい値。返却値が確定する。
			if (c < a) {
				//aは2番目に大きい値である（確定）
				evaluatedMedian = a;
			//a < b && c > aの場合、2番目に大きい値が不確定。
			//b < cであればb, b > cであれば、cが返却値。
			} else if (b < c){
				; //返却値はbのまま（確定）
			} else {
				//cは2番目に大きい値である（確定）
				evaluatedMedian = c;
			}
		//b < a ならば
		} else {
			//bは2番目に大きい値である（仮）
			evaluatedMedian = b;
			//b < a && c < bの場合、bは2番目に大きい値なので
			//中央値はbの値であり、返却値が確定する。
			if (c < b) {
				//bは2番目に大きい値である（確定）
				evaluatedMedian = a;
			//b < a && a < cの場合、aは2番目に大きい値なので
			//中央値はaの値であり、返却値確定。
			} else if (a < c){
				//返却値はa（確定）
				evaluatedMedian = a;
			//b < a && c < aの場合、2番目に大きい値が不確定なので再度条件分岐。
			} else {
				
				//b < a && c < a && b < c であれば 
				if (b < c){
					//返却値はc（確定）
					evaluatedMedian = c;
				//b < a && c < a && c < b であれば 
				} else {
					//返却値はb（確定）
					evaluatedMedian = b;
				}
			}
		}
		
		//返却値
		return evaluatedMedian;
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
		System.out.println("中央値は" + med( a, b, c) + "です。");
	}
}

