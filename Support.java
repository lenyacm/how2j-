package how2j;

public class Support extends Hero {
	
	public void heal() {
		System.out.println(name + "进行了一次治疗，但不确定治疗到谁了");
	}
	
	public void heal(Hero h) {
		System.out.println(name + "为" + h.name + "加血");
	}
	
	public void heal(Hero h, int hp) {
		System.out.println(name + "为" + h.name + "加了" + hp + "的血");
	}
}
