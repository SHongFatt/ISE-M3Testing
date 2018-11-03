package project2x01;

public class Game {
	int score;
	Enviorement gameEvviornment;
	
	public int selectLevel() {
		return 1;
	}
	public Enviorement setEnvioroment(){
		return gameEvviornment = new Enviorement();
		
		
	}	
	public void startGame() {
		setEnvioroment();
		
	}
	public void generateFeedback() {
		
	}
	public boolean confirmSelection(String confirmation) {
		if(confirmation)
		
	}
	public int generateScore() {
		
		return score;
		
	}
	public void endGame() {
		
	}
	
}
