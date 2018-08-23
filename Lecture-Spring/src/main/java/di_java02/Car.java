package di_java02;

import di_java02.KoreaTire;
import di_java02.NexenTire;
import di_java02.Tire;

public class Car {
	
	private Tire tire;
	
	public Car(Tire tire) {
		this.tire = tire;
	}

	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
	
}
