package bpt;

public class ConcreteHouse extends House {

	@Override
	void buildWalls() {
		System.out.println("Building concrete walls.");
	}

	@Override
	void buildWindows() {
		System.out.println("Building concrete windows.");

	}

	@Override
	void buildRoof() {
		System.out.println("Building concrete roof.");
	}
	
	boolean isLandscapingNeeded() {
		return false;
	}

}
