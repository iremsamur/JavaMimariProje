package eTicaretDemo;

import eTicaretDemo.business.abstracts.CustomerService;
import eTicaretDemo.business.concretes.CustomerManager;
import eTicaretDemo.core.GoogleManagerAdapter;
import eTicaretDemo.core.MailManagerAdapter;
import eTicaretDemo.dataAccess.concretes.HibernateCustomerDao;
import eTicaretDemo.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new HibernateCustomerDao(),new MailManagerAdapter(),new GoogleManagerAdapter());
		Customer customer = new Customer(3,"Merve","Deniz","merve@gmail.com","12345");
		customerService.add(customer);
		customerService.uyeGirisi(customer);
		Customer customer2 = new Customer(1,"Ýrem","Samur","irem@gmail.com","123456");
		customerService.add(customer2);
		customerService.uyeGirisi(customer2);
	}

}
