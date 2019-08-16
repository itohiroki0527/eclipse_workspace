package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FortuneServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	//entry.jspから送られてきたnameとか
	req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		int year = Integer.parseInt(req.getParameter("year"));
		int month = Integer.parseInt(req.getParameter("month"));
		int date = Integer.parseInt(req.getParameter("date"));
		//
		LogicBean lb = new LogicBean();
		//上記のname等をexecuteメソッドの引数にしている
		//それらをResultBeanのインスタンスrbに格納
		ResultBean rb =lb.execute(name, year, month, date);
		//[resultに上記で生成したrbを格納]←をreqに格納
		req.setAttribute("result",rb);
		req.setAttribute("name",name);

		//result.jspに遷移
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		rd.forward(req,resp);

}



}
