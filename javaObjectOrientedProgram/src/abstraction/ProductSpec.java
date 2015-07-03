package abstraction;

public class ProductSpec implements Product{
	private String company; // 제조사
	private String name; // 제품명
	private String serialNo; // 일련번호
	
	@Override
	public void setInfo(String company, String name, String serialNo){
		this.company = company;
		this.name = name;
		this.serialNo = serialNo;
	}
	
	@Override
	public void getInfo() {
		System.out.println("제조사 : "+ this.company);
		System.out.println("제품명 : "+ this.name);
		System.out.println("시리얼 넘버 : "+ this.serialNo);
		
	}

}
