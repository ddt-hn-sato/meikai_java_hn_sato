//水平直線

package workspace0.chapter13_archive.ensyu13_01;

class HorzLine extends AbstLine{
	
	// - - - コンストラクタ
	HorzLine(int length){
		//初期化
		super(length);
	}
	
	//親のdrawメソッドを継承し、非抽象にオーバーライド
	@Override void draw() {
		//'-'を指定回数ぶん（1行）表示しきったら改行
		for(int i = 1; i <= getLength(); i++) {
			//'-'を表示
			System.out.print('-');
		}
		//1行終わったら改行
		System.out.println();
	}
	
	//非抽象メソッド。中身を書く
	public String toString() {
		//以下表示
		return "HorzLine 水平直線";
	};
}