package di_anno03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
//	@Resource(name="nexen")
	@Autowired
	@Qualifier("nexen")
	private Tire tire;
	
	public Car() {
		System.out.println("Car() 기본생성자 호출...");		
	}
/*	
//	@Autowired
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 생성자 호출...");
	}
	
//	@Autowired
	public void setTire(@Qualifier("nexen") Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) 메소드 호출...");
	}
*/	
	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
	
}
