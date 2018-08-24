package di_anno01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 스프링을 이용한 Di - @Autowired 어노테이션을 이용한 자동주입
 * 
 * xml 추가태그
 * - <context:annotation-config />
 * 
 * @Autowired 사용 가능 위치 : 멤버변수, 생성자, setter메소드
 * 
 * 객체주입 우선순위
 * 1. type matching
 * 2. name matching
 */

public class DriverMain {

	public static void main(String[] args) {
		
//		ApplicationContext context = new GenericXmlApplicationContext("di_anno01.xml");
//		ApplicationContext context = new GenericXmlApplicationContext("di_anno01-1.xml");
		ApplicationContext context = new GenericXmlApplicationContext("di_anno01-2.xml");
		
		Car car = (Car) context.getBean("car");
		System.out.println(car.getTireBrand());
	}

}
