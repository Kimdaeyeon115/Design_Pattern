package programming.practice.plantszombie.simple;

public class PlantStore {
	public Plant orderPlant(String plantname) {
		Plant plant = SimplePlantFactory.createPlant(plantname);
		
		if (plant == null) {
			return null;
		}
		
		return plant;
}
}