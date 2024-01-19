package XYZ;

public class Test implements Eg{
	public void show()
	{
		System.out.println("I am show()");
	}
	static int square(int s)
	{
		return s*s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t =new Test();
		t.show();
		System.out.println(t.square(4));
		System.out.println(Eg.square(7));
	}

	

			

}
