package abstraction;

public class CartMain {
	public static void main(String[] args) {
		TV samsungTV = new TV();
		samsungTV.setInfo("삼성", "와이드 TV", "123-456", "42인치", "LCD");
		// samsungTV.getInfo();
		
		System.out.println();
		
		Notebook appleNotebook = new Notebook();
		appleNotebook.setInfo("Apple", "MacBookPro", "MF840KH/A", "Intel Core i5 2.93GHz", "8GB", "512GB");
		// appleNotebook.getInfo();
		
		// 생성자를 사용하지 않는 배열선언은 인터페이스 타입으로도 가능하다.
		Product cart[] = new Product[2];
		cart[0] = samsungTV;
		cart[1] = appleNotebook;
		for (Product product : cart) { // cart 는 배열
			product.getInfo();
		}
	}
}
