package time;

import java.text.SimpleDateFormat;

public class TimeService {
	
	TimeDTO dto = new TimeDTO();
	
	public void start() {
		
		long time = System.currentTimeMillis();
		
		dto.setStart(time);
		System.out.println("시작시간 설정 완료");

	}
	
	public void startPrint() {

		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
		
		if (dto.getStart() == 0) {
			System.out.println("시간을 먼저 설정하세요");
		}
		else {
			String date = simple.format( dto.getStart() );
			System.out.println( date );
		}
	}
		
		
	
	public void end() {
		long time = System.currentTimeMillis();
		
		dto.setEnd(time);
		System.out.println("종료시간 설정 완료");

	}
	
	
	public void endPrint() {
		
		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy-MM-dd aa hh:mm:ss");
		

		String date = simple.format( dto.getEnd() );
		System.out.println( date );
	}
	
	public void total() {
		
		dto.setTotal(dto.getEnd() - dto.getStart());
		
		SimpleDateFormat simple = 
				new SimpleDateFormat("ss");
		
		String date = simple.format( dto.getTotal() );
		System.out.println( date + "초 사용");
	}
}
