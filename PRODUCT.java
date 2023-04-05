
/* class Main
{
    public static void main(String[]args)
    {
        int[] arr = {2,3,4,2};
        
        System.out.println(findProduct(arr));
    }     
    public static int findProduct(int[] arr)
    {
        int product = 1;        
        for(int i=0;i<=arr.length-1;i++)
        {
            product*=arr[i];
        }
        return product;
    }
}*/
public class Main
{
    public static void main(String[]args)
    {
        //creat an arr
    	int [] arr = {2,3,4,2};
        
        //find the all element of product
    	int product = 1;
    	
        //we run the loop 
    	for(int i = 0; i < = arr.length-1;i++)
    	{
            //all the element we  product
    		product * = arr[i];
    	}
    	System.out.println(product);
    }
 }
    	

