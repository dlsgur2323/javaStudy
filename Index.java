
public class Index {

	public static void main(String[] args) {
		int[] arr = new int[]{1, 5, 2, 4, 8, 7, 15, 10};
		
//		arr배열에서 15 값이 있는지 확인해서 찾아서 출력(loop, if)
		boolean check = false;
		for(int i = 0; i < arr.length; i++){
			if(arr[i] == 15){
				check = true;
				System.out.println(arr[i]);
				break;
			}
		}
		if(!check){
			System.out.println("그 값이 존재하지 않습니다.");
		} 
	}

}
