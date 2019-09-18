package br.edu.ifrs.canoas.lpoo2.p1;

import static org.assertj.core.api.Assertions.*;


import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

public class OrderTest {

	Order order;

	@Before
	public void setup() {
		order = new Order();
	}
	
	
	@Test
	public void testPlaceOrder() {
		//given
		assertThat(order.getStatus()).isNull();
		assertThat(order.getDateShipped()).isNull();
		
	
		//When
		order.placeOrder();
		
		//then
		assertThat(order.getStatus()).isEqualTo("sent");
		assertThat(order.getDateShipped()).isNotNull();
		
	}

}
