/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習08_02 p293
 *  自動車クラスCarに対して、フィールドやメソッドを自由に追加せよ。
 *  
 * 回答:
 *  同フォルダ「ensyu08_02_classCar」に、Carファイルがあります。
 *  そちらのプログラムも併せてご参照ください。
 *  
 * パッケージ名:ensyu08_02_classCar
 * クラス名:CarTester
 * 作成日:2022/12/7
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter08_archive.ensyu08_02_classCar;

import java.util.Scanner;

//クラス
class CarTester{
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//★車を乗り換えるかどうかの変数を宣言する
		int carChange = 0;
		//★２回目以降の移動で、移動するかしないかの1か0を格納する変数を初期化
		int moveOr = 0;
		
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
		
		//クラス（の中のコンストラクタ）を用いて、インスタンスを初期化
		//このインスタンスはクラスというたこ焼き型から作られたたこ焼き自体
		Car Mercedez = new Car(name, width, height, length, fuel);
		
		//メソッドを呼び出す
		//スぺックを表示
		System.out.println( "★" + name + "のスペック一覧★");
		Mercedez.putSpec();
		
		//現在地と残り燃料
		System.out.println("現在地(" + Mercedez.getX() + ", " + Mercedez.getY() + ")・残り燃料 " + Mercedez.getFuel());
		//移動する表示
		System.out.println("移動します。");
		
		//車の移動と、移動ができるかどうか
		do {
			
			//移動距離の入力を促す
			System.out.print("X方向の移動距離：");
			double deltaX = standardInput.nextDouble();
			System.out.print("Y方向の移動距離：");
			double deltaY = standardInput.nextDouble();
			
			if(carChange == 0) {
			
				//古い車で移動できるのかどうか判定
				if(!Mercedez.move(deltaX, deltaY)) {
					System.out.println("この車では燃料が足りません！");
					
					//乗り換えていれば燃料は足りていたのか？
					if (Mercedez.moveNew(deltaX, deltaY)) {
						System.out.println("新しい車に乗り換えれば燃料は足りていました。");
					}
					
					//燃料が足りないので強制終了
					break;
				}
				//現在地と残り燃料
				System.out.println("現在地(" + Mercedez.getX() + ", " + Mercedez.getY() + ")・残り燃料 " + Mercedez.getFuel());
				
			//新しい車で移動できるのかどうかの判定
			} else if(carChange == 1) {
				
				if(!Mercedez.moveNew(deltaX, deltaY)) {
				System.out.println("新しいこの車でも、燃料が足りません。");
				//燃料が足りないので強制終了
				break;
				}
				//現在地と残り燃料
				System.out.println("現在地(" + Mercedez.getX() + ", " + Mercedez.getY() + ")・残り燃料 " + Mercedez.getFuel());
			}
			
			//★まだ乗り換えていない場合は
			if(carChange == 0) {
				
				//★移動する前に、燃費が3倍良い車（燃料の減りが3分の1になる）に乗り換えるかどうか聞く
				System.out.print("燃費が3倍良い車に乗り換えてみませんか？[ 0…No / 1…Yes ]：");
				//★乗り換えるかどうかの変数
				carChange = standardInput.nextInt();
				
			}
			//★乗り換えないの「0」の入力があった場合、
			if(carChange == 0) {
				System.out.println("それでは、今の車のまま進みます。");
			} else
				System.out.println("新しい車で進みます。");
			
			//移動するかどうか
			System.out.print("移動しますか？[ 0…No / 1…Yes ]：");
			moveOr = standardInput.nextInt();
			
		} while (moveOr == 1);
		//終了の旨
		System.out.println("終了します。");
	}
}