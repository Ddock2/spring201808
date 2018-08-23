package di_xml01;

import di_xml01.KoreaTire;
import di_xml01.NexenTire;
import di_xml01.Tire;

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
