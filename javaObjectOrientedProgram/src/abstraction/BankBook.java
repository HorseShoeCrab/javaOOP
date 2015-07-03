package abstraction;
// ÀÎÅÍÆäÀÌ½º Å¸ÀÔÀ¸·Î »ı¼ºµÈ ÅëÀå Å¬·¡½º
public class BankBook implements Account{
	
	private String accountNo; // °èÁÂ¹øÈ£
	private String ownerName; // °èÁÂÁÖ¸³
	private String password; // ÅëÀåºñ¹ø
	private int balance; // ÀÜ¾×
	public static final String BANK_NAME = "¾ÆÀÌÆ¼¹ğÅ©";
	
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
		// À¯È¿¼º Ã¼Å©
		// ÀÔ±İ¾× È¤½Ã 0 ÀÌ³ª 0 º¸´Ù ÀÛÀº ±İ¾×
		// ÆÄ¶ó¹ÌÅÍ·Î ´øÁú °æ¿ì ¿¡·¯°¡ ¹ß»ıÇÏ´Â °ÍÀ»
		// ¸·±â À§ÇÑ ¹æ¾îÄÚµù
		if (money <= 0) {
			System.out.println("ÀÔ±İ¾×Àº 0 º¸´Ù Ä¿¾ß ÇÑ´Ù.");
		} else {
			this.balance += money;
		}

	}
	
	@Override
	public void withdraw(int money) {
		if (money <= 0) {
			System.out.println("Ãâ±İ¾×Àº 0 º¸´Ù Ä¿¾ß ÇÑ´Ù.");
		} else if (money > getBalance()) {
			System.out.println("­y±İ¾×Àº ÀÜ¾×º¸´Ù ÀÛ¾Æ¾ß ÇÑ´Ù.");
		} else
		this.balance -= money;
	}
	/*
	 * Java ¿¡¼­´Â ÀÚÁÖ »ç¿ëµÇ´Â Å¬·¡½º¿Í ÀÎÅÍÆäÀÌ½º¸¦ ÀÌ¹Ì »ı¼º ¶Ç´Â ±¸ÇöÇÑ µÚ °³¹ßÀÚµéÀÌ ÀÌ¸¦ °¡Á®´Ù ¾²°Ô²û ÇÔ
	 * ex. ½ºÄ³³Ê ¶Ç´Â ½Ã½ºÅÛ
	 * ÀÌÃ³·³ ¹Ì¸® ¸¸µé¾îÁø Å¬·¡½º¿Í ÀÎÅÍÆäÀÌ½º¸¦ API ¶ó°í ÇÑ´Ù.
	 * ±× Áß ÃÖ»óÀ§ °´Ã¼¸¦ Object ¶ó°í ÇÏ¸ç, ÀÌ Object ÀÇ Å¬·¡½º´Â ÀÚ¹Ù¿¡¼­ °´Ã¼·Î ¼±¾ğµÈ °ÍÀÌ¶ó¸é ¹«Á¶°Ç »ó¼Ó ¹ŞÀ½
	 * µû¶ó¼­, Object ÀÇ ¸Ş¼ÒµåµéÀº ÀÚ¹Ù°´Ã¼¶ó¸é ¾î´À °ÍÀÌµç »ç¿ë °¡´É
	 * ÀÌ°É »ç¿ëÇÏ´Â ¹æ¹ıÀº Å¬·¡½º ³»ºÎ¿¡¼­ ºó °ø°£¿¡ CTRL + Space
	 */
	@Override
	public String toString() {
		return "ÀÔÃâ±İ °èÁÂ\n"+ "["+BANK_NAME+ "]\n"+ "°èÁÂ¹øÈ£ :"
				+ getAccountNo()+"\n"+"°èÁÂ¸í :"
				+ getOwnerName()+"\n"
				+ "ºñ¹ø : ******** \n"+"ÀÜ¾× :"
				+ getBalance()+"\n"
				+ "À¸·Î ÅëÀåÀÌ °³¼³µÇ¾ú½À´Ï´Ù.";
	}
}
