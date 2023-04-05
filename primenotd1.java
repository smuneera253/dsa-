public class main
{
  public static void main(String[]args)
  {
  //creat one number
  int num=8;
  int count=0;
  	//we run the loop
  	for(int i=1;i<=num;i++)
  	{
  		if(num%i==0)/ /check the if number is prime or not
  		{
  			count++;
  		}
  	}
  	if(count==2)
  	{
  	 	System.out.println("Prime");
  	}else
  	{
  		System.out.println("not a prime");
  	}
  }
  
 } 
  	
