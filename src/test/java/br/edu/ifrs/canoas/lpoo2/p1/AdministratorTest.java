package br.edu.ifrs.canoas.lpoo2.p1;

import static org.assertj.core.api.Assertions.*;


import org.junit.Before;
import org.junit.Test;

public class AdministratorTest {
	
	Administrator administrator;
	

	@Before
	public void setup() {
		administrator = new Administrator();
	}

	@Test
	public void testUpdateModule() {
		//Given
		assertThat(administrator.getModule()).isNull();
		
		//when
		administrator.updateModule("module");
		
		//Then
		assertThat(administrator.getModule()).isEqualTo("module");
		
	}

}
