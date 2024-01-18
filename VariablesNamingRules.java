import java.lang.*;

public class VariablesNamingRules {
    /*
    Case sensitive - lower/upper case is different
    Contains alphabets, nums, except _ or $
    Start with alphabets, _ or $
    Should not be built-in-keyword, classname,
    No limit on length, follow camel cases
     */
    public static void main(String arg[]) {
        //Case sensitive, flexibility to programmer can use same with diff cases
       // int amount;
        //int Amount;
        //int x;
        //float X;
        //Contains alphabets, nums, except _ or $
        //int roooms1;
        //int cabin151;
        //int room_number;
        //float total$amount;
        //    Start with alphabets, _ or $
        //byte x1; //1x not allowed
        //byte _x;
        //byte $x; //int String not allowed (String, Integer is class)
        //int numbers$ofStudent$inCSE$$department; //this is allowed
        //byte roll_number;
        //byte rollNumber; // recommended
        //float averageMarksOfClass;
        /* this is  and this notation followed by java. It is easy to read
         every first word caps except very first word */
        int String=10;
      System.out.print(String);
    }

}
