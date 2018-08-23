package di_xml01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 스프링을 이용한 DI : 속성주입방식(setter주입)
 * 
 * - 쇼핑몰에서 타이어 구매
 * - 쇼핑몰에서 자동차 구입
 * - 운전자가 직접 자동차에 타이어를 장착
 */

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di_xml01.xml");
		
//		KoreaTire tire = (KoreaTire) context.getBean("koreaTire");
//		NexenTire tire = (NexenTire) context.getBean("nexenTire");
		
		Tire tire = (Tire) context.getBean("koreaTire");
		
		Car car = (Car) context.getBean("car");
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}

}
