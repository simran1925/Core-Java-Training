package ifElse;

public class second_method_for_Maximum {

	public static void main(String[] args) {
		// This method is more optimized as compared to 1st method and its time complexity is less because if result is obtained before reaching to every if-else condition, it will give result
         int a= 5, b=6,c=1;
         int ans=0;
         if(a>b && a>c)
 		{
 			ans=a;
 		}
        else if(b>c && b>c)
 		{
 			ans=b;
 		}
        else if(c>a && c>b)
 		{
 			ans=c;
 		}
 		System.out.println(ans);
		
	}

}
