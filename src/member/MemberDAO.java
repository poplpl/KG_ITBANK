package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO {
	private String url = "jdbc:mysql://localhost:3306/jsp?serverTimezone=Asia/Seoul";
	private String user = "jsp", pwd="1234";
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	public MemberDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url,user,pwd);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	
	//로그인 유효성 검증 
	public int loginCheck(String id,String pw) {
		int loginFlag=0;
		String sql ="SELECT * FROM memberInfo WHERE id=?";
		
		try {
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return loginFlag;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
