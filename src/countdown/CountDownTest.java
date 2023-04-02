package countdown;

public class CountDownTest {

	public static void main(String[] args) {
		CountDown countDown = new CountDown();
		CountDownEvent countDownEvent = new CountDownEvent(10000, "연결 고리 해제!");
		CountDownEvent countDownEvent1 = new CountDownEvent(15000, "카운트다운");
		CountDownEvent countDownEvent2 = new CountDownEvent(21000, "발사!!!!!");
		countDown.start();
		countDownEvent.start();
		countDownEvent1.start();
		countDownEvent2.start();

	}

}
