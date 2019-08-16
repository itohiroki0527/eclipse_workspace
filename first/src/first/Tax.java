package first;
//クラスTaxを定義
public class Tax {
	//定数rateに0.05を代入
	public static final double rate = 0.05;

	//それぞれint calcのとこだけ、重複しているが引数が
	//異なっているものを定義している。これがオーバーロード

	//int calc(int price)メソッドを定義
	public static int calc(int price) {
		return(int)( price * rate);
	}
	//int calc(double price)メソッドを定義
	public static int calc (double price) {
		return (int)(((int)price)*rate);
	}
	//int calc(String price)メソッドを定義。
	//Integer.parseIntで文字列から数字に型変換している。
	public static int calc(String price) {
		return(int)(Integer.parseInt(price)*rate);
	}

}
