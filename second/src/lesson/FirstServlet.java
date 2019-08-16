package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//「MIMEタイプ」と「エンコーディング」の設定をする
		//今回はhtmlでUTF-8
		resp.setContentType("text/html;charset = UTF-8");
		//ブラウザに文字列を出力するための出力ストリームを取得する
		//(ブラウザに出力するための準備)
		PrintWriter out = resp.getWriter();



		//HTMLを書くために必要なメソッド
		out.println("<html>");
		out.println("<head><title>サンプルページ</title></head>");
		out.println("<body>");
		out.println("<h1>HelloWold!</hi>");
		out.println("</body>");
		out.println("</html>");
		//ストリームを閉じる
		//(ここで終了。という宣言がclose)
		out.close();







	}

}
