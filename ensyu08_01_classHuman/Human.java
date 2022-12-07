/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習08_01 p293
 *  名前・身長・体重などをメンバとして持つ≪人間クラス≫を
 *  作成せよ。フィールドやメソッドなどは自分で自由に設計すること
 *  
 * 回答:
 *  同フォルダ「ensyu08_01_classHuman」に、HumanTesterクラスのファイルがあります。
 *  そちらのプログラムも併せてご参照ください。
 *  
 * パッケージ名:ensyu08_01_classHuman
 * クラス名:Human
 * 作成日:2022/12/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter08_archive.ensyu08_01_classHuman;

//Humanクラス
public class Human {
	
	//名前
	private String name;
	//身長
	private int height;
	//体重
	private int weight;
	
	//コンストラクタ
	Human(String name, int height, int weight){
		
		//名前
		this.name = name;
		//身長
		this.height = height;
		//体重
		this.weight = weight;
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