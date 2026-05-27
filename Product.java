//write a java program for product of array except self
import java.util.*;
class Product
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int[] arr1=new int[m];
		for(int i=0;i<m;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			int product=1;
			for(int j=0;j<m;j++)
			{
				if(i!=j)
				{
					product=product*arr1[j];
				}
			}
			System.out.print(product+" ");
		}
	}
}