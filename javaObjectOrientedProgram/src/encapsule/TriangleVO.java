package encapsule;
// �����ڸ����� �ﰢ�� ���� ���ϱ�
public class TriangleVO {
	/*
	 * ��ü Ŭ������ �ʵ念���� �������(�ν��Ͻ����� + Ŭ��������) ��
	 * �޼��念���� ����޼���� �����ȴ�
	 * �ű⿡ Ư���� �޼ҵ��� �����ڰ� ��� ��ġ�Ѵ�
	 */
	private double area;

	public TriangleVO(double width, double height) {
		this.area = width*height/2;
	}
	public double getArea() {
		return area;
	}

}
