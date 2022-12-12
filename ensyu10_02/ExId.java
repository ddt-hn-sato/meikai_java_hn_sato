/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10_02 p351
 *  前問で作成したクラスIdを、以下のように変更したクラスExIdを作成せよ。
 *  
 *  インスタンスを生成するたびに識別番号をnずつ増やして与える（nは正の数）。
 *  nの値は、指定されない限り1とするが、メソッドを通じて取得・変更できるようにする。
 *  
 *  たとえばインスタンスを3個生成した後にnを4に変更した場合、
 *  インスタンスに与える識別番号は生成順に 1, 2, 3, 7, 11, 15 ...となる。
 *  
 * 回答:
 *  下記をご参照ください。
 *  
 * パッケージ名:ensyu10_02
 * クラス名: ExId
 * 作成日:2022/12/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter10_archive.ensyu10_02;

//Scannerクラスをインポート
import java.util.Scanner;

//ExIdクラス
public class ExId{

	//スキャナクラスの変数を作成
	static Scanner standardInput = new Scanner(System.in);
	
	//何番までの識別番号を与えたか
	static int counter = 0;
	
	//識別番号
	private int id;
	
	//nを宣言, 1で初期化
	private int n = 1;
	
	// - - - コンストラクタ
	public ExId() {

		//識別番号にnを加える
		counter += changeN(n);
		//識別番号
		id = counter;
	}
	
	// - - - 識別番号を取得するメソッド
	public int getId() {
		//識別番号を取得
		return id;
	}
	
	// - - - 入力値をchangedNに代入するメソッド
	public static int changeN(int n) {
		
		//返却値を定義
		int changedN = 1;
		
		if(counter != 0) {
		
			System.out.print("nを変更できます：");
			//入力値
			changedN = standardInput.nextInt();
		}
		//識別番号を取得
		return changedN;
	}
	
	//★ - - - 最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加
	static int getMaxId() {
		//非staticであるgetId()を呼び出す
		int maxId = counter;
		
		return maxId;
	}
	
	public static void main(String args[]) {
	//ここからメインメソッド
		
		//nを宣言し、初期化
		int n = 1;
		
		
		// - - - - - aについて
		//識別番号1番
		ExId a = new ExId();
		
		//識別番号の表示
		System.out.println("aの識別番号：" + a.getId());
		
	
		// - - - - - bについて
		//識別番号1+その時のn番
		ExId b = new ExId();
	
		//識別番号の表示
		System.out.println("bの識別番号：" + b.getId());
		
		
		// - - - cについて
		//識別番号1+その時のn番+その時のn番
		ExId c = new ExId();
	
		//識別番号の表示
		System.out.println("cの識別番号：" + c.getId());
		
		System.out.println("Id.counter = " + ExId.counter);
		System.out.println(" a.counter = " +    a.counter);
		System.out.println(" b.counter = " +    b.counter);
		System.out.println(" c.counter = " +    c.counter);
		
		//★最後に与えた識別番号を返す
		System.out.println("最後のID → "+ getMaxId());
	}
}