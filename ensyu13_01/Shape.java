//図形
//メソッドの実体は、実際にはないため抽象クラスとする

package workspace0.chapter13_archive.ensyu13_01;

abstract class Shape{

	//あえて抽象メソッドとして宣言
	//ObjectクラスのtoStringメソッドを継承しているため、
	//[public]は、そのtoStringメソッドにかかっている
	public abstract String toString();
	
	//drawメソッド（抽象）
	abstract void draw();

	//printメソッド（非抽象）
	//動的結合で（現在実行しているクラスの型のメソッドが呼び出される
	void print() {	//←これがどのクラスで呼び出されるかに応じて
					//メソッドの内容が変わってくる
		
		//抽象メソッドを呼び出している
		System.out.println(toString());
		//このクラスの抽象メソッドを呼び出している
		draw();
		//this.draw(); //←こう書くのと同じ
	}
	
	//↑メソッドprintを個々の子クラスでなく
	//この親クラスでくくるメリットは、変更が簡単なこと。
	
	//メモ：抽象メソッドには本体を書いてはいけない。
	//カラであっても、{}も書いてはいけない。
	
}