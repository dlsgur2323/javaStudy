package mygame;

public class Maps {
	String name; //맵이름
	int sizeX; //맵 x축 크기
	int sizeY; //맵 y축 크기
	String[][] map; //맵 디자인? y,x
	
	Maps(String name,int sizeX, int sizeY){
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.map = new String[sizeY][sizeX];
		
		for(int i = 0; i < sizeY; i++){
			map[i][0] = "1";
			map[i][sizeX-1] = "1";
			for(int j = 1; j < sizeX-1; j++){
				if(i == 0 || i == sizeY-1){					
					map[i][j] = "1";
				} else {
					map[i][j] = " ";
				}
			}
		}
	}
	
	void showMap(Maps m, Character c){
		for(int i = 0; i < m.map.length; i++){
			for(int j = 0; j < m.map[i].length; j++){
				if(i == c.y && j == c.x){
					System.out.print("C");
				} else
				System.out.print(m.map[i][j]);
				}
			System.out.println();
			}
		}
	
	void mapMakerHomeTown(Maps m){
		for(int i = 0; i < 100; i++){
			m.map[(int)(Math.random()*(m.sizeY -1))+1][(int)(Math.random()*(m.sizeX -1))+1] = "1";
		}
	}
	
	
	
}

























