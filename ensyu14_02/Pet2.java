//RobotPet2クラスの親クラス、Pet2クラス（Petクラス（p.407）と同一内容だが、子クラスとの名称の統一のため2をつけた）

package workspace0.chapter14_archive.ensyu14_02;

class Pet2 implements SeasonalGreetings{
	//ペットの名前
	private String name;
	//飼い主の名前
	private String masterName;
	
	// - - - コンストラクタ
	public Pet2(String name, String masterName) {
		//ペットの名前
		this.name = name;
		//飼い主の名前
		this.masterName = masterName; 
	}
	
	// - - - メソッド
	//ペットの名前を返却するメソッド
	public String getName() {
		//ペットの名前を返却する
		return name;
	}
	
	//飼い主の名前を返却するメソッド
	public String getMasterName() {
		//飼い主の名前を返却する
		return masterName;
	}
	
	//自己紹介
	public void introduce() {
		//名前
		System.out.println("■僕の名前は" + name + "です！");
		//飼い主の名前
		System.out.println("■飼い主の名前は" + masterName + "さんです！");
	}
	
	//インターフェースの、季節の挨拶メソッドを実装
	public void greetAppropriately(int eventNumber){
		//入力値を仮引数に受け、その値で場合分け
		switch(eventNumber) {
			case NEWYEAR:
				System.out.println("あけましておめでとうございます！");
				//NEWYEARつまり、1と入力されたら、この処理だけさせたいのでここでbreakする
				break;
			case SPRINGSTART:
				System.out.println("もうすぐ春ですね！");
				//SPRINGSTARTつまり、3と入力されたら、この処理だけさせたいのでここでbreakする
				break;
			case RAINYSEASON:
				System.out.println("梅雨の季節ですね…");
				//RAINYSEASONつまり、6と入力されたら、この処理だけさせたいのでここでbreakする
				break;
			case SUMMEREND:
				System.out.println("夏休みが終わりますねT_T");
				//SUMMERENDつまり、8と入力されたら、この処理だけさせたいのでここでbreakする
				break;
			case HALLOWEEN:
				System.out.println("HAPPY HALLOWEEN!");
				//HALLOWEENつまり、10と入力されたら、この処理だけさせたいのでここでbreakする
				break;
			case CHRISTMAS:
				System.out.println("Merry Christmas!!");
				//CHRISTMASつまり、12と入力されたらbreakしなくてもこの処理だけ行うが、
				//季節の選択肢追加の可能性を考え、break処理を書いておく
				break;
		}
	}
}