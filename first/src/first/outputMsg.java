package first;

public class outputMsg {

		public void hello(){
			System.out.println("HelloWorld");
		}
		public void outputNum(int a) {
			System.out.println(a);
		}
		public void outputStr(String s) {
			System.out.println(s);
		}
		public void outputArray(int[] i) {
			for(int y:i) {
				System.out.println(y);
			}
		}
		public void outputOther(int q,String t) {
			System.out.println(q);
			System.out.println(t);
		}
		public void Str(String str) {
			System.out.println(str);
		}
		public String getStr(String g) {
			System.out.println(g);
			return (g);
		}
		public void getChangeArray(String w,String x) {
			String[] man = {w,x};
			System.out.println(man[0]);
			System.out.println(man[1]);

		}
}
