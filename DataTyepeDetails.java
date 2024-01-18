import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class DataTyepeDetails {
    public static void main(String arg[]){
        //how but patterns look like
        int x=-5; //output - 11111111111111111111111111111011 (saved in 32 bits in 2's compliment form)
        System.out.println(Integer.toBinaryString(x));
        //if you want to use in byte or short you must convert in into integer
        //for float there is no method to convert in binary string

        // every electronic device follow IEEE 754 standard, zero is signed, meaning that there exist both a "positive zero" (+0) and a "negative zero" (−0
        //How floating points number 163.52 is stored in memory
        //163.52X100/100 = 16352X10 power(-2)
        //16352 is mantissa

        //10 power(-2) exponent. Expo always 10 ki power
        //16352E(-2)

        /* *********************************************** */
        // double - if you want more precise value than go for double
        //if you want num 12.539462 - upto 6 digits float is suitable else double (support 14-15 digits after decimal)

        /* *********************************************** */
        // Computer doesn't support alphabets, we use numeric values instead of these char.
        // ASCII code is there for upper case english and lowercase, numeric digits, anything find in keyboards like special chars
        // Every programming language support UNICODE, these unicode works as supporting language ex converting into Hindi, Bangla, Spanish, German. etc. unicode.org
        // (A - 65)--- (Z-90) -- values 0-127
        // (a - 97) --- (z - 122) -- 7 bits
        // (0- 48) --- (9 - 57)
        //that's why java support char in 2 bits size

    }
}
