package inheritance;

class Calc02{
	
	public void display() {
		System.out.println("나는 계산기야~");
		
	}
}

class Computer02 extends Calc02{
//	Calc02 : 부모 클래스 // Computer02 : 자식 클래스	
	
//	Calc02 c;
//	public Computer02() {	c= new Calc02();	}
	
	public void print02() {
		System.out.println("print");
		display();
		// 자기자신에게 없는 display는 부모클래스로 올라가 찾는다
	}
	
	public void print() {
		System.out.println("나는 컴퓨터야");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		
//		Calc02 c = new Calc02();
//		c.display();
		
		Computer02 com = new Computer02();
		com.print();
		com.display();
		
	}
}
