package ifElse;

public class SalaryIncrement {

	public static void main(String[] args) {
		int sal = 400;
		char gen='m';
		int exp=7;
		int inc=0;
		int per =0;
		int increaseper=0; 
		
		if(gen=='f')
		{
			if(exp > 5)
			{
				per= sal * 20 /100;
				increaseper=20;                // increment 20%
			}
			else if(exp >3 && exp <=5 )
			{
				per = sal* 10/100;      //increment 10%
				increaseper=15;  
			}
		}
		else if(gen=='m')
		{
			if(exp > 5)
			{
				per= sal * 15 /100;     // increment 15%
				increaseper=15;  
			}
			else if(exp >3 && exp <=5 )
			{
				per = sal* 5/100;      //increment 5%
				increaseper=5;  
			}
		}
		inc= sal + per;
		System.out.println("Initial salary was " + sal);
		System.out.println("Salary increment percentage "+ increaseper+ "%");
		System.out.println("Salary after increment is "+ inc);
		

	}

}
