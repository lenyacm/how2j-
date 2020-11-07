package how2j;

public class Armor extends Item {
	int armorClass;//护甲等级
	
	public static void main(String[] args) {
		Armor clothArmour = new Armor();
		clothArmour.name = "布甲";
		clothArmour.price = 300;
		clothArmour.armorClass = 15;
		
		Armor hauberk = new Armor();
		hauberk.name = "锁子甲";
		hauberk.price = 500;
		hauberk.armorClass = 40;
	}
}
