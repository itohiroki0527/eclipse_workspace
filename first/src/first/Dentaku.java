package first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dentaku {
	public static void main(String[]args) throws IOException{
		System.out.println("パスワードを入力してください");
/*
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str = br.readLine();
			if(str == "テスト") {
				System.out.println("パスワードを認証しました");
				break;
			}else {
				System.out.println("パスワードが違います");
			}
			}
			*/
		System.out.println("数値,演算子,数値の順で入力してください");



		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String str2 = br2.readLine();
		int num2 = Integer.parseInt(str2);

		BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
		String str3 = br3.readLine();
		if(!str3.matches("[\\+\\-\\*\\/\\%]")) {
			System.out.println("演算子は + - * / % で入力してください");
		}
		BufferedReader br4 = new BufferedReader(new InputStreamReader(System.in));
		String str4 = br4.readLine();
		int num4 = Integer.parseInt(str4);

	}
}
