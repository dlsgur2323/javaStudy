package j_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {
	
	public static void main(String[] args) {	
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "dlsgur";
		String password = "java";
			
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT pknum"
					+ " FROM pk_num";
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()){
				int pkn = rs.getInt("pknum");
				System.out.println(pkn);
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












