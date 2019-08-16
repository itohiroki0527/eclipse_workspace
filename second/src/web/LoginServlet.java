package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//送られてきたパラメーターの文字コード取得
		//読み込み用
		req.setCharacterEncoding("UTF-8");

		//書き出し用
		resp.setContentType("text/html; charset = UTF-8");

		//login.jspで入力されたidとpass格納
		String sid = req.getParameter("sessionid");
		String pass = req.getParameter("pass");
		boolean flg = false;

		//MySQLの設定
		String url ="jdbc:mysql://localhost/store?useSSL = false";
		String id = "root";
		String pw = "password";

		//Connection,Statement,Resultを変数定義しておく
		Connection cnct = null;
		Statement st = null;
		ResultSet rs = null;
		try {

			//JDBCドライバの登録
			//JDBCドライバ（ジャー）をWEB-INF→libのフォルダに入れるのを忘れずにする
			Class.forName("com.mysql.jdbc.Driver");

			//SQLに接続してる
			cnct = DriverManager.getConnection(url, id, pw);
			st = cnct.createStatement();

			//SQL文の発行

			//入力されたlogin_nameがDBのuserテーブルの中のlogin_nameにあるかどうかをselectで特定する
			rs = st.executeQuery("Select * from user where login_name = '"+sid+"'");
			while(rs.next()){

				//カーソルがさしているレコードのカラム値を取り出すためのメソッド群
				//itemテーブル内のname,priceをそれぞれ格納してく
				String zid =rs.getString("user_name");
				String catid = rs.getString("login_pw");


				//↓☆ここからセッション・ページ遷移関係☆
				//JDBCのコードに組み込んだ。

				//文字化け防止
					//resp.setContentType("text/html;charset = UTF-8");
					req.setCharacterEncoding("UTF-8");
					//HTMLの内容を記述
					PrintWriter out = resp.getWriter();

					//idとpassが一致した場合ログインできる。そうでなければnullを返す
					if(zid.equals(sid) & pass.equals(catid)) {

					//セッションの生成及び"login_start"に"セッションある"を格納
					HttpSession session = req.getSession(true);
					session.setAttribute("login_start","セッションある");
					//商品検索画面に遷移
					RequestDispatcher rd = req.getRequestDispatcher("search.jsp");
					rd.forward(req,resp);
					//idとpassが未入力のとき
					}else if(zid.equals("") || pass.equals("")){
						//messageに"IDまたはパスワードが未入力ですを格納
						req.setAttribute("message_id_pass_nothing", "IDまたはパスワードが未入力です");
						req.getRequestDispatcher("login.jsp").forward(req, resp);
					}else {
						//messageに"IDまたはパスワードが違います"を格納
						req.setAttribute("message_id_pass_error", "IDまたはパスワードが違います");
						req.getRequestDispatcher("login.jsp").forward(req, resp);
					}
					//↑☆ここまでセッション・ページ遷移関係☆

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
			}catch(Exception ex) {
		}
	}
}
}