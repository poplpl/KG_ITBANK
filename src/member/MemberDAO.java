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
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				if(rs.getString("pwd").equals(pw)) {
					loginFlag=1;							 //아이디 비번 둘다 맞음 
					if(rs.getBoolean("admin")) loginFlag=2;  //관리자임
				}
				else loginFlag=0;								//비번 틀림 
				
			}
			else loginFlag =-1;									//아이디 없음
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return loginFlag;
	}
	
	//회원가입 
	public void signUp(MemberDTO dto) {
		
		//과목제외 다른정보들 일단 넣는다
		String sql = "insert into memberInfo(id,pwd,name,tel,admin) values(?,?,?,?,?)";
		
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPwd());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getTel());
			ps.setBoolean(5, dto.isAdmin());
			
			ps.executeUpdate();
			
			//과목 정보도 넣는다
			for(String sub:dto.getSubs()) {
				String sql2="update memberInfo set ? = true where id = ?";
				
				ps = con.prepareStatement(sql2);
				ps.setString(1, sub);
				ps.setString(2, dto.getId());
				ps.executeUpdate();

			}	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
