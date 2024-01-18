import java.lang.*;
public class MergingSwapping {
    public static void main(String args[]){
//        Swapping two numbers
        int a=10, b=15;
        System.out.println("Actual value of A = " +a+ " " + "and Actual value of B = " +b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping Result of A = " +a+ " " + "and Result of B = " +b);

    }
}
