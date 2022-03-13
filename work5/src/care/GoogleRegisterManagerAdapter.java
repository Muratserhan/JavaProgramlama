package care;

mport java.util.ArrayList;

import eTrade.business.abstracts.VerificationService;

public class GoogleRegisterManagerAdapter implements VerificationService{
	ArrayList<String>verificatedEmails=new ArrayList<String>();
	@Override
	public void sendVerifyMail(String email) {
	System.out.println(email + " mailine doğrulama kodu yollandı.");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		if(verificatedEmails.contains(email))
			return true;
		return false;
	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
		System.out.println(" Mail doğrulandı");
		
	}

}