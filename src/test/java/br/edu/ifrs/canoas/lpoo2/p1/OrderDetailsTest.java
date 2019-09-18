package br.edu.ifrs.canoas.lpoo2.p1;

import static org.assertj.core.api.Assertions.*;


import org.junit.Before;
import org.junit.Test;

public class OrderDetailsTest {

	OrderDetails details;
	

	@Before
	public void setup() {
		details = new OrderDetails();
	}
	
	@Test
	public void testCalcTotalPrice() {
		//given
		assertThat(details.calcTotalPrice()).isEqualTo(0f);
		
		//when
		details.setQuantity(2);
		Product product = new Product();
		product.setUnitCost(4f);
		details.setProduct(product);
		
		//then
		assertThat(details.calcTotalPrice()).isEqualTo(8f); // 2 * 4
		assertThat(details.getSubtotal()).isEqualTo(8f); // 2 * 4
		
	}

}
