package member;

public class MemberDTO {
	
	private String id;
	private String pwd;
	private String name;
	private String tel;
	
	private boolean clang;
	private boolean cpp;
	private boolean phyton;
	private boolean java;
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
	public boolean isClang() {
		return clang;
	}
	public void setClang(boolean clang) {
		this.clang = clang;
	}
	public boolean isCpp() {
		return cpp;
	}
	public void setCpp(boolean cpp) {
		this.cpp = cpp;
	}
	public boolean isPhyton() {
		return phyton;
	}
	public void setPhyton(boolean phyton) {
		this.phyton = phyton;
	}
	public boolean isJava() {
		return java;
	}
	public void setJava(boolean java) {
		this.java = java;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	

}
