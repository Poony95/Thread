package countdown;

public class CountDownEvent extends Thread{
	private int delay;
	private String msg;
	
	public CountDownEvent (int delay, String msg) {
		this.delay = delay;
		this.msg = msg;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(delay);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(msg);  //일정시간 후 문장 출력하도록 출력문 넣기!
	}
}
