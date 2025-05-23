package main;
public class SMSMessage extends Message {
	
	public SMSMessage(ILogin smsLogin, String sender, String recipient, String message) {
		super(smsLogin, sender,recipient, message);
	
	}

	@Override
	public boolean send(String name, String psw) {
		if (login.authenticate(name, psw)) {
            System.out.println("SMS sent from " + sender + " to " + recipient + ": " + content);
            return true;
        } else {
            System.out.println("SMS authentication failed for user: " + name);
            return false;
        }
	}
	

}
