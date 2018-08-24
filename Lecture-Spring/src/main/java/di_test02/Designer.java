package di_test02;

import org.springframework.stereotype.Component;

@Component
public class Designer implements Developer {

	@Override
	public void goToOffice() {
		System.out.println("디자이너 출근 ㅜㅜ");
	}

	@Override
	public void getOffOffice() {
		System.out.println("디자이너 퇴근 ^^");
	}

}
