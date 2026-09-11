import java.util.Scanner;
public class String01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //creation of string
        String str = "Shivam"; 

        String intro = new String("I am Shivam Yadav  doing (Btech in computer science and engineering.)");

        System.out.println(str);
        System.out.println(intro);



        System.out.println("Enter Your name :");
        String name = sc.nextLine();

        System.out.println(name);

        //Methods of String
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));

        System.out.println("Length of name :"+name.length());

        sc.close();
    }
    
}
