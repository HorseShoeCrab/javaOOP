package inheritance;

public class AndroidPhone extends Iphone{
	private String data; 
	public static final String BRAND = "안드로이드";
	public static boolean TRUE = true;

	public void setData(String name, String data) {
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = super.getCompany()+"\t"+
					super.getCall()+"\t"+
					data + " : 카카오톡 메시지 전달";
	}
	@Override
	public String getData() {
		return data;
	}
}
