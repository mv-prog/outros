package model;

public class Role {
	private String email;
	private String rolename;
	public Role(String email, String rolename) {
		super();
		this.email = email;
		this.rolename = rolename;
	}
	public Role() {
	
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
}
