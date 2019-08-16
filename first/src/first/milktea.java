package first;

public class milktea {
public static void main (String[]args){
	//配列の大きさが5部屋あるgoodという配列を定義
	String[] good = new String[5];

	//goodという配列にそれぞれ値を代入
	good[0] = "高野";
	good[1] = "武田";
	good[2] = "長谷川";
	good[3] = "伊藤";
	good[4] = "祝";
	//長谷川さんを呼び出す
	System.out.println(good[2]);

	int age [] = {32,24,29,16,5,22,27,45,14};

	System.out.println(good[0]+"さんの年齢"+age[7]+"歳です");
	System.out.println(age[4]);
	}
}
