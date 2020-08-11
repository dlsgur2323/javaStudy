package mygame.mine_find;

public class Map {
	int sizeX;
	int sizeY;
	int mine;
	int[][] m;
	
	Map(int x, int y, int mine){
		sizeX = x;
		sizeY = y;
		this.mine = mine;
		m = new int[y][x];
	}
	
	void mapMaker(){ // 맵만들기
		for(int i = 0; i < mine; i++){//지뢰만들기
			m[(int)(Math.random()*sizeY-1)][(int)(Math.random()*sizeX-1)] = 9;
		}
		
		for(int i = 1; i < sizeY-1; i++){ //테두리를 제외한 내부
			for(int j = 1; j < sizeX-1; j++){
				int count = 0;
				if(m[i][j] != 9){
					if(m[i+1][j] == 9)count++;
					if(m[i+1][j+1] == 9)count++;
					if(m[i+1][j-1] == 9)count++;
					if(m[i][j+1] == 9)count++;
					if(m[i][j-1] == 9)count++;
					if(m[i-1][j+1] == 9)count++;
					if(m[i-1][j-1] == 9)count++;
					if(m[i-1][j] == 9)count++;
					m[i][j] = count;
				}
			}
		}
		for(int j = 1; j < sizeX -1; j++){ //위아래 테두리
			int count = 0;
			if(m[0][j] != 9){
				if(m[1][j] == 9)count++;
				if(m[1][j+1] == 9)count++;
				if(m[1][j-1] == 9)count++;
				if(m[0][j+1] == 9)count++;
				if(m[0][j-1] == 9)count++;
				m[0][j] = count;
			}
			if(m[sizeY-1][j] != 9){
				count = 0;
				if(m[sizeY-2][j] == 9)count++;
				if(m[sizeY-2][j+1] == 9)count++;
				if(m[sizeY-2][j-1] == 9)count++;
				if(m[sizeY-1][j+1] == 9)count++;
				if(m[sizeY-1][j-1] == 9)count++;
				m[sizeY-1][j] = count;				
			}
		}
		for(int j = 1; j < sizeY -1; j++){ //좌우 테두리
			int count = 0;
			if(m[j][0] != 9){
				if(m[j-1][0] == 9)count++;
				if(m[j+1][0] == 9)count++;
				if(m[j+1][1] == 9)count++;
				if(m[j-1][1] == 9)count++;
				if(m[j][1] == 9)count++;
				m[j][0] = count;
			}
			if(m[j][sizeX-1] != 9){
				count = 0;
				if(m[j-1][sizeX-1] == 9)count++;
				if(m[j+1][sizeX-1] == 9)count++;
				if(m[j+1][sizeX-2] == 9)count++;
				if(m[j-1][sizeX-2] == 9)count++;
				if(m[j][sizeX-2] == 9)count++;
				m[j][sizeX-1] = count;	
			}
		}
		if(m[0][0] != 9){ //네 꼭지점
			int count = 0;
			if(m[1][0] == 9)count++;
			if(m[1][1] == 9)count++;
			if(m[0][1] == 9)count++;
			m[0][0] = count;
		}
		if(m[0][sizeX-1] != 9){
			int count = 0;
			if(m[1][sizeX-1] == 9)count++;
			if(m[1][sizeX-2] == 9)count++;
			if(m[0][sizeX-2] == 9)count++;
			m[0][sizeX-1] = count;
		}
		if(m[sizeY-1][0] != 9){
			int count = 0;
			if(m[sizeY-2][0] == 9)count++;
			if(m[sizeY-2][1] == 9)count++;
			if(m[sizeY-1][1] == 9)count++;
			m[sizeY-1][0] = count;
		}
		if(m[sizeY-1][sizeX-1] != 9){
			int count = 0;
			if(m[sizeY-2][sizeX-1] == 9)count++;
			if(m[sizeY-2][sizeX-2] == 9)count++;
			if(m[sizeY-1][sizeX-2] == 9)count++;
			m[sizeY-1][sizeX-1] = count;
		}
	}
}




















