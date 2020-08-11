package Test;

import e_oop.ScanUtil;

public class moving {
	//기본설정
	boolean power; //전원
	int volume; // 볼륨
	
	boolean menu; //메뉴화면
	boolean play; //재생화면
	boolean list; //목록화면
	
	{
		menu = false;
		play = false;
		list = false;
	}
	
	//전원부
	void power(){
		power = !power;
		System.out.println(power ? "" : "--------------------------------------\n             <<Power Off>>\n--------------------------------------");
	}
	
	
	//메인메뉴
	final int MENU_ROW = 3;
	final int MENU_COL = 2;
	void menu(){
		menu = true;
		play = false;
		list = false;
		
	//ui 부분
		showVolume();
		System.out.println("----------------[메인메뉴]---------------\n");

		System.out.print("\t노래재생");
		if(indexS[0][0] == 1){showSelect();}
		System.out.print("\t\t랜덤재생");
		if(indexS[1][0] == 1){showSelect();}
		System.out.print("\n\t노래목록");
		if(indexS[0][1] == 1){showSelect();}
		System.out.print("\t\t앨범목록");
		if(indexS[1][1] == 1){showSelect();}
		System.out.print("\n\t전원종료");
		if(indexS[0][2] == 1){showSelect();}
		
		System.out.println("\n\n--------------------------------------");
	//ui부분 end
	}
	int musicIndex;
	
	//재생화면
	void play(Music[] musics, int index){
		menu = false;
		list = false;
		play = true;
		musicIndex = index;
		showVolume();
		System.out.println("----------------[노래재생]---------------");
		System.out.println();
		System.out.println(musicIndex+1 + "." +musics[musicIndex].name + " - " + musics[musicIndex].singer);
		System.out.println("\t" + musics[musicIndex].album + "\n");
		System.out.print("0:0" + "\t\t " + musics[musicIndex].mTime/60 + ":");
		if(musics[musicIndex].mTime%60 < 10){
				System.out.println("0"+musics[musicIndex].mTime%60);
		} else {
			System.out.println(musics[musicIndex].mTime%60);
		}
		System.out.println();
		System.out.println("--------------------------------------");
	}	
	//재생중 표시 (ui 상단에 표시)
	
	
	
	//노래목록
	final int LIST_ROW = 3;
	final int LIST_COL = 1;
	void list(Music[] musics){
		menu = false;
		list = true;
		play = false;
		showVolume();
		System.out.println("----------------[노래목록]---------------\n");
		for(int i = 0; i < musics.length; i++){
			System.out.print(i+1 + "." + musics[i].name);
			if(indexS[0][i] == 1){showSelect();}
			System.out.println();
		}
		System.out.println();
		System.out.println("\n--------------------------------------");
		}
			
	

	
	//앨범목록
	
	//볼륨조절
	int MAX_VOLUME = 5;
	int MIN_VOLUME = 0;
	void volumeUp(){
			if(volume < MAX_VOLUME){
				volume++;
			}
	}
	void volumeDown(){
			if(MIN_VOLUME < volume){
				volume--;
			}
	}
	//볼륨표시
	void showVolume(){
		System.out.print("\t\t\t\t");
		for(int i = MAX_VOLUME - 1; i >= MIN_VOLUME; i--){
			if(i >= volume){
				System.out.print("□");
			}else{
				System.out.print("■");
			}
		}
		System.out.print(" Vo\n");
	}
	
	//배터리?
	
	//인덱스 스크롤
	int rowIndex = 0;
	int colIndex = 0;
	int[][] indexS = new int[2][3];
	{
		indexS[0][0] = 1;
	}
	int row;
	int col;
	
	void showSelect(){
		System.out.print(" <<");
		
	}
	
