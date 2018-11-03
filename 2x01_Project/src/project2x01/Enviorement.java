package project2x01;

public class Enviorement {
	String environmentName;
	int numberOfPedestrian;
	int numberOfVehicle;
	
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
