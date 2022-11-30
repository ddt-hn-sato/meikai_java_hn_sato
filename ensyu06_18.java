/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_18 p215
 * 	行数・各行の列数・各要素の値をキーボードから
 * 読み込むように、 List 6 - 18 を書き換えたプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu06_18
 * クラス名:ensyu06_18
 * 作成日:2022/11/30
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_18{

	public static void main(String[] args) {

		//キーボードから値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//2次元配列を宣言
		int[][] array2d;
		
		
		//2次元配列の行数の入力を促す
		System.out.print("配列の行数は：");
		//入力値を変数へ代入
		int arrayHeights = scannerInstance.nextInt();
		//2次元配列の列数（行のみ）を初期化
		array2d = new int[arrayHeights][];
		
		//2次元配列の構成要素（配列）ごとに列数を入力させるループ
		for(int lineNumber = 1; lineNumber <= arrayHeights; lineNumber++) {
			
			//lineNumber行目の構成要素（配列）ごとに列数の入力を促す
			System.out.print( lineNumber + "行目の配列の列数は：");
			//入力値を変数へ代入
			int columnNumber = scannerInstance.nextInt();
				
			//構成要素（配列）ごとの列数を初期化
			array2d[lineNumber - 1] = new int[columnNumber];
			
			//各配列の列数ぶん、要素の値を代入するループ
			for(int everyIndex = 0; everyIndex < columnNumber; everyIndex++) {
				
				//lineNumber行目の構成要素（配列）の列数ごとに、要素の値の入力を促す
				System.out.print( lineNumber + "行目の配列の、" + (everyIndex + 1) + "番目の要素の値は：");
				//入力値を変数へ代入
				int elementItself = scannerInstance.nextInt();
				//各配列の列数ごとに、要素の値を格納
				array2d[lineNumber - 1][everyIndex] = elementItself;
				//各配列の列数ごとに、要素の値を表示
				System.out.printf("%3d", array2d[lineNumber-1][everyIndex]);
				
				//行の出力が終わるたびに改行
				System.out.println();
			}
		}
	}
}