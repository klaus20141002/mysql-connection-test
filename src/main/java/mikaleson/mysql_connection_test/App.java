package mikaleson.mysql_connection_test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ImportResource("classpath*:app-context.xml")
@ComponentScan(basePackages="mikaleson.mysql_connection_test.com.niklaus")
public class App {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(App.class, args);
	}
	
	
	
	

}

class MyTest implements Runnable{
	public static int ii = 0 ;
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		ii++;
		DBHelper h = new DBHelper();
		try {
			Connection conn = h.conn;
			Statement st = conn.createStatement() ;
			ResultSet rs = st.executeQuery("select count(1) from t_insurance") ;
			while(rs.next()) {
				int i = rs.getInt(1);
				System.out.println("test is test "+ii+" times :"+i);
			}
			st.close();
			h.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}




