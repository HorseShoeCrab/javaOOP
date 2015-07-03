package inheritance;

import java.util.Scanner;

public class CellphoneMain {
	public static void main(String[] args) {
		Cellphone motorola = new Cellphone();
		// motorla.set...("모토로라");
		System.out.println("모토로라"+"를 사용합니다");
		Scanner scanner = new Scanner(System.in);
		System.out.println("통화할 사람 : ");
		motorola.setCall(scanner.next());
		// motorola.set...("홍길동")
		motorola.setPortable(true);
		System.out.println(motorola.getCall()+"와 통화합니다. "+motorola.getMove());
		
		scanner.close();
	}
}
