import java.util.*;

abstract class Marks
{
	static int getPercentage(int m1, int m2)
	{
		int p = (m1+m2)/2;
		return p;
	}
}

class A extends Marks
{
	static int getPercentage(int m1, int m2, int m3)
	{
		int p = (m1+m2+m3)/3;
		return p;
	}
}

class B extends Marks
{
	static int getPercentage(int m1, int m2, int m3, int m4)
	{
		int p = (m1+m2+m3+m4)/4;
		return p;
	}
}

public class Que1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 3 subjects for student A:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Enter the marks of 4 subjects for student B:");
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		A a1 = new A();
		B b1 = new B();

		int p1 = a1.getPercentage(a, b, c);
		int p2 = b1.getPercentage(w, x, y, z);

		System.out.println("Percentage of marks of student A are: " +p1);
		System.out.println("Percentage of marks of student B are: " +p2);
		
	}
}
