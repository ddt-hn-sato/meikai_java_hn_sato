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
 * クラス名: LeftBottomCorner //左下が直角
 * 作成日:2022/12/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter13_archive.ensyu13_02;

//左下が直角
public class LeftBottomCorner extends IsoscelesTriangle {

	//何段にしたいかという変数（フィールド）を宣言
	private int bottomLeft;
	
	// - - - コンストラクタ
	public LeftBottomCorner(int bottomLeft) {
		//仮引数で初期化
		this.bottomLeft = bottomLeft;
	}

	// - - - メソッド
	//非抽象メソッド。図形の説明を書く
	public String toString() {
		//左下直角の三角形を表示する旨
		return "左下直角の三角形を表示します。";
	};	
	
	//左下直角の三角形を表示するメソッド_同パッケージからアクセスできれば良いためデフォルトアクセスでよい
	//親のdrawメソッドを継承し、非抽象にオーバーライド
	@Override void draw() {
		
		//段数と同じ個数の * を1行に表示し、1行ごとに改行し、最後の段の出力が終わったら終了するループ
		for (int i = 1; i <= bottomLeft; i++) {
			//段数と同じ個数の * を1行に表示
			for(int k = 1; k <= i; k++) {
				System.out.print('*');
			}
			//表示が1行終わったら改行
			System.out.println();
		}
	}
}