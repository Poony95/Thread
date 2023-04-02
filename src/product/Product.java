package product;

import java.util.Random;

public class Product {	// 해당클래스 자체가 공급자와 수요자의 공통 참조 내용으로 사용할 예정이기에 
	private int num;	// Product 클래스 자체가 소비자, 생산자 클래스의 맴버변수의 참조자료형으로 불러지게 됩니다.
	private boolean isNew;		//부모 자식 클래스처럼 상속되어 사용되는 것이 아니기 때문에 protected 로 하지 않아도 됩니다.
	
	
	/*
	 Product의 기본 생성자만을 사용하고 , 변수명이 있는 생성자를 생성하지 않는 이유는 무엇일까?
	 
	 Product 클래스의 인스턴스에 직접적으로 맴버변수 값을 넣지 않을 것이기 때문이다.
	 즉, Consumer consumer = new Consumer(product); 맴버변수로만 사용하여 인스턴스화 할 뿐이지, 
	 Product product = new Product(num, isNew)로 사용되지는 않을것이기 때문이다.
	 */
	
	
	public synchronized void useNumber() {
		while ( isNew == false) {	// 얘야,, 소비자가 isNew(물건)을 사면 물건이 false가 될건데 말이지.. 
			try {wait();} catch (Exception e) {}	// 잠시만..기다려! 샀어? false(샀으면)되면 while문 나가 알려줘!
		}
		System.out.println("소비자가 물건을 소비했습니다"+num);
		isNew = false;	// 나 물건을 샀다!!!(확정)
		notify();		// 그럼 빨리 물건 만들라는 다른 임계영역 깨움.
	}
	
	public synchronized void makeNumber() {
		Random random = new Random();	//같은 물건을 사가는지 확인하려고 임의 값을 난수로 넣어볼게..
		while(isNew == true) {	//생산자가 물건을 만들면 true가 될건데 말이지...
			try {wait();} catch (Exception e) {}	//잠깐만 기다려봐.. 만들었어? 만들었으면 while문 나가서 알려줘!
		}
		num = random.nextInt(100)+1; // 문 빠져나왔으면 물건 번호 1~100까지 랜덤으로 출력해.
		System.out.println("생산자가 새로운 물건은 생성했습니다"+num);
		isNew = true;	//물건을 만들었다!(확정)
		notify();		// 빨리 물건 사라고 다른 임계영역을 깨움.
	}
}
// 멀티 쓰레드 환경에서?? 이처럼 wait와 notify를 통해 임계영역을 동기화하여 사용해야 오류가 없습니다.