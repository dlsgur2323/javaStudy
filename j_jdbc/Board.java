package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {


	
	public static void main(String[] args) {
		/*
		 * 오라클 데이터베이스에 게시판 테이블을 생성하고, 게시판 프로그램을 만들어주세요.
		 * 테이블 : TB_JDBC_BOARD
		 * 컬럼 : BOARD_NO, TITLE, CONTENT, USER_ID, REG_DATE
		 */
		while(true){
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("==============================================");
			System.out.println("\n");
			System.out.println("\t\t 환영합니다.");
			System.out.println("\t1.로그인\t2.회원가입\t0.종료");
			System.out.println("\n");
			System.out.println("==============================================");
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.print("입력>");
			String input = ScanUtil.nextLine();
			if(input.equals("0")){
				System.out.println("종료되었습니다.");
				System.exit(0);
			} else if(input.equals("2")){
				newid = " ";
				newas = " ";
				newpas = " ";
				while(true){
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println("==============================================");
					System.out.println("\n");
					System.out.println("아이디(로그인에 사용) : " + newid);
					System.out.println("별명 : " + newas);
					if(newpas.equals(" ")){
						System.out.println("패스워드 : " + newpas);						
					} else {
						System.out.print("패스워드 : ");
						for(int i = 1; i <= newpas.length(); i++){
							System.out.print("*");
						}
						System.out.println();
					}
					System.out.println("\n");
					System.out.println("==============================================");
					System.out.println("\n\n");
					System.out.println("\n\n\n\n\n\n\n");
					if(newid.equals(" ")){
						System.out.println("아이디를 입력해 주세요");
						System.out.println("0.취소");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else {
							setid(input);
						}
					} else if(newas.equals(" ")){
						System.out.println("별명을 입력해 주세요");
						System.out.println("0.취소");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else {
							setas(input);
						}
					} else if(newpas.equals(" ")){
						System.out.println("비밀번호를 입력해 주세요");
						System.out.println("0.취소");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else {
							newpas = input;
						}
					} else {
						System.out.println("회원가입을 완료하겠습니까?");
						System.out.println("1.확인\t0.취소");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else if(input.equals("1")){
							makeId(newid, newas, newpas);
							break;
						}
					}
				}
			} else if(input.equals("1")) {
				logid = " ";
				logpas = " ";
				while(true){
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println("==============================================");
					System.out.println("\n");
					System.out.println("아이디(로그인에 사용) : " + logid);
					if(logpas.equals(" ")){
						System.out.println("패스워드 : " + logpas);						
					} else {
						System.out.print("패스워드 : ");
						for(int i = 1; i <= logpas.length(); i++){
							System.out.print("*");
						}
						System.out.println();
					}
					System.out.println("\n");
					System.out.println("==============================================");
					System.out.println("\n\n");
					System.out.println("\n\n\n\n\n\n\n");
					if(logid.equals(" ")){
						System.out.println("아이디를 입력하세요");
						System.out.println("0.취소");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else {
							logid = input;
						}
						 
					} else if(logpas.equals(" ")){
						System.out.println("비밀번호를 입력하세요");
						System.out.println("0.취소");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else {
							logpas = input;
						}
					} else {
						System.out.println("로그인 하겠습니까?");
						System.out.println("1.확인\t0.취소");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("0")){
							break;
						} else if(input.equals("1")){
							login(logid, logpas);
							if(logInId.equals(null)){
								break;
							} else {
								Board :
									while(true){
										System.out.println("\n\n\n\n\n\n\n\n\n");
										System.out.println("별명 : " + logInas);
										System.out.println("==============================================");
										System.out.println("글번호\t        제목\t\t작성자\t    작성일");
										showTable();
										System.out.println("==============================================");
										System.out.println("1.조회\t2.등록\t0.종료");
										System.out.print("입력>");
										System.out.println("\n\n\n\n\n\n\n\n\n");
										input = ScanUtil.nextLine();
										if(input.equals("0")){
											System.out.println("게시판을 나갑니다.");
											System.exit(0);
										} else if(input.equals("1")){
											reader();
										} else if(input.equals("2")){
											insert();
											
										}
									}
							}
						}
					}
				}
			
			}	
			
		}
		
	}
	static String logInId =null;
	static String logInas =null;
	
	private static void login(String logid2, String logpas2) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM my_users WHERE userid = ? AND pass = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, logid2);
			ps.setString(2, logpas2);
			rs = ps.executeQuery();
			while(rs.next()){
				if(rs.getString("userid").equals(null)){
					System.out.println("잘못된 아이디 또는 패스워드 입니다");
					break;
				}
				logInId = rs.getString("userid");
				logInas = rs.getString("usernm");
				System.out.println("어서오세요 " + logInas + "님!");
				stop(1000);
				break;
			}
				
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
		}
	}
	
	static String logid;
	static String logpas;
		
		
	private static void makeId(String newid, String newas, String newpas) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "INSERT INTO my_users"
					+ " VALUES (?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, newid);
			ps.setString(2, newas);
			ps.setString(3, newpas);
			ps.setDate(4, new Date(new java.util.Date().getTime()));
			ps.executeUpdate();
			System.out.println("회원가입 완료!");
			stop(1000);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
		}
	}

	private static void setas(String input) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT usernm"
					+ " FROM my_users";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			checker : 
			while(true){
				while(rs.next()){
					if(rs.getString(1).equals(input)){
						System.out.println("이미 있는 별명 입니다.");
						stop(1000);
						break checker;
					}
				}
				newas = input;
				break;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
		}
	}
	
	static String newid;
	static String newas;
	static String newpas;

	private static void setid(String input) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT userid"
					+ " FROM my_users";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			checker : 
			while(true){
				while(rs.next()){
					if(rs.getString(1).equals(input)){
						System.out.println("이미 있는 아이디 입니다.");
						stop(1000);
						break checker;
					}
				}
				newid = input;
				break;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
		}
		
	}


	static Object no = 0;
	static Object title = null;
	static Object content = null;
	static Object id = null;
	static Object date = null;
	private static void insert() {
		while(true){
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println("==============================================");
			System.out.println("제목 : ");
			System.out.println("작성자 : " + logInas);
			System.out.println("----------------------------------------------");
			System.out.println("\t\t        내용\t\t");
			System.out.println("> ");
			System.out.println("==============================================");
			System.out.println("0.취소");
			System.out.println("\n\n\n\n\n\n\n\n\n");
			System.out.println(">>> 제목을 입력하세요 <<<");
			System.out.print("입력>");
			String input = ScanUtil.nextLine();
			if(input.equals("0")){
				break;
			} else {
				String title = input;
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println("==============================================");
				System.out.println("제목 : " + title);
				System.out.println("작성자 : " + logInas);
				System.out.println("----------------------------------------------");
				System.out.println("\t\t        내용\t\t");
				System.out.println("> ");
				System.out.println("==============================================");
				System.out.println("0.취소");
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println(">>> 내용을 입력하세요 <<<");
				System.out.print("입력>");
				input = ScanUtil.nextLine();
				if(input.equals("0")){
					break;
				} else {
					String contents = input;
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.println("==============================================");
					System.out.println("제목 : " + title);
					System.out.println("작성자 : " + logInas);
					System.out.println("----------------------------------------------");
					System.out.println("\t\t        내용\t\t");
					System.out.println("> " + contents);
					System.out.println("==============================================");
					System.out.println(">>> 등록하시겠습니까? <<<");
					System.out.println("1.등록\t0.취소");
					System.out.println("\n\n\n\n\n\n\n\n\n");
					System.out.print("입력>");
					input = ScanUtil.nextLine();
					if(input.equals("0")){
						break;
					} else if(input.equals("1")) {
						newContent(title, contents);
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

	private static void newContent(String title, String contents) {
		//데이터베이스 접속정보
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "dlsgur";
				String password = "java";
					
				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				int pkn = 0;
				try {
					con = DriverManager.getConnection(url, user, password);
					String sql = "SELECT *"
							+ " FROM pk_num"
							+ " WHERE please = 1";
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					while(rs.next()){
						pkn = rs.getInt("pknum");
					}
					
					sql = "INSERT INTO tb_jdbc_board"
							+ " VALUES (?, ?, ?, ?, ?)";
					ps = con.prepareStatement(sql);
					ps.setLong(1, pkn);
					ps.setString(2, title);
					ps.setString(3, contents);
					ps.setString(4, logInas);
					ps.setDate(5, new Date(new java.util.Date().getTime()));
					ps.executeUpdate();
					
					sql = "UPDATE pk_num SET pknum = ?"
							+ "WHERE please = 1";
					ps = con.prepareStatement(sql);
					pkn += 1;
					ps.setLong(1, pkn);
					ps.executeUpdate();
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					if(rs != null) try { rs.close();} catch (Exception e) {}
					if(ps != null) try { ps.close();} catch (Exception e) {}
					if(con != null) try { con.close();} catch (Exception e) {}
				}
	}

	private static void reader() {
			System.out.println(">>>조회할 글 번호를 입력하세요 <<<");
			System.out.print("입력>");
			int num = ScanUtil.nextInt();
			
			
			while(true){
				//데이터베이스 접속정보
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "dlsgur";
				String password = "java";
				
				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				try {
					con = DriverManager.getConnection(url, user, password);
					String sql = "SELECT *"
							+ " FROM tb_jdbc_board"
							+ " WHERE board_no = ?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, num);
					rs = ps.executeQuery();
					while(rs.next()){
						no = rs.getInt(1);
						title = rs.getString(2);
						content = rs.getString(3);
						id = rs.getString(4);
						date = rs.getDate(5);
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}finally {
					if(rs != null) try { rs.close();} catch (Exception e) {}
					if(ps != null) try { ps.close();} catch (Exception e) {}
					if(con != null) try { con.close();} catch (Exception e) {}
				}
				SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd");
				System.out.println("\n\n\n\n\n\n\n\n\n");
				System.out.println("==============================================");
				System.out.println("글번호 : " + no + "\t\t\t   작성일 : " + sdf1.format(date));
				System.out.println("제목 : " + title);
				System.out.println("작성자 : " + id);
				System.out.println("----------------------------------------------");
				System.out.println("\t\t        내용\t\t");
				System.out.println("> " + content);
				System.out.println("==============================================");
				System.out.println("1.수정\t2.삭제\t0.돌아가기");
				System.out.println("\n\n\n\n\n\n\n\n\n");
				String input = ScanUtil.nextLine();
				if(input.equals("0")){
					break;
				} else if(input.equals("2")){
					if(logInas.equals(id)){
						System.out.println(">>> 정말로 삭제하겠습니까? <<<");
						System.out.println("1.예\t2.아니오");
						System.out.print("입력>");
						input = ScanUtil.nextLine();
						if(input.equals("2")){
							continue;
						} else if(input.equals("1")){
							remove(num);
							System.out.println("\n\n\n\n\n\n\n\n\n");
							System.out.println("삭제되었습니다");
							System.out.println("\n\n\n\n\n\n\n\n\n");
							stop(1000);
							break;
						}
					} else {
						System.out.println("작성자 외에는 삭제할 수 없습니다.");
						stop(1000);
						continue;
					}
				} else if(input.equals("1")){
					if(!logInas.equals(id)){
						System.out.println("작성자 외에는 삭제할 수 없습니다.");
						stop(1000);
						continue;
					} else {
						while(true){
							System.out.println("\n\n\n\n\n\n\n\n\n");
							System.out.println("==============================================");
							System.out.println("제목 : " + title);
							System.out.println("작성자 : " + id);
							System.out.println("----------------------------------------------");
							System.out.println("\t\t        내용\t\t");
							System.out.println("> " + content);
							System.out.println("==============================================");
							System.out.println("\n\n\n\n\n\n\n\n\n");
							System.out.println(">>> 수정할 부분을 입력하세요 <<<");
							System.out.println("1.제목\t2.내용\t0.취소");
							System.out.print("입력>");
							input = ScanUtil.nextLine();
							if(input.equals("0")){
								break;
							}else if (input.equals("1")){
								System.out.println(">>> 새로운 제목을 입력하세요 <<<");
								System.out.println("0.취소");
								System.out.print("입력>");
								input = ScanUtil.nextLine();
								if(input.equals("0")){
									continue;
								} else {
									String newTitle = input;
									System.out.println("\n\n\n\n\n\n\n\n\n");
									System.out.println("==============================================");
									System.out.println("제목 : " + newTitle);
									System.out.println("작성자 : " + id);
									System.out.println("----------------------------------------------");
									System.out.println("\t\t        내용\t\t");
									System.out.println("> " + content);
									System.out.println("==============================================");
									System.out.println("1.적용\t0.취소");
									System.out.println("\n\n\n\n\n\n\n\n\n");
									System.out.print("입력>");
									input = ScanUtil.nextLine();
									if(input.equals("0")){
										continue;
									} else if(input.equals("1")){
										titleUpdate(num, newTitle);
										break;
									}
								}
							} else if (input.equals("2")){
								System.out.println(">>> 새로운 내용을 입력하세요 <<<");
								System.out.println("0.취소");
								System.out.print("입력>");
								input = ScanUtil.nextLine();
								if(input.equals("0")){
									continue;
								} else {
									String newContents = input;
									System.out.println("\n\n\n\n\n\n\n\n\n");
									System.out.println("==============================================");
									System.out.println("제목 : " + title);
									System.out.println("작성자 : " + id);
									System.out.println("----------------------------------------------");
									System.out.println("\t\t        내용\t\t");
									System.out.println("> " + newContents);
									System.out.println("==============================================");
									System.out.println("1.적용\t0.취소");
									System.out.println("\n\n\n\n\n\n\n\n\n");
									System.out.print("입력>");
									input = ScanUtil.nextLine();
									if(input.equals("0")){
										continue;
									} else if(input.equals("1")){
										contentUpdate(num, newContents);
										break;
									}
								}
							}
						}	
					}
				}
			}
		}
		
	private static void titleUpdate(int num, String newTitle) {
		//데이터베이스 접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE tb_jdbc_board"
					+ " SET title = ?"
					+ " WHERE board_no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, newTitle);
			ps.setInt(2, num);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
		}
		
	}

	private static void contentUpdate(int num, String newTitle) {
		//데이터베이스 접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE tb_jdbc_board"
					+ " SET content = ?"
					+ " WHERE board_no = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, newTitle);
			ps.setInt(2, num);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
		}
		
	}

	private static void remove(int num) {
		//데이터베이스 접속정보
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "dlsgur";
				String password = "java";
					
				Connection con = null;
				PreparedStatement ps = null;
				ResultSet rs = null;
				
				try {
					con = DriverManager.getConnection(url, user, password);
					
					String sql = "DELETE tb_jdbc_board"
							+ " WHERE board_no = ?";
					ps = con.prepareStatement(sql);
					ps.setInt(1, num);
					ps.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					if(rs != null) try { rs.close();} catch (Exception e) {}
					if(ps != null) try { ps.close();} catch (Exception e) {}
					if(con != null) try { con.close();} catch (Exception e) {}
				}
		
	}

	private static void showTable(){
		//데이터베이스 접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd");
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT board_no, title, user_id, reg_date"
					+ " FROM tb_jdbc_board"
					+ " ORDER BY board_no DESC";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();
			
			while(rs.next()){
					Object value1 = rs.getObject("board_no");
					Object value2 = rs.getObject("title");
					Object value4 = rs.getObject("user_id");
					Date value5 = rs.getDate("reg_date");
					System.out.print(value1 + "\t" + value2 + "\t" + value4 + "\t" + sdf1.format(value5) + "\t");
				System.out.println();
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
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















