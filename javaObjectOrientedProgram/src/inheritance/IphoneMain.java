package inheritance;

import java.util.Scanner;

public class IphoneMain {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		Scanner scanner = new Scanner(System.in);
		System.out.println("통화할 상대방 입력");
		String name = scanner.next();
		System.out.println("보낼 메시지 입력 :");
		String msg = scanner.next();
		iphone.setData(name, msg);
		System.out.println(iphone.getData());
		
		scanner.close();
	}
}
