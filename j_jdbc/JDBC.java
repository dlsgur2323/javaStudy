package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class JDBC {

	public static void main(String[] args) {
		/*
		 * JDBC(Java Database Connectivity)
		 * - 자바와 데이터베이스를 연결해주는 라이브러리
		 * - ojdbc : 오라클 JDBC
		 * 
		 * JDBC 작성 단계
		 * 1. Connection 생성
		 * 2. Statement 생성(쿼리)
		 * 3. Query 실행
		 * 4. ResultSet에서 결과 추출(select인 경우)
		 * 5. ResultSet, Statement, Connection 닫기
		 * 
		 */
		
		//데이터베이스 접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			//DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			con = DriverManager.getConnection(url, user, password);
			//getConnection에서 드라이버 자동 로드
			
			String sql = "select * from emp";
			ps = con.prepareStatement(sql);
			
			//select인 경우
			rs = ps.executeQuery();
			
			//insert, update, delete인 경우, 실행하면 쿼리의 결과로 몇개의 행이 영향을 받았는지 반환해준다.
//			int result = ps.executeUpdate();
			
			//next()는 다음 줄이 있느냐 없느냐를 반환해줌
			System.out.println("empno\tename\tjob\tmgr\thiredate\tsal\tcomm\tdeptno");
			while(rs.next()){
				int empno = rs.getInt(1); //컬럼의 순서로 
				String ename = rs.getString("ename"); //컬럼의 이름으로
				String job = rs.getString("job"); //컬럼의 이름으로
				int mgr = rs.getInt(4); //컬럼의 순서로 
				Date hiredate = rs.getDate(5); //컬럼의 순서로 
				int sal = rs.getInt(6); //컬럼의 순서로 
				int comm = rs.getInt(7); //컬럼의 순서로 
				int deptno = rs.getInt(8); //컬럼의 순서로 
				
				System.out.print(empno + "\t" + ename + "\t" + job + "\t" + mgr + "\t" + hiredate + "\t" + sal + "\t" + comm + "\t" + deptno+"\n");
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close();} catch (Exception e) {}
			if(ps != null) try { ps.close();} catch (Exception e) {}
			if(con != null) try { con.close();} catch (Exception e) {}
		}
			
	}

}
















