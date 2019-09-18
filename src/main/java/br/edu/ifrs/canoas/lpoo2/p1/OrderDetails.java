package br.edu.ifrs.canoas.lpoo2.p1;

public class OrderDetails {
	
	private long id;
	private int quantity;
	private float subtotal;
	
	private Product product;

	public float calcTotalPrice() {
		if (product == null)
			return 0f;
		
		subtotal  = product.getUnitCost() * quantity;
		return subtotal;
				
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

	public float getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
