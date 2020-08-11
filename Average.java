
public class Average {

	public static void main(String[] args) {
		int[] numberList = new int[]{40, 35, 30, 25, 20, 15, 10};
		//간격의 평균 구하기                                       
		int sum = 0;
		for(int i = 0; i < numberList.length-1; i++){
			sum += (numberList[i] - numberList[i+1]);
		}
		double avg = (double)sum/(numberList.length-1);
		System.out.println("간격의 평균 : " + avg);
	}

}
