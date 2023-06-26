package inheritance;

class Test06{
	public int num;
	public Test06() {
		num = 100;
	}
}

class TestClass06 extends Test06{
	int num = 77777;
	// 같은 이름의 변수이면 자신의 값이 우선시 된다
	
	public void test() {
		System.out.println(num);
		System.out.println(super.num);
	}
}

public class MainClass06 {
	public static void main(String[] args) {
		TestClass06 t = new TestClass06();
		t.test();
	}
}
