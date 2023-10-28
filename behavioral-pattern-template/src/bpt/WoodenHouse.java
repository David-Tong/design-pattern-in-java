package bpt;

public class WoodenHouse extends House {

	@Override
	void buildWalls() {
		System.out.println("Building wooden walls.");
	}

	@Override
	void buildWindows() {
		System.out.println("Building wooden windows.");
	}

	@Override
	void buildRoof() {
		System.out.println("Building wooden roof.");
	}

}
