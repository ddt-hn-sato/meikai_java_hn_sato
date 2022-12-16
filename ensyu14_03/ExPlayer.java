
package workspace0.chapter14_archive.ensyu14_03;

//ExPlayerインターフェース - - - Playerインターフェースの子インターフェース。この後DVDPlayerクラスに実装される。
interface ExPlayer extends Player{
	
	//再生と表示するメソッド(抽象、public)
	//停止と表示するメソッド(抽象, public) →この2つを内部に持っている
	
	//スロー再生するメソッド(抽象, public)
	void slow();
	
}