package first;

public class instance {
	public static void main(String[]args) {
		/*アタッククラスを宣言したいので
		インスタンス化する
		Attackクラスをaという変数に代入する
		*/
		Attack a = new Attack();

		System.out.println(a.name);
		a.BodyAttack();
		a.Damage(50);

	}
}
