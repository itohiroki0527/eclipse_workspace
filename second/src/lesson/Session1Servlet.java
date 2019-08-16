package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Session1Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		//req.getSessionがtrueのときセッションオブジェクトを生成
		HttpSession session = req.getSession(true);
		//文字化け防止
		resp.setContentType("text/html;charset = UTF-8");
		//HTMLの内容を記述
		PrintWriter out = resp.getWriter();
		//nameにitoを格納
		session.setAttribute("name","ito");

		out.println("<p>セッション開始しました</p>");
	}

}
