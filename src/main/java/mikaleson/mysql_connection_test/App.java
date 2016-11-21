package mikaleson.mysql_connection_test;

import java.sql.SQLException;

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
@ComponentScan
public class App {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(App.class, args);
	}
	
	
	
	
}
