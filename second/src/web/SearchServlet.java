package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SearchServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	//req.getSessionがfalseのときセッションがない場合sessionはnullになる。
	HttpSession session = req.getSession(false);
	//文字化け防止
	req.setCharacterEncoding("UTF-8");
	resp.setContentType("text/html;charset = UTF-8");

	//complete.jspに遷移
	RequestDispatcher rd = req.getRequestDispatcher("complete.jsp");
	rd.forward(req,resp);
	}
}


