package di_test02;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class Develope {
//	@Resource(name="designer")
	@Autowired
	@Qualifier("programmer")
	private Developer developer;
	
	public Develope() {
		
	}
/*
	@Autowired
	public Develope(@Qualifier("programmer")Developer developer) {
		this.developer = developer;
	}

	@Resource(name="designer")
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
*/
	public void develope() {
		
		developer.goToOffice();
		System.out.println("개발을 합니다 ㅠㅠ");
		developer.getOffOffice();
	}
	
}
