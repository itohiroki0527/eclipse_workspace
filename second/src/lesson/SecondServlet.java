package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {

		//送信されてくるパラメータの文字コードの設定
		req.setCharacterEncoding("UTF-8");

		//HTMLからparamという名前のパラメータを取得してきて変数に格納
		String x = req.getParameter("param");


		resp.setContentType("text/html;charset = UTF-8");
		PrintWriter out = resp.getWriter();

		out.println("<html>");
		out.println("<head><title>サンプルページ</title></head>");
		out.println("<body>");
		//変数xの値をHTMLで表示
		out.println("<h1>" + x +"</hi>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}

}
