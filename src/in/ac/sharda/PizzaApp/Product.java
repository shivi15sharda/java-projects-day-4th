package in.ac.sharda.PizzaApp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {
	
	private int id, price;
	private String name, description;
	private Date expiry;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public Product(String string, String string2, int i, Date date) {
		// TODO Auto-generated constructor stub
	}
	public String list() {
		
		List<Product> products=new ArrayList<>();
		for(int i=1;i<21;i++) {
			products.add(new Product("Name"+i,"Description"+i,i*100,new Date()));
			}
		return "List";
	}

}
