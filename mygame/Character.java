package mygame;


public class Character {
	String name; 	//이름
	int maxHp;		//최대 체력
	int maxMp;		//최대 마나
	int hp;			//체력
	int mp;			//마나
	int att;		//공격력
	int def; 		//방어력
	int level;		//레벨
	int exp;		//경험치
	Item[] items;	//보유아이템
	
	int x; // 캐릭터의 x좌표
	int y; // 캐릭터의 y좌표
	Maps map; //캐릭터의 현재 맵
	
	
	Character(String name, Maps map){
		this.name = name;
		maxHp = 100;
		maxMp = 50;
		hp = maxHp;
		mp = maxMp;
		att = 1;
		def = 1;
		level = 1;
		exp = 0;
		items = new Item[10];
		x = 10;
		y = 10;
		this.map = map;
		
	}
	
	void move(String input, Maps m, Character c){
		if(input.equals("s") && m.map[y+1][x] == " "){
			c.y += 1;
		} else if(input.equals("w") && m.map[y-1][x] == " "){
			c.y -= 1;
		} else if(input.equals("a") && m.map[y][x-1] == " "){
			c.x -= 1;
		} else if(input.equals("d") && m.map[y][x+1] == " "){
			c.x += 1;
		}
		
	}
	
}


















