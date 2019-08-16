package first;
//TaxMainクラスを定義
public class TaxMain {

	public static void main(String[]args) {
		//変数priceInt,pricedDouble,priceStringをそれぞれ定義
		int priceInt = 100;
		double pricedDouble = 200.0;
		String priceString = "300";

		//sys出力する。Tax.javaのint calc(int price)メソッドが返る
		System.out.println(priceInt + "円の消費税は"
		+Tax.calc(priceInt)+"円です");

		//sys出力する。Tax.javaのint calc(double price)メソッドが返る
		System.out.println((int)pricedDouble + "円の消費税は"
		+Tax.calc((int)pricedDouble)+"円です");

		//sys出力する。Tax.javaのint calc(String price)メソッドが返る
		System.out.println(priceString + "円の消費税は"
		+Tax.calc(priceString)+"円です");

		//
		System.out.println(priceInt + "円の消費税は"
		+Tax.calc(priceInt)+"円です"+"税込み"+ (priceInt + Tax.calc(priceInt))+"円です");

		//
		System.out.println((int)pricedDouble + "円の消費税は"
		+Tax.calc(pricedDouble)+"円です"+"税込み"+ ((int)pricedDouble + Tax.calc(pricedDouble))+"円です");

		//
		System.out.println(priceString + "円の消費税は"
		+Tax.calc(priceString)+"円です"+"税込み"+ (Integer.parseInt(priceString) + Tax.calc(priceString))+"円です");

	}
}
