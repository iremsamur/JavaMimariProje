package eTicaretDemo.business.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.Customer;


public interface CustomerService {
	void add(Customer customer);
	List<Customer> getAll();
	boolean mailKontrol(String mailAdres);
	boolean mailKontrol2(String mailAdres);
	void uyeGirisi(Customer customer);
	boolean uyeGirisKontrol(String mail,String parola);

}
