/*-
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習15_05 P.497
 * 	3人で行うじゃんけんプログラムを作成せよ。プレーヤ3人のうち、コンピュータを2人として
 *  人間を1人とすること。また、演習13-3で作成した、プレーやクラスを利用すること。
 *  
 *  	・人間プレーヤクラス（出す手をキーボードから読み込む）
 *  	・コンピュータプレーヤクラス（出す手を乱数で生成する）
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  
 * パッケージ名:ensyu15_05
 * クラス名: RockPaperScissorsPlayer //じゃんけんクラス
 * 作成日:2022/12/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

// - - - じゃんけんプレイヤークラス（RockPaperScissors = じゃんけん）

package workspace0.chapter15_archive.ensyu15_05;

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
	
	/*
	 * judgeResultメソッドは非抽象メソッドとして作成
	 *
	 * 概要：教本のロジックより
	 * 	・(humanHand - computerHand(1も2も) + 3) % 3 
	 *    = 1なら人間の負け、 = 0 なら引き分け、 = 2 なら人間の勝ち
	 */
	
	//3人でじゃんけん
	void judgeResult(int humanHand, int computerHand1, int computerHand2) {
		
		//computerHand1とhumanHandの勝ち負け
		int resultNumber1 = ( humanHand - computerHand1 + 3 ) % 3;
		
		//computerHand2とhumanHandの勝ち負け
		int resultNumber2 = ( humanHand - computerHand2 + 3 ) % 3;
		
		// 1 + 2 か、2 + 1 か、0 + 0
		if( (resultNumber1 + resultNumber2) % 3 == 0 ) {
			//3人であいこ
			System.out.println("あいこです。");

		//0,2 か 2,2
		} else if ( resultNumber1 == 0 && resultNumber2 == 2 || resultNumber1 == 2 && resultNumber2 == 2 ) {
			//人間の勝ち
			System.out.println("あなたの勝ちです！");

		//1,1 か 1,0 か 0,1 か 2,0
		} else {
			//人間の負け
			System.out.println("あなたの負けです！コンピュータの勝ち。");
		}
	}
}