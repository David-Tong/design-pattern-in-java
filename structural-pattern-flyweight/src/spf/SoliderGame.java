package spf;

public class SoliderGame {

	public static void main(String[] args) {
		SoldierFlyweightFactory soldierFlyweightFactory = new SoldierFlyweightFactory();
		
		// create soldier type
		SoldierType archerType = soldierFlyweightFactory.getSoldierType("Archer", "Bow", "Leather");
		SoldierType knightType = soldierFlyweightFactory.getSoldierType("Knight", "Sword", "Plate");
		
		// create soldiers
		Soldier archer = new Soldier(archerType, 100, 50);
		Soldier archer2 = new Soldier(archerType, 120, 60);
		Soldier knight = new Soldier(knightType, 200, 100);
		Soldier knight2 = new Soldier(knightType, 250, 120);
		
		archer.display();
		archer2.display();
		knight.display();
		knight2.display();
	}

}
