public class WideningNarrowingDemo {
    public static void main(String args[]){
        //widening
        byte b=15;
        short s=327;
        int i=10;
        long l=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bool=true;

        b=(byte)s; //by narrowing of typecasting data, you may loose data.
        // we are ready to bear loss 1 byte length is 127. If put value 126 easily accommodate data
        //System.out.println(b);
        //when widening is not possible then go for narrowing, down casting, type casting
        //smaller right hand and bigger left side is allowed
        //i=f; //not allowed
        f=i; //allowed
        d=f; //allowed
        //f=d; //not allowed
        f=(float)d; // allowed
        //if want to force it then use type caste
        i=(int)f; //float value can't assign in int, if force may loose data
        System.out.println(i);

        //Byte - Typecasting is possible for b,s,i,l,f,d but not possible for boolean and char data type
        //short - Typecasting is possible for b,i,l,f,d but not possible for boolean and char data type
        //int - Typecasting is possible for i,l,f,d,c but not possible for boolean data type
        //long - Typecasting is possible for l,f,d but not possible for boolean and char data type
        //float - Typecasting is possible for f,d but not possible for boolean and char data type
        //double - Typecasting is possible for d but not possible for boolean and char data type
        //char - Typecasting is possible for i,l,f,d,c but not possible for boolean data type
        //boolean - Typecasting is only possible for boolean data type

        //Byte>>Short>>Int>>Long>>Float>>Double
        //Char>>Int>>Long>>Float>>Double






    }
}
