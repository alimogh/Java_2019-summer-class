package ch05_class;
/*
 * �ʵ�
 * 	�̸�
 * 	HP
 * 	damage
 * 
 * �޼ҵ�
 * 	attack
 */
public class Monster extends Unit{
	int xp=10;
	public Monster() {}
	public Monster(String name,int hp,int damage) {
		super(name,hp,damage);
	}
	
	public void attack(PlayerCharactor p) {
		
	}
	@Override
	public void setHP(int damage,Unit u) {
		super.setHP(damage,u);
		if(super.hp<=0) {
			PlayerCharactor p=(PlayerCharactor)u;
			p.setXP(xp);
		}
	}
}
