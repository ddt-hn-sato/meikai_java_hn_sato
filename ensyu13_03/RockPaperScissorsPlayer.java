/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習13_03 P.443
 * 	じゃんけんの《プレーヤ》を表す抽象クラスを定義せよ。
 *  そのクラスから、以下のクラスを派生すること。
 *  
 *  	・人間プレーヤクラス（出す手をキーボードから読み込む）
 *  	・コンピュータプレーヤクラス（出す手を乱数で生成する）
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu13_03
 * クラス名: RockPaperScissorsPlayer //じゃんけんのプレーヤクラス
 * 作成日:2022/12/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

//じゃんけんプレイヤークラス（RockPaperScissors = じゃんけん）

package workspace0.chapter13_archive.ensyu13_03;

//抽象クラスを作る
abstract class RockPaperScissorsPlayer{
	
	//toStringメソッドを、子クラスでオーバーライド(実装)することを強制するため
	//ここでは抽象メソッドとして宣言
	//ObjectクラスのtoStringメソッドを継承しているため、
	//[public]は、toStringメソッドにかかっている
	public abstract String toString();
	
	//printメソッド（ここに中身を書きたいので、非抽象）
	//動的結合する（現在実行しているクラスの型のメソッドが呼び出される）
	void print() {	//←これがどのクラスで呼び出されるかに応じて抽象メソッドの中身が変わってくる
		
		//本クラスの抽象メソッドを呼び出している
		System.out.println(this.toString());
	}
	
	//judgeResultメソッドは非抽象メソッドとして作成
	//概要：1 = グー、2 = チョキ、3 = パー なので、
	//・1は2に勝ち、2は3に勝ち、3は1に勝つ。
	//・同じ数であれば"あいこ"となる。
	void judgeResult(int humanHand, int computerHand) {
		
		//humanHandが1 かつ computerHandが2 、または
		//humanHandが2 かつ computerHandが3 、または
		//humanHandが3 かつ computerHandが1 であれば勝ち
		if( humanHand == 1 && computerHand == 2 || humanHand == 2 && computerHand == 3 || humanHand == 3 && computerHand == 1 ) {
			//humanHandの勝ち
			System.out.println("あなたの勝ちです！");

		} else if ( humanHand == computerHand ) {
			//あいこ
			System.out.println("あいこです！");

		} else {
			//humanHandの負けのパターン
			System.out.println("あなたの負けです！コンピュータの勝ち。");
		}
	}
}