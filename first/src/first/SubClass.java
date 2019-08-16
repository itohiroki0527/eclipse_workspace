package first;

public class SubClass extends SuperClass{
	public SubClass() {
		this("B");
	}
	public SubClass(String val) {
		System.out.println(val);
	}
}