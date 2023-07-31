package ifElse;

public class TofindLibraryFine {

	public static void main(String[] args) {
		int days=9;
		int fine=0;
		if(days >0 && days<=5)
		{
			fine = days*1;
		}
		else if(days>5 && days<=10)
		{
			fine = 5+ (days-5)*2;
		}
		else if(days >10 && days <=15) 
		{
			fine = 5+ 10 +(days-10) * 3;
		}
		else if(days>15)
		{
			fine = 5+10+15 +(days-15) * 5;
		}
		System.out.println("Fine is "+ fine);

	}

}
