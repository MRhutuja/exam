package XYZ;

public class Date {
	int dd, mm, yy;
	
	public static void main()
	{
		Date d = new Date();
		d.dd = 13;
		d.mm = 12;
		d.yy = 2023;
		
		System.out.println(d.dd+" / "+d.mm+" / "+d.yy);
	}

}
