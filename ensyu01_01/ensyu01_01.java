/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習1-1 p13
 * 	プログラム中の文の終端を示すセミコロン;が欠如しているとどうなるか。
 * 	プログラムをコンパイルして検証せよ。
 * 回答:
 *  プロジェクト内にエラーがある旨のポップアップ表示が出て、さらに「実行」ボタンを押さないと実行されない。
 * 理由:
 * 	文は原則セミコロンで終わるにもかかわらず、セミコロンが欠けていた為。
 *
 * パッケージ名:ensyu1_1
 * クラス名:ensyu1_1
 * 作成日:2022/11/01
 * 作成者:HinaSato
 * 修正日:2022/11/01
 * 修正者:HinaSato
 * ver:1.0.0
 */

package ensyu01_01;

public class ensyu01_01 {
//ここからクラスの内容

	public static void main(String[] args) {
	//ここからメインメソッド
		//文末のセミコロンを省略しない命令文
		System.out.println("セミコロンつき");
		//文末のセミコロンを省略した命令文
//		System.out.println("セミコロンなし")
		/* 検証の結果、後者「文末のセミコロンを省略した命令文」では
		   プロジェクト内にエラーがある旨のポップアップ表示が出る
		*/

	//ここまでメインメソッド
	}
//クラスの内容ここまで
}
