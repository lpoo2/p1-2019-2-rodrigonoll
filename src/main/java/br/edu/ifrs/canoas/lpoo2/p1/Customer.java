package br.edu.ifrs.canoas.lpoo2.p1;

public class Customer extends User{
	
	private String customerName;
	private String address;
	private String creditCardInfo;
	private String shippingInfo;
	
	public static Customer register (String customerName, String address, String email) {
		Customer customer = new Customer();
		customer.setCustomerName(customerName);
		customer.setEmail(email);
		customer.setAddress(address);				
		return customer;
	}
	
	public void login() {
		super.loginStatus = "online";
	}
	
	public boolean updateProfile (String customerName, String address, String email) {
		
		if (customerName == null || address == null || email == null) {
			return false;
		}
		
		this.customerName = customerName;
		this.address = address;				
		super.setEmail(email);

		return true;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}

	public String getShippingInfo() {
		return shippingInfo;
	}

	public void setShippingInfo(String shippingInfo) {
		this.shippingInfo = shippingInfo;
	}
	
	
	
	

}
