/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13_02 P.443
 * 	図形クラス群に対して、直角三角形を表すクラス群を追加せよ。
 *  左下が直角、左上が直角、右下が直角、右上が直角のものを追加すること。
 *  直角二等辺三角形を表す抽象クラスを作り、そこから個々のクラスを派生して作ること。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu13_02
 * クラス名: LeftUpperCorner //左上が直角
 * 作成日:2022/12/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter13_archive.ensyu13_02;

//左上が直角
public class LeftUpperCorner extends IsoscelesTriangle {
	
	//何段にしたいかという変数（フィールド）を宣言
	private int upperLeft;
	
	// - - - コンストラクタ
	public LeftUpperCorner(int upperLeft) {
		//仮引数で初期化
		this.upperLeft = upperLeft;
	}

	// - - - メソッド
	//非抽象メソッド。図形の説明を書く
	public String toString() {
		//左上直角の三角形を表示する旨
		return "左上直角の三角形を表示します。";
	};	

	//左上直角の三角形を表示するメソッド_同パッケージからアクセスできれば良いためデフォルトアクセスでよい
	//親のdrawメソッドを継承し、非抽象にオーバーライド
	@Override void draw() {

		//外側for文：内側for文がupperLeft回ループするごとに、改行するループ
		for (int a = upperLeft; a > 0; a--) {
	
			//内側for文：bはaから1まで、ループごとに1ずつデクリメントされる
			//1行にb個の * が表示され、bの中身が0以下になった時点で、
			//内側for文の処理が終了する。
			for (int b = a; b > 0 ; b--) {
				System.out.print('*');
			}
			//b !> 0すなわち、この場合はbが0、になった時点で
			//内側for文を抜けこの改行処理が入る。
			System.out.println();
		}
	}
}