/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_03 P.489
 *  文字列探索のプログラムを書き換えて、下記のように表示するプログラムを作成せよ。
 *  一致する部分が上下で揃うように表示すること。
 *  
 *  	文字列s1:ABCDE
 *  	文字列s2:BC
 *  	s1:ABCDE
 *  	s2: BC
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu15_03
 * クラス名: ensyu15_03
 * 作成日:2022/12/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter15_archive;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu15_03{
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//1つめの文字列を入力させる
		System.out.print("1つめの文字列 ★string1：");
		
		//入力値を変数に代入する
		String string1 = standardInput.next();
		
		//2つめの文字列を入力させる
		System.out.print("2つめの文字列 ※string1と、一部完全一致させてください。全角入力のみ。 ★string2：");
		
		//入力値を変数に代入する
		String string2 = standardInput.next();
		
		//部分一致するかどうか調べた結果を変数に代入する
		//（「一致する = その場所をchar型の配列のインデックスとして返す」「一致しない = -1 を返す」メソッドを使用）
		int matchedIndex = string1.indexOf(string2); //string1にstring2は含まれるか
		
		//一致する場合
		if (matchedIndex != -1) {
			//表示の説明
			System.out.println("▼文字が一部、完全一致する部分を表示します▼");
			
			//まずstring1から表示する
			System.out.println("string1:" + string1);
			
			//次にstring2を表示する旨
			System.out.print("string2:");
			
			//String型の文字列リテラル(今回はstring1)の内部は、char型の文字リテラルを要素とする配列なので、この配列を
			//インデックスの0から最大値まで走査する。string2も同様に行い、同じ文字リテラルがあるか調べる。
			for (int i = 0; i < string1.length(); i++) {
				//char型の配列のインデックスiの値を、String型のインスタンス経由で取得し、
				//matchedIndex以上、(matchedIndex + string2の文字数 - 1)以下であれば 
				// = つまり インデックスがmatchedIndexから数えてstring2の文字数ぶん その文字リテラルを表示する。
				if ( i >= matchedIndex && i <= matchedIndex + string2.length() - 1) {
					//1文字ずつ、その文字リテラルを表示する
					System.out.print(string1.charAt(i));
				} else {
					//iがmatchedIndexと同じでなければ空欄を表示
					System.out.print('　');
				}
			}
		} else {
			//部分一致しない場合
			System.out.println("×××　文字が一部、完全一致しません。　×××");
		}
		
	}
}
	
