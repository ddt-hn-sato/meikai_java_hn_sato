//点

package workspace0.chapter13_archive.ensyu13_01;

class Point extends Shape{
	
	//仮引数がカラの場合のコンストラクタ
	Point(){
		
	}
	
	//非抽象メソッド。中身を書く
	public String toString() {
		//以下表示
		return "Point";
	};
	
	//親のdrawメソッドを継承し、非抽象にオーバーライド
	@Override void draw() {
		System.out.println('+');
	}
	
}