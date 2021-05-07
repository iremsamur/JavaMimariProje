package eTicaretDemo.core;

import eTicaretDemo.verifyMail.PostalConfirmationManager;


public class MailManagerAdapter implements MailService{

	@Override
	public boolean verify() {
		// TODO Auto-generated method stub
		PostalConfirmationManager manager = new PostalConfirmationManager();
		
		return manager.verify();
	}
	

}
