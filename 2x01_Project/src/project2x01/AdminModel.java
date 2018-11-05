package project2x01;

import java.awt.List;
import java.util.ArrayList;

public class AdminModel {;
	Enviornment env = new Enviornment();
	String array[] ;
	
	public boolean verifyUser(String username, String password) {
		if(username == "" || password == "" ) {
			return false; 
		}
		else
		{
			if(username == "admin") {
				if(password == "admin") {
					return true;
				}
			}
		return false;
	}
}
	
	public boolean checkVehicleExist(int id) {
		if(id < 0 || id < env.getEnviormentDetails().length  ) {
			return false;
		}
		else
		{
			String arr[][] = env.getEnviormentDetails();
			for(int i = 0; i < env.getEnviormentDetails().length;i++) 
			{
				if(arr[i][0].equals(String.valueOf(id)))
				{
					return true;
				}
			}
			return false;
		}		
	}
	public void updateNumberOfVehicle(int id, String value) {
		if(id < 0 || value == "") {
			System.out.println("Error! invalid input");
		}
		else
		{
			if(checkVehicleExist(1)) {
				env.lvl1enviornmentDetails[0][3] = value;
				System.out.println("Successfully Updated");
				
			}
		}
	}
	
	
//	public void updateNumberOfPedestrian(int id, String value) {
//		 		
//			if(arry[0].equals(id)) {
//				arry[2] = value; 
//			}
//			System.out.println(arry[1]);	
//		}
//	}
	 
	 

}
