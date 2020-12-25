import java.util.*;
class LongestEle
{	
	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		int n,i;
	        int max = a[0];
		System.out.println("enter no. of array");
		n=s.nextInt();
		System.out.println("enter array");
		for(i=0;i<n;i++)
		{
		    a[i]=s.nextInt();
		}
		for(i=1;i<a.length;i++)
		{
		    if(a[i]>max)
		    {
		        max = a[i];
		    }
		}System.out.println("Longest ele" +max);
	}
}