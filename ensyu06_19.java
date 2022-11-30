/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_19 p215
 * 	クラス数、各クラスの人数、全員の点数を読み込んで、
 *  点数の合計点と平均点を求めるプログラムを作成せよ。
 *  合計点と平均点は、クラスごとのものと、全体のものとを表示すること。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu06_19
 * クラス名:ensyu06_19
 * 作成日:2022/11/30
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_19{

	public static void main(String[] args) {

		//キーボードから値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//点数を格納する2次元配列を宣言
		int[][] array2d;
		
		//2次元配列の行数の入力を促す
		System.out.print("クラス数：");
		//入力値を変数へ代入
		int arrayHeights = scannerInstance.nextInt();
		
		//2次元配列の列数（行のみ）を初期化
		array2d = new int[arrayHeights][];
		
		//合計点、平均点を格納する2次元配列を初期化
		double[][] sumAverage = new double[arrayHeights][2];
		
		//合計値を代入する変数sumScoreを初期化
		double sumScore = 0.0;
		//平均値を代入する変数averageScoreを初期化
		double averageScore = 0.0;
		
		//2次元配列の構成要素（配列）ごとに列数を入力させるループ
		for(int lineNumber = 1; lineNumber <= arrayHeights; lineNumber++) {
			
			//lineNumber行目の構成要素（配列）ごとに列数の入力を促す
			System.out.print("\n" + lineNumber + "組の人数は：");
			//入力値を変数へ代入
			int columnNumber = scannerInstance.nextInt();
				
			//構成要素（配列）ごとの列数を初期化
			array2d[lineNumber - 1] = new int[columnNumber];
			
			//合計値を代入する変数sumScoreを初期化
			sumScore = 0.0;
			//平均値を代入する変数averageScoreを初期化
			averageScore = 0.0;
			
			//各配列の列数ぶん、要素の値を代入するループ
			for(int everyIndex = 0; everyIndex < columnNumber; everyIndex++) {
				
				//lineNumber行目の構成要素（配列）の列数ごとに、要素の値の入力を促す
				System.out.print( lineNumber + "組 " + (everyIndex + 1) + "番 の点数は？：");
				//入力値を変数へ代入
				int elementItself = scannerInstance.nextInt();
				//各配列の列数ごとに、要素の値を格納
				array2d[lineNumber - 1][everyIndex] = elementItself;
				
				//合計値を算出し、変数に代入
				sumScore += elementItself;
				//平均値を算出し、変数に代入
				averageScore = sumScore / columnNumber;
				//合計値と平均値を配列sumAverageに格納する
				sumAverage[lineNumber - 1][0] = sumScore;
				sumAverage[lineNumber - 1][1] = averageScore;
			}
			
		}
		
		//結果の表示（前半部分）
		System.out.println("\n  組 |     合計 |     平均 |");
		System.out.println("-----+----------+----------+");
		
		
		//sumAverage配列から合計値と平均値を列ごとに取得する
		for (int lineNumber = 1; lineNumber <= arrayHeights; lineNumber++) {
			
			//●組、の部分を表示
			System.out.print(" " + lineNumber + "組 |");
			
			//各配列の列ごとに、合計値を表示
			System.out.printf("%9f", sumAverage[lineNumber - 1][0]);
			System.out.print(" |");
			
			//各配列の列ごとに、平均値を表示
			System.out.printf("%9f", sumAverage[lineNumber - 1][1]);
			System.out.print(" |");
			
			//総計の計算のためsumScoreへ合計値を合算していく
			sumScore += sumAverage[lineNumber - 1][0];
			//総計の計算のためaverageScoreへ平均値を合算していく
			averageScore += sumAverage[lineNumber - 1][1];
			
			//行の出力が終わるたびに改行
			System.out.println();
		}
		//総計を表示
		System.out.println("-----+----------+----------+");
		System.out.print(" 総計|");
		
		//合計値の総計
		System.out.printf("%9f", sumScore);
		System.out.print(" |");
		//平均値の総計
		System.out.printf("%9f", averageScore);
		System.out.print(" |");
		
	}
}
