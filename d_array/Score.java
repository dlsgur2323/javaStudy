package d_array;

import java.util.Arrays;

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
		
		int[][] scores = new int[25][7]; //[학생수][과목수]
		String[] sub = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java", "합계", "평균", "석차"}; //[국어~석차까지] 상단 표
	
		String[] student = {"강지원", "김동민", "김동희", "김민지", "김용진", "김인혁", "김진용", "박범영", "박병규",
							"배현태", "심민규", "여인욱", "이나정", "이승민", "이영섭", "이윤혜", "이지향", "임정혁",
							"임형묵", "장성보", "정선영", "정회립", "차경석", "최준영", "허지영"}; //[학생수] 학생이름
		
		int[] sumStudent = new int[scores.length]; //[학생수] 학생별 총검
		double[] avgStudent = new double[scores.length]; //[학생수] 학생별 평균
		int[] rank = new int[scores.length]; //[학생수] 석차
		int[] sumSub = new int[scores[0].length]; //[과목수] 과목별 합계
		double[] avgSub = new double[scores[0].length]; //[과목수] 과목별 평균
		
		// 학생별 점수, 총점, 평균 구하기
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				scores[i][j] = (int)(Math.random()*101);
				sumStudent[i] += scores[i][j];
			}
			avgStudent[i] = Math.round(((double)sumStudent[i] / scores[i].length)*100) /100.0;
		}
		
		
		//과목별 합계, 평균 구하기
		for(int i = 0; i < scores[i].length; i++){
			for(int j = 0; j < scores.length; j++){
				sumSub[i] += scores[j][i];
			}
			avgSub[i] = Math.round(((double)sumSub[i] / scores.length)*100) /100.0;
		}
		
		
		//석차구하기
		for(int i = 0; i < rank.length; i++){
			rank[i] = 1;
			for(int j = 0; j < sumStudent.length; j++){
				if(sumStudent[i] < sumStudent[j]){
					rank[i]++; 
				}
			}
		}
		
		
		// 출력부분 test (정렬 작동하는지 비교하기 위함)
//			for(int i = 0; i < sub.length; i++){
//				System.out.print("\t" + sub[i]);
//				}
//				System.out.println();
//				for(int i = 0; i < student.length; i++){
//					System.out.print(student[i] + "\t");
//					for(int j = 0; j < scores[i].length; j++){
//						System.out.print(scores[i][j] + "\t");
//					}
//					System.out.print(sumStudent[i] + "\t" + avgStudent[i] + "\t" + rank[i]);
//					System.out.println();
//				}
//				System.out.print("과목합계" + "\t");
//				for(int i = 0; i < sumSub.length; i++){
//					System.out.print(sumSub[i] + "\t");
//				}
//				System.out.println();
//				System.out.print("과목평균" + "\t");
//				for(int i = 0; i < avgSub.length; i++){
//					System.out.print(avgSub[i] + "\t");
//				}
//		System.out.println();
			
		//석차로 정렬
		for(int i = 0; i < rank.length; i++){
			int min = i;
			for(int j = i+1; j < rank.length; j++){
				if(rank[min] > rank[j]){
					min = j;
				}
			}
			//석차 정렬
			int temp = rank[min];
			rank[min] = rank[i];
			rank[i] = temp;
			//학생 정렬
			String temps = student[min];
			student[min] = student[i];
			student[i] = temps;
			//합계, 평균 정렬
			temp = sumStudent[min];
			sumStudent[min] = sumStudent[i];
			sumStudent[i] = temp;
			double temp2 = avgStudent[min];
			avgStudent[min] = avgStudent[i];
			avgStudent[i] = temp2;
			//점수 정렬
			for(int k = 0; k < scores[i].length; k++){
				temp = scores[min][k];
				scores[min][k] = scores[i][k];
				scores[i][k] = temp;
			}
		}
			
		// 출력부분
		for(int i = 0; i < sub.length; i++){
			System.out.print("\t" + sub[i]);
		}
		System.out.println();
		for(int i = 0; i < student.length; i++){
			System.out.print(student[i] + "\t");
			for(int j = 0; j < scores[i].length; j++){
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print(sumStudent[i] + "\t" + avgStudent[i] + "\t" + rank[i]);
			System.out.println();
		}
		System.out.print("과목합계" + "\t");
		for(int i = 0; i < sumSub.length; i++){
			System.out.print(sumSub[i] + "\t");
		}
		System.out.println();
		System.out.print("과목평균" + "\t");
		for(int i = 0; i < avgSub.length; i++){
			System.out.print(avgSub[i] + "\t");
		}
		
		
	}

}








