package mygame.mine_find;

public class User {
	int[][] location;
	int[][] check;
	int x;
	int y;
	
	
	User(Map m){
		location = new int[m.sizeY][m.sizeX];
		x = 4;
		y = 4;
		location[y][x] = 1;
		check = new int[m.sizeY][m.sizeX];
	}
	
	void moving(String m){ // 커서 이동조작
		if(m == "w" && y != 0){
			location[y][x] = 0;
			y -= 1;
			location[y][x] = 1;
		} else if(m == "a" && x != 0){
			location[y][x] = 0;
			x -= 1;
			location[y][x] = 1;
		} else if(m == "s" && y != location.length-1){
			location[y][x] = 0;
			y += 1;
			location[y][x] = 1;
		} else if(m == "d" && x != location[y].length-1){
			location[y][x] = 0;
			x +=1 ;
			location[y][x] = 1;
		}
	}
	
	void select(Map level){// 선택
		check[y][x] = 1;
		if(level.m[y][x] == 0){
			if(y < level.m.length-1)
				check[y+1][x] = 1;
			if(y > 0)
				check[y-1][x] = 1;
			if(x < level.m[y].length-1)
				check[y][x+1] = 1;
			if(x > 0)
				check[y][x-1] = 1;
			if(y < level.m.length-1 && x < level.m[y].length-1)
				check[y+1][x+1] = 1;
			if(y < level.m.length-1 && x > 0)
				check[y+1][x-1] = 1;
			if(y > 0 && x < level.m[y].length-1)
				check[y-1][x+1] = 1;
			if(y > 0 && x > 0)
				check[y-1][x-1] = 1;
		}
	}
	
	void findZero(Map level){ // 주변에 0이 있으면 밝혀주는 기능
		for(int k = 0; k < level.m.length; k++){
			for(int i = 0 ; i < level.m.length; i++){
				for(int j = 0; j < level.m[i].length; j++){
					if(check[i][j] == 1 && level.m[i][j] == 0){
						if(i < level.m.length-1)
							check[i+1][j] = 1;
						if(i > 0)
							check[i-1][j] = 1;
						if(j < level.m[i].length-1)
							check[i][j+1] = 1;
						if(j > 0)
							check[i][j-1] = 1;
						if(i < level.m.length-1 && j < level.m[i].length-1)
							check[i+1][j+1] = 1;
						if(i < level.m.length-1 && j > 0)
							check[i+1][j-1] = 1;
						if(i > 0 && j < level.m[i].length-1)
							check[i-1][j+1] = 1;
						if(i > 0 && j > 0)
							check[i-1][j-1] = 1;
					}
				}
			}
		
		}
	
	}

	void flag(Map level){ // 깃발
		if(check[y][x] == 2){
			check[y][x] = 0;
		} else if(check[y][x] != 1){
			check[y][x] = 2;
		
		}
	}



}






