package br.edu.ifrs.canoas.lpoo2.p1;

import static org.assertj.core.api.Assertions.*;


import org.junit.Before;
import org.junit.Test;


import org.junit.Test;

public class CustomerTest {
	
	Customer customer;
	
	private static final String CUSTOMER_NAME = "name";
	private static final String ADDRESS = "address";
	private static final String EMAIL = "email";
	

	@Before
	public void setup() {
		customer = new Customer();
	}

	@Test
	public void testRegister() {
		//given
		
		//when 
		Customer customer = Customer.register(CUSTOMER_NAME, ADDRESS, EMAIL);
		
		//then
		assertThat(customer.getCustomerName()).isEqualTo(CUSTOMER_NAME);
		assertThat(customer.getAddress()).isEqualTo(ADDRESS);
		assertThat(customer.getEmail()).isEqualTo(EMAIL);
		
	}

	@Test
	public void testLogin() {
		//Given
		assertThat(customer.getLoginStatus()).isNull();
		
		//When
		customer.login();
		
		//Then
		assertThat(customer.getLoginStatus()).isEqualTo("online");
		
	}

	@Test
	public void testUpdateProfile() {
		//given
		assertThat(customer.getCustomerName()).isNull();
		assertThat(customer.getAddress()).isNull();
		assertThat(customer.getEmail()).isNull();
		
		//when 
		customer.updateProfile(CUSTOMER_NAME, ADDRESS, EMAIL);
		
		//then
		assertThat(customer.getCustomerName()).isEqualTo(CUSTOMER_NAME);
		assertThat(customer.getAddress()).isEqualTo(ADDRESS);
		assertThat(customer.getEmail()).isEqualTo(EMAIL);
	}
	
	@Test
	public void testUpdateProfileWithNull() {
		//when 
		assertThat(customer.updateProfile(CUSTOMER_NAME, ADDRESS, null)).isFalse();
		
	}

}
