package abstraction;

public class Notebook extends ProductSpec{
	private String cpu;
	private String ram;
	private String ssd;
	
	public void setInfo(String company, String name, String sid, String cpu, String ram, String ssd) {
		
		super.setInfo(company, name, sid);
		this.cpu = cpu;
		this.ram = ram;
		this.ssd = ssd;
		
				/*
				 * �ϳ��� Ŭ������ ������ ��� �ݺ��ؼ� ���� �ٸ� ��ü�� ������ ��
				 * ������ ��ɿ� ���� �ݺ� ����ϴ� ���� [������] �����ε��̶�� �Ѵ�.
				 * �����ڸ� ���� �� �ݺ��ϸ� ������ �����ε�,
				 * �޼ҵ带 �Ķ���͸� �ٸ� ���·� ���� ���� �����̸����� ���� �Ͽ��ٸ�
				 * �̸� �޼ҵ� �����ε��̶�� �Ѵ�.
				 */
		
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("cpu ���� : " +this.cpu);
		System.out.println("���θ޸� ���� : " +this.ram);
		System.out.println("ssd ���� : " +this.ssd);
		
				// ����
				/*
				 * �Ķ���ͷ� �Ѿ�� ���鵵 �ٷ� super �� ����
				 * �θ� �޼ҵ��� �Ķ���ͷ� ������
				 * �ٷ� set �մϴ�.
				 * ��... �⺯�� ������ �θ��ڽ� ���迡�� �����ϹǷ�, �θ��� �⺯�� ���� ����
				 * ���� ����
				 */
	}
}
