package abstraction;
// 인터페이스 타입으로 생성된 통장 클래스
public class BankBook implements Account{
	
	private String accountNo; // 계좌번호
	private String ownerName; // 계좌주립
	private String password; // 통장비번
	private int balance; // 잔액
	public static final String BANK_NAME = "아이티뱅크";
	
	public BankBook() {
		this("","","",0);
		
	}
	
	public BankBook(String accountNo, String ownerName, String password, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.password = password;
		this.balance = balance;
	}
	
	

	public String getAccountNo() {
		return accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getBalance() {
		return balance;
	}

	@Override
	public void deposit(int money) {
		// 유효성 체크
		// 입금액 혹시 0 이나 0 보다 작은 금액
		// 파라미터로 던질 경우 에러가 발생하는 것을
		// 막기 위한 방어코딩
		if (money <= 0) {
			System.out.println("입금액은 0 보다 커야 한다.");
		} else {
			this.balance += money;
		}

	}
	
	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("출금액은 0 보다 커야 한다.");
		} else if (money > getBalance()) {
			System.out.println("춞금액은 잔액보다 작아야 한다.");
		} else
		this.balance -= money;
	}
	/*
	 * Java 에서는 자주 사용되는 클래스와 인터페이스를 이미 생성 또는 구현한 뒤 개발자들이 이를 가져다 쓰게끔 함
	 * ex. 스캐너 또는 시스템
	 * 이처럼 미리 만들어진 클래스와 인터페이스를 API 라고 한다.
	 * 그 중 최상위 객체를 Object 라고 하며, 이 Object 의 클래스는 자바에서 객체로 선언된 것이라면 무조건 상속 받음
	 * 따라서, Object 의 메소드들은 자바객체라면 어느 것이든 사용 가능
	 * 이걸 사용하는 방법은 클래스 내부에서 빈 공간에 CTRL + Space
	 */
	@Override
	public String toString() {
		return "입출금 계좌\n"+ "["+BANK_NAME+ "]\n"+ "계좌번호 :"
				+ getAccountNo()+"\n"+"계좌명 :"
				+ getOwnerName()+"\n"
				+ "비번 : ******** \n"+"잔액 :"
				+ getBalance()+"\n"
				+ "으로 통장이 개설되었습니다.";
	}
}
