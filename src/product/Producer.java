package product;

public class Producer extends Thread {
	private Product product;		//Product 클래스를 참조하기 위해 참조자료형으로 product 변수에 주소값을 넣어 사용함. //객체
	
	public Producer (Product product) {
		this.product = product;
	}
	public void run() {
		for(int i=1; i <=10; i++) {
			product.makeNumber();
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}
