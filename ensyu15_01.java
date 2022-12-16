/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_01 P.489
 *  文字列を読み込んで、その文字列を逆順に表示するプログラムを作成せよ。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu15_01
 * クラス名: Reverse
 * 作成日:2022/12/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter15_archive;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu15_01{
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//文字列を入力させる
		System.out.print("逆さにしたい文字列：");
		//入力値で変数を初期化
		String reversibleString = standardInput.next();
		
		//逆さにした旨文字列を表示
		System.out.println("▼逆さにしました▼");
		//文字列リテラルの内部は、char型の文字リテラルを要素とする配列なので、この配列を
		//インデックスの最大値から0まで走査し、逆から表示させる
		for (int i = (reversibleString.length() - 1); i >= 0  ; i--) {
			//表示させる。char型の配列のインデックスiの値を、String型のインスタンス経由で取ってきている
			System.out.print(reversibleString.charAt(i));
		}
	}
}
