/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_05 p330
 *  開始日と終了日とから構成される《期間》を表すクラスPeriodを作成せよ。
 *  フィールドは以下のようになる。
 *  	
 *  	class Period {
 *  		private Day from; //開始日
 *  		private Day to;   //終了日
 *  	}
 *  
 *  コンストラクタやメソッドを自由に定義すること。
 *  
 * 回答:
 *  下記ご参照ください。
 *  
 * パッケージ名:ensyu09_05_classPeriod
 * クラス名: Period
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_05_classPeriod;

//スキャナクラスをインポート
import java.util.Scanner;

//PeriodTesterクラス
public class PeriodTester {
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//------<古い>年月日を入力させ、
		//年、月、日をそれぞれ入力値から変数へ代入し、一括でインスタンスを生成
		System.out.print("開始年を入力：");
		int yearFrom = standardInput.nextInt();
		
		System.out.print("開始月を入力：");
		int monthFrom = standardInput.nextInt();
		
		System.out.print("開始日を入力：");
		int dateFrom = standardInput.nextInt();
		
		//コンストラクタでクラスを作成
		Day from = new Day(yearFrom, monthFrom, dateFrom);
		
		//日付表現を表示する
		System.out.println("from = " + from.toString(yearFrom, monthFrom, dateFrom));
		
		//------<新しい>年月日を入力させ、
		//年、月、日をそれぞれ入力値から変数へ代入し、一括でインスタンスを生成
		System.out.print("終了年を入力：");
		int yearTo = standardInput.nextInt();
		
		System.out.print("終了月を入力：");
		int monthTo = standardInput.nextInt();
		
		System.out.print("終了日を入力：");
		int dateTo = standardInput.nextInt();
		
		//コンストラクタでクラスを作成
		Day to = new Day(yearTo, monthTo, dateTo);
		
		//日付表現を表示する
		System.out.println("to = " + to.toString(yearTo, monthTo, dateTo));
		
		//期間をnewする//期間を算出し、変数を初期化する
		int periodNumber = to.countDays(yearTo, monthTo, dateTo) - from.countDays(yearFrom, monthFrom, dateFrom);

		//期間を表示する
		System.out.println("この2つの日付の期間は、" + periodNumber + "日です。");
		
		//Periodクラスを作成
		Period periodDays = new Period(yearFrom, monthFrom, dateFrom, yearTo, monthTo, dateTo);
		
		//periodがちょうど100日単位かどうか、返却する
		periodDays.Just(periodNumber);
	}
}