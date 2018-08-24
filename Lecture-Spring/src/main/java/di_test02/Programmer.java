package di_test02;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Developer {

	@Override
	public void goToOffice() {
		System.out.println("프로그래머 출근 ㅜㅜ");
	}

	@Override
	public void getOffOffice() {
		System.out.println("프로그래머 퇴근 ^^");
	}

}
