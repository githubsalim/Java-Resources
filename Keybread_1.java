

import java.util.Scanner;

class Keybread_1{
	public static void main (String arg[]){
		Scanner s=new Scanner(System.in);
		String yourname;
		System.out.println("May I know your name please?");
		yourname = s.nextLine();
		System.out.println("Welcome onboard Mr./Mrs. " +yourname);
	}
}

