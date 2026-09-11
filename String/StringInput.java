import java.util.Scanner;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1,str2;

        System.out.println("Provide your string content:");
        str1 = sc.nextLine();

        System.out.println("Provide your string content:");
        str2 = sc.next();

        System.out.println("Values of nextline :"+str1);
        System.out.println("Values of next :"+str2);

    
        sc.close();
    }
    
}