/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習08_02 p293
 *  自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ。
 *  
 * 回答:
 *  同フォルダ「ensyu08_02_classCar」に、carTesterファイルがあります。
 *  そちらのプログラムも併せてご参照ください。
 *  
 * パッケージ名:ensyu08_02_classCar
 * クラス名:Car
 * 作成日:2022/12/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter08_archive.ensyu08_02_classCar;

//クラス
class Car{
	//インスタンスを宣言
	private String name;
	private int width;
	private int height;
	private int length;
	private double x;
	private int y;
	private double fuel;
	
	//コンストラクタ
	Car( String name, int width, int height, int length, double fuel ){
		//インスタンスを初期化
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = x;
		this.y = y;
		this.fuel = fuel;
		
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
	
	//「燃費が3倍良い車で」X方向にdeltaX, Y方向にdeltaY移動するだけの燃料が残っていなかったら、falseを返すメソッド
	boolean moveNew(double deltaX, double deltaY) {
		//移動距離(deltaXとdeltaYの2乗の平方根を取ることで、直線距離に直している)
		double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
		
		//↑この距離を移動できるだけの燃料が残っていなかったら
		if (distance > fuel*3) {
			//移動できないのでfalseを返す
			return false;
		} else {
			//移動距離の分だけ燃料が減る
			fuel -= distance/3;
			//移動距離の分だけ座標が動く
			x += deltaX;
			y += deltaY;
			//移動できるのでtrueを返す
			return true;
		}
	}
}