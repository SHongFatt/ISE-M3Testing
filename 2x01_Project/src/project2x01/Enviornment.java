package project2x01;


import java.util.ArrayList;
import java.util.List;

public class Enviornment {
	String environmentName;
	int numberOfPedestrian;
	int numberOfVehicle;
    String lvl1enviornmentDetails[][] ;

    
    public Enviornment() {
    	lvl1enviornmentDetails = new String[][]{
            new String[]{"1","Level2" , "30" , "40"}};
		
    }
    public String[][] getEnviormentDetails() {
    	return this.lvl1enviornmentDetails;
    }
    public String getlevelEnvNumOfVehicle() {
    	return lvl1enviornmentDetails[0][3];
    }


}
