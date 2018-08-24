package di_test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di_test02.xml");
		Develope dev = context.getBean("develope", Develope.class);
		dev.develope();
	}

}
