/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_07 P.501
 *  List 15-15 のfor文を拡張for文で実現したプログラムを作成せよ。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu15_07
 * クラス名: ensyu15_07
 * 作成日:2022/12/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */
package workspace0.chapter15_archive;

class SumOfArgs {
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		double sum = 0.0;
		
		//30,31行目を、拡張for文を用いたコードに変更する
		for ( String elementItself: args) {
			sum += Double.parseDouble(elementItself);
		
		//for (int i = 0; i < args.length; i++ ) {
			//sum += Double.parseDouble(args[i]);
			
		}
		System.out.println("合計は" + sum + "です。");
	}
}