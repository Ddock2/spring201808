package di_anno02;

import javax.annotation.Resource;

public class Car {
	@Resource
	private Tire tire;
	
	public Car() {
		
	}
	// 생성자는 @Resource 안됨
//	public Car(Tire tire) {
//		this.tire = tire;
//	}
	
//	@Resource
	public void setTire(Tire tire) {
		System.out.println("setTire(Tire)");
		this.tire = tire;
	}
	
	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
	
}
