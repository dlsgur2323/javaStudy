package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		Student[] students = new Student[10];
		String[] subjects = {"국어", "영어", "수학"};
		
		for(int i = 0; i < students.length; i++){
			Student student = new Student();
			
			student.name = "학생" + (i+1);
			student.rank = 1;
			student.kor = (int)(Math.random()*101);
			student.eng = (int)(Math.random()*101);
			student.math = (int)(Math.random()*101);
			
			student.sum = student.kor + student.eng + student.math;
			student.avg = Math.round(((double)(student.sum) / subjects.length) *100)/100.0;
			
			students[i] = student;
			
		}
		
		//성적관리 프로그램을 완성해주세요.
		//석차구하기
		for(int i = 0; i < students.length; i++){
			for(int j = 0; j < students.length; j++){
				if(students[i].sum < students[j].sum){
					students[i].rank++;
				}
			}
		}
		
		//석차로 정렬
		for(int i = 0; i < students.length; i++){
			int min = i;
			for(int j = i+1; j < students.length; j++){
				if(students[min].rank > students[j].rank){
					min = j;
				}
			}
			Student temp = students[min];
			students[min] = students[i];
			students[i] = temp;
		}
			
		//출력
		for(int i = 0; i < subjects.length; i++){
			System.out.print("\t" + subjects[i]);
		}
		System.out.println("\t" + "합계" + "\t" + "평균" + "\t" + "석차");
		
		for(int i = 0; i < students.length; i++){
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].sum + "\t");
			System.out.print(students[i].avg + "\t");
			System.out.print(students[i].rank + "\n");
		}

		
		
		
	}

}












