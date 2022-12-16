/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14_03 P.467
 *  クラスDVDPlayerを利用するプログラム例を作成せよ。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu14_03
 * クラス名: DVDPlayerTester
 * 作成日:2022/12/16
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter14_archive.ensyu14_03;

//Scannerクラスをインポート
import java.util.Scanner;

//DVDPlayerTesterクラス - - - DVDPlayerクラスの動作確認クラス
class DVDPlayerTester{
	
	//ここからメインメソッド
	public static void main(String[] args) {

		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//再生、停止、スロー再生時に用いる変数playOrをDVDPlayerクラスでnewする。
		//今回は製造番号1の機器しか扱わないコードとする。1をあらかじめ製造番号として代入する。
		DVDPlayer serialNumber = new DVDPlayer(1);
		
		//再生させるかどうか入力させる
		System.out.print("再生させますか？ [ YES = 1 ]：");
		
		//入力値が1であれば再生させる
		if (standardInput.nextInt() == 1) {
			//再生させる
			serialNumber.play();
		}
		
		//停止させるかどうか入力させる
		System.out.print("停止させますか？ [ YES = 1 ]：");
		
		//入力値が1であれば停止させる
		if (standardInput.nextInt() == 1) {
			//停止させる
			serialNumber.stop();
		}
		
		//スロー再生させるかどうか入力させる
		System.out.print("スロー再生させますか？ [ YES = 1 ]：");
		
		//入力値が1であればスロー再生させる
		if (standardInput.nextInt() == 1) {
			//スロー再生させる
			serialNumber.slow();
		}
	}
}
