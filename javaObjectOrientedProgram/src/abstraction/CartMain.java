package abstraction;

public class CartMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.setInfo("�Ｚ", "���̵� TV", "123-456", "42��ġ", "LCD");
		// samsungTV.getInfo();
		
		System.out.println();
		
		Notebook appleNotebook = new Notebook();
		appleNotebook.setInfo("Apple", "MacBookPro", "MF840KH/A", "Intel Core i5 2.93GHz", "8GB", "512GB");
		// appleNotebook.getInfo();
		
		// �����ڸ� ������� �ʴ� �迭������ �������̽� Ÿ�����ε� �����ϴ�.
		Product cart[] = new Product[2];
		cart[0] = samsungTV;
		cart[1] = appleNotebook;
		for (Product product : cart) { // cart �� �迭
			product.getInfo();
		}
	}
}
