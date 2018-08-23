package di_java03;

import di_java03.KoreaTire;
import di_java03.NexenTire;
import di_java03.Tire;

public class Car {
	
	private Tire tire;
	
	public Car() {
		
	}

	public void setTire(Tire tire) {
		this.tire = tire;
	}

	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
	
}
