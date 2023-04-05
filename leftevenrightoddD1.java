class main
{
	public static void main(String[]args)
	{
		int []arr={2,3,4,6,5,1,8};
		int start=0;
		int end=arr.length -1;
		
		while(start<end)
		{
			while(arr[start]%2==0)
			{
				start++;
			}
			while(arr[end]%2!=0)
			{
				end--;
			}
			if(start<end)
			{
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				start++;
				end--;
			}
		
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}	
	}     
}


