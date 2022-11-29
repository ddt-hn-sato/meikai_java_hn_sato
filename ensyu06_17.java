/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習06_17 p211
 * 	6人の2科目（国語・数学）の点数を読み込んで、
 *  科目ごとの平均点、学生ごとの平均点を求めるプログラムを作成せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu06_17
 * クラス名:ensyu06_17
 * 作成日:2022/11/29
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu06_17{

	public static void main(String[] args) {

		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);

		//int配列languageMathを宣言
		int[][] languageMath = new int[6][6];
		//String配列を初期化
		String[] japaneseSubject = {"国語" , "数学"};
		
		//要素の値を代入する変数を宣言
		int languageScore;
		int mathScore;
		
		//合計値の変数を初期化する
		int sumScore = 0;
		
		//配列を作成する旨を表示
		System.out.println("国語と数学の点数を6人分、格納する配列を、作成します。\n"
			+ "国語を1列目、数学を2列目に格納します。\n");
		
		//配列をループで作成
		//国語６人分の点数の格納が終わったら、数学の点数を順に配列に格納していく
		for(int indexNumber = 0; indexNumber < japaneseSubject.length; indexNumber++){
		
			//国語６人分の点数を順に配列に格納していく→数学６人分の点数も同様の処理
			for (int column = 0; column < 6; column++) {
				
				//要素の値の入力を促す
				System.out.print((column + 1) + "人目の" + japaneseSubject[indexNumber] + "の点数を入力：");
				
				//国語の点数についての入力なら、
				//入力値をlanguageScoreへ代入し、配列に格納し、累計の合計値を算出
				if(japaneseSubject[indexNumber].equals("国語")){
					languageScore = scannerInstance.nextInt();
					sumScore += languageScore;
					//配列に格納
					languageMath[indexNumber][column] = languageScore;
				//数学の点数についての入力なら、
				//入力値をmathScoreへ代入し、配列に格納し、累計の合計値を算出
				} else {
					mathScore = scannerInstance.nextInt();
					sumScore += mathScore;
					//配列に格納
					languageMath[indexNumber][column] = mathScore;
				}
			}
			//科目ごとの平均値を表示
			System.out.println("★" + japaneseSubject[indexNumber] + "の平均値：" + (sumScore/6));
			//見やすさのため改行
			System.out.println();
		}
		
		//各人の点数の合計値（つまり、languageMath[0][●]とlanguageMath[1][●]の和）の平均値
		for(int indexNumber = 0; indexNumber < 6; indexNumber++){
			sumScore = languageMath[0][indexNumber] + languageMath[1][indexNumber];
			//各人の平均値を表示
			System.out.println((indexNumber + 1) + "人目の国語と数学の点数の平均は" + (sumScore/6) + "です。");
		}
		
		//終了する旨を表示
		System.out.println("終了");
	}
}