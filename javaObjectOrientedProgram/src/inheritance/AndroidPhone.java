package inheritance;

public class AndroidPhone extends Iphone{
	private String data; 
	public static final String BRAND = "�ȵ���̵�";
	public static boolean TRUE = true;

	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = super.getCompany()+"\t"+
					super.getCall()+"\t"+
					data + " : īī���� �޽��� ����";
	}
	@Override
	public String getData() {
		return data;
	}
}
