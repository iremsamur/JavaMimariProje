package eTicaretDemo.entities.concretes;

import eTicaretDemo.entities.abstracts.Entity;

public class Customer implements Entity{

	private int id;
	private String ad;
	private String soyad;
	private String parola;
	private String mailAdres;
	public Customer() {
		
	}
	public Customer(int id, String ad, String soyad, String parola, String mailAdres) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.parola = parola;
		this.mailAdres = mailAdres;
	}
	public Customer(String ad, String soyad, String parola, String mailAdres) {
		this.ad = ad;
		this.soyad = soyad;
		this.parola = parola;
		this.mailAdres = mailAdres;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getParola() {
		return parola;
	}
	public void setParola(String parola) {
		this.parola = parola;
	}
	public String getMailAdres() {
		return mailAdres;
	}
	public void setMailAdres(String mailAdres) {
		this.mailAdres = mailAdres;
	}
	
}