	void indexDown(){
		if(menu){
			row = MENU_ROW;
			col = MENU_COL;
		} else if(list){
			row = LIST_ROW;
			col = LIST_COL;
		}
		if(rowIndex == row-1){
			indexS[colIndex][rowIndex] = 0;
			indexS[colIndex][0] = 1;
			rowIndex = 0;
		} else {
			indexS[colIndex][rowIndex] = 0;
			indexS[colIndex][rowIndex+1] = 1;
			rowIndex++;
		}
	}
	void indexUp(){
		if(menu){
			row = MENU_ROW;
			col = MENU_COL;
		} else if(list){
			row = LIST_ROW;
			col = LIST_COL;
		}
		if(rowIndex == 0){
			indexS[colIndex][rowIndex] = 0;
			indexS[colIndex][row-1] = 1;
			rowIndex = row-1;
		} else {
			indexS[colIndex][rowIndex] = 0;
			indexS[colIndex][rowIndex-1] = 1;
			rowIndex--;
		}
	}
	void indexRigth(){
		if(menu){
			row = MENU_ROW;
			col = MENU_COL;
		} else if(list){
			row = LIST_ROW;
			col = LIST_COL;
		}
		if(colIndex == col-1){
			indexS[colIndex][rowIndex] = 0;
			indexS[0][rowIndex] = 1;
			colIndex = 0;
		} else {
			indexS[colIndex][rowIndex] = 0;
			indexS[colIndex+1][rowIndex] = 1;
			colIndex++;
		}
	}
	void indexLeft(){
		if(menu){
			row = MENU_ROW;
			col = MENU_COL;
		} else if(list){
			row = LIST_ROW;
			col = LIST_COL;
		}
		if(colIndex == 0){
			indexS[colIndex][rowIndex] = 0;
			indexS[col-1][rowIndex] = 1;
			colIndex = col-1;
		} else {
			indexS[colIndex][rowIndex] = 0;
			indexS[colIndex-1][rowIndex] = 1;
			colIndex--;
		}
	}
	// 스크롤 end
	// 인덱스 선택
	void select(Music[] musics){
		if(menu){ //메뉴에서
			if(indexS[0][0] == 1){ //노래재생 선택 
				play(musics,0);
			}
			
			if(indexS[1][0] == 1){ //랜덤재생 선택 
				play(musics,(int)(Math.random()*musics.length));
			}
				
			if(indexS[0][1] == 1){ //노래목록 선택
				indexS[colIndex][rowIndex] = 0;
				indexS[0][0] = 1;
				rowIndex = 0;
				colIndex = 0;
				list(musics);
			}
			
			if(indexS[1][1] == 1){ //앨범목록 선택 
				
			}
			if(indexS[0][2] == 1){ //전원종료 선택
				power();
			}
		}	
		else if(list){ //노래목록에서
				play(musics,rowIndex);
			}
		
	}
	
	
	public static void main(String[] args) {
		Music[] musics = new Music[3];
		Music music1 = new Music("당신을 위하여", "더크로스", "1집 Melody Quus", 243);
		Music music2 = new Music("비처럼 음악처럼", "김현식", "김현식 3집", 273);
		Music music3 = new Music("사랑했지만", "김광석", "김광석 2nd", 268);	
		
		musics[0] = music1;
		musics[1] = music2;
		musics[2] = music3;
		
		moving m = new moving();
		
		System.out.println("--------------------------------------\n");
		System.out.println();
		System.out.println("                ON?\n"                 );
		System.out.println();
		System.out.println("--------------------------------------");
		String input = ScanUtil.nextLine();
		if(input.equals("on") && m.power == false){
			m.power();
			m.menu = true;
			while(m.power){

				if(m.menu){
					m.menu();
				} else if (m.list){
					m.list(musics);
				} else if (m.play){
//					m.play(musics);
				}
				
				input =  ScanUtil.nextLine();
				if(m.menu || m.list){
					if(input.equals("e")){
						m.select(musics);
					}
					// 스크롤 부분 
					if(input.equals("s")){
						m.indexDown();
					}
					if(input.equals("w")){
						m.indexUp();
					}
					if(input.equals("d")){
						m.indexRigth();
					}
					if(input.equals("a")){
						m.indexLeft();
					}
					if(input.equals("q") && m.list){
						m.menu();
					}
				}
				if(m.play){
					if(input.equals("e")){
						
					}
					if(input.equals("d")){
						if(m.musicIndex < musics.length-1){
							m.play(musics,m.musicIndex+1);
						} else if (m.musicIndex == musics.length-1){
							m.play(musics,0);
						}
					}
					if(input.equals("a")){
						if(m.musicIndex > 0){
							m.play(musics,m.musicIndex-1);
						} else if (m.musicIndex == 0){
							m.play(musics,musics.length-1);
						}
					}
					if(input.equals("q")){
						m.menu();
					}
					
					
				}
				
				
				
			}
			
		}
		
	}
	
}
class Music{
	String name; //노래이름
	String singer; //가수명
	String album; //앨범명
	int mTime; //곡 시간(초 기준)
	
	Music(String nm, String sin, String al, int mTi){
		name = nm;
		singer = sin;
		album = al;
		mTime = mTi;
	}
}


















