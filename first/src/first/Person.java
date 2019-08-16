package first;
//クラスPersonを定義nameとageをそれぞれprivateし、外部アクセスを制限する
public class Person {
	//privateがあるのでPersonクラス以外からはアクセスできない
	private String name;
	private int age;
	//setAgeに入る値が0以上のとき、ageにnewAgeを代入する
	public void setAge(int newAge) {
		if(newAge >= 0) {
			age = newAge;
		}
	}
	//getAge()メソッドを定義。呼び出された場合ageが返る
	public int getAge() {
		return age;
	}
	//newNameがnullの場合、かつ、newNameが空白でなければ
	public void setName(String newName) {
		if(newName!=null && !newName.equals("")){
			name = newName;
		}
	}
	//String getName()メソッドを定義。呼び出された場合nameが返る
	public String getName() {
		return name;
	}
}

