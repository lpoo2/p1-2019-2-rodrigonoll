package br.edu.ifrs.canoas.lpoo2.p1;

import static org.assertj.core.api.Assertions.*;


import org.junit.Before;
import org.junit.Test;

public class UserTest {
	
	User user;
	
	
	@Before
	public void setup() {
		user = new User();
	}

	@Test
	public void testVerifyLogin() {
		//given - dado que
		assertThat(user.getLoginStatus()).isNull();
		assertThat(user.verifyLogin()).isFalse();
		
		//when - quando
		user.setLoginStatus("online");
		
		//then - então
		assertThat(user.verifyLogin()).isTrue();
		
	}

}
