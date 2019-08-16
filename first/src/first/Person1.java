package first;
	//クラスPerson1を定義、int ageを定義
	public class Person1 {
		public int age;
		//Person1メソッドを定義
		public Person1() {
			age = 0;
		}
		/*setAge(int age)メソッドを作成
		引数がage<0だった場合
		PersonTest.javaのExpection ageに投げる*/
		public void setAge(int age)throws Exception{
			if(age<0) {
				//引数が0未満だったときにthrow文が
				//働いてcatchに補足される
				Exception e = new Exception();
				throw e;
			}
		}
	}

