package abstraction;

public class TVMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.setInfo("삼성", "와이드 TV", "123-456", "42인치", "LCD");
		samsungTV.getInfo();
	}
}
