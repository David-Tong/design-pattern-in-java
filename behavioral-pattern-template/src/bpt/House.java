package bpt;

public abstract class House {
	final void buildHouse() {
		buildFoundation();
		buildWalls();
		buildWindows();
		buildRoof();
		if (isLandscapingNeeded()) {
			landscape();
		}
	}
	
	void buildFoundation() {
		System.out.println("Building basic foundation.");
	}
	
	abstract void buildWalls();
	
	abstract void buildWindows();
	
	abstract void buildRoof();
	
	boolean isLandscapingNeeded() {
		return true;
	}
	
	void landscape() {
		System.out.println("Landscaping the surroundings.");
	}

}
