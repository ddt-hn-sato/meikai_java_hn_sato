/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_05 P.497
 * 	3人で行うじゃんけんプログラムを作成せよ。プレーヤ3人のうち、コンピュータを2人として
 *  人間を1人とすること。また、演習13-3で作成した、プレーやクラスを利用すること。
 *  
 *  	●人間プレーヤクラス（出す手をキーボードから読み込む）
 *  	・コンピュータプレーヤクラス（出す手を乱数で生成する）
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu15_05
 * クラス名: HumanPlayer //●人間プレーヤクラス
 * 作成日:2022/12/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

// - - - 人間プレイヤクラス_出す手をキーボードから読み込む

package workspace0.chapter15_archive.ensyu15_05;

//HumanPlayerクラスはRockPaperScissorsPlayerから派生
class HumanPlayer extends RockPaperScissorsPlayer {

	//変数を生成
	private int humanHand;
	
	// - - - コンストラクタで初期化
	HumanPlayer(int humanHand){
		
		this.humanHand = humanHand;
	}
	
	// - - - 非抽象メソッド。中身を書く
	public String toString() {
		
		//返却する変数を宣言
		String inJapanese;
		
		if(humanHand == 1) {
			//日本語表記で返すため代入
			inJapanese = "グー";
		} else if (humanHand == 2) {
			//日本語表記で返すため代入
			inJapanese = "チョキ";
		} else{
			//ここでは、「if (humanHand == 3)」と同義
			//日本語表記で返すため代入
			inJapanese = "パー";
		}

		//以下表示
		return "あなたの手は" + inJapanese + "でしたね。";
	}
}