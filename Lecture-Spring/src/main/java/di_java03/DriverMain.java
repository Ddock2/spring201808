package di_java03;

import di_java03.Car;

/*
 *  JAVA에서의 DI : Setter 주입방식 (속성주입방식)
 *  
 *  - 운전자가 타이어 주문
 *  - 운전자가 자동차 주문
 *  - 운전자가 직접 자동차에 타이어를 장착
 */

public class DriverMain {
	
	public static void main(String[] args) {
		
//		Tire tire = new KoreaTire();
		Tire tire = new NexenTire();
		
		Car car = new Car();
		
		car.setTire(tire);
		
		System.out.println(car.getTireBrand());
	}
	
}
