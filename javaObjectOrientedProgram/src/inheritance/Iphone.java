package inheritance;

public class Iphone extends Cellphone{
	private String data;
	public static final String BRAND = "������"; // �������� �귣�� ����� ����
	public static boolean TRUE = true;
	public String getData() {
		return data;
	}
	public void setData(String name, String data) {
		/*
		 * this. �� �ش� Ŭ���� ������ �޼ҵ峪 Ȥ��
		 * �ʵ��� �ν��Ͻ� ����, Ŭ���� ������ ȣ���� �� �ְ�,
		 * super, �� extends(���)����
		 * �θ�Ŭ������ �޼ҵ峪 �ʵ尪�� ȣ���� �� �ִ�.
		 */
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany()+"\t"+
				super.getCall()+"\t"+
				data+ " : �޽��� ����";
		
	}

}