package how2j;

public class Armor extends Item {
	int armorClass;//���׵ȼ�
	
	public static void main(String[] args) {
		Armor clothArmour = new Armor();
		clothArmour.name = "����";
		clothArmour.price = 300;
		clothArmour.armorClass = 15;
		
		Armor hauberk = new Armor();
		hauberk.name = "���Ӽ�";
		hauberk.price = 500;
		hauberk.armorClass = 40;
	}
}
