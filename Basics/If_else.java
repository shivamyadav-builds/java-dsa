import java.util.Scanner;
public class If_else {
    static void main(){
        int a;
        int b;
        String operator;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of number a : ");
        a = sc.nextInt();

        System.out.print("Enter value of number b : ");
        b = sc.nextInt();

        System.out.print("Enter operator you want to operate : ");
        operator = sc.next();

        if(operator.equals("+")){
            System.out.println("Sum is " + (a+b));
        }
        else if(operator.equals("-")){
            System.out.println("Difference is " + (a-b));
        }
        else if(operator.equals("*")){
            System.out.println("Product is " + (a*b));
        }
        else if(operator.equals("/")){
            System.out.println("Quotient is " + (float)((float)a/(float)(b)));
        }
        else if(operator.equals("%")){
            System.out.println("Remainder is " + (double)(a%b));
        }
        else{
            System.out.println("Operator is not in range ,Please enter a valid operator .");
        }
        sc.close();
    }
}
