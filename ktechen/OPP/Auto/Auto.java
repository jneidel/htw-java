package OPP.Auto;

import java.util.Random;

public class Auto {
	
	public Auto (int speed, String colour)
	{
		this.setSpeed(speed);
		this.setColour(colour);
	}
	
	private int speed;
	private String colour;
	private int rotationOfCar;

	/*
	 * Print: @Speed, @colour, @Rotation, @CollisionOject
	 */
	public static void printMessageOfAuto(Auto a) {
		final String BORDER = "==================================================";
		
		//Debug
		//a.collisionObject();
		
		System.out.println(BORDER);
		System.out.println("Das Auto "+ a.checkSpeed(a) + a.getSpeed());
		System.out.println("Die Farbe ist " + a.colour);
		System.out.println("Die Lenkgradzahl ist " + a.getRotationOfCar());
		System.out.println("Objekt auf der Straße sind " + a.collisionObject());
		System.out.println(BORDER);
	}

	private String checkSpeed(Auto a) {		
		if(a.getSpeed() <= 0) {
			return "steht ";
		}else if(a.getSpeed() > 0){
			return "fährt ";
		}	
		return "error";
	}
	
	/*
	 * Object alert
	 */
	private String collisionObject() {
		int randomNumber = new Random().nextInt();
		final int biggerLowerThan = 0;
		
		//Debug
		System.out.println(randomNumber);
		
		if(randomNumber > biggerLowerThan) {
			return "keine Objekte";
		}else if(randomNumber < biggerLowerThan) {
			return "Objekte";
		}
		return "error";
	}

	public int getRotationOfCar() {
		return rotationOfCar;
	}

	public void setRotationOfCar(int rotationOfCar) {
		this.rotationOfCar = rotationOfCar;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
