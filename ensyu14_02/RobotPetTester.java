/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14_02 P.463
 * 	ロボット型ペットクラスRobotPet(P.407)を拡張した、着せ替え可能なロボット型ペットクラスを作成せよ。
 *  インターフェースSkinnableを実装すること。
 *  ※次ページの解説も参考にすること。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu14_02
 * クラス名: RobotPetTester
 * 作成日:2022/12/13
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter14_archive.ensyu14_02;

//Scannerクラスをインポート
import java.util.Scanner;

//RobotPetTesterクラス
public class RobotPetTester{
	
	//ここからメインメソッド
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		// - - - Pet2クラスのテスト
		//Pet2クラス型のインスタンスを生成
		Pet2 aPet = new Pet2("マイル", "ともか");
		
		//ペットに自己紹介させる
		aPet.introduce();
		
		//ペットに季節の挨拶をさせるため入力を促す
		System.out.print("次のうち、いちばん近いのは何月ですか？"
				+ "[ 1, 3, 6, 8, 10, 12 ]：");
		//ペットに季節の挨拶をさせる
		aPet.greetAppropriately(standardInput.nextInt());
		
		// - - - RobotPet2クラスのテスト
		//RobotPet2クラス型のインスタンスを生成
		RobotPet2 aRobotPet = new RobotPet2("ロボマイル", "ロボともか");
		
		//ロボットペットに自己紹介させる
		aRobotPet.introduce();
		
		//ペットに季節の挨拶をさせるため入力を促す
		System.out.print("次のうち、いちばん近いのは何月ですか？"
				+ "[ 1, 3, 6, 8, 10, 12 ]：");
		//ロボットペットに季節の挨拶をさせる
		aPet.greetAppropriately(standardInput.nextInt());
		
		//ロボットペットのスキンの変更のため入力を促す
		System.out.print("スキンを変更します。何色がいいですか？"
				+ "[ 黒 = 0, 赤 = 1, 緑 = 2, 青 = 3, ヒョウ柄 = 4 ]：");
		//入力値でスキン変更
		aRobotPet.changeSkin(standardInput.nextInt());
		
	}
}