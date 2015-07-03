package abstraction;
// �������̽� Ÿ������ ������ ���� Ŭ����
public class BankBook implements Account{
	
	private String accountNo; // ���¹�ȣ
	private String ownerName; // �����ָ�
	private String password; // ������
	private int balance; // �ܾ�
	public static final String BANK_NAME = "����Ƽ��ũ";
	
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
		// ��ȿ�� üũ
		// �Աݾ� Ȥ�� 0 �̳� 0 ���� ���� �ݾ�
		// �Ķ���ͷ� ���� ��� ������ �߻��ϴ� ����
		// ���� ���� ����ڵ�
		if (money <= 0) {
			System.out.println("�Աݾ��� 0 ���� Ŀ�� �Ѵ�.");
		} else {
			this.balance += money;
		}

	}
	
	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("��ݾ��� 0 ���� Ŀ�� �Ѵ�.");
		} else if (money > getBalance()) {
			System.out.println("�y�ݾ��� �ܾ׺��� �۾ƾ� �Ѵ�.");
		} else
		this.balance -= money;
	}
	/*
	 * Java ������ ���� ���Ǵ� Ŭ������ �������̽��� �̹� ���� �Ǵ� ������ �� �����ڵ��� �̸� ������ ���Բ� ��
	 * ex. ��ĳ�� �Ǵ� �ý���
	 * ��ó�� �̸� ������� Ŭ������ �������̽��� API ��� �Ѵ�.
	 * �� �� �ֻ��� ��ü�� Object ��� �ϸ�, �� Object �� Ŭ������ �ڹٿ��� ��ü�� ����� ���̶�� ������ ��� ����
	 * ����, Object �� �޼ҵ���� �ڹٰ�ü��� ��� ���̵� ��� ����
	 * �̰� ����ϴ� ����� Ŭ���� ���ο��� �� ������ CTRL + Space
	 */
	@Override
	public String toString() {
		return "����� ����\n"+ "["+BANK_NAME+ "]\n"+ "���¹�ȣ :"
				+ getAccountNo()+"\n"+"���¸� :"
				+ getOwnerName()+"\n"
				+ "��� : ******** \n"+"�ܾ� :"
				+ getBalance()+"\n"
				+ "���� ������ �����Ǿ����ϴ�.";
	}
}
