package line;
import java.util.Scanner;
public class LineComparisonBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to line comparison problem!!!!!");
		int x1,y1,x2,y2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the end points of the line:(x1,y1),(x2,y2)");
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		double length=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
		System.out.println("The length of the line  is "+length);
		sc.close();
	}

}
