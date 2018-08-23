package di_java01;

public class Car {
	
	private Tire tire;

	public Car() {
		// 의존관계 발생
//		tire = new KoreaTire();
		tire = new NexenTire();
	}

	public String getTireBrand() {
		return "장착된 타이어 : " + tire.getBrand();
	}
	
}
