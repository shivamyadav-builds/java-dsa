import java.util.Scanner;
public class OperationOnArray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
        int arr[];
        arr = new int[6];
        int sum = 0;
        int product = 1;

        System.out.println("Enter your array :");
        for (int i = 0;  i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Your entered array :");
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");

        //printing sum of array
        for(int i = 0; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array :"+ sum);

        //printing product of array
        for(int i = 0; i<arr.length ; i++){
            product = product*arr[i];
        }
        System.out.println("Product of Array :" + product);

        

        sc.close();

    }
}
