package org.lessons.java.shop;

public class Prodotto {

	private int code;
	private String name;
	private String text;
	private double price;
	private double vat;
	
	public int getCode(){
		return code;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getText(){
		return text;
	}
	public void setText(String text){
		this.text = text;
	}
	public double getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public double getVat(){
		return vat;
	}
	public void setVat(int vat){
		this.vat = vat;
	}
}
