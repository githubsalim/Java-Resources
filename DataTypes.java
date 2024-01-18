import java.lang.*;
public class DataTypes {
    //integral numeric value - byte, short, int, long
    //floating decimal values - float, double positive and negative
    //char - Char can't be negative, Java support other natural languages other than english. C support only english
    // All other lang's we've unicode (java support), for eng code is ASCII
    //boolean - In other lang true means 1 and false 1, in java True/false is reserve keyword
    public static void main (String arg[]){
        //primitive data type
        System.out.println("Int Min: " +Integer.MIN_VALUE);
        System.out.println("Int Max: " +Integer.MAX_VALUE);
        System.out.println("Int Bytes: " +Integer.BYTES);
        System.out.println("-*--*--*--*--*--*--*--*--*--*-");
        System.out.println("Byte Min: " +Byte.MIN_VALUE);
        System.out.println("Byte Max: " +Byte.MAX_VALUE);
        System.out.println("Byte Bytes: " +Byte.BYTES);
        System.out.println("-*--*--*--*--*--*--*--*--*--*-");
        System.out.println("Short Min: " +Short.MIN_VALUE);
        System.out.println("Short Max: " +Short.MAX_VALUE);
        System.out.println("Short Bytes: " +Short.BYTES);
        System.out.println("-*--*--*--*--*--*--*--*--*--*-");
        System.out.println("Long Min: " +Long.MIN_VALUE);
        System.out.println("Long Max: " +Long.MAX_VALUE);
        System.out.println("Long Bytes: " +Long.BYTES);
        System.out.println("-*--*--*--*--*--*--*--*--*--*-");
        System.out.println("Float Min: " +Float.MIN_VALUE);
        System.out.println("Float Max: " +Float.MAX_VALUE);
        System.out.println("Float Bytes: " +Float.BYTES);
    }
}
