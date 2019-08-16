package first;

public class ensyu_problem {
	public static void main(String []args) {
		System.out.println("---演習問題１---");
		int x=10;
		int y=20;

		if(x==10) {
			x += 10;
		}else {
			x -=10;
		}
		if(y==10) {
			y += 10;
		}else {
			y -=10;
		}
		System.out.println("Xの値は"+x);
		System.out.println("Yの値は"+y);
		System.out.println("---演習問題２---");

		for(int i=1;i<=9;i++) {
			System.out.println("▼"+i+"の段▼");
			for(int j=1;j<=9;j++) {
				System.out.print(i+"×"+j+"="+j*i+",");
			}
			System.out.println("");
		}
		System.out.println("---演習問題３---");
		for(int a=1;a<=100;a++) {
			System.out.print(a+"  ");
			if(a % 3 == 0) {
				System.out.print("Fizz");
			}else if(a % 5 == 0) {
				System.out.print("Buzz");
			}else if(a % 3 == 0 && a % 5 == 0) {
				System.out.print("FizzBuzz");
			}
			System.out.println("");
		}
	}

}
