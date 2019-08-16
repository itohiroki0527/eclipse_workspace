package first;

public class CalcTest {
	public static void main(String[] args) {
	int dollar = 150;
	int yen = 25800;

	System.out.println(dollar+"ドルは、"+MoneyCalc.dollarToYen(dollar)+"円です");

	System.out.println(yen+"円は、"+MoneyCalc.yenToDollar(yen)+"ドルです");

	}
}