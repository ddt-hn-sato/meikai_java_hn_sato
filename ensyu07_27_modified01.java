/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_27 p257
 *  List 7-20のプログラムは、３つの配列 x. y, z の行数及び
 *  列数が同一であることを前提としている。
 *  ３つの配列の要素数が等しければ加算を行って true を返し、
 *  等しくなければ加算を行わずに false を返すメソッドに書き換えよ。
 *  
 *  	boolean addMatrix(int[][] x, int[][] y, int[][] z)
 *  
 * 回答:
 *  下記プログラムをご参照ください。
 *  なお、問題に指定がなかったため、穴ぼこのある配列
 *  （「多次元配列の構成要素の、配列」ごとの要素数が一律でない多次元配列）ではないと仮定しました。
 *  
 * パッケージ名:ensyu07_27
 * クラス名:ensyu07_27
 * 作成日:2022/12/5
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter07_archive_21to33;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_27_modified01 {
	
	//キーボードから値を取得するインスタンスを作成
	static Scanner scannerInstance = new Scanner(System.in);
	
	//３つの配列の要素数が等しければ加算を行って true を返し、
	//等しくなければ加算を行わずに false を返す。
	static boolean addMatrix(int[][] x, int[][] y, int[][] z) {
		
		if (x.length == y.length && x[0].length == y[0].length && y.length == z.length && y[0].length == z[0].length){
			for(int i = 0; i < x.length; i++) {
				for(int j = 0; j < x[i].length; j++) {
					z[i][j] = x[i][j] + y[i][j];
				}
			}
			return true;
		}
		
		//
		return false;
	}
	
	//配列を生成するメソッド
	static int[][] makeArray(String arrayName){
		
		// - - - 配列の作成と表示 - - -
		//入力を促す
		System.out.print("配列" + arrayName + "の要素数（ヨコ）：");
		//入力値で変数を初期化する
		int columnNumber = scannerInstance.nextInt();
		//入力を促す
		System.out.print("配列" + arrayName + "の要素数（タテ）：");
		//入力値で変数を初期化する
		int lineNumber = scannerInstance.nextInt();

		//返却する2次元配列を初期化
		int[][] anyArray = new int[lineNumber][columnNumber];
		
		//入力値を値として、要素に格納していく
		for(int lineIndex = 0; lineIndex < lineNumber; lineIndex++) {
			for(int columnIndex = 0; columnIndex < columnNumber; columnIndex++) {
				//配列の要素の値の入力を促す
				System.out.print(arrayName +" [ " + (lineIndex) + " ][ " + columnIndex + " ] = ");
				//入力値を要素に格納する
				anyArray[lineIndex][columnIndex] = scannerInstance.nextInt();
			}
		}
		
		//返却する
		return anyArray;
	}

	public static void main(String args[]) {
		
		//配列の名前を決める
		String nameX, nameY;
		nameX = "x";
		nameY = "y";
		
		//配列xArray, yArrayを生成し、行数と列数を変数に初期化する
		int[][] xArray = makeArray(nameX);
		int xLength = xArray.length;
		//配列は穴ぼこのない配列を仮定しているため、どの行の長さをとっても同じ
		int xLines = xArray[0].length;
		
		int[][] yArray = makeArray(nameY);
		int yLength = yArray.length;
		//配列は穴ぼこのない配列を仮定しているため、どの行の長さをとっても同じ
		int yLines = yArray[0].length;
		
		//配列xArray, yArrayを生成し、「行数と列数が同一」であれば、カラの配列zを作る
		if (xLength == yLength && xLines == yLines) {
			//配列zArrayを作る
			//行数、列数は、配列x, yと同じのため変数を使いまわす
			int[][] zArray = new int[xLines][xLength];
			
			//trueであれば"true"と表示
			if(addMatrix(xArray, yArray, zArray))
				//（コンソールでの分かりやすさのため）"true"を表示
				System.out.println("true");
		} else {
			//（コンソールでの分かりやすさのため）"false"を表示
			System.out.println("false");
		}
	}
}