/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習10_01 p351
 *  List 10-3 に示した連番クラスIdに、最後に与えた識別番号を返す
 *  クラスメソッドgetMaxIdを追加せよ。
 *  
 *  	static int getMaxId()
 *  
 *  なお、このメソッドは、インスタンスを n こ生成した時点で呼び出すと n を返すことになる
 *  
 * 回答:
 *  下記★コメントアウト部分をご参照ください。
 *  
 * パッケージ名:ensyu10_01
 * クラス名: Id
 * 作成日:2022/12/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

package workspace0.chapter10_archive.ensyu10_01;

//Idクラス
public class Id{
	
	//何番までの識別番号を与えたか
	static int counter = 0;
	
	//識別番号
	private int id;
	
	// - - - コンストラクタ
	public Id() {
		//識別番号
		id = ++counter;
	}
	
	// - - - 識別番号を取得するメソッド
	public int getId() {
		//識別番号を取得
		return id;
	}
	
	//★ - - - 最後に与えた識別番号を返すクラスメソッドgetMaxIdを追加
	static int getMaxId() {
		//非staticであるgetId()を呼び出す
		int maxId = counter;
		
		return maxId;
	}
	
	public static void main(String args[]) {
	//ここからメインメソッド
		
		//識別番号1番
		Id a = new Id();
		//識別番号2番
		Id b = new Id();
		
		//識別番号の表示
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		
		System.out.println("Id.counter = " + Id.counter);
		System.out.println(" a.counter = " +  a.counter);
		System.out.println(" b.counter = " +  b.counter);
		
		//★最後に与えた識別番号を返す
		System.out.println("最後のID → "+ getMaxId());
	}
}