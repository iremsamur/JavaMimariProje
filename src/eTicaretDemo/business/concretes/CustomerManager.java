package eTicaretDemo.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.CustomerService;
import eTicaretDemo.core.GoogleEnterService;
import eTicaretDemo.core.MailService;
import eTicaretDemo.dataAccess.abstracts.CustomerDao;
import eTicaretDemo.entities.concretes.Customer;

public class CustomerManager implements CustomerService{
	private CustomerDao customerDao;
	private MailService mailService;
	private GoogleEnterService googleService;

	public CustomerManager(CustomerDao customerDao,MailService mailService,GoogleEnterService googleService) {
		super();
		this.customerDao = customerDao;
		this.mailService = mailService;
		this.googleService = googleService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if((customer.getParola().length()>=6 && mailKontrol(customer.getMailAdres())==true && mailKontrol2(customer.getMailAdres())==false && 
				customer.getAd().length()>=2 && customer.getSoyad().length()>=2) || this.googleService.enter()==true){
			if(this.mailService.verify()==true) {
				System.out.println("Mail doðrulandý.");
				this.customerDao.uyeEkle(customer);
			}
			else {
				System.out.println("E postayý doðrulamanýz gerekmektedir!!");
			}
			
			
		}
		else {
			System.out.println("Üyelik iþlemi tamamlanamadý");
		}
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean mailKontrol(String mailAdres) {
		// TODO Auto-generated method stub
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		 
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mailAdres);
		if(matcher.matches()==true) {
			return true;
		}
		else {
			return false;
		}
		
		 
 
	}

	@Override
	public boolean mailKontrol2(String mailAdres) {
		// TODO Auto-generated method stub
		boolean kontrol=true;
		List<Customer> yeniListe=null;
		yeniListe = this.customerDao.getAll();
		if(yeniListe != null){
            
            for(Customer yeni : yeniListe){
               
                if(yeni.getMailAdres().contains(mailAdres)) {
                	
                	kontrol=true;
                }
                else {
                	kontrol=false;
                }
                
                
               
            
        }
		}
		if(kontrol==true) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public void uyeGirisi(Customer customer) {
		// TODO Auto-generated method stub
		if(uyeGirisKontrol(customer.getMailAdres(),customer.getParola())==true) {
			System.out.println("Baþarýlý üye giriþi");
			
		}
		else {
			System.out.println("Mail adresi veya parola hatalý!!");
		}
		
		
	}

	@Override
	public boolean uyeGirisKontrol(String mail, String parola) {
		// TODO Auto-generated method stub
		boolean kontrol=true;
		List<Customer> yeniListe=null;
		yeniListe = this.customerDao.getAll();
		if(yeniListe != null){
           
            for(Customer yeni : yeniListe){
               
                if(yeni.getMailAdres().contains(mail) && yeni.getParola().contains(parola)) {
                	
                	kontrol=true;
                }
                else {
                	kontrol=false;
                }
                
                
               
            
        }
		}
		if(kontrol==true) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
