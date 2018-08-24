package di_anno03;

import org.springframework.stereotype.Component;

@Component("korea")
public class KoreaTire implements Tire {
	
	public KoreaTire() {
		System.out.println("KoreaTire() 생성자 호출...");
	}
	
	public String getBrand() {
		
		return "한국타이어";
	}

}
