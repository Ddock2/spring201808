package di_anno04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HyundaiMaker implements CarMaker {
	
	@Autowired
	private Car car;
	
	@Override
	public Car sell(Money money) {
		car.setName("소나타");
		System.out.println(car.getName() + "를 " + money.getAmount() + "만원에  팔았습니다.");
		return car;
	}
	
}
