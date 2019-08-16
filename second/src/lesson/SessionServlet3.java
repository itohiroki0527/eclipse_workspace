package lesson;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet3 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
		//req.getSessionがfalseのときセッションがない場合sessionはnullになる。
		HttpSession session = req.getSession(false);
		//文字化け防止
		resp.setContentType("text/html;charset = UTF-8");
		//HTMLの内容を表示する
		PrintWriter out = resp.getWriter();
		//sessionがnullじゃないときsession.invalidate();によって
		//セッションオブジェクトが廃棄される。
		if(session != null) {
			session.invalidate();
			out.println("<p>セッション終了</p>");
		}
	}
}
