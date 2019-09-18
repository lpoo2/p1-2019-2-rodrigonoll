package br.edu.ifrs.canoas.lpoo2.p1;

import java.util.Date;

public class Order {
	
	private long id;
	private Date dateCreated;
	private Date dateShipped;
	private String status;
	
	private Customer customer;
	private OrderDetails details;
	
	
	public boolean placeOrder() {
		this.dateShipped = new Date();
		this.status = "sent";
		return true;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getDateCreated() {
		return dateCreated;
	}


	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}


	public Date getDateShipped() {
		return dateShipped;
	}


	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public OrderDetails getDetails() {
		return details;
	}


	public void setDetails(OrderDetails details) {
		this.details = details;
	}
	
	
	

}
