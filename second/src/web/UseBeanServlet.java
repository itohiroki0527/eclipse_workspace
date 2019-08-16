package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
throws ServletException, IOException {
	//EmpBeanをインスタンス化
	EmpBean bean = new EmpBean();
	//クラスEmpBeanに"KnowledgeTaro"を渡してる
	bean.setName("KnowledgeTaro");
	//クラスEmpBeanに"KnowledgeTaro"を渡してる
	bean.setAge(20);
	//empにbeanを格納している
	req.setAttribute("emp", bean);
	//test.jspに値をとばす
	RequestDispatcher rd = req.getRequestDispatcher("test.jsp");
	rd.forward(req, resp);
}
}
