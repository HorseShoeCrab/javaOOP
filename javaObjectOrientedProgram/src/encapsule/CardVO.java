package encapsule;

public class CardVO {
	String msg;
	/*
	 * ī�� ���̴� ���� -> �������� �־��� -> ��� ����
	 */
	static final int WIDTH=150;
	static final int HEGIHT=300;

	public CardVO(String kind, int num) {
		this.msg = kind+":"+num;
	}

	// setMsg() �� ����ٴ� ���� ���Ƿ� msg �� �ٲ� �� ���� 
	// ����, �о� ���⸸ �Ѵٴ� readOnly �� �ǹ�
	public String getMsg() {
		return msg;
	}

}
