package programming.practice.plantszombie.simple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlantStore plantStore = new PlantStore();

		Plant plant = plantStore.orderPlant("���� Sunflower");
		plant.display();
		
		plant = plantStore.orderPlant("���� Repeater");
		plant.display();

		plant = plantStore.orderPlant("���� Peashooter");
		plant.display();

		plant = plantStore.orderPlant("���� Wallnut");
		plant.display();

		plant = plantStore.orderPlant("���� Tallnut");
		plant.display();
		
		plant = plantStore.orderPlant("���� Sunshroom");
		plant.display();
	}

}
