package programming.practice.plantszombie.simple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlantStore plantStore = new PlantStore();

		Plant plant = plantStore.orderPlant("나는 Sunflower");
		plant.display();
		
		plant = plantStore.orderPlant("나는 Repeater");
		plant.display();

		plant = plantStore.orderPlant("나는 Peashooter");
		plant.display();

		plant = plantStore.orderPlant("나는 Wallnut");
		plant.display();

		plant = plantStore.orderPlant("나는 Tallnut");
		plant.display();
		
		plant = plantStore.orderPlant("나는 Sunshroom");
		plant.display();
	}

}
