import java.util.*;

interface Series
{
	void start(int x);
	void next(int n);
	void reset();
}

class OddSeries implements Series
{
	int x;
	int n;

	public void start(int x)
	{
		this.x = x;
	}

	public void next(int n)
	{
		this.n = n;
	}

	public void reset()
	{
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
		{
			arr[i] = x + 2*i;
		}

		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
}

public class Que3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting element: ");
		int x = sc.nextInt();
		System.out.println("Enter the no. of elements: ");
		int n = sc.nextInt();

		OddSeries O = new OddSeries();
		O.start(x);
		O.next(n);
		O.reset();
	}
}