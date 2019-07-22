package ch05_class;
/*
 * Ư��,�޼ҵ� ���Ϳ� ����
 */
public class PlayerCharactor extends Unit{
	public PlayerCharactor() {}
	public PlayerCharactor(String name,int hp,int damage) {
		super(name,hp,damage);
	}
	
	public void attack(Unit u) {
		u.setHP(damage,this);
		System.out.println(this.name+"�� "+u.name+"��(��) �����߽��ϴ�");
	}
	@Override
	public void setHP(int damage,Unit u) {
		super.setHP(damage,u);
		if(hp<=0) {
			if(u instanceof Monster) {
				System.out.println("����ġ �谨");
			}
			else if(u instanceof PlayerCharactor) {
				System.out.println("������ ��Ż");
			}
		}
		else {
			System.out.println("����");
		}
	}
	public void setXP(int xp) {
		
	}
	
}
