package first;

public class Msg {
	public static void main(String []args) {
		outputMsg o = new outputMsg();
		o.hello();
		o.outputNum(50);
		o.outputStr("ココア");
		int[] j = {1,2,3,4,5};
		o.outputArray(j);
		o.outputOther(99,"紅茶");
		o.Str("レモンティー");
		o.getStr("ミルクティー");
		o.getChangeArray("肉まん","あんまん");

	}
}
