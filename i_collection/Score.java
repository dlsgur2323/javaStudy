package i_collection;

import java.util.ArrayList;

import javax.security.auth.Subject;

import d_array.array;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, oracle, java 점수를 0~100 까지 랜덤으로 생성해주시고,
		 * 아래와 같이 출력해주세요.
		 * 
		 * 		국어		영어		수학		사회		과학		Oracle		java	 합계		평균		석차
		 * 홍길동 	90		90		90		90		90		90			90		90		90		1
		 * 홍길동 	90		90		90		90		90		90			90		90		90		1
		 * 홍길동 	90		90		90		90		90		90			90		90		90		1
		 * 홍길동 	90		90		90		90		90		90			90		90		90		1
		 * 홍길동 	90		90		90		90		90		90			90		90		90		1
		 * 과목합계 450		450		450		450		450		450			450		450		
		 * 과목 평균90.0	90.0	90.0	90.0	90.0	90.0		90.0	90.0	
		 * 
		 */
		
		String[] sub = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"}; //[국어~석차까지] 상단 표
			
		String[] student = {"강지원", "김동민", "김동희", "김민지", "김용진", "김인혁", "김진용", "박범영", "박병규",
							"배현태", "심민규", "여인욱", "이나정", "이승민", "이영섭", "이윤혜", "이지향", "임정혁",
							"임형묵", "장성보", "정선영", "정회립", "차경석", "최준영", "허지영"}; //[학생수] 학생이름
			
		ArrayList<String> subject = new ArrayList<>();
		for(int i = 0; i < sub.length; i++){
			subject.add(sub[i]);
		}
		
		ArrayList<String> students = new ArrayList<>();
		for(int i = 0; i< student.length; i++){
			students.add(student[i]);
		}
		
		ArrayList<ArrayList<Integer>> scores = new ArrayList<>(); //학생별 과목별 점수
		ArrayList<Integer> sumStudent = new ArrayList<>(); // 학생별 합계
		ArrayList<Double> avgStudent = new ArrayList<>(); // 학생별 평균
		
		for(int i = 0; i < students.size(); i++){ //학생별 과목별 점수 만들기 , 합계, 평균 다같이
			ArrayList<Integer> score = new ArrayList<>();
			scores.add(score);
			int sum = 0;
			for(int j = 0; j < subject.size(); j++){
				scores.get(i).add((int)(Math.random()*101));
				sum += scores.get(i).get(j);
			}
			sumStudent.add(sum);
			avgStudent.add(Math.round(((double)sumStudent.get(i)/subject.size())*100)/100.0);
		}
				
		ArrayList<Integer> rank = new ArrayList<>(); // 석차 만들기
		for(int i = 0; i < students.size(); i++){
			rank.add(1);
			for(int j = 0; j < students.size(); j++){
				if(sumStudent.get(i) < sumStudent.get(j)){
					rank.set(i, rank.get(i)+1);
				}
			}
		}
		//과목별 합계, 과목별 평균
		ArrayList<Integer> sumSub = new ArrayList<>();
		ArrayList<Double> avgSub = new ArrayList<>();
		
		for(int i = 0; i < subject.size(); i++){
			int sum = 0;
			for(int j = 0; j < students.size(); j++){
				sum += scores.get(j).get(i);
			}
			sumSub.add(sum);
			avgSub.add(Math.round(((double)sumSub.get(i)/students.size())*100)/100.0);
		}
		
		//석차정렬
		for(int i = 0; i < rank.size(); i++){
			int min = i;
			for(int j = i+1; j < rank.size(); j++){
				if(rank.get(min) > rank.get(j)){
					min = j;
				}
			}
			students.set(min, students.set(i, students.get(min))); //학생이름 정렬
			scores.set(min, scores.set(i, scores.get(min))); // 성적 정렬
			sumStudent.set(min, sumStudent.set(i, sumStudent.get(min))); // 합계 정렬
			avgStudent.set(min, avgStudent.set(i, avgStudent.get(min))); // 평균 정렬
			rank.set(min, rank.set(i, rank.get(min))); // 평균 정렬
			
			
		}
		
		
		//=======  출력문 ============//
		for(int i = 0; i < subject.size(); i++){
			System.out.print("\t" + subject.get(i));
		}
		System.out.println("\t합계\t평균\t석차");
		
		for(int i = 0; i < students.size(); i++){
			System.out.print(students.get(i) + "\t");
			for(int j = 0 ; j < subject.size(); j++){
				System.out.print(scores.get(i).get(j) + "\t");
			}
			System.out.println(sumStudent.get(i) + "\t" + avgStudent.get(i) + "\t" + rank.get(i));
		}
				
		System.out.print("과목 합계");
		for(int i = 0; i < sumSub.size(); i++){
			System.out.print("\t" + sumSub.get(i));
		}
		System.out.println();
		System.out.print("과목 평균");
		for(int i = 0; i < avgSub.size(); i++){
			System.out.print("\t" + avgSub.get(i));
		}
	
		
		
		
		//과제 교재 컬렉션 부분 196쪽부터 213쪽까지 읽어보세요. 네
		
	}

		
}



























