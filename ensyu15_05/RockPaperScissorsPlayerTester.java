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
 * クラス名: RockPaperScissorsPlayerTester //じゃんけんクラスの動作確認クラス
 * 作成日:2022/12/18
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

//じゃんけんプレイヤー動作確認用クラス

package workspace0.chapter15_archive.ensyu15_05;

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
		
		//コンピュータ1に手を考えさせる
		System.out.println("コンピュータ1も手を考えています・・・");
		//乱数で生成された値を変数へ代入
		int computerHand1 = randomInput.nextInt(3) + 1;
		//ComputerPlayerクラスでインスタンス化する
		ComputerPlayer handWhich1 = new ComputerPlayer( computerHand1 );
		//手の確認
		handWhich1.print();
		
		//コンピュータ2に手を考えさせる
		System.out.println("コンピュータ2も手を考えています・・・");
		//乱数で生成された値を変数へ代入
		int computerHand2 = randomInput.nextInt(3) + 1;
		//ComputerPlayerクラスでインスタンス化する
		ComputerPlayer handWhich2 = new ComputerPlayer( computerHand2 );
		//手の確認
		handWhich2.print();
		
		//見やすさのため改行
		System.out.println();
		
		//勝敗の結果を表示_子クラスのインスタンスから親クラスのメソッドへアクセス
		whichHand.judgeResult( humanHand, computerHand1, computerHand2 );
		
		//終了
		System.out.print(" - - - じゃんけん終了 - - - ");
	}
}
