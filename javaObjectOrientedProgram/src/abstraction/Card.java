package abstraction;

public class Card {
	static final int WIDTH=150;
	static final int HEGIHT=300;
	/*
	 * 4���� ���� �� ��Ʈ ���̸� ������ �÷��� ��.
	 */
	public static final String KIND = "��Ʈ";
	private int num;

	// ������ ����Ű : CTRL + Space
	public Card() {
		this.num = (int) ((Math.random()*13)+1);
		/*
		 * Math Ŭ������ ���а� ���õ� Ŭ���� Math.random() �޼ҵ�� ���������� ���� ���ڸ� 
		 * �߻���Ű�� ���� *13 �� ����Ʈ��, +1 �� ��ŸƮ��
		 */
	}
	public int getNum() {
		return num;
	}
	
}
