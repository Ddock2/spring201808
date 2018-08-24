package di_anno03;

import org.springframework.stereotype.Component;

@Component("nexen")
public class NexenTire implements Tire {
	
	public NexenTire() {
		System.out.println("NexenTire() 생성자 호출...");
	}
	
	public String getBrand() {
		
		return "넥센타이어";
	}

}
