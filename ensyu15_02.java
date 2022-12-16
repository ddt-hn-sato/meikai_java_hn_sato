/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_02 P.489
 *  文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  どの文字コードなのか指定がなかったため、教本に説明のあるUnicodeコードポイントにて表示させました。
 *  
 * パッケージ名:ensyu15_02
 * クラス名: ensyu15_02
 * 作成日:2022/12/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter15_archive;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu15_02{
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//文字列を入力させる
		System.out.print("全文字を文字コードに表したい文字列：");
		//入力値で変数を初期化
		String encodingString = standardInput.next();
		
		//逆さにした旨文字列を表示
		System.out.println("▼1文字ずつ、文字コードを表示します▼");
		//String型の文字列リテラルの内部は、char型の文字リテラルを要素とする配列なので、この配列を
		//インデックスの0から最大値まで走査し表示、さらに文字コードに置換のうえ表示もさせる
		for (int i = 0; i < encodingString.length(); i++) {
			//その文字自体を1文字ずつ表示させる。char型の配列のインデックス1の値を、String型のインスタンス経由で取ってきている
			System.out.print("「" + encodingString.charAt(i) + "」の文字コードは→");
			//文字コードを表示させる
			System.out.println(encodingString.codePointAt(i));
		}
	}
}
