/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_06 p235
 * 	引数mで指定された月の季節を表示するメソッドprintSeasonを表示せよ。
 *  mが3, 4, 5であれば「春」、6, 7, 8であれば「夏」、9, 10, 11であれば「秋」、12, 1, 2であれば「冬」を
 *  表示し、それ以外であれば何も表示しないこと。
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_06
 * クラス名:ensyu07_06
 * 作成日:2022/12/01
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_06 {
	
	//引数mで指定された月の季節を表示するメソッドprintSeasonを作成
	static void printSeason(int m) {
		
		//mの値で条件分岐
		if ( m == 3 || m == 4 || m == 5) {
			//春を表示
			System.out.print("春");
			
		//6, 7, 8月ならば
		} else if ( m == 6 || m == 7 || m == 8) {
			//夏を表示
			System.out.print("夏");
			
		//9, 10, 11月ならば
		} else if ( m == 9 || m == 10 || m == 11) {
			//秋を表示
			System.out.print("秋");
			
		//12, 1, 2月ならば
		} else if ( m == 12 || m == 1 || m == 2) {
			//冬を表示
			System.out.print("冬");
			
		//1-12以外の月ならば
		} else {
			return; //何も表示しない
		}
	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//季節を判定したい月の数字を入力させる
		System.out.print("季節を判定したい月の数字を入力：");
		//入力値を変数へ代入
		int monthNumber = scannerInstance.nextInt();

		//結果を表示
		printSeason(monthNumber);

	}
}