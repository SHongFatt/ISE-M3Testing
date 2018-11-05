package project2x01;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class AdminModelJunit {
	AdminModel am = new AdminModel();
	Enviornment env = new Enviornment();
	@Test
	void testVerifyUser() {
		assertTrue(am.verifyUser("admin", "admin") == true);
		assertFalse(am.verifyUser("admin", "") ==  true);
		assertFalse(am.verifyUser("", "admin") ==  true);
		assertFalse(am.verifyUser("admin", "abc") == true);
		
	}

	@Test
	void testCheckVehicleExist() {
		assertTrue(am.checkVehicleExist(1) == true);
		assertFalse(am.checkVehicleExist(-1) == true);
		assertFalse(am.checkVehicleExist(env.getEnviormentDetails().length -1) == true);
		assertFalse(am.checkVehicleExist(5)==true);
	}

	@Test
	void testUpdateNumberOfVehicle() {
		am.updateNumberOfVehicle(0, "abc");
		equals(am.env.getlevelEnvNumOfVehicle() == "abc");
		equals("Successfully Updated");
		am.updateNumberOfVehicle(-1, "");
		equals("Error! invalid input");
		am.updateNumberOfVehicle(0, "");
		equals("Error! invalid input");
	
	}	

}
