package ifElse;

public class methodsforfindingMaximum {

	public static void main(String[] args) {
		
		// with separate if else but here time complexity is more as compare to 2nd method
		int a=7, b=10000000 , c= 69453; 
		int result = 0;
		if(a>b && a>c)
		{
			result=a;
		}
		if(b>c && b>c)
		{
			result=b;
		}
		
		if(c>a && c>b)
		{
			result=c;
		}
		System.out.println(result);

	}

}
	
