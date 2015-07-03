package test;

public class PayVO {
	/*
	 * �ʵ忡 ����� �ν��Ͻ� ������ �ݵ�� 
	 * ���������ڵ� �� private ���� �����Ͽ�
	 * ����ȭ�� �ؾ��Ѵ�
	 * �׷��� ������ getter/setter �� �� ������ ����.
	 */
	private String name; // �����̸�
	private int salary; // �޿�
	private double income; // �Ǳ޿� = �޿� - ����
	public static final double TAX=0.1; // ���� 10% �� ������
	/*
	 * ������ ���ѹα� �����̶�� ������ �˾ƾ� �� ����
	 * ���� �����Ǿ�� �ϴ� �ʵ尪�̴�
	 * �̷� ���� ������ �Ǿ�� �ϹǷ�
	 * static �̶�� Ŭ�������� Ű���带 �ٿ��� �������ش�.
	 * �׷��� �������� ������ �빮�ڷ� ǥ���ؼ� �������ش�.
	 * setter, getter �� ����� �ȵȴ� �ֳ��ϸ� �������̱� �����̴�.
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(int salary) {
		this.income = (int)(salary-(salary*TAX));
	}
}
