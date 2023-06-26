package day11;

class TestClass03{
	
	static TestClass03 t;	// null
	
	private TestClass03() {
		System.out.println("생성자 실행");
	}
	
	public static TestClass03 getInstance() {
		System.out.println(t + " "  + "test 실행");	
		if (t == null) 
			t = new TestClass03();	
		return t;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		
		// TestClass03 t01 = new TestClass03();	// private : new 사용 불가, 객체 만들수 없음
		
		// TestClass03.test();		// static 붙이면 객체 없이 메소드 불러올수 있음
		
		TestClass03 t01 = TestClass03.getInstance();
		TestClass03 t02 = TestClass03.getInstance();
		TestClass03 t03 = TestClass03.getInstance();
		
		System.out.println(t01);
		System.out.println(t02);
		System.out.println(t03);
		
		
//		null test 실행
//		생성자 실행
//		day11.TestClass03@5e91993f test 실행
//		day11.TestClass03@5e91993f test 실행
//		day11.TestClass03@5e91993f
//		day11.TestClass03@5e91993f
//		day11.TestClass03@5e91993f
		
	}
}
