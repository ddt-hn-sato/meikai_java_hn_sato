//直線
//方向がなく描画はできないため抽象クラスとする

package workspace0.chapter13_archive.ensyu13_01;

abstract class AbstLine extends Shape{
	
	//フィールドと、アクセッサのみ定義し
	//drawメソッドはカラのまま
	
	//長さ
	private int length;
	
	// - - - コンストラクタ
	AbstLine(int length){
		
		setLength(length);
	}
	
	//ゲッタ(外から間接的にアクセスするため)
	int getLength(){
		
		return length;
	}
	
	//セッタ(外から間接的にアクセスするため)
	void setLength(int length) {
		
		this.length = length;
	}
}
