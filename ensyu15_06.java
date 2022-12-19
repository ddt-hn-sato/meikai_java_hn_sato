/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_06 P.501
 *  コマンドライン引数で与えられた半径を持つ円の
 *  円周の長さと面積を求めて表示するプログラムを作成せよ。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  eclipseの[実行] → [実行の構成] → [引数]タブから引数を入力し、動作確認しました。
 *  
 * パッケージ名:ensyu15_06
 * クラス名: ensyu15_06
 * 作成日:2022/12/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter15_archive;

class Circle {
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//半径
		double radianNumber = 0.0;
		//円周率 - - - 今回は指定がないので3.14（定数）とする
		double PI = 3.14;
		
		//コマンドライン引数から与えられた値をradianNumberにいれる
		radianNumber = Double.parseDouble(args[0]);
		
		//円周の長さを表示
		System.out.println("円周の長さは→" + radianNumber * 2);
		
		//円の面積を表示
		System.out.println("円の面積は→" + radianNumber * radianNumber * PI);
	}
}