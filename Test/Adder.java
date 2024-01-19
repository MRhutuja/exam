package Test;

public class Adder {
	static int add(int x, int y)
	{
		return x+y;
	}
	static int add(int a, int b, int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
		//add(16, 14);
		System.out.println(Adder.add(16, 14));
		//System.out.println(Adder.add(10, 10));
//		Adder a = new Adder();
//		
//		System.out.println(a.add(10,10));
		

	}

}
