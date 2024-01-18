import java.lang.*;
import java.util.*;
class Keybread{
	//private static final String C = C;
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int a,b,c,d;
	System.out.println("Enter three numbers");
	a = s.nextInt();
	b = s.nextInt();
	c = s.nextInt();
	d = ((a-b+c)*2)*2;
	System.out.println("Result is " +d);
}
}


