package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/*
		 * ������ ���� : ���ڷ��̼� ����
		 * ���ڷ��̼� ����
		 */
		BasicBot myBot = new BasicBot();
		ShieldBot myShield = new ShieldBot(myBot);
		
		myShield.status();
		myShield.chargeEnergy(50);
		myShield.status();
		myShield.shield(30);
		myShield.run();
		myShield.status();
		
	}
}
