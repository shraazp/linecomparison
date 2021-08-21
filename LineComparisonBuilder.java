package line;
import java.util.Scanner;
public class LineComparisonBuilder 
{
	//class members
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	//parameterized constructor
	public LineComparisonBuilder(int x1,int y1,int x2,int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	//method to get the length of line
	public double  length()
		{
			return Math.pow(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)),0.5);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparison problem!!!!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the end points of the line 1:(x1,y1),(x2,y2)");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		//object is created with parameters obtained by user
		LineComparisonBuilder l1=new LineComparisonBuilder(x1,y1,x2,y2);
		System.out.println("Enter the end points of the line 2:(p1,q1),(p2,q2)");
		int p1=sc.nextInt();
		int q1=sc.nextInt();
		int p2=sc.nextInt();
		int q2=sc.nextInt();
		//object is created with parameters obtained by user
		LineComparisonBuilder l2=new LineComparisonBuilder(p1,q1,p2,q2);
		double length;
		length=l1.length();
		System.out.println("The length of the line1  is "+length);
		//converted to object
		Double length1 = new Double(length);
		length=l2.length();
		System.out.println("The length of the line2  is "+length);
		//length is converted to an object
		Double length2=new Double(length);
		//equal to function is used
		if(length1.equals(length2))
			System.out.println("The lines are equal!!!");
		else
			System.out.println("The lines are not equal!!!");
		//compareTo function is usd to compare lengths
		int result=length1.compareTo(length2);
		if(result==1)
			System.out.println("line1 is greater than line2!!!");
		else if(result==-1)
			System.out.println("Line1 is smaller than line2");
		
	}

}
