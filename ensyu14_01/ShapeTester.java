/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13_01 P.443
 * 	図形クラス群をテストするプログラムを作成せよ。
 *  List 13 - 9 と同じく、Shape型の配列を利用して、
 *  インスタンスの生成と表示を行うこと。
 *  
 *  ただし、個々の要素が参照するインスタンスは、
 *  プログラム内で与えるのではなく、キーボードから
 *  読み込むようにすること。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu12_02
 * クラス名: Account
 * 作成日:2022/12/13
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter14_archive.ensyu14_01;

//Scannerクラスをインポート
import java.util.Scanner;

//ShapeTesterクラス
public class ShapeTester{
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//配列の要素数（このコードでは、図形の個数となる）の入力を促す
		System.out.print("図形は何個：");
		//入力値を変数へ代入
		int elementNumber = standardInput.nextInt();
		
		//入力値を配列の要素数として、配列を初期化（問題文より、Shape型の配列を使用する）
		Shape[] shapeArray = new Shape[elementNumber];
		
		//長方形クラス、平行四辺形クラスのインスタンスを代入する変数を、宣言
		Rectangle aRectangle;
		Parallelogram aParallelogram;
		
		//1からelementNumber個まで、入力を促すことを繰り返す
		//その入力値に応じたクラス型のインスタンスを、配列の要素の値として格納していく
		for(int i = 0; i < elementNumber ; i++) {
			
			//図形の種類を選ばせる
			System.out.print( (i + 1) + "番の図形の種類（ 1 = 長方形 / 2 = 平行四辺形  ) ：");
			//入力値を変数へ代入
			int whichShape = standardInput.nextInt();
			
			//入力値で場合分け
			if (whichShape == 1){
				//4が入力された場合、長方形_Rectangleクラスでインスタンスを初期化したいので
				//まず幅を入力させる
				System.out.print("長方形の幅：");
				//入力値を変数に代入
				int width = standardInput.nextInt();
				//つぎに高さを入力させる
				System.out.print("長方形の高さ：");
				//入力値を変数に代入
				int height = standardInput.nextInt();
				//長方形_Rectangleクラスでインスタンスを初期化
				aRectangle = new Rectangle(width, height);
				//説明と、描画
				aRectangle.print();
				
				//面積を求める
				System.out.println((i + 1) + "番目の長方形の面積→" + aRectangle.getArea());
				
			} else {
				//5が入力された場合、平行四辺形_Parallelogramクラスでインスタンスを初期化したいので
				//まず幅を入力させる
				System.out.print("平行四辺形の幅：");
				//入力値を変数に代入
				int width = standardInput.nextInt();
				//つぎに高さを入力させる
				System.out.print("平行四辺形の高さ：");
				//入力値を変数に代入
				int height = standardInput.nextInt();
				//平行四辺形_Parallelogramクラスでインスタンスを初期化
				aParallelogram = new Parallelogram(width, height);
				//説明と、描画
				aParallelogram.print();
				
				//面積を求める
				System.out.println((i + 1) + "番目の平行四辺形の面積→" + aParallelogram.getArea());
			}
		}
		
		//終了表示
		System.out.println("- - - 以上 - - -");
	}
}
	
