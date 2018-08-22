package basic;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class HelloMain {

	public static void main(String[] args) {
		
//		Hello hello = new Hello();
//		hello.prnMsg();
		
		// classPath는 src/main/resource 밑부터
//		Resource resource = new ClassPathResource("beanContainer.xml");	
		// fileSystem은 src부터 다 써야됨
		Resource resource = new FileSystemResource("src/main/resources/beanContainer.xml");	
		
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Hello obj = (Hello)factory.getBean("hello");		
		obj.prnMsg();
		
		Hello obj2 = (Hello)factory.getBean("hello2");		
		obj2.prnMsg();
		
		// 이미 생성된 객체 사용
		Hello obj3 = (Hello)factory.getBean("hello");		
		obj3.prnMsg();
		
	}
}












