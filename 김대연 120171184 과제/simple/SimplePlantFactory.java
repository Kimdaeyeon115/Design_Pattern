	package programming.practice.plantszombie.simple;

public class SimplePlantFactory {
	public static Plant createPlant(String name) {
		Plant plant = null;
		
		if (name.equals("���� Sunflower")) {
			plant = new Sunflower();
		} else if (name.equals("���� Repeater")) {
			plant = new Repeater();
		} else if (name.equals("���� Peashooter")) {
			plant = new Peashooter();
		} else if (name.equals("���� Wallnut")) {
			plant = new Wallnut();
		} else if (name.equals("���� Tallnut")) {
			plant = new Tallnut();
		} else if (name.equals("���� Sunshroom")) {
			plant = new Sunshroom();
		} 
		
		return plant;
	}
}
