class main
{
	public static void main(String[]args)
	{	
		//creat an arr
		int []arr={2,3,4,6,5,1,8};
		//we have to fine to point
		int start=0;	
		int end=arr.length -1;
		
		//we run the  while loop
		while(start<end)
		{
			//we check the  condition even or not
			while(arr[start]%2==0)
			{
				start++;
			}
			//we check the  condition odd or not
			while(arr[end]%2!=0)
			{
				end--;
			}
			if(start<end)//again we have to check the condition
			{
				//after check the condition we have to swape
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				start++;
				end--;
			}
		
		}
		
		//after swap the condion  we have to print in right way
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}	
	}     
}


