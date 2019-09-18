package br.edu.ifrs.canoas.lpoo2.p1;

import java.util.Date;

public class ShoppingCart {

	private long id;
	private int quantity;
	private Date dateAdded;
	
	private Customer customer;
	private Product product;

	public static ShoppingCart addCartItem(Product product, int quantity) {
		ShoppingCart cart = new ShoppingCart();
		cart.setProduct(product);
		cart.setQuantity(quantity);
		cart.setDateAdded(new Date());
		return cart;
	}

	public void updateQuantity(int quantity) {
		this.setQuantity(quantity);
	}

	public void viewCardDetails() {
		System.out.println("quantity: " + quantity + ", product: " + product.getName() + "...");
	}

	public Order checkout() {
		Order order = new Order();
		order.setDateCreated(new Date());
		order.setCustomer(this.customer);
		
		OrderDetails details = new OrderDetails();
		details.setQuantity(this.quantity);
		details.setProduct(this.product);
		
		order.setDetails(details);
		
		return order;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	

}
