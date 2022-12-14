//垂直直線

package workspace0.chapter13_archive.ensyu13_01;

class VirtLine extends AbstLine{
	
	// - - - コンストラクタ
	VirtLine(int length){
		//初期化
		super(length);
	}
	
	//親のdrawメソッドを継承し、非抽象にオーバーライド
	@Override void draw() {
		//'|'を指定回数ぶん（1列）表示する
		for(int i = 1; i <= getLength(); i++) {
			//'|'を表示
			System.out.println('|');
		}
	}
	
	//非抽象メソッド。中身を書く
	public String toString() {
		//以下表示
		return "VirtLine 垂直直線";
	};
}