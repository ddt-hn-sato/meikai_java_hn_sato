//平行四辺形 //インターフェースを実装

package workspace0.chapter14_archive.ensyu14_01;

public class Parallelogram extends Shape implements Plane2D{
	
	private int width; //底辺の幅
	private int height; //高さ
	
	// - - - コンストラクタ
	public Parallelogram(int width, int height) {
		//初期化
		this.width = width;
		this.height = height;
	}
	
	// - - - メソッド
	//文字列表現を返却するメソッド
	public String toString() {
		
		return "Parallelogram(width: " + width + ", height: " + height + ")";
	}
	
	//実際に描画するメソッド
	//見かけは1行に1マスずつ右に傾いたような平行四辺形となる
	public void draw() {
		
		//height回ぶんループし、height行分表示
		for (int i = 1; i <= height; i++) {
			//スペースを（height - 今の行目）個入力
			for(int k = 1; k <= height - i; k++) {
				
				System.out.print(' ');
			}
			
			for(int k = 1; k <= width; k++) {
				
				System.out.print('#');
			}

			//1行の表示が終わったら改行
			System.out.println();
		}
	}
	
	//インターフェースにあるgetAreaメソッドを実装
	public int getArea() {
		//面積を求める
		return width * height;
	}
}