package e_oop;

public class UserDefinedDataType {

	public static void main(String[] args) {
		/*
		 * 사용자 정의 데이터 타입
		 * - 데이터의 최종 진화 형태이다. (변수 -> 배열 -> 클래스)
		 * - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 * - 변수와 메소드로 구성할 수 있다.
		 */
		
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		int[] scores;
		double[] avg2;
		String name2;
		
		Student student;
		
		student = new Student(); //(초기화)객체 생성(인스턴스화)
		
		student.name = "홍길동";
		student.kor = 80;
		
		System.out.println(student.name);
		System.out.println(student.kor);
		System.out.println(student.eng);
	}

}

class Student{
	int kor;
	int eng = 70;
	int math;
	int sum;
	double avg;
	String name;
	
}



















