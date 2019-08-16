package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login_JDBC extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//送られてきたパラメーターの文字コード取得
		//読み込み用
		req.setCharacterEncoding("UTF-8");
		//書き出し用
		resp.setContentType("text/html; charset = UTF-8");
		String sid = req.getParameter("sessionid");
		String pass = req.getParameter("pass");
		boolean flg = false;
		//super.doGet(req, resp);
		String url ="jdbc:mysql://localhost/lesson20xx?useSSL = false";

		//String url ="jdbc:mysql://localhost/store?useSSL = false";
		String id = "root";
		String pw = "password";
		//Connection,Statement,Resultを変数定義しておく
		Connection cnct = null;
		Statement st = null;
		ResultSet rs = null;
		//html側で入力した値とDBからとってきた値がtrueならloginするプログラムをつくる



		try {
			//JDBCドライバの登録
			Class.forName("com.mysql.jdbc.Driver");
			//SQLに接続してる
			cnct = DriverManager.getConnection(url, id, pw);
			st = cnct.createStatement();
			//SQL文の発行
			rs = st.executeQuery("Select *from zaiko");

			while(rs.next() & flg ==false){
				//カーソルがさしているレコードのカラム値を取り出すためのメソッド群
				//itemテーブル内のname,priceをそれぞれ格納してく
				String name = rs.getString("name");
				String zid =rs.getString("id");
				String catid = rs.getString("cat_id");
				
				
				
				if(zid.equals(sid) & pass.equals(catid)) {
					flg= true;
					PrintWriter out = resp.getWriter();
					//htmlコードの記入
					out.println("<html>");
					out.println("<head> <title>サンプル</title><head>");
					out.println("<body>");
					out.println("hello"+name);
					out.println("<br>");
					out.println("</body>");
					out.println("</html>");
					//記入の終了を宣言
					out.close();
				}

///////////////////////////////////////

			}
		}catch(ClassNotFoundException ex) {
			//どんな例外が起きたかを表示してくれる
			ex.printStackTrace();
		}catch(SQLException ex) {
			ex.printStackTrace();
		}finally {
			try {
				//接続の解除//あってもなくてもいいけどあったほうがいい
				if(rs!=null) rs.close();
				if(st!=null) st.close();
				//if(cnct!=null)cnct.close();
			}catch(Exception ex) {}
		}


	}

}
