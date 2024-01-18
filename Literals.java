import java.lang.*;
public class Literals {

    /*
    Literals are constant values z=5*x+7*y. Literals have data type too
    int value =25 (integer literals)
    double price = 152.24; (double literal)
    area =3.1425* radius*radius;
    char c='A'; (Single quotes char)
    String srt = "Java"; (double quotes string)

     | data type | Literal |
     |-------    |------ |
     | byte      | int   |   byte b=5;
     | short     | int   |   short f=25;
     | int       | int   |   int g=454;
     | long      | L or l |  5l
     | float     | F or f |  2.5f
     | double    | D or d |  2.5d
     | char      | '' |
     | boolean   | true/false |

     Decimal *** 0-9 --- b=10;
     Binary *** 0,1 --- byte b=0b1010;
     Octal *** 0-7  --- b=012;
     Hexadecimal *** 0-9,A,B,C,D,E,F --- b=0xA;
     */

    public static void main (String arg[]){
        byte b1=10;
        byte b2=0b1010;
        byte b3=012;
        byte b4=0XA;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        //long l=999999999999L;
        //int i=125l; //assign literal to its compatible data type only. This shouldn't have long literal
        float f=12.56f; //by default double, larger than float. Making its float write F
        double d=1234_563_4234_234.56;//not allowed underscore after last digit
        long l=9999_99999; //before and after decimal not allowed underscore
        System.out.println(d);
        System.out.println(l);
    }
}
