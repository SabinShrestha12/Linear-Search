import java.util.Random;
class LnrSrch 
{
	public static int search(int arr[], int x)
	{
		
		int n = arr.length; 
	    for(int i = 0; i < n; i++) 
	    { 
	        if(arr[i] == x) 
	            return i; 
	    } 
	    return -1; 
	}
	
	public static void main(String [] args)
	{
		long start = System.currentTimeMillis();
		Random rn = new Random();
		int arr[]=new int[10000];
		int n = arr.length;
		for(int i = 0;i<10000;i++)
		{
			arr[i] = rn.nextInt(1000);
		}
		for(int i = 0; i<n-1;i++)
		{
			int minInd = i;
			for(int j = i; j<n;j++)
			{
				if(arr[j] < arr[minInd])
				{
					minInd = j;	
				}
			}
			int temp = arr[i];
			arr[i] = arr[minInd];
			arr[minInd] = temp;	
		}
		int x = 52;
		int res = search(arr,x);
		if(res == -1)
		{
			System.out.println("Element "+ x+" is not present in array");
		}
		else
		{
			System.out.println("Element "+x+" is present at "+"index "+ res);
		}

		long end = System.currentTimeMillis();
		System.out.println("Total time taken to execute the program is : "+ (end-start)+ " ms");
	}
}
