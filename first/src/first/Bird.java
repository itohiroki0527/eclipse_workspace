package first;
//Animalクラスを継承しているBirdクラス
public class Bird extends Animal {


	//staticで変数を定義
	public static int wing = 2;
	//flyのメソッドを定義
	public void fly() {
		int wing = 3;
		System.out.println(this.wing+"枚の羽根で飛びます");
	}
	//sleepメソッドの定義
	public void sleep() {
		System.out.println("木の上で");
		//親クラスのsleepメソッドを呼び出している
		super.sleep();
	}
}
