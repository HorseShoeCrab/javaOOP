package encapsule;

public class AverageVOStep2 {
	/*
	 *Ŭ���� �ٷ� ��(�ʵ�) �� ����� ������ �ν��Ͻ� ������ �ϸ�
	 *�� �ν��Ͻ� ������ �ʱ�ȭ�� �ص� �ǰ�
	 *���ص� �Ǵ� �� �������� ����ϱ�
	 *������ ��κ� �ʱ�ȭ�� ���� �ʴ´�
	 *�׸��� ���� �ʾƵ� ������ ������ �߻����� �ʴ´�
	 */
	String name;
	int kor;
	int eng;
	int tot;
	double avg;
	
	// �հ踦 ���ϴ� ����� main() ���� �����ͼ� �����
	
	public int calcTot(int kor, int eng){
		return kor+eng;
	    //  �� �� tot �� �������� �̴�. ���� �ʱ�ȭ ���� �Է��ؾ���
		/*tot = kor+eng;
		return tot;*/
	}
	
	// ����� ���ϴ� ����� main() ���� �����ͼ� �����
	public double calcAvg(int tot){
		return tot/2;
	}
		
}
