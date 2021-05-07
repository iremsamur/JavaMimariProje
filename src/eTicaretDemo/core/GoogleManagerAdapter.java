package eTicaretDemo.core;

import eTicaretDemo.googleEnter.GoogleControlManager;
import eTicaretDemo.verifyMail.PostalConfirmationManager;

public class GoogleManagerAdapter implements GoogleEnterService {

	@Override
	public boolean enter() {
		// TODO Auto-generated method stub
        GoogleControlManager manager = new GoogleControlManager();
		
		return manager.enter();
	}
	

}
