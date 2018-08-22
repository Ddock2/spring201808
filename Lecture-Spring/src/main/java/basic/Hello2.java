package basic;

public class Hello2 {
	private static Hello2 instance;
	
	public Hello2() {
		System.out.println("Hello2 객체 생성");
	}
	
	public static Hello2 getInstance() {
		System.out.println("getInstance메소드 호출");
		if(instance == null)
			instance = new Hello2();
		return instance;
	}
	
	public void prnMsg() {
		System.out.println("Hello2 prnMsg()");
	}
}
