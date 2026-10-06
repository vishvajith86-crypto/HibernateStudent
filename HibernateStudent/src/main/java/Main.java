

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args) {
		Configuration con=new  Configuration();
		con.setProperty("hibernate.connection.driver_class","com.mysql.cj.jdbc.Driver");
		
		con.setProperty("hibernate.connection.url","jdbc:mysql://db01.dbhost.dev:5051/db_455c2v3ys");
		
		con.setProperty("hibernate.connection.username","user_455c2v3ys");
		
		con.setProperty("hibernate.connection.password","p455c2v3ys");
		
		con.setProperty("hibernate.hbm2ddl.auto","update");
		con.setProperty("hibernate.show_sql","true");
		con.setProperty("hibernate.format_sql","true");
		
		con.addAnnotatedClass(Student.class);
		
		SessionFactory sessionFactory =con.buildSessionFactory();
		Session session =sessionFactory.openSession();
		
		Student student =new Student(123, "vishva", "vishvajith86@gmail.com", "Advance Java Program");
		session.beginTransaction();
		
		session.persist(student); 
		session.getTransaction().commit();
		
		System.out.println("Student inserted successfully");
	}

}
