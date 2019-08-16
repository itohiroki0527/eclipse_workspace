package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {

	//送信されてくるパラメータの文字コードの設定
	req.setCharacterEncoding("UTF-8");

	//HTMLからparamという名前のパラメータを取得してきて変数に格納
	String POST_name = req.getParameter("name");
	String POST_age = req.getParameter("age");
	String POST_man_woman = req.getParameter("man_woman");
	String POST_text_area = req.getParameter("text_area");
	//チェックボックスに配列
	String lange[] = req.getParameterValues("lange");





	//必ずtext/htmlと記載。逆にしてはならない。
	resp.setContentType("text/html;charset = UTF-8");
	//HTMLの内容を記述
	PrintWriter out = resp.getWriter();

	out.println("<html>");
	out.println("<head><title>サンプルページ</title></head>");
	out.println("<body>");
	//変数xの値をHTMLで表示
	out.println("お名前:");
	out.println("<h1>" + POST_name +"</h1>");

	out.println("年齢");
	out.println("<h1>" + POST_age +"</h1>");

	out.println("性別");
	out.println("<h1>" + POST_man_woman +"</h1>");
	//(5)vehicleパラメータの取得

	out.println("興味のある言語");
    for (int i = 0; i < lange.length; i++ ) {
        out.println("<h1>" + lange[i] +"</h1>");
    }

	out.println("備考");
	out.println("<h1>" + POST_text_area +"</h1>");
	out.println("</body>");
	out.println("</html>");

	out.close();
	}
}
