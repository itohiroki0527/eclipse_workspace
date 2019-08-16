package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//req.getSessionがfalseのときセッションがない場合sessionはnullになる。
		HttpSession session = req.getSession(false);
		//文字化け防止
		resp.setContentType("text/html;charset = UTF-8");
		//HTMLの内容を記述
		PrintWriter out = resp.getWriter();
		//sessionがnullのときは開始されない表示、
		//nullじゃないときはsession継続とその旨の表示
		if(session == null) {
			out.println("セッションが開始されてません");
		}else {
			out.println("セッション継続中");
			out.println("<p>ログインユーザー：");
			out.println(session.getAttribute("name")+"</p>");
		}
	}
}
