package threadminmax;

public class MainTest {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		Person p2 = new Person("이순신");
		Person p3 = new Person("유관순");
		
		p1.setPriority(1);	//min 최소니까 늦게 출력해도 된다.
		p2.setPriority(Thread.MIN_PRIORITY);	//1써도되고 이렇게 써도됨
		
		p3.setPriority(Thread.MAX_PRIORITY);	//max 빨리 출력해라
		
		// thread 우선순위setPriority는 많이 쓰이지는 않지만 기본 상식으로 알아두기.
		// 쓰레드는 가능한 공평하게 여러 객체가 출력이되지만 확실하게 우선순위
		// 1:1대응으로 공평히 출력되지 않음. 우선순위도 요청만할 뿐 출력문은 다를 수 있음.
		
		p1.start();
		p2.start();
		p3.start();
	}

}
