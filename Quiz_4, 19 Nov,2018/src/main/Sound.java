package main;

public class Sound {
	private double distance;	
	public double caculation(double spreed ,double timeInterval) {
		return distance = spreed * timeInterval;
	}
	public void display() {
		System.out.println("Distance is : "+distance);
	}
	public static void main(String[] args){
		Sound sound = new Sound();
		final double SPREED = 1100;
		final double TIME = 7.2;
		sound.caculation(SPREED, TIME);
		sound.display();
		
	}

	
}
