package first;

public class problem {
	public static void main(String[]args) {
		System.out.println("Hallo,World");
		int num =+ 10;
		System.out.println(num);
		String str = "Hallo,World";
		System.out.println(str);
		Boolean flg = true;
		System.out.println(flg);



		String time[] = {"朝","昼","夕方","夜"};
		System.out.println(time[1]);
		System.out.println(time[3]);

		int num3 = 50;
		if(num3 >= 60) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}

		boolean flg2 = true;
		if(flg2 == true) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}

		int num2[] = {50,20,30,40,10};
		if(num2[1]<20) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}

		String day[] = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日",};
		if(day[2]=="水曜日") {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}

		String name[]= {"A.Jolie","B.Pitt","C.Diaz","D.Washington","E.Murphy"};
		for(int i=0;i<5;i++) {
			System.out.println(name[i]);
		}

		String [] a = {"A.Jolie","B.Pitt","C.Diaz","D.Washington","E.Murphy"};
		for(String a2:a) {
			System.out.println(a2);
		}

		/*変数Xに任意の値を入れます
		Xの値が８０以上なら「Aクラス」を出力
		Xの値が７０以上なら「Bクラス」を出力
		Xの値が６０以上なら「Cクラス」を出力
		Xの値が６０より小さければ「Dクラス」を
		出力されるプログラムを作成してください。
		*/

		int i = 60;

		if(i<100 && i<0) {
			System.out.println("不正な数字です");
		}else if(i>=80){
			System.out.println("Aクラス");
		}else if(i>=70){
			System.out.println("Bクラス");
		}else if(i>=60) {
			System.out.println("Cクラス");
		}else{
			System.out.println("Dクラス");
		}

	}

}
