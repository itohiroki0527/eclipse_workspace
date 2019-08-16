package first;

public class MoneyCalc {
		static double rate = 117.94;
		/* staticがあるためインスタンス化しなくても
		メソッドを呼び出せる
		*/
	public static double dollarToYen(int dollar) {
		return dollar*rate;
	}
	/* staticがあるためインスタンス化しなくても
	メソッドを呼び出せる
	*/
	public static double yenToDollar(int yen) {
		return yen/rate;
	}
}