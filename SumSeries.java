import java.util.Scanner;
public class SumSeries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		int n;
		System.out.println("enter no. of term");
		n = sc.nextInt();
		SumSeries obj = new SumSeries();
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)i/(obj.fact(i));
		}
		System.out.println("Sum of series:"+sum);
	}
	int fact(int x)
	{
		int mul=1;
		while(x>0)
		{
			mul=mul*x;
			x--;
		}
		return mul;
	}
}