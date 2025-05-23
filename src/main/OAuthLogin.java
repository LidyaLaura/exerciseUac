package main;
public class OAuthLogin implements ILogin {

	String token;
	
	public OAuthLogin(String token) {
		this.token= token;
	}

	@Override
	public boolean authenticate(String name, String psw){
		return this.token.equals(psw);
	}

}
