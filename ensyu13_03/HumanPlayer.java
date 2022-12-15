/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13_03 P.443
 * 	じゃんけんの《プレーヤ》を表す抽象クラスを定義せよ。
 *  そのクラスから、以下のクラスを派生すること。
 *  
 *  	★人間プレーヤクラス（出す手をキーボードから読み込む）
 *  	・コンピュータプレーヤクラス（出す手を乱数で生成する）
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu13_03
 * クラス名: HumanPlayer //★人間プレーヤクラス
 * 作成日:2022/12/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

//人間プレイヤクラス_出す手をキーボードから読み込む

package workspace0.chapter13_archive.ensyu13_03;

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