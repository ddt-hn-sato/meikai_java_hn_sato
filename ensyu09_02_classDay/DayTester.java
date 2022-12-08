/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_02 p323
 *  日付クラス第3版を利用するプログラムを作成せよ。
 *  すべてのコンストラクタの働きを確認できるようにすること。
 *  
 * 回答:
 *  同フォルダ「ensyu09_02_classDay」に、Dayクラスのファイルがあります。
 *  そちらのプログラムも、併せてご参照ください。①～●のコンストラクタと対応しています。
 *  
 * パッケージ名:ensyu09_02_classDay
 * クラス名: DayTester
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_02_classDay;

//Scannerクラスをインポート
import java.util.Scanner;

//DayTesterクラス
public class DayTester {
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//年、月、日を入力できるかどうか聞く
		System.out.print("年月日などの入力を行いますか？[ YES = 1, NO = 0 ]：");
		int yesNo = standardInput.nextInt();
		if ( yesNo != 1 ) {
		//入力を行いませんの場合
			
			//①クラスでの初期化子をそのまま取ってくるコンストラクタに
			//アクセスし、1年1月1日を取得。
			Day yearMonthDateOld = new Day();
			//説明、表示させる
			System.out.println("それでは、デフォルトの年月日を表示して終了します。");
			System.out.println("yearMonthDateOld = " + yearMonthDateOld);
			//終わり
			
		} else {
		//入力を行いますの場合
			
			//年、月、日をすべて入力できるかどうか聞く
			System.out.print("年月日をすべて入力しますか？[ YES = 1, NO = 0 ]：");
			yesNo = standardInput.nextInt();
			
			//すべて入力する「YES」の場合
			if (yesNo == 1) {
				
				//年、月、日をそれぞれ入力値から変数へ代入し、一括でインスタンスを生成
				System.out.print("年を入力：");
				int year = standardInput.nextInt();
				
				System.out.print("月を入力：");
				int month = standardInput.nextInt();
				
				System.out.print("日を入力：");
				int date = standardInput.nextInt();
				
				//コンストラクタでクラスを作成
				Day yearMonthDateOld = new Day(year, month, date);
				
				//日付表現を表示する
				System.out.println("yearMonthDate = " + yearMonthDateOld);

			} else if (yesNo == 0) {
				
			// - - - yearだけをまず入力させる
			System.out.print("★年を入力：");
			//入力値を変数へ代入
			int year = standardInput.nextInt();
			//②インスタンスを生成
			Day yearMonthDateOld = new Day(year);
			//日付表現を表示する
			System.out.println("yearMonthDate = " + yearMonthDateOld);
			
			// - - - 月を入力するかどうか
			System.out.print("月を入力しますか？[ YES = 1, NO = 0 ]：");
			yesNo = standardInput.nextInt();
			
				if (yesNo == 1) {
				
				//monthを入力させる
				System.out.print("★月を入力：");
				//入力値を変数へ代入
				int month = standardInput.nextInt();
				//③インスタンスをnewで新たに生成
				yearMonthDateOld = new Day(year, month);
				//日付表現を表示する
				System.out.println("yearMonthDate = " + yearMonthDateOld);
				
				// - - - 日にちを入力するかどうか
				System.out.print("日を入力しますか？[ YES = 1, NO = 0 ]：");
				yesNo = standardInput.nextInt();
				
					if (yesNo == 1) {
					
					//dateを入力させる
					System.out.print("★日を入力：");
					//入力値を変数へ代入
					int date = standardInput.nextInt();
					//④インスタンスをnewで新たに生成
					yearMonthDateOld = new Day(year, month, date);
					//日付表現を表示する
					System.out.println("yearMonthDate = " + yearMonthDateOld);
					
					//上書きさせる
					System.out.println("年月日をすべて上書きしましょう。（年月日をすべて入力すること）");
						
					//もとの日付表現を表示する
					System.out.println("旧 yearMonthDate = " + yearMonthDateOld.toString());
					
					//④セッタを使ってみるため、あえて、新しい年月日のインスタンスを生成
					Day yearMonthDateNew = new Day(year, month, date);
					
					//上書きしたい年月日を入力させ
					System.out.print("上書き -> 年を入力：");
					int yearNew = standardInput.nextInt();
					
					System.out.print("上書き -> 月を入力：");
					int monthNew = standardInput.nextInt();
					
					System.out.print("上書き -> 日を入力：");
					int dateNew = standardInput.nextInt();
					
					//セッタで、新しいほうを上書きする
					yearMonthDateNew.set(yearNew, monthNew, dateNew);
					
					//新しいほうの日付表現を表示する
					System.out.println("新 yearMonthDate = " + yearMonthDateNew);
					
					//もとの日付と、新しい日付を比較
					if (yearMonthDateOld.equalTo(yearMonthDateNew)){
						System.out.println("二つの年月日は同じです。上書きしても変わらないが、上書きします。");
					} else {
						System.out.println("二つの年月日は違います。上書きします。");
					}
					
					//セッタで、古いほうも上書きする
					yearMonthDateOld.set(yearNew, monthNew, dateNew);
					
					//古いほうの日付表現を表示する
					System.out.println("旧 yearMonthDate を上書きしました = " + yearMonthDateOld);
					}
				}
			}
		}
		//終了
		System.out.print("終了します。");
			
	}
}