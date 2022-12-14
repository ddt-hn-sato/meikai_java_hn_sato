//自動車クラスCar 第2版 (p.324) 

package workspace0.chapter12_archive;

//クラス
class Car{
	//インスタンスを宣言
	public static String name; //名前
	public static int width; //幅
	public static int height; //高さ
	public static int length; //長さ
	public static double x; //現在位置 X座標
	public static double y; //現在位置 Y座標
	public static double fuel; //残り燃料
	public static Day purchaseDay; //購入日
	
	//コンストラクタ
	public Car( String name, int width, int height, int length, double fuel, Day purchaseDay ){
		//インスタンスを初期化
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.fuel = fuel;
		this.x = 0.0;
		this.y = 0.0;
		this.purchaseDay = new Day(purchaseDay);
	}
	// - - - メソッド群 - - -
	//現在地のx座標を返す＊仮引数がないメソッドは、とにかくそのメソッドが呼ばれたらこれをしろというもの
	double getX() {
		return x;
	}
	//現在地のy座標を返す
	double getY() {
		return y;
	}
	
	//現在時点でのfuelを返す
	double getFuel() {
		return fuel;
	}
	
	//購入日を取得
	Day getPurchaseDay() {
		return new Day(purchaseDay);
	}
	
	//スぺック表示メソッド
	void putSpec() {
		//インスタンスに応じてそれぞれのスペックを返す
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("高さ：" + height + "mm");
		System.out.println("長さ：" + length + "mm");
	}
	
	//X方向にdeltaX, Y方向にdeltaY移動するだけの燃料が残っていなかったら、falseを返すメソッド
	boolean move(double deltaX, double deltaY) {
		//移動距離(deltaXとdeltaYの2乗の平方根を取ることで、直線距離に直している)
		double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		
		//↑この距離を移動できるだけの燃料が残っていなかったら
		if (distance > fuel) {
			//移動できないのでfalseを返す
			return false;
		} else {
			//移動距離の分だけ燃料が減る
			fuel -= distance;
			//移動距離の分だけ座標が動く
			x += deltaX;
			y += deltaY;
			//移動できるのでtrueを返す
			return true;
		}
	}
}
	