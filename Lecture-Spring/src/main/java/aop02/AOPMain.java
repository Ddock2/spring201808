package aop02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * Spring AOP 특징
 * 1. 프록시 기반
 * 2. 인터페이스 기반
 * 3. 런타임 기반
 */

public class AOPMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop02.xml");
		
		Person girl = context.getBean("girl", Person.class);		// 인터페이스 기반이라 인터페이스 자료형으로
		Person boy = context.getBean("boy", Person.class);
		
		girl.runSomething();
		boy.runSomething();
	}

}
