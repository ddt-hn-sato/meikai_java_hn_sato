/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_04 P.493
 *  浮動小数点値 x を、小数点以下の部分を pケタ で、全体を少なくとも wケタ で
 *  表示するメソッド printDouble を作成せよ。
 *  
 *  	printDouble(double x, int p, int w)
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu15_04
 * クラス名: ensyu15_04
 * 作成日:2022/12/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter15_archive;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu15_04{
	
	//浮動小数点値 x を、小数点以下の部分を pケタ で、全体を少なくとも wケタ で
	//表示するメソッド
	 static void printDouble(double x, int p, int w) {
		//これを実現したいが、直接String型でない変数（wやp）をこの箇所に書くとエラーになるので
		//String formattedNumber = String.format("%w.pf", x);
		 
		//以下のように、string型にformatしてから、上記の箇所に間接的に書く
		String W = String.format("%d", w);
		String P = String.format("%d", p);

		String formattedNumber = String.format("%" + W + "." + P + "f", x);
		System.out.println(formattedNumber);
	}
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//浮動小数点数値 x を入力させる
		System.out.print("浮動小数点値 x を入力：");
		//入力値を変数へ代入する
		double x = standardInput.nextDouble();
		
		//全体を何桁で表示させますか、を表示
		System.out.print("表示させる全体の桁数 w を入力：");
		//入力値を変数へ代入する
		int w = standardInput.nextInt();
		
		//小数点以下を何桁で表示させますか、を表示
		System.out.print("表示させる小数点以下の桁数 p を入力：");
		//入力値を変数へ代入する
		int p = standardInput.nextInt();
		
		//浮動小数点値 x を、小数点以下の部分を pケタ で、全体を少なくとも wケタ で表示する
		printDouble( x, p, w );
	}
}
	
