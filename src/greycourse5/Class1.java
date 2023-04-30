package greycourse5;

public class Class1 {

	public static void main(String[] args) {
		
		
		int a = 10;
		int b = 20;
		

		System.out.println("Before swap");
		System.out.println("a is " + a);
		System.out.println("b is " + b);
		
		a = a + b; // a is 30 b is 20
		b = a - b; // b is 10 now and a is 30
		a = a - b;  // b is 10 now and a is 20 now
		
		
		System.out.println("After swap");
		System.out.println("a is " + a);
		System.out.println("b is " + b);
	}

}
