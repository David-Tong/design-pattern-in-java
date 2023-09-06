package spf;

public class SoldierType implements SoliderFlyweight {
	private String type;
	private String weapon;
	private String armor;
	
	
	public SoldierType(String type, String weapon, String armor) {
		this.type = type;
		this.weapon = weapon;
		this.armor = armor;
	}
	
	@Override
	public void display(int x, int y) {
		System.out.println("Displaying " + type + " at (" + x + ", " + y + ") with weapon "
				+ weapon + " and armor " + armor);
	}

}
