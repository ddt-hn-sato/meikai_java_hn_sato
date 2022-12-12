/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習12_01 P.404
 * 	総走行距離を表すフィールドと、その値を調べるメソッドを追加した
 *  自動車クラスを作成せよ。自動車クラスCar 第2版 (p.324) から派生すること。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu12_01
 * クラス名: TotalDistance
 * 作成日:2022/12/12
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter12_archive;

//Scannerクラスをインポート
import java.util.Scanner;

//Carクラスから派生させる
public class TotalDistance extends Car {

	//総走行距離を表すフィールドを宣言
	private double totalDistance;
	
	//コンストラクタ（一部は、Carから継承）
	TotalDistance(double x, double y, double fuel, double totalDistance){
		
		super(name, width, height, length, fuel, purchaseDay); //クラスCarのコンストラクタの呼び出し
		this.totalDistance = totalDistance;
	}
	
	//総走行距離の値を調べるメソッド
	public static void distanceToString() {
		
		//総走行距離を変数でおく
		double totalDistance = Math.sqrt(x * x + y * y);
		//表示
		System.out.println("総走行距離は" + totalDistance + "です。");
	}
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//それぞれの情報の入力を促し、入力値を変数へ格納
		System.out.print("車の名前は？：");
		String name = standardInput.next();
	
		System.out.print("車幅：");
		int width = standardInput.nextInt();
		
		System.out.print("車高：");
		int height = standardInput.nextInt();
		
		System.out.print("長さ：");
		int length = standardInput.nextInt();
		
		System.out.print("残りの燃料：");
		int fuel = standardInput.nextInt();
		
		//購入日を入力させる
		System.out.print("購入年：");
		int year = standardInput.nextInt();
		System.out.print("購入月：");
		int month = standardInput.nextInt();
		System.out.print("購入年：");
		int date = standardInput.nextInt();
		
		//クラスを用いて、インスタンスを初期化
		Day purchaceDay = new Day( year, month, date );
		
		//クラスを用いて、インスタンスを初期化
		Car Mercedez = new Car(name, width, height, length, fuel, purchaceDay);
		
		//メソッドを呼び出す
		//スぺックを表示
		System.out.println( "★" + name + "のスペック一覧★");
		Mercedez.putSpec();
		
		//現在地と残り燃料
		System.out.println("現在地(" + Mercedez.getX() + ", " + Mercedez.getY() + ")・残り燃料 " + Mercedez.getFuel());
		//移動する表示
		System.out.println("移動します。");
		
		//移動距離の入力を促す
		System.out.print("X方向の移動距離：");
		double deltaX = standardInput.nextDouble();
		System.out.print("Y方向の移動距離：");
		double deltaY = standardInput.nextDouble();
		
		//動かす
		Mercedez.move(deltaX, deltaY);
		
		//総走行距離
		distanceToString();
	}
}