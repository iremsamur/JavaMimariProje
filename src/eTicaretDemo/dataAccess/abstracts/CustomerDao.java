package eTicaretDemo.dataAccess.abstracts;

import eTicaretDemo.entities.concretes.Customer;
import java.util.*;


public interface CustomerDao {

	void uyeEkle(Customer customer);
	void uyeSil(Customer customer);
	void uyeGuncelle(Customer customer);
	Customer get(int id);
	ArrayList<Customer> getAll();
}
