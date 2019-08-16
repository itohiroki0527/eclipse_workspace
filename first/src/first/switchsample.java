package first;

public class switchsample {
	public static void main (String[]args) {
		String name = "斉藤";
		//switch文の条件値に変数nameを入れる
		switch(name) {
		//caseで当てはまる所から実行
		case "鳥原":
			System.out.println("鳥原です");
		break;
		case "斉藤":
			System.out.println("斉藤さんだぞ！");
		break;
		case "伊藤":
			System.out.println("伊藤さんだぞ！");
		break;
		default:
			System.out.println("誰ですか");
		break;
		}
	}
}
