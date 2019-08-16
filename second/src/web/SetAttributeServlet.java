package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetAttributeServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {

	HttpSession session = req.getSession(true);
	//reqでもsessionでもどっちつかってもいい。
	//reqは情報漏れてもいい部分。sessionはセキュリティが高い。
	//迷ったらsessionのがいいかも。
	session.setAttribute("title","Dispatch JSP");
	//Knowledgeをnameに格納
	session.setAttribute("name","KnowledgeTaro");
	//20をageに格納
	req.setAttribute("age", 20);

	//dispatch.jspにrd.forward(req, resp);を渡す
	RequestDispatcher rd = req.getRequestDispatcher("dispatch.jsp");
	rd.forward(req, resp);
}
}
