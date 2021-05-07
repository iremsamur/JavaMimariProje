package eTicaretDemo.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTicaretDemo.dataAccess.abstracts.CustomerDao;
import eTicaretDemo.entities.concretes.Customer;

public class HibernateCustomerDao implements CustomerDao{

	@Override
	public void uyeEkle(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Üyelik iþlemi baþarýyla gerçekleþti !!"+customer.getAd());
		
	}

	@Override
	public void uyeSil(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void uyeGuncelle(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Customer> getAll() {
		// TODO Auto-generated method stub
		//veritabanýndan bilgi gelsin
		ArrayList<Customer> yeniListe=new ArrayList<>();
		Customer object;
		object =(new Customer(1,"Ýrem","Samur","123456","irem@gmail.com"));
		object = (new Customer(2,"Mert","Ata","123456","mertAta@gmail.com"));
		System.out.println(yeniListe.size());
		yeniListe.add(object);
		return yeniListe;
	}
	

}
