
package workspace0.chapter14_archive.ensyu14_03;

//DVDPlayerクラス - - - ExPlayerクラスを実装
class DVDPlayer implements ExPlayer{
	
	//製造番号のインスタンスを生成
	int serialNumber;
	
	// - - - コンストラクタ
	//コンストラクタで初期化
	DVDPlayer(int serialNumber){
		
		this.serialNumber = serialNumber;
	}
	
	//再生と表示するメソッド
	public void play() {
		
		//再生と表示
		System.out.println("再生します。");
		System.out.println("～　♪　～　♪　～　♪　～");
		
	};
	
	//停止と表示するメソッド
	public void stop() {
		
		//停止と表示
		System.out.println("停止します。");
		System.out.println("- - - - - - - - - - - - - -");
		
	};
	
	//スロー再生するメソッド
	public void slow() {
		
		//スロー再生と表示
		System.out.println("ス　ロ　ー　再　生　し　ま　す　。");
		System.out.println("～　～　♪　～　～　♪　～　～　♪　～　～");
		
	};
}