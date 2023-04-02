package person;

public class Maintest {

	public static void main(String[] args) {
		Person person = new Person("김유신");
		Person person2 = new Person("홍길동");
				
		person.start();
		person2.start();
	}

}
