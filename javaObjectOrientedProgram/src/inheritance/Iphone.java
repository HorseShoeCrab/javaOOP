package inheritance;

public class Iphone extends Cellphone{
	private String data;
	public static final String BRAND = "아이폰"; // 아이폰은 브랜드 상속을 막음
	public static boolean TRUE = true;
	public String getData() {
		return data;
	}
	public void setData(String name, String data) {
		/*
		 * this. 은 해당 클래스 내부의 메소드나 혹은
		 * 필드의 인스턴스 변수, 클래스 변수를 호출할 수 있고,
		 * super, 은 extends(상속)받은
		 * 부모클래스의 메소드나 필드값을 호출할 수 있다.
		 */
		super.setCompany(BRAND);
		super.setPortable(TRUE);
		super.setCall(name);
		this.data = 
				super.getCompany()+"\t"+
				super.getCall()+"\t"+
				data+ " : 메시지 전달";
		
	}

}
