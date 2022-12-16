//RobotPet（p.407）を拡張したクラス、RobotPet2

package workspace0.chapter14_archive.ensyu14_02;

class RobotPet2 extends Pet2 implements Skinnable{
	
	// - - - コンストラクタ
	public RobotPet2 (String name, String masterName) {
		//インスタンスの初期値を継承
		super(name, masterName);
	}
	
	// - - - メソッド
	//自己紹介をするメソッド
	public void introduce() {
		//名前
		System.out.println("◇私の 名前は " + getName() + " デス。");
		//飼い主の名前
		System.out.println("◇ご主人様の 名前は " + getMasterName() + " さんデス。");
	}
	
	//家事をするメソッド
	public void work( int switchNumber) {
		//入力値を仮引数に受け、その値で場合分け
		switch(switchNumber) {
			case 0:
				System.out.println("掃除します。");
				//0と入力されたら掃除だけさせたいので、ここでbreakする
				break;
			case 1:
				System.out.println("洗濯します。");
				//1と入力されたら洗濯だけさせたいので、ここでbreakする
				break;
			case 2:
				System.out.println("炊事します。");
				//2と入力されたらbreakしなくても炊事だけ行うが、
				//家事の選択肢追加の可能性を考え、break処理を書いておく
				break;
		}
	}
	
	//インターフェースSkinnableの、スキン変更メソッドを実装する
	public void changeSkin(int skinColor) {;
		
		//入力値を仮引数に受け、その値で場合分け
		switch(skinColor) {
			case BLACK:
				System.out.println("スキンを黒に変更しました。");
				//BLACKの中身である0、と入力されたらスキンを黒にだけ変更させたいので、ここでbreakする
				break;
			case RED:
				System.out.println("スキンを赤に変更しました。");
				//REDの中身である1、と入力されたらスキンを赤にだけ変更させたいので、ここでbreakする
				break;
			case GREEN:
				System.out.println("炊事します。");
				//GREENの中身である2、と入力されたらスキンを緑にだけ変更させたいので、ここでbreakする
				break;
			case BLUE:
				System.out.println("スキンを青に変更しました。");
				//BLUEの中身である3、と入力されたらスキンを青にだけ変更させたいので、ここでbreakする
				break;
			case LEOPARD:
				System.out.println("スキンをヒョウ柄に変更しました。");
				//LEOPARDの中身である4、と入力されたら、breakしなくてもスキンをヒョウ柄にだけ変更を行うが、
				//スキンの選択肢追加の可能性を考え、break処理を書いておく
				break;
		}
	}
	
	//季節の挨拶メソッドは、Pet2（親クラス）から継承している
}