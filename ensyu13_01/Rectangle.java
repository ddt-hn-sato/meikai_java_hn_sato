//長方形

package workspace0.chapter13_archive.ensyu13_01;

class Rectangle extends Shape{
	
	//幅
	private int width;
	//高さ
	private int height;

	//コンストラクタ
	Rectangle(int width, int height){
		
		this.width = width;
		this.height = height;
	}
	
	//非抽象メソッド
	//ObjectクラスのtoStringメソッドを継承しているため、
	//[public]は、そのtoStringメソッドにかかっている
	public String toString() {
		//長方形の情報を表示
		return "Rectangle(width:" + width + ", height:" + height + ") 長方形";
	}
	
	//親のdrawメソッドを継承し、非抽象にオーバーライド
	@Override void draw() {
		
		//(内側の、幅のループが回ってから)高さのループが回る
		for(int i = 1; i <= height; i++) {
			
			//幅のループが周る
			for(int k = 1; k <= width; k++) {
				System.out.print('*');
			}
			//1行終わったら改行
			System.out.println();
		}
	}
}