package person;

public class Person extends Thread {
	private String name;
	
	public Person(String name) {
		this.name = name;
		}
	@Override
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("안녕, "+ name +i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}
}	// Thread 클래스에서 run을 오버라이딩 하여 그 안에 공평히 출력할 값을 넣으면
	// "가능하면"(무조건이 아님) 1:1 로 객체마다 공평하게 출력됩니다.
