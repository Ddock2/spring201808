package basic;

public class Hello {
	private String msg;
	
	public Hello() {
		System.out.println("객체 생성 완료!!!");
		this.msg = "Hello";
	}
	
	public void prnMsg() {
		System.out.println("msg : " + msg);
	}
	
}
