package project2x01;

import java.awt.List;
import java.util.ArrayList;

public class AdminModel {;
	Enviornment env = new Enviornment();
	String array[] ;
	public boolean verifyUser(String username, String password) {
		if(username == "admin" && password == "admin") {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void updateNumberOfVehicle(int id, String value) {
		for(String[] arry : env.animals) {
			if(arry[0].equals(id)) {
				arry[1] = value; 
			}
			System.out.println(arry[1]);	
		}
	}
	
	public void updateNumberOfPedestrian(int id, String value) {
		for(String[] arry : env.animals) {
			if(arry[0].equals(id)) {
				arry[2] = value; 
			}
			System.out.println(arry[1]);	
		}
	}
	 
	 

}
