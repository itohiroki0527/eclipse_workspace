package first;


public class PersonTest {
	public static void main(String[]args) {
		//p1インスタンスの生成
		Person1 p1 = new Person1();
		//try~catchでp1.setAge(1)を例外補足
		try {
			//setAgeメソッドに負の値を渡す
		p1.setAge(1);
		//例外発生時にその旨を出力する
		}catch(Exception e) {
			System.out.println("例外が発生しました");
			//例外あるなしに関わらず実行後に出力
		}finally {
			System.out.println("実行終了");
		}
	}
}
