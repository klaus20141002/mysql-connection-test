/**
 * @2016-2016年11月3日-上午10:05:49
 * @ Niklaus Mikaelson 
 * @DBHelper.java
 */
package mikaleson.mysql_connection_test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @DBHelper
 */
public class DBHelper {

	public static final String url = "jdbc:mysql://192.168.100.71:1234/new2bulu?useUnicode=true&amp;amp;characterEncoding=UTF-8";
	public static final String name = "com.mysql.jdbc.Driver";
	public static final String user = "root";
	public static final String password = "root";

	public Connection conn = null;

	public DBHelper() {
		try {
			Class.forName(name);// 指定连接类型
			conn = DriverManager.getConnection(url, user, password);// 获取连接
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
