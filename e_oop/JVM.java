package e_oop;

public class JVM {

	public static void main(String[] args) {
		/*
		 * JVM(Java Virtual Machine)
		 * - 자바로 만들어진 프로그램이 실행되는 컴퓨터 안의 가상 컴퓨터
		 * - 운영체제 -> JVM -> 자바프로그램
		 * - 장점 : 운영체제에 상관없이 실행할 수 있다.
		 * - 단점 : 속도가 느리다.
		 * 
		 * JVM 메모리 구조 (시험에 나온다)
		 * - Method Area(메소드 영역) : 클래스 멤버가 저장된다. (static 붙은애들)
		 * - Call Stack(호출스택) : 현재 호출되어 있는 메소드가 저장된다.
		 * - Heap : 객체가 저장된다.
		 */
		
		//1. 프로그램 실행시 main(), classVar, classMethod()가 Method Area에 저장된다.
		//2. main()이 호출되어 Call Stack에 저장됨
		
		System.out.println(classVar);
		//3. System 클래스의 out이 Method Area에 저장됨
		//4. println()이 호출되어 Call Stack에 저장됨
		//5. println()이 classVar를 출력 후 Call Stack에서 삭제됨
		
		classMethod();
		//6. classMethod()가 호출되어 Call Stack에 저장됨
		//7. instanceVar는 메모리에 존재하지 않기 때문에 사용할 수 없음.
		//8. println()이 호출되어 Call Stack에 저장됨
		//9. println()이 CalssVar을 출력 후 Call Stack에서 삭제됨
		//10. classMethod()의 실행이 종료되어 Call Stack에서 삭제됨
		
		JVM jvm = new JVM();
		//11. JVM객체가 Heap에 저장됨
		//12. jvm 변수가 Call Stack에 생성되고, JVM객체의 주소가 저장됨
		
		System.out.println(jvm.instanceVar);
		//13. println()이 호출되어 Call Stack에 저장됨
		//14. println()이 instanceVar를 출력 후 Call Stack에서 삭제됨.
		
		jvm.instanceMethod();
		//15. instanceMethd() 가 호출되어 Call Stack에 저장됨
		//16. println()이 호출되어 Call Stack에 저장됨
		//17. println()이 instanceVar을 출력 후 Call Stack에서 삭제됨
		//18. println()이 호출되어 Call Stack에 저장됨
		//19. println()이classVar를 출력 후 Call Stack에서 삭제됨.
		//20. instanceMethod()의 실행이 종료되어 Call Stack에서 삭제됨
		
		jvm = null;
		//21. jvm변수에 null이 저장됨
		//22. 어디에서도 주소를 참조하지 않는 JVM객체는 GarbageCollector에 의해 삭제됨
		
		//23. main()이 실행이 종료되어 Call Stack에서 삭제됨
		//24. 프로그램이 종료되고 Method Area의 데이터가 삭제됨
	}
	
	int instanceVar;
	static int classVar;
	
	void instanceMethod(){
		System.out.println(instanceVar);
		System.out.println(classVar);
	}
	
	static void classMethod(){
//		System.out.println(instanceVar); //아직 메모리에 올라가지 않은 상태
		System.out.println(classVar);
	}
	

}






















