package how2j;

public class Support extends Hero {
	
	public void heal() {
		System.out.println(name + "������һ�����ƣ�����ȷ�����Ƶ�˭��");
	}
	
	public void heal(Hero h) {
		System.out.println(name + "Ϊ" + h.name + "��Ѫ");
	}
	
	public void heal(Hero h, int hp) {
		System.out.println(name + "Ϊ" + h.name + "����" + hp + "��Ѫ");
	}
}
