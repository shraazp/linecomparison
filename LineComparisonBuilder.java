package line;
import java.util.Scanner;
public class LineComparisonBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparison problem!!!!!");
		int x1,y1,x2,y2;
		int p1,q1,p2,q2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the end points of the line 1:(x1,y1),(x2,y2)");
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		System.out.println("Enter the end points of the line 2:(p1,q1),(p2,q2)");
		p1=sc.nextInt();
		q1=sc.nextInt();
		p2=sc.nextInt();
		q2=sc.nextInt();
		double length1=Math.pow(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)),0.5);
		System.out.println("The length of the line1  is "+length1);
		double length2=Math.sqrt(((p2-p1)*(p2-p1))+((q2-q1)*(q2-q1)));
		System.out.println("The length of the line2  is "+length2);
		if(length1==length2)
			System.out.println("The lines are equal!!!");
		else
			System.out.println("The lines are not equal!!!");
		sc.close();
	}

}
