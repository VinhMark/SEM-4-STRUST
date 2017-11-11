package entities;

public class Product {
	private String id;
	private String name ;
	private double price ;
	private String quantity ;
	private String photo;
	
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public  double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String  getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public Product(String id, String name, double price, String quantity ,String photo) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.photo = photo;
	}
	public Product() {
		super();
	}
	
	
}
