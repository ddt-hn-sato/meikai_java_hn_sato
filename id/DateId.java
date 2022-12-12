/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習11_01 P.377
 * 	List10-12（p.356）のクラス DatedId をパッケージ id に所属させるよう書き換えよ。
 *  なお、クラス DatedIdTester は無名パッケージに所属させること。
 *  
 * 回答:
 *  下記のプログラムをご参照ください。
 *  なお、eclipseのワークスペースでのフォルダ・ファイル整理の都合上、
 *  「workspace0.chapter11_archive」フォルダ内に「id」パッケージを作成しました。
 *  
 * パッケージ名:ensyu10_05
 * クラス名: Account
 * 作成日:2022/12/12
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */

//パッケージidに所属させる
package workspace0.chapter11_archive.id;

import static java.util.Calendar.*;

//DateIdクラス - - - 内容は教本のList10-12と全く同じものです

//グレゴリオ暦カレンダーのクラスをインポート
import java.util.GregorianCalendar;

public class DateId {

	//何番までの識別番号を与えたか
	private static int counter;
	
	//識別番号
	private static int id;
	
	//静的初期化
	static {
		//グレゴリオ暦表記をしてくれるクラスをインスタンス化する
		GregorianCalendar today = new GregorianCalendar();
		
		int y = today.get(YEAR); //年
		int m = today.get(MONTH) + 1; //月
		int d = today.get(DATE); //日
		
		System.out.printf("今日は%04d年%02d月%02d日です。\n", y, m, d);
		//識別番号として、yyyymmddXXという10ケタ表記にする
		counter = y * 1000000 + m * 10000 + d * 100;
	}
	
	//コンストラクタ
	public DateId() {
		id = ++counter;
	}
	
	//識別番号を取得
	public static int getId() {
		return id;
	}
}