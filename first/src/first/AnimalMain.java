package first;

public class AnimalMain {
		public static void main(String[]args) {
			//birdクラスをインスタンス化
			Bird b = new Bird();
			//birdクラスのスリープメソッドを呼び出し
			b.sleep();
			//birdクラスのwakeupメソッド呼び出し
			b.wakeUp();
			//birdクラスのflyメソッド呼び出し
			b.fly();
		}
}
