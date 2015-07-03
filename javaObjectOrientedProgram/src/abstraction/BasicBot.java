package abstraction;

public class BasicBot implements Robot{
	int energy = 0;
	int attack = 10;
	int hp = 100;
	int speed = 0;
	
	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public int attack() {
		return attack;
	}

	@Override
	public void shield(int attack) {
		hp -= attack;
		
	}

	@Override
	public void run() {
		speed += 10;
		
	}

	@Override
	public void status() {
		System.out.println( "[HP]" + getHp()+"\n"
				+ "[속도]" + getSpeed()+"\n"
				+ "[에너지]]"+ getEnergy()+"\n");
		
	}

	@Override
	public void chargeEnergy(int energy) {
		this.energy += energy;
		
	}

}
