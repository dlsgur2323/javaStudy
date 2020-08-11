package f_oop2;

import e_oop.ScanUtil;

public class AccessModifier {
	
	public String publicVar = "public : 접근제한이 없음";
	protected String protectedVar = "protected : 같은 패키지 + 상속받은 클래스에서 접근가능";
	String defaultVar = "default : 같은 패키지에서만 접근 가능";
	private String privateVar = "private : 클래스 내에서만 접근 가능";
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	protected void protecedMethod(){
		System.out.println(protectedVar);
	}
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	private void privateMethod(){
		System.out.println(privateVar);
	}
	
	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protecedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		System.out.println(am.privateVar);
		am.privateMethod();
	
		
		/*
		 * 접근제어자를 사용하는 이유
		 * - 데이터를 보호하기 위해
		 * - 불필요핟 멤버를 감추기 위해
		 * 
		 */
		
		Time t = new Time();
		
//		t.hour = 16;
//		t.minute = 350;
//		t.second = -15;
		t.setHour(16);
		t.setMinute(350);
		t.setSecond(-15);
		System.out.println(t.getTime());
			t.clock();
			System.out.println(am.publicVar);
			am.publicMethod();
		
		
	}
	
}























