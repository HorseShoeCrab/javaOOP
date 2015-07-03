package encapsule;
/*
 /* ����ȭ�� ���� ����,
  * 	����ȭ�� �ʵ忡 �ִ� �����Ͱ��� �ƹ��� �������� ���ϰ��ϰ� 
  * 	getter �� setter �� ���� ������ ȹ���� ��ü�� �����Ϳ� �����ϵ��� �ϴ� ����
  */
 /*
  * ���������� private
  * - ���ȼ��� ����. ������Ʈ�� �������� �����
  * - ���۳�Ʈ�� ������ �ּ�ȭ�Ͽ� �������� ������ �� ����
  * - ������ ����
  */
public class AverageVOStep3 {
	private String name;
	private int kor;
	private int eng;
	private int tot;
	private double avg;
	/*
	* �޼ҵ���� �����ϴ� ������ ���� �ִ� �ʵ念���� 
	* �����ؼ� �ʿ��� ����� �ϵ��� �� ���� ������
	* ���ȿ� ����� ���� ������ �߻��߽��ϴ�.
	* ���� ���̳ĸ� �ʵ忡 �ִ� ������ ������ �����ؼ� 
	* �б�� ����(�����ͼ���) �� �����ؼ��� �ȵ˴ϴ�.
	* readOnly ��� ����� �����е��� ���� ��� �����
	* �� ���� �ֵ�, ���� �� ���̶�� ������ ���� ���� ���Դϴ�.
	* ���������� ȣũ�� ���������� ��ũ�� �����Ͽ� �ٲ� �� �ִ� ����
	* step2 �� �������̾����ϴ�.
	* ���� ����� �ٽ� �и��Ͽ� �ϱ�� ���� ������� �����ϴ�.
	* �� �� �б⸦ get~() ��� �ϰ� ���⸦ set~() ��� �մϴ�. -> ����ȭ(����ȭ)
	* ��Ŭ���������� �ʵ尪�� ���� �޼ҵ� �̸� �ִ� ���� �ڵ�ȭ �߽��ϴ�.
	* getter(�б���) �� setter(������) �� �޼ҵ带 �ڵ����� ������ �ݴϴ�.
	* ����Ű�� ALT + SHIFR + s ���� generate getter and setter �� �����Ͻø� �˴ϴ�.
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int kor, int eng) {
		this.tot = kor + eng;
		/*
		 *�ڵ����� ��Ŭ������ ���ؼ� �޽����
		 *����Ÿ��, �Ķ���͸� ������Ű�� ��
		 *������ �ʿ信 ���� �ణ���� �����ϴ�
		 *�̼������� ���� �ڵ� �ϼ�
		 */
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(int tot) {
		this.avg = tot/2;
	}
}

/*
 ��ü���� ��� 4�� Ư¡ 
 1. ����ȭ (encapsule) -> getter/setter
 2. ��� (inheritance) -> extends
 3. �߻�ȭ (abstraction) -> implements
 4. ������  (polymorphism) -> overriding, overloading
 */
 
