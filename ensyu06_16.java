/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_16 p211
 * 	4行3列の行列と、3行4列の行列の積を求めるプログラムを
 *  作成せよ。各要素の値はキーボードから読み込むこと。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお、問題に曖昧な文章があったため、本社で卜部さんにご相談しまして
 *  以下のような解釈で実装しております。
 *  
 *  ※行と列を、行列AとBで逆転した上で積を求める考え方。
 *  
 *  	行列Aの1行1列目 * 行列Bの1行1列目 を求める
 *  	行列Aの1行2列目 * 行列Bの2行1列目 を求める
 *  	行列Aの1行3列目 * 行列Bの3行1列目 を求める・・・・・
 *  
 * パッケージ名:ensyu06_16
 * クラス名:ensyu06_16
 * 作成日:2022/11/29
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_16{

	public static void main(String[] args) {

		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//配列A, Bを宣言
		int[][] intArrayA = new int[4][3];
		int[][] intArrayB = new int[3][4];
		
		//要素の値を代入する変数elementNumberA,Bを宣言
		int elementNumberA;
		int elementNumberB;
		
		//配列Aを作成する旨を表示
		System.out.println("intArrayAと、intArrayBを作成します。\n");
		
		//配列AとBを同じループで作成
		//配列Aの行を変数under4, 列を変数under3で宣言し、定数まで回す
		//配列Bの行を変数under3, 列を変数under4で宣言し、定数まで回す
		for (int under4 = 0; under4 < 4; under4++) {
			for (int under3 = 0; under3 < 3; under3++) {
				
				//要素の値の入力を促す
				System.out.print("intArrayA[" + under4 + "][" + under3 + "] =");
				
				//入力値をelementNumberAへ代入
				elementNumberA = scannerInstance.nextInt();
				
				//配列の要素を代入
				intArrayA[under4][under3] = elementNumberA;
				
				//要素の値の入力を促す
				System.out.print("intArrayB[" + under3 + "][" + under4 + "] =");
				
				//入力値をelementNumberBへ代入
				elementNumberB = scannerInstance.nextInt();
				
				//配列の要素を代入
				intArrayB[under3][under4] = elementNumberB;
				
				//積を求める旨を表示
				System.out.println("intArrayA[ア][イ] * intArrayB[イ][ア] を、表示します。\n");
				
				//積を表示
				System.out.println("intArrayA[" + under4 + "][" + under3 + "] "
						+ "* intArrayB[" + under3 + "][" + under4 + "] =" + elementNumberA * elementNumberB + "\n");
			}
		}
		
		
		//終了する旨を表示
		System.out.println("終了");
	}
}