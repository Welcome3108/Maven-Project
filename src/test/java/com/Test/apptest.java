package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.GuruMavin.App;

public class apptest {
	
	@Test
	public void testlogin1() {
		
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc123"));
	}

	@Test
	public void testlogin2() {
		
		App myapp=new App();
		Assert.assertEquals(0,myapp.userLogin("abc", "abc@123"));
	}
	
	
}
