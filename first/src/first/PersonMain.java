package first;
//クラスPersonMainを定義
public class PersonMain {
	public static void main(String[]args) {
		//pインスタンスを生成
		Person p = new Person();
		//p.setAge(int newAge)を呼び出し
		p.setAge(32);
		p.setName("伊藤");
		//p.setName(String newName)を呼び出し
		System.out.println(p.getAge());
		System.out.println(p.getName());


	}

}
