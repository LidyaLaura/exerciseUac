package main;
public class BasicLogin implements ILogin {
	String name;
	String psw;
	public BasicLogin(String name, String psw) {
		super();
		this.name = name;
		this.psw = psw;
	}
	@Override
	public boolean authenticate(String username, String password) {
		return this.name.equals(username) && this.psw.equals(password);
	}
}
