package encapsule;

import java.util.Scanner;

public class RectangleMain2 {
	public static void main(String[] args) {
		// �����ڷ� �������ϱ�
		Scanner scanner = new Scanner(System.in);
		System.out.println("���α��� �Է� :");
		int width = scanner.nextInt();
		System.out.println("���α��� �Է� :");
		int height = scanner.nextInt();
		RectangleVO2 rectangle = new RectangleVO2(width, height);
		System.out.println("���� :"+rectangle.getArea());
		
		scanner.close();
	}
}
