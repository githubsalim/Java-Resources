import java.util.StringJoiner;
public class Bitwise {
    public static void main(String args[]){
//        int x=10, y=6;
//        int z= x^y;
//        System.out.println(z);

//        int a = 10;
//        System.out.println(a++);
//        a++;
//        int x=10, y=20;
//        System.out.println("Sum of "+x+" and "+y+" is "+(x+y));

        //printF scientific representation -- format specifier
        int x=10;
        float y=0.0012f;
        char z='A';
        String str = "Java Program";
        //System.out.printf("Hi %e",y);
        //System.out.printf("Hi %s",str);
        //System.out.printf("%3$s %2$f  %1$d",x,y,str);


        //Demo of Flags and Width
        int a=-10;
        //System.out.printf("%010d",a);
        //System.out.printf("%( 5d",a);

        float num = 3.45f;
        String str1 = "Salim Ansari";
//        System.out.printf("%04.2f", num);
          System.out.format("%-20s", str1);

    }
}
