public class String02 {
    public static void main(String[] args) {
        String firstName = "Shivam";
        String lastName = "yadav";

        if(firstName.equals(lastName)){            //do not use == for comparing string it chks whether 
          System.out.println("Both are equals");  // they are refering to same string literals in string pool 
        }                                            
            
        else{
            System.out.println("Both are not equals");
        }

        String a= "love";
        String b= "LOVE";


        if(a.equals(b)){
            System.out.println("Both are equals");
        }
        else{
            System.out.println("Both are not equals");
        }



        if(a.equalsIgnoreCase(b)){
            System.out.println("Both are equals");
        }
        else{
            System.out.println("Both are not equals");
        }




    }
}
