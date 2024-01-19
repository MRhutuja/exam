package XYZ;

public class Person {
	String name;
	Date bdate;
	
	public Person()
	{
		System.out.println("Constru");
		
	}

	void show()
	{
		System.out.println(name + bdate);
	}
	public static void main(String[] args) {
	Person p = new Person();
	p.show();
			
	}

}
