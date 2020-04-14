package member;

public class MemberDTO {
	
	private String id;
	private String pwd;
	private String name;
	private String tel;
	
	private String[] subs;
	private boolean admin;
	
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String[] getSubs() {
		return subs;
	}
	public void setSubs(String[] subs) {
		this.subs = subs;
	}
	
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	

}
