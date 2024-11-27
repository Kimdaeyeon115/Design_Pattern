	package programming.practice.plantszombie.simple;

public class SimplePlantFactory {
	public static Plant createPlant(String name) {
		Plant plant = null;
		
		if (name.equals("나는 Sunflower")) {
			plant = new Sunflower();
		} else if (name.equals("나는 Repeater")) {
			plant = new Repeater();
		} else if (name.equals("나는 Peashooter")) {
			plant = new Peashooter();
		} else if (name.equals("나는 Wallnut")) {
			plant = new Wallnut();
		} else if (name.equals("나는 Tallnut")) {
			plant = new Tallnut();
		} else if (name.equals("나는 Sunshroom")) {
			plant = new Sunshroom();
		} 
		
		return plant;
	}
}
