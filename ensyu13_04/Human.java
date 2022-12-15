/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13_04 p449
 *  演習9-4（p.329）で作成した《人間クラス》に対して、
 *  javadocコメントを与えるとともに、javadocツールによってドキュメントを作成せよ。
 *  
 * 回答:
 *  下記ご参照ください。
 *  
 * パッケージ名: workspace0.chapter13_archive.ensyu13_04
 * クラス名: Human
 * 作成日:2022/12/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter13_archive.ensyu13_04;

/** 
 * クラスHumanは、HumanTesterクラスでの入力値から値を取得し
 * スペック、BMI、誕生日（曜日）を返却するクラスです。
 * @author hsato
 * @see HumanTester
 */
public class Human {
	
	/**
	 * 名前を表すフィールドです。
	 */
	private String name;
	/**
	 * 身長を表すフィールドです。
	 */
	private int height;
	/**
	 * 体重を表すフィールドです。
	 */
	private int weight;
	
	/**
	 * 名前、身長、体重を初期化するコンストラクタです。
	 */
	Human(String name, int height, int weight){
		
		/**
		 * 名前を初期化します。
		 */
		this.name = name;
		/**
		 * 身長を初期化します。
		 */
		this.height = height;
		/**
		 * 体重を初期化します。
		 */
		this.weight = weight;
	}
	
	/*
	 * メソッドSpecは、ダイエット用語の「スぺ●●」の●●の数値をint型で返却するメソッドです。
	 *  ※身長(cm) - 体重(kg) で計算する、学術的な意味はない口語的な値です。
	 *  ※1つのクラスに属するstatic～～メソッドとは違い、個々のインスタンスに属するので
	 *  staticを付けないメソッドで作りました。
	 */
	int Spec(int height, int weight){
		
		/*
		 * 返却する変数を「身長(cm) - 体重(kg)」の式で算出し、初期化します。
		 */
		int specNumber = height - weight;
		/*
		 * 返却します。
		 */
		return specNumber;
	}
	
	/*
	 * メソッドBMIは、体重、身長の入力値からBMI指数を計算し、double型で返却するメソッドです。
	 * メソッド内の計算式の通り算出します。
	 * ※同上の理由でstaticをつけないメソッドで作りました。
	 */
	double BMI(double height, double weight) {
		
		/*
		 * 返却する変数を初期化します。
		 */
		double bmiNumber = 0;
		
		/*
		 * bmiNumber(BMI指数)を「体重kg / (身長m)の2乗」の式で算出し、代入します。
		 */
		bmiNumber = weight / Math.pow((height)/100, 2);
		
		/*
		 * 返却します。
		 */
		return bmiNumber;
	}
	
	/*
	 * メソッドAppropriateは、適性体重から、何キロ痩せているか計算し、double型で返却するメソッドです。
	 * メソッド内の計算式の通り算出します。
	 * ※同上の理由でstaticをつけないメソッドで作りました。
	 */
	void Appropriate(String name, double height, double weight) {
		/*
		 * 適性体重を「身長(m)の2乗 * 22」で求め、変数appropriateWeightを初期化ます。
		 */
		double appropriateWeight = Math.pow((height)/100, 2) * 22;
		
		if (appropriateWeight > weight) {
			/*
			 * もし、体重の入力値が適正体重より痩せていたら、痩せている旨表示します。
			 */
			System.out.print(name + "さんは標準体重より");
			System.out.printf("%4.2f", appropriateWeight - weight);
			System.out.print("キロ痩せています。" );
		} else if (appropriateWeight > weight) {
			/*
			 * もし、体重の入力値が適正体重と同じ体重なら、その旨表示します。
			 */
			System.out.print(name + "さんは標準体重です。");
		} else {
			/*
			 * もし、体重の入力値が適正体重より重かったら、太っている旨表示
			 */
			System.out.print(name + "さんは標準体重より");
			System.out.printf("%4.2f", weight - appropriateWeight);
			System.out.print("キロ太っています。" );
		}
	}
}