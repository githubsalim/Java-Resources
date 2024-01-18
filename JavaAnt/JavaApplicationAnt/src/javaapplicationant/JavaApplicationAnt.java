package javaapplicationant;
public class JavaApplicationAnt {
    public static void main(String[] args) {
        String str1 = "Java Program"; //Java Program called String Literal pool; str1 is the reference  
        String str2 = new String("JAVA"); // adding new mean object will create in Heap str2 reference holding this object
        char c[] = {'H','E','L','L','O'};
        String str3 = new String(c);
        //System.out.println(str3);
        
        //creating string using byte 
        byte b[]={65,66,67,68,69,70};
        String str4 = new String(b);
        System.out.println(str4);
        
        //Extends
        class One {
            public void methodOne(){
                    // Some Functionality
            }
        }
        class Two extends One {
                public static void main(String args[]){
                        Two t = new Two();
                        // Calls the method one
                        // of the above class
                        t.methodOne();
                }
        }
    }
}


        
