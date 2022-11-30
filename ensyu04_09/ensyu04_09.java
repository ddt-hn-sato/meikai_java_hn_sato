/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習04-09 p113
 * 	右に示すように、正の整数値nを読み込んで、1からnまでの積をもとめる
 *  プログラムを出力せよ。
 *
 * 回答:
 *  下記プログラムをご参照ください。
 *
 * パッケージ名:ensyu04_09
 * クラス名:ensyu04_09
 * 作成日:2022/11/9
 * 作成者:HinaSato
 * 修正日:
 * 修正者:
 * ver:1.0.0
 */


package ensyu04_09;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_09 {
	public static void main(String[] args) {

		//インスタンスを作成
		Scanner ins = new Scanner(System.in);
		//入力を促す
		System.out.println("1からnまでの積を求めます。");
		System.out.println("正の整数値 n を入力：");
		//入力値を変数nとして宣言
		int n = ins.nextInt();

		//変数countを初期化
		int count = 1;

		//nが0以下の場合、以下のプログラムを正しく実行できないため
		//nが0より大きく（正の整数値に）なるまで離脱させない
		while (n <= 0) {
			System.out.println("※ n には正の整数値を入力してください。：");
			//入力値を変数nとして代入
			n = ins.nextInt();
		}

		//最終的に表示する積を変数mulとおき、初期値としてcount(=1)を入れる
		int mul = count;

		//countが動く範囲は1以上n以下なので、その範囲で+1ずつcountをインクリメント
		//かつ、mulにループごとにcountをかける（1*1, 1*2, 2*3, …)
		while (n >= count) {
			mul *= count; // mul = mul * count;
			++count;
		}

		//mulを1からnの積として表示する
		System.out.println("1から" + n + "の積は" + mul + "です。");
	}
}
