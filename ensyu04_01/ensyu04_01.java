package ensyu04_01;

//Scannerクラスをインポート
import java.util.Scanner;

public class ensyu04_01 {

	public static void main (String[] args) {

		// キーボードから値を取得するインスタンスを作成する
		Scanner ins = new Scanner(System.in);

		int retry;

		do {
		// 整数値の入力を促す
		System.out.println("整数値を入力してください。\n正か負か判定します。");

		// インスタンスを用いて変数numに値を入力
		int num = ins.nextInt();

		// numが正か負か０かで条件分岐
		if (num > 0)
			System.out.println("正です");
		else if (num < 0)
			System.out.println("負です");
		else if (num == 0)
			System.out.println("0です ※正でも負でもない");
		else
			System.out.println("存在しない整数値です");

		//もう一度やるかどうか入力を促す
		System.out.println("もう一度？ 1…Yes / 0…No：");

		//インスタンスを用いて変数retryに値を入力
		retry = ins.nextInt();

		//do～以上を、変数retryが1である限り、繰り返し続ける。
		} while (retry == 1);
	}
}
