package day11;

public class MainClass04 {
	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();	// 1 / 1000초 단위로 표현
		System.out.println( time );
		
		try {
			Thread.sleep(2000);				// try/catch 사용해야함
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end - time);
		System.out.println((end - time)/1000 + "초 사용");
		
	}
}
