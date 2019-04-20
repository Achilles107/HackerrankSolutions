import java.util.Scanner;

public class CuttingSticks 
{
	public static void cutTheSticks(int[] arr)
	{
		int smallest=Integer.MAX_VALUE;
		int[] newArr=new int[arr.length];
		int stepCount=0;
		int stickCut=0;
		if(stepCount==arr.length)
		{
			System.out.println(stickCut);
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
					smallest=Math.min(arr[i], smallest);
				else
				{
					stepCount=stepCount+1;
				}
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=0)
				{
					newArr[i]=arr[i]-smallest;
					stickCut=stickCut+1;
				}
			}
			
			//System.out.println(stepCount);
			//stickCut=0;
			if(stickCut!=0)
			{
				System.out.println(stickCut);
				cutTheSticks(newArr);
			}
			
			
			
			
		}
		
		/*for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);*/
	}

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int[] arr = new int[n];
	    for(int arr_i = 0; arr_i < n; arr_i++){
	        arr[arr_i] = in.nextInt();
	    }
	    /*int[] result = cutTheSticks(arr);
	    for (int i = 0; i < result.length; i++) {
	        System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
	    }*/
	    cutTheSticks(arr);
	    //System.out.println(cutTheSticks(arr));
	    System.out.println("");
	
	
	    in.close();
	}

}
