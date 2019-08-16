package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CompleteServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	//req.getSessionがfalseのときセッションがない場合sessionはnullになる。
	HttpSession session = req.getSession(false);

	//文字化け防止
	resp.setContentType("text/html;charset = UTF-8");
	req.setCharacterEncoding("UTF-8");

	//HTMLの内容を記述
	PrintWriter out = resp.getWriter();

	//「買い物を続けるボタン」が押された場合検索ページに遷移
	//「ログアウトボタン」をされた場合はログイン画面に戻る
	//それらの条件以外の場合はnullを返す
	if(req.getParameter("shopping").equals("買い物を続ける")){
	RequestDispatcher rd = req.getRequestDispatcher("search.jsp");
	rd.forward(req,resp);
	}else if(req.getParameter("shopping").equals("ログアウト")){
		session.invalidate();
		RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
		rd.forward(req,resp);
	}else {
		out.println("null");
	}
}
}
