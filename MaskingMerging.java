
import java.lang.*;
public class MaskingMerging {
    public static void main(String args[]) {
//        Masking and Merging
        byte a = 9, b = 12;
        byte c; // we have to store both values 9 and 12 in single variable C
        //c = (byte) (a << 4);
        c = (byte) (9 << 4);
        //c = (byte) (c | b);
        c = (byte) (c | 12);
//        here bitwise masking you can read the number
        System.out.println((c&0b11110000) >>4);
//        this way we can read first four bits from left side
        System.out.println((c&0b00001111));
//        this way we can read right four bit
    }
}
