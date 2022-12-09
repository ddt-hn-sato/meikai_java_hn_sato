/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習09_04 p329
 *  演習8-1で作成した《人間クラス》に、誕生日のフィールドと
 *  toStringメソッドを追加せよ。
 *  ※コンストラクタを変更したり、誕生日のゲッタなどのメソッドを追加したりすること。
 *  
 * 回答:
 *  同フォルダに、演習問題09_04に関する、HumanTester4クラス, Dayクラスのファイルがあります。
 *  そちらのプログラムも併せてご参照ください。
 *  
 * パッケージ名:ensyu09_04_classHuman3
 * クラス名: Human2
 * 作成日:2022/12/8
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter09_archive.ensyu09_04_classHuman3;

import workspace0.chapter09_archive.ensyu09_03_classAccount.Day;

//Human2クラス
public class Human2 {
	
	//名前
	private String name;
	//身長
	private int height;
	//体重
	private int weight;
	
	//誕生年
	private int year;
	//誕生月
	private int month;
	//誕生の日
	private int date;
	
	//誕生年月日
	private Day birthDay;
	
	//コンストラクタ
	Human2(String name, int height, int weight, Day birthDay){
		
		//名前
		this.name = name;
		//身長
		this.height = height;
		//体重
		this.weight = weight;
		//誕生年月日
		//HumanTester4クラスで、Dayクラスを用いて作成したインスタンスへの、参照を代入
		this.birthDay = birthDay;
	}

	//★誕生日を調べるメソッド
	//日付インスタンス
	Day getBirthDay() {
		//日付インスタンスへの参照をコピー
		birthDay = new Day(year, month, date);
		//そのコピーを返却
		return birthDay;
	}
	
	//★曜日を求めるメソッド
	public int dayOfWeek() {
		
		int y = year;
		int m = month;
		if (m == 1 || m == 2) {
			y--;
			m += 12;
		}
		return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
	}
	
	//★（誕生日の）文字列表現を返却するメソッド
	public String toString() {
		String[] wd = {
			"日", "月", "火", "水", "木", "金", "土"
		};
		
		return String.format("%04d年%02d月%02d日(%s)",
				year, month, date, wd[dayOfWeek()]);
	}
	
	//Specメソッド ※1つのクラスに属するstatic～～メソッドとは違い、個々のインスタンスに属するので
	//staticを付けないメソッドで作る
	int Spec(int height, int weight){
		
		//返却する変数を初期化
		int specNumber = height - weight;
		//返却する
		return specNumber;
	}
	
	//BMIメソッド_同上の理由でstaticなし
	double BMI(double height, double weight) {
		
		//返却する変数を初期化
		double bmiNumber = 0;
		
		//体重kg / (身長m)^2
		bmiNumber = weight / Math.pow((height)/100, 2);
		
		//返却する
		return bmiNumber;
	}
	
	//適性体重から、何キロ痩せているか教えてくれるメソッド_同上の理由でstaticなし
	void Appropriate(String name, double height, double weight) {
		//適性体重を求める
		double appropriateWeight = Math.pow((height)/100, 2) * 22;
		
		if (appropriateWeight > weight) {
			//もし、より痩せていたら、痩せている旨表示
			System.out.print(name + "さんは標準体重より");
			System.out.printf("%4.2f", appropriateWeight - weight);
			System.out.print("キロ痩せています。" );
		} else if (appropriateWeight > weight) {
			//もし同じ体重なら、その旨表示
			System.out.print(name + "さんは標準体重です。");
		} else {
			//もし、より太っていたら、太っている旨表示
			System.out.print(name + "さんは標準体重より");
			System.out.printf("%4.2f", weight - appropriateWeight);
			System.out.print("キロ太っています。" );
		}
	}
}