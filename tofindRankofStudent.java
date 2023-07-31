package ifElse;

public class tofindRankofStudent 
{

	public static void main(String[] args)
	{
		int English = 20 ,Punjabi = 10, Hindi = 5;
		int Total = 300;
		int Percentage = (English + Punjabi + Hindi)*100 / Total; 
		// here We cannot write Percentage = (English+ Punjabi + Hindi) /100 * Total because:-
       // 200/300 * 100 = here 200/300 will give value in points but int will not store this value so error occur
         if(Percentage >=60) 
         {
        	System.out.println("First Rank Of Simranjit Kaur"); 
         }
         else if(Percentage >=50)
         {
        	 System.out.println("Second Rank");
         }
         else if(Percentage >= 40)
         {
        	System.out.println("Third Rank");
         }
         else if(Percentage < 40)
         {
        	 System.out.println("Jora Fail");
         }
	}

}
