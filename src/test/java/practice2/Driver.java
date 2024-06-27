package practice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import prcatice.AppConfig;
import prcatice.Samsung;

public class Driver {

	public static void main(String[] args) {
	//ApplicationContext contex= new ClassPathXmlApplicationContext("practice2/Spring.xml");
//	Vehicle obj=(Vehicle) contex.getBean("bike");
	//Vehicle obj=new Bike();
//	 obj.drive();
//	   Tyre t= (Tyre) contex.getBean("tyre");
//	   t.d();
//	
		ApplicationContext factory =new AnnotationConfigApplicationContext(AppConfig.class);
		Samsung s7= factory.getBean(Samsung.class);
	    s7.config();
	   
	  
	}
	

}
