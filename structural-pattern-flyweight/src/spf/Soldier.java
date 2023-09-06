package spf;

public class Soldier {
	
	private SoldierType soldierType;
	private int x;
	private int y;
	
	public Soldier(SoldierType soldierType, int x, int y) {
		this.soldierType = soldierType;
		this.x = x;
		this.y = y;
	}
	
	public void display() {
		soldierType.display(x, y);
	}

}
