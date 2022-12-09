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

//Periodクラス
public class Period {
	
	//インスタンスの宣言を行う
	private Day from; //開始日
	private Day to;   //終了日
	
	// - - - コンストラクタ
	//year, month, dateがそれぞれ入力されたときに、
	public Period(int yearFrom, int monthFrom, int dateFrom, int yearTo, int monthTo, int dateTo) {
		
		//各インスタンスを初期化するコンストラクタ
		this.from = new Day(yearFrom, monthFrom, dateFrom); //開始日
		this.to = new Day(yearTo, monthTo, dateTo);   //終了日
	}
	
	// - - - ちょうど100日単位で、ちょうど○日と返すメソッド
	public void Just(int periodNumber) {
		
		int justOr = periodNumber;
		
		if (justOr%100 == 0) {
			//ちょうど●日です、と表示する
			System.out.println("ちょうど" + justOr + "日です！");
			
		} else {
			System.out.println("キリのいい100日単位まで、あと" + (100 - justOr%100) + "日です！");
		}
	}
	
}