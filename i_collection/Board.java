package i_collection;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {
	
	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고, 조회, 등룩, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 글번호(pk), 제목, 작성자, 작성일
		 * 
		 * 글번호 		제목		작성자		작성일
		 * 
		 * 1		대충제목	홍길동		07-23
		 * 2		대충제목	홍길동		07-23
		 * 3		대충제목	홍길동		07-23
		 * 
		 * 1.조회		2.등록		3.종료
		 * 
		 * 
		 * 글번호 	제목			
		 * 작성자			 	 작성일
		 * 내용
		 */
				
		
		
		ArrayList<HashMap<String, String>> board = new ArrayList<>();
		int pkn = 0;
		board.add(new HashMap<String, String>());
		board.get(0).put("pk", String.valueOf(++pkn));
		board.get(0).put("title", "대충 쓸데없는 제목");
		board.get(0).put("writer", "백길동");
		board.get(0).put("contents", "대충 쓸데없이 적어놓은 내용");
		board.get(0).put("date", "20-07-21");
		board.add(new HashMap<String, String>());
		board.get(1).put("pk", String.valueOf(++pkn));
		board.get(1).put("title", "대충 어그로 끄는 제목");
		board.get(1).put("writer", "홍길동");
		board.get(1).put("contents", "대충 어그로 끄는 내용");
		board.get(1).put("date", "20-07-22");
		board.add(new HashMap<String, String>());
		board.get(2).put("pk", String.valueOf(++pkn));
		board.get(2).put("title", "홍길동 보아라");
		board.get(2).put("writer", "청길동");
		board.get(2).put("contents", "어그로 끌지 마라 ㅡㅡ");
		board.get(2).put("date", "20-07-23");
		
		
		Board :
		while(true){
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("==============================================");
			System.out.println("글번호\t        제목\t\t작성자\t    작성일");
			if(board.size() > 0){
				for(int i = board.size()-1; i >= 0; i--){
					System.out.print(board.get(i).get("pk") + "\t" + board.get(i).get("title") + "\t" + board.get(i).get("writer") + "\t" + board.get(i).get("date"));
					System.out.println();
				}
			}
			System.out.println("==============================================");
			System.out.println("1.조회\t2.등록\t0.종료");
			System.out.println("\n\n\n\n\n\n\n\n\n");
			String input = ScanUtil.nextLine();
			if(input.equals("0")){
				System.out.println("게시판을 나갑니다.");
				System.exit(0);
			} else if(input.equals("1")){
				reader(board);
			} else if(input.equals("2")){
				insert(board,++pkn);
				
			
			}
			
		}
	
	
	}
	
	
	private static void insert(ArrayList<HashMap<String, String>> board, int pkn) {
		while(true){
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("==============================================");
			System.out.println("제목 : ");
			System.out.println("작성자 : ");
			System.out.println("----------------------------------------------");
			System.out.println("\t\t        내용\t\t");
			System.out.println("> ");
			System.out.println("==============================================");
			System.out.println("0.취소");
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println(">>> 제목을 입력하세요 <<<");
			String input = ScanUtil.nextLine();
			if(input.equals("0")){
				break;
			} else {
				String title = input;
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println("==============================================");
				System.out.println("제목 : " + title);
				System.out.println("작성자 : ");
				System.out.println("----------------------------------------------");
				System.out.println("\t\t        내용\t\t");
				System.out.println("> ");
				System.out.println("==============================================");
				System.out.println("0.취소");
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println(">>> 작성자 이름을 입력하세요 <<<");
				input = ScanUtil.nextLine();
				if(input.equals("0")){
					break;
				} else {
					String writer = input;
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println("==============================================");
					System.out.println("제목 : " + title);
					System.out.println("작성자 : " + writer);
					System.out.println("----------------------------------------------");
					System.out.println("\t\t        내용\t\t");
					System.out.println("> ");
					System.out.println("==============================================");
					System.out.println("0.취소");
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println(">>> 내용을 입력하세요 <<<");
					input = ScanUtil.nextLine();
					if(input.equals("0")){
						break;
					} else {
						String contents = input;
						System.out.println("\n\n\n\n\n\n\n\n\n");
						System.out.println("==============================================");
						System.out.println("제목 : " + title);
						System.out.println("작성자 : " + writer);
						System.out.println("----------------------------------------------");
						System.out.println("\t\t        내용\t\t");
						System.out.println("> " + contents);
						System.out.println("==============================================");
						System.out.println(">>> 등록하시겠습니까? <<<");
						System.out.println("1.등록\t0.취소");
						System.out.println("\n\n\n\n\n\n\n\n\n");
						
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else if(input.equals("1")) {
							Date today = new Date();
							SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd");
							board.add(new HashMap<String, String>());
							board.get(board.size()-1).put("pk", String.valueOf(pkn));
							board.get(board.size()-1).put("title", title);
							board.get(board.size()-1).put("writer", writer);
							board.get(board.size()-1).put("contents", contents);
							board.get(board.size()-1).put("date", sdf1.format(today));
							System.out.println("\n\n\n\n\n\n\n\n\n");
							System.out.println("등록되었습니다.");
							System.out.println("\n\n\n\n\n\n\n\n\n");
							stop(1000);
							break;
						}
					}
			
				}

			}
		
		}
		
	}


	private static void reader(ArrayList<HashMap<String, String>> board) {
		if(board.size() < 1){
			System.out.println("조회할 게시글이 없습니다.");
		} else{
			System.out.println(">>>조회할 글 번호를 입력하세요 <<<");
			int num = ScanUtil.nextInt();
			int ind = 0;
			for(int i = 0; i < board.size(); i++){
				if(board.get(i).containsValue(String.valueOf(num))){
					ind = i;
					break;
				} 
			}					
			while(true){
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println("==============================================");
				System.out.println("글번호 : " + board.get(ind).get("pk") + "\t\t\t   작성일 : " + board.get(ind).get("date"));
				System.out.println("제목 : " + board.get(ind).get("title"));
				System.out.println("작성자 : " + board.get(ind).get("writer"));
				System.out.println("----------------------------------------------");
				System.out.println("\t\t        내용\t\t");
				System.out.println("> " + board.get(ind).get("contents"));
				System.out.println("==============================================");
				System.out.println("1.수정\t2.삭제\t0.돌아가기");
				System.out.println("\n\n\n\n\n\n\n\n\n");
				String input = ScanUtil.nextLine();
				if(input.equals("0")){
					break;
				} else if(input.equals("2")){
					System.out.println(">>> 정말로 삭제하겠습니까? <<<");
					System.out.println("1.예\t2.아니오");
					input = ScanUtil.nextLine();
					if(input.equals("2")){
						continue;
					} else if(input.equals("1")){
						System.out.println("\n\n\n\n\n\n\n\n\n");
						System.out.println("삭제되었습니다");
						System.out.println("\n\n\n\n\n\n\n\n\n");
						board.remove(ind);
						stop(1000);
						break;
					}
				} else if(input.equals("1")){
					while(true){
						System.out.println("\n\n\n\n\n\n\n\n\n");
						System.out.println("==============================================");
						System.out.println("제목 : " + board.get(ind).get("title"));
						System.out.println("작성자 : " + board.get(ind).get("writer"));
						System.out.println("----------------------------------------------");
						System.out.println("\t\t        내용\t\t");
						System.out.println("> " + board.get(ind).get("contents"));
						System.out.println("==============================================");
						System.out.println("\n\n\n\n\n\n\n\n\n");
						System.out.println(">>> 수정할 부분을 입력하세요 <<<");
						System.out.println("1.제목\t2.내용\t0.취소");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						}else if (input.equals("1")){
							System.out.println(">>> 새로운 제목을 입력하세요 <<<");
							System.out.println("0.취소");
							input = ScanUtil.nextLine();
							if(input.equals("0")){
								continue;
							} else {
								String newTitle = input;
								System.out.println("\n\n\n\n\n\n\n\n\n");
								System.out.println("==============================================");
								System.out.println("제목 : " + newTitle);
								System.out.println("작성자 : " + board.get(ind).get("writer"));
								System.out.println("----------------------------------------------");
								System.out.println("\t\t        내용\t\t");
								System.out.println("> " + board.get(ind).get("contents"));
								System.out.println("==============================================");
								System.out.println("1.적용\t0.취소");
								System.out.println("\n\n\n\n\n\n\n\n\n");
								input = ScanUtil.nextLine();
								if(input.equals("0")){
									continue;
								} else if(input.equals("1")){
									board.get(ind).put("title", newTitle);
								}
							}
							
						} else if (input.equals("2")){
							System.out.println(">>> 새로운 내용을 입력하세요 <<<");
							System.out.println("0.취소");
							input = ScanUtil.nextLine();
							if(input.equals("0")){
								continue;
							} else {
								String newContents = input;
								System.out.println("\n\n\n\n\n\n\n\n\n");
								System.out.println("==============================================");
								System.out.println("제목 : " + board.get(ind).get("title"));
								System.out.println("작성자 : " + board.get(ind).get("writer"));
								System.out.println("----------------------------------------------");
								System.out.println("\t\t        내용\t\t");
								System.out.println("> " + newContents);
								System.out.println("==============================================");
								System.out.println("1.적용\t0.취소");
								System.out.println("\n\n\n\n\n\n\n\n\n");
								input = ScanUtil.nextLine();
								if(input.equals("0")){
									continue;
								} else if(input.equals("1")){
									board.get(ind).put("contents", newContents);
								}
							}
						}
						
					}
				}
			}
		}
		
	}


	static void stop(int interval) {
		try {
			Thread.sleep(interval);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
}














