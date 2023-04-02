package product;
// 클래스 : 변수와 메서드를 넣어 둔 설계도
// 객체 : 클래스 타입으로 선언 된 것을 객체라고 함 Product product 가 객체임.
// 인스턴스 : 그 객체가 메모리에 할당되어 생성될 때(실제 사용될 때) 인스턴스라고 부름. product = new Product();


public class MainTest {

	public static void main(String[] args) {	// Product가 참조자료형으로 쓰인거지, 상속한게 아니니까 ..	
		Product product = new Product();		//속성을 가져오려면 클래스마다 객체를 생성해야 합니다.
		Consumer consumer = new Consumer(product);// 소비자, 생산자가 참조할 제품정보를  맴버변수로 받고
		Producer producer = new Producer(product);
		consumer.start();	// 소비자와, 생산자의 값만을 출력합니다.
		producer.start();
	}

}
