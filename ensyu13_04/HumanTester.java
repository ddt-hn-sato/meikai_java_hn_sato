//演習13-4用のテスタクラス

package workspace0.chapter13_archive.ensyu13_04;

//Scannerクラスをインポート
import java.util.Scanner;

/** 
 * クラスHumanTesterは、値を取得してHumanクラスを使用し、
 * スペック、BMI、誕生日（曜日）を返却するクラスです。
 * @author hsato
 * @see Human
 */
public class HumanTester {
	
	public static void main(String args[]) {
		
		//キーボードから値を取得する変数を、標準コンストラクタで作成
		Scanner standardInput = new Scanner(System.in);
		
		//それぞれの情報の入力を促し、入力値を変数へ格納
		System.out.print("お名前は？");
		String name = standardInput.next();
		
		System.out.print("身長(cm)を整数で：");
		int height = standardInput.nextInt();
		
		System.out.print("体重(kg)を整数で：");
		int weight = standardInput.nextInt();
		
		//クラス（の中のコンストラクタ）を用いて、インスタンスを初期化
		//このインスタンスはクラスというたこ焼き型から作られたたこ焼き自体
		Human aPerson = new Human(name, height, weight);
		
		//メソッドを呼び出す
		//スぺ表示
		System.out.println( name + "さんはスぺ " + aPerson.Spec( height, weight ) + " です。" );
		//BMI表示
		System.out.print( name + "さんはBMI ");
		System.out.printf("%4.2f", aPerson.BMI( (double)height, (double)weight ));
		System.out.println(" です。" );
		//適正体重と比較し、重いか軽いか教えてくれるメソッドを呼び出す
		aPerson.Appropriate(name, (double)height, (double)weight);
	}
}
