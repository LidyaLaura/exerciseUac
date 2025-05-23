package main;
public class EmailMessage extends Message {

	
	public EmailMessage(ILogin emailLogin, String sender, String recipient, String message) {
		super(emailLogin,sender,recipient, message);
	}


	@Override
	public boolean send(String name, String psw) {
		if (login.authenticate(name, psw)) {
            System.out.println("Email sent from " + sender + " to " + recipient + ": " + content);
            return true;
        } else {
            System.out.println("Email authentication failed for user: " + name);
            return false;
        }
	}

}
