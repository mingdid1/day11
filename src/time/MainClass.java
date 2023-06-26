package time;

import java.util.Scanner;

/*
		 	1. 시작시간 설정
		 	2. 시작시간 확인 (년월일시분초)
			3. 종료시간 설정
		 	4. 종료시간 확인
		 	5. 사용시간 가져오기
		 	 - ?시간 ?분 ?초 사용함
 */

public class MainClass {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TimeService timer = new TimeService();
		
		
		while (true) {
			System.out.println("1.시작 시간 설정");
			System.out.println("2.시작 시간 확인");
			System.out.println("3.종료 시간 설정");
			System.out.println("4.종료 시간 확인");
			System.out.println("5.사용 시간 가져오기");
			System.out.print(">>> ");
			int num = sc.nextInt();
			
			switch (num) {
				case 1 : 
					timer.start();
					break;
				case 2 : 
					timer.startPrint();
					break;
				case 3 : 
					timer.end();
					break;
				case 4 : 
					timer.endPrint();
					break;
				case 5 : 
					timer.total();
					break;
			}
		}
		
		
	}
}
