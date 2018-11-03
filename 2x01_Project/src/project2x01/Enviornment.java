package project2x01;


import java.util.ArrayList;
import java.util.List;

public class Enviornment {
	String environmentName;
	int numberOfPedestrian;
	int numberOfVehicle;
	List<String[]> animals = new ArrayList<>();
    String lvl1enviornmentDetails[] = {"1","Level1" , "20" , "10"};
    String lvl2enviornmentDetails[] = {"2","Level2" , "30" , "40"};
    
    public Enviornment() {
		animals.add(lvl1enviornmentDetails);
		animals.add(lvl2enviornmentDetails);
		
    }
	public String getEnvName() {

		return "Level 1 Environment";
	
	}
	public void setEnvName(String newEnvName) {
		this.environmentName = newEnvName;
		
	}
	public int getNumberOfPedestrian() {
		return 1;
	
	}
	
	public void setNumOfPesdestrian(int a){
		this.numberOfPedestrian = a;
		
	}
	public int getNumberOfVehiclen() {
		return 1;
	
	}
	
	public void setNumOfVehicle(int a){
		this.numberOfVehicle =a ;
		
	}
	public boolean hasPedestrian(){
		return true;
	}
	public boolean hasVehicle()
	{
		return true;
	}
	public void addNewEnviroment(String value) {
		
	}
	public void updateEnvironment(int i) {
		
	}
	public void deleteEnviroment(int i) {
		this.numberOfPedestrian = 0;
		this.numberOfVehicle = 0;
		this.environmentName = "";
		
	}
	
		
	
	
	
	

}
