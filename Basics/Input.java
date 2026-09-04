import java.util.Scanner;

public class Input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age :");       // integer input
        int age = sc.nextInt(); 

        System.out.println("Entered age ="+ age);

        System.out.print("Enter number 1 : ");      // floating value input
        double num_1 = sc.nextDouble();

        System.out.print("Enter the number 2 : ");
        double num_2 = sc.nextDouble();

        double sum = num_1 + num_2;
        System.out.println("Sum : " + sum );
        

        sc.close(); // close object to prevent resouce leak
 
    }
}
