package bpt;

public class HouseBuilder {

	public static void main(String[] args) {
		House concreteHouse = new ConcreteHouse();
		concreteHouse.buildHouse();
		System.out.println("---------------------------------------");
		House woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
	}

}
