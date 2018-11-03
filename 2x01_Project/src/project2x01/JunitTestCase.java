package project2x01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitTestCase {

	AdminModel  admin = new AdminModel();;

	@Test
	public void testVerify() {
		assertTrue(admin.verifyUser("admin", "admin") == true);
	
	}
	
	@Test
	public void toFail() {
		assertFalse(admin.verifyUser("admin11", "ad11min") == true);
	}

	
	
}
