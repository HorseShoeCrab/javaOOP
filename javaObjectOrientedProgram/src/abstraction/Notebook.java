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
				 * 하나의 클래스를 가지고 계속 반복해서 서로 다른 객체를 생성한 후
				 * 여러번 기능에 따라 반복 사용하는 것을 [생성자] 오버로딩이라고 한다.
				 * 생성자를 여러 번 반복하면 생성자 오버로딩,
				 * 메소드를 파라미터만 다른 형태로 여러 개의 동일이름으로 선언 하였다면
				 * 이를 메소드 오버로딩이라고 한다.
				 */
		
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("cpu 정보 : " +this.cpu);
		System.out.println("메인메모리 정보 : " +this.ram);
		System.out.println("ssd 정보 : " +this.ssd);
		
				// 구현
				/*
				 * 파라미터로 넘어온 값들도 바로 super 를 통해
				 * 부모 메소드의 파라미터로 던져서
				 * 바로 set 합니다.
				 * 즉... 멤변의 공유가 부모자식 관계에서 성립하므로, 부모의 멤변에 대한 접근
				 * 역시 가능
				 */
	}
}
