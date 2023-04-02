package countdown;

public class CountDown extends Thread {

	@Override
	public void run() {
		int i=20;
		while(i>0) {
			System.out.printf("%d 초 전입니다.\n",i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			i--;
			
		}
		
	}

}
