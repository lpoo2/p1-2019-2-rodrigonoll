package br.edu.ifrs.canoas.lpoo2.p1;


import static org.assertj.core.api.Assertions.*;


import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

public class ShoppingCartTest {
	

	ShoppingCart cart;
	Product product;

	@Before
	public void setup() {
		cart = new ShoppingCart();
		product = new Product();
		product.setName("Televisao");
	}

	
	@Test
	public void testAddCartItem() {
		//Given
		
		//When
		ShoppingCart myCart = ShoppingCart.addCartItem(product, 2);
		
		//then
		assertThat(myCart.getProduct().getName()).isEqualTo("Televisao");
		assertThat(myCart.getQuantity()).isEqualTo(2);
		
	}

	@Test
	public void testUpdateQuantity() {
		//given 
		assertThat(cart.getQuantity()).isEqualTo(0);
		
		//when 
		cart.updateQuantity(2);
		
		//Then
		assertThat(cart.getQuantity()).isEqualTo(2);
	}

	
	@Test
	public void testCheckout() {
		//given 
		Customer customer = new Customer();
		customer.setCustomerName("Rodrigo");
		
		cart.setCustomer(customer);
		cart.setProduct(product);
		cart.setQuantity(3);
		
		//When
		Order order = cart.checkout();
		
		//Then
		assertThat(order.getCustomer().getCustomerName()).isEqualTo("Rodrigo");
		assertThat(order.getDateCreated()).isNotNull();
		assertThat(order.getDetails().getProduct().getName()).isEqualTo("Televisao");
		assertThat(order.getDetails().getQuantity()).isEqualTo(3);
	}

}
