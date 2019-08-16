package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
	public static void main(String[] args) {
	//JDBCの接続で使う「url,id,pw」をそれぞれ中身を入れておく
	String url = "jdbc:mysql://localhost/lesson20xx";
	String id = "root";					//↑●書き換えるところ●データベース名
	String pw = "password";
	//「connection,Statement,ResultSet」各オブジェクトを変数定義しておく
	Connection cnct = null;
	Statement st = null;
	ResultSet rs = null;
	try {
		//JDBCドライバの登録
		Class.forName("com.mysql.jdbc.Driver");
		//MySQLへ接続（データベースまで）
		cnct = DriverManager.getConnection(url,id,pw);
		st = cnct.createStatement();
		//●書き換えるところ●SQL文の発行
		rs = st.executeQuery("SELECT * from item");
		//●書き換えるところ●while文にてitemテーブルのレコードをnextメソッドで回していく
		while(rs.next()){
			//getXXXメソッドを使い、itemテーブル内の「name,price」をそれぞれname,priceに格納
			String name = rs.getString("name");
			String price = rs.getString("price");
			//コンソールに商品名と値段を出力する
			System.out.println("商品名" + name + "価格:" + price);
		}
	} catch(ClassNotFoundException ex){
		ex.printStackTrace();
	} catch(SQLException ex) {
		ex.printStackTrace();
	} finally {
		try {
			//JDBCの解除
			if (rs!=null) rs.close();
			if (st!=null) st.close();
			if (cnct!=null) cnct.close();
		} catch(Exception ex) {

		}
	}
}
}
