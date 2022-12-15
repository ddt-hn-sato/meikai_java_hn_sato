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
 * クラス名: IsocelesTriangleTester //IsocelesTriangleクラスの動作確認クラス
 * 作成日:2022/12/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter13_archive.ensyu13_02;

//Scannerクラスをインポート
import java.util.Scanner;

//右上が直角
public class IsoscelesTriangleTester {
	
	//ここからメインメソッド
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//配列の要素数（このコードでは、図形の個数となる）の入力を促す
		System.out.print("図形は何個：");
		//入力値を変数へ代入
		int elementNumber = standardInput.nextInt();
		
		//入力値を配列の要素数として、配列を初期化（問題文より、IsocelesTriangle型の配列を使用する）
		IsoscelesTriangle[] triangleArray = new IsoscelesTriangle[elementNumber];
		
		//1からelementNumber個まで、入力を促すことを繰り返す
		//その入力値に応じたクラス型のインスタンスを、配列の要素の値として格納していく
		for(int i = 0; i < elementNumber ; i++) {
			
			//図形の種類を選ばせる
			System.out.print( (i + 1) + "番目の直角二等辺三角形は、どこを直角にしたいですか？（ 1 = 左下 / 2 = 左上 / 3 = 右下 / 4 = 右上 ) ：");
			//入力値を変数へ代入
			int whichCorner = standardInput.nextInt();
			
			//入力値で場合分け
			if (whichCorner == 1) {

				//1が入力された場合、LeftBottomCornerクラスでインスタンスを初期化したいので
				//初期化に用いる段数の入力を促す
				System.out.print("段数は：");
			
				//入力値を変数bottomLeftへ代入
				int bottomLeft = standardInput.nextInt();
				//初期化
				triangleArray[i] = new LeftBottomCorner(bottomLeft);
				
			} else if (whichCorner == 2) {

				//2が入力された場合、LeftUpperCornerクラスでインスタンスを初期化したいので
				//初期化に用いる段数の入力を促す
				System.out.print("段数は：");
				//入力値を変数に代入
				int upperLeft = standardInput.nextInt();
				//初期化
				triangleArray[i] = new LeftUpperCorner(upperLeft);
				
			} else if (whichCorner == 3) {
				
				//3が入力された場合、RightBottomCornerクラスでインスタンスを初期化したいので
				//初期化に用いる段数の入力を促す
				System.out.print("段数は：");
				//入力値を変数に代入
				int bottomRight = standardInput.nextInt();
				//初期化
				triangleArray[i] = new RightBottomCorner(bottomRight);
				
			} else {
				//4が入力された場合、RightUpperCornerクラスでインスタンスを初期化したいので
				//初期化に用いる段数の入力を促す
				System.out.print("段数は：");
				//入力値を変数に代入
				int upperRight = standardInput.nextInt();
				//初期化
				triangleArray[i] = new RightUpperCorner(upperRight);
			}
		}
		
		//見やすさのため、入力させるパートが終わったら改行
		System.out.println();
		
		//拡張for文( 書き方→for (要素の型 要素そのものを表す任意の変数 : 配列名 ){ … )
		for (IsoscelesTriangle elementItself : triangleArray) {
			//要素の表示
			elementItself.print();
			//見やすさのため、要素の表示が終わったらいちいち改行
			System.out.println();
		}
	}
}
	
	