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

//無名パッケージに所属させるため、パッケージ宣言をしない。
//なお、eclipseのワークスペースでのフォルダ・ファイル整理の都合上、
//ワークスペース（疑似的なルートディレクトリ）直下に配置したいため以下の宣言をする。
package workspace0;

//パッケージidからDateIdクラスをインポートしてくる
import workspace0.chapter11_archive.id.DateId;

//DateIdTesterクラス
public class DateIdTester {

	public static void main(String[] args) {
		
		//識別番号を表示するインスタンスを変数で宣言
		DateId a = new DateId();
		DateId b = new DateId();
		DateId c = new DateId();
		
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		System.out.println("cの識別番号：" + c.getId());
	}
}