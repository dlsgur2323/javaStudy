package mygame.mine_find;

public class View {
	
	int sizeX;
	int sizeY;
	String[][] m;
	
	View(Map level){
		sizeX = level.sizeX;
		sizeY = level.sizeY;
		m = new String[sizeX][sizeY];
	}
	
	void viewMaker(User user, Map level){ //화면출력
		for(int i = 0; i < sizeY; i++){
			for(int j = 0; j < sizeX; j++){
				if(user.location[i][j] == 1){
						System.out.print(" >");
					if (user.check[i][j] ==1){
						if(level.m[i][j] ==0){
							System.out.print(" ");
						} else{
							System.out.print(level.m[i][j]);
						}
					} else if(user.check[i][j] == 2){
						System.out.print("#");
					} else {
						System.out.print("□");
					}
					System.out.print("<");
				} else {
					System.out.print("  ");
					if (user.check[i][j] ==1){
						if(level.m[i][j] ==0){
							System.out.print(" ");
						} else{
							System.out.print(level.m[i][j]);
						}
					} else if(user.check[i][j] == 2){
						System.out.print("#");
					}else {
						System.out.print("□");
					}
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
	
}

