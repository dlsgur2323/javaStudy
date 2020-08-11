package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Date;

public class JDBC2 {

	public static void main(String[] args) {
		//데이터베이스 접속정보
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "dlsgur";
			String password = "java";
				
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			try {
				con = DriverManager.getConnection(url, user, password);
				
				String sql = "select *"
						+ " from cart"
						+ " where cart_member = ?"; //값을 동적으로 넣고 싶을때 ?를 사용
				ps = con.prepareStatement(sql);
				ps.setString(1, "a001");
				//ps.setInt()
				//ps.setObject() 같은 것들도 있다.
				
				
				rs = ps.executeQuery();
				
				ResultSetMetaData md =  rs.getMetaData(); //메타데이터 : 데이터에 대한 데이터
				
				int columnCount = md.getColumnCount(); //컬럼 수
				
				
				while(rs.next()){
					for(int i = 1; i <= columnCount; i++){
						Object value = rs.getObject(md.getColumnName(i));
						System.out.print(value + "\t");
					}
					System.out.println();
				}
				
				String sql2 = "INSERT INTO emp"
						+ " VALUES(9999, '김인혁', 'ANALYST', 7566, ?, 2500, NULL, 20)";
				ps = con.prepareStatement(sql2);
				ps.setDate(1, new Date(new java.util.Date().getTime()));;
				int result = ps.executeUpdate();
				System.out.println(result);
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(rs != null) try { rs.close();} catch (Exception e) {}
				if(ps != null) try { ps.close();} catch (Exception e) {}
				if(con != null) try { con.close();} catch (Exception e) {}
			}
			
				

	}

}












