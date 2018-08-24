package di_anno03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 스프링을 이용한 DI - component-scan 이용한 자동객체 생성 및 주입
 * 
 * 객체 검색 및 생성 (XML)
 * <context:component-scan base-package="">
 * 	
 *   객체 생성과 관련된 어노테이션 4가지
 * 	 @Component  @Controller  @Service  @Repository	
 */

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di_anno03.xml");
		
		Car car = (Car) context.getBean("car");
		System.out.println(car.getTireBrand());
	}

}
