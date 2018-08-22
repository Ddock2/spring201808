package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain02 {

	public static void main(String[] args) throws Exception {
		
		String xmlLocation = "classpath:beanContainer.xml";
//		ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext(xmlLocation);

//		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext(xmlLocation);

//		ApplicationContext context = new GenericXmlApplicationContext("beanContainer.xml");
//		ApplicationContext context = new GenericXmlApplicationContext("classpath:beanContainer.xml");
//		ApplicationContext context = new GenericXmlApplicationContext(xmlLocation);
		ApplicationContext context = new GenericXmlApplicationContext("file:src/main/resources/beanContainer.xml");
		
		
		Thread.sleep(3000);	// 3초동안 멈춤...
		
		Hello obj = (Hello)context.getBean("hello");
		Hello obj2 = (Hello)context.getBean("hello2");
		Hello2 obj3 = (Hello2)context.getBean("hello3");
		
		obj.prnMsg();
		obj2.prnMsg();
		obj3.prnMsg();
	}
	
}
