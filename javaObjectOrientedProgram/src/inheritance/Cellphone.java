package inheritance;

public class Cellphone extends Phone{
	private boolean portable; 
	private String move;
	
	/*
	 * �ʵ忡 �ִ� �ν��Ͻ� ������ Ÿ���� boolean �� ���
	 * get... set... �� �ƴ϶�
	 * is... set... ���� �ڵ� �����ȴ�.
	 * �̰��� ������ boolean Ÿ���� ������ �ش�ȴ�.
	 */
	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if (portable == true) {
			this.setMove("���� ������ �ٴ� �� ����");
		} else {
			this.setMove("���� ������ �ٴ� �� ����");
		}
	}
	public String getMove() {
		return move;
	}
	public void setMove(String move) {
		this.move = move;
	}
	
	
}
