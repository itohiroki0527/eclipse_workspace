package first;

import java.util.HashMap;

public class HashMapTest {
	public static void main(String[]args) {

		HashMap map = new HashMap();
		map.put("name", "G.Paltrow");
		map.put("Age",30);
		map.put("Gender","Female");

		System.out.println(map.get("Gender"));
	}
}
