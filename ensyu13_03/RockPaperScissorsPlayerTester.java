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
 * クラス名: RockPaperScissorsPlayerTester //RockPaperScissorsPlayerクラスの動作確認クラス
 * 作成日:2022/12/15
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

//じゃんけんプレイヤー動作確認用クラス

package workspace0.chapter13_archive.ensyu13_03;

//Randomクラスをインポート
import java.util.Random;
//Scannerクラスをインポート
import java.util.Scanner;

//RockPaperScissorsPlayerTesterクラス
public class RockPaperScissorsPlayerTester{
	
	//ここからメインメソッド
	public static void main(String[] args) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		//乱数を生成して値を取得する変数を、標準コンストラクタで作成
		Random randomInput = new Random();

		//じゃんけんで自分が出したい手の入力を促す
		System.out.print("じゃんけんしましょう。あなたの手は？（1 = グー、2 = チョキ、3 = パーのどれかの数字）：");
		//入力値を変数へ代入
		int humanHand = standardInput.nextInt();
		//HumanPlayerクラスでインスタンス化する
		HumanPlayer whichHand = new HumanPlayer(humanHand);
		//手の確認
		whichHand.print();
		
		//見やすさのため改行
		System.out.println();
		
		//コンピュータにも手を考えさせる
		System.out.println("コンピュータも手を考えています・・・");
		//乱数で生成された値を変数へ代入
		int computerHand = randomInput.nextInt(3) + 1;
		//ComputerPlayerクラスでインスタンス化する
		ComputerPlayer handWhich = new ComputerPlayer( computerHand );
		//手の確認
		handWhich.print();
		
		//見やすさのため改行
		System.out.println();
		
		//勝敗の結果を表示_子クラスのインスタンスから親クラスへアクセス
		whichHand.judgeResult( humanHand, computerHand );
		
		//終了
		System.out.print(" - - - じゃんけん終了 - - - ");
	}
}
