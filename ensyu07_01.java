/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習07_01 p229
 * 	受け取ったint型引数の値 n が負であれば、-1を返却し、0であれば0を返却し、
 *  正であれば1を返却するメソッド signOf を作成せよ。
 *  
 *  ※指定のメソッドだけを作成する問題ではあるが、厳密には、そのメソッドが正しく動作することを
 *  　検証できるようなメインメソッドも併せて作ることが必要。以降の問題でも同様とのこと。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *  
 * パッケージ名:ensyu07_01
 * クラス名:ensyu07_01
 * 作成日:2022/11/30
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package workspace0;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu07_01 {
	
	//入力された値が代入された変数whichSignが、正か負か、評価するメソッドを作成
	static int signOf(int whichSign) {
		
		//返却する値を変数evaluatedSignとおき、入力値で初期化
		int evaluatedSign = whichSign;
		
		//whichSignが0より大きければ
		if ( whichSign > 0 )
			//返却値を1で返す
			evaluatedSign = 1;
		
		//whichSignが0であれば
		if (whichSign == 0)
			//返却値を0で返す
			evaluatedSign = 0;
		
		//whichSignが0より小さければ
		if ( whichSign < 0)
			//返却値を-1で返す
			evaluatedSign = -1;
		
		return evaluatedSign;
	}
	
	public static void main(String args[]) {
		
		//キーボード入力から値を取得するインスタンスを作成
		Scanner scannerInstance = new Scanner(System.in);
		
		//整数値を入力させる
		System.out.print("正・負・0を評価したい整数値を入力：");
		
		//入力値を変数へ代入
		int whichSign = scannerInstance.nextInt();

		//結果を表示
		System.out.println("\n↓正 = 1・負 = -1 ・0 = 0 を返します。\n" + signOf(whichSign) + "です。");
	}
}

