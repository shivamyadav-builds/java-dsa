import java.util.Scanner;
public class Array_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declaration
        int arr[];
        //allocation
        arr = new int[5];
        //inialisation of another array
        int brr[] = {11,22,33};

        // accessing element of array
        System.out.println("Value at 0 index "+brr[0]);
        System.out.println("Value at 1 index "+brr[1]);
        System.out.println("Value at 2 index "+brr[2]);

        for(int index=0; index<brr.length;index++){
            System.out.print(brr[index] + " ");
        }
        System.out.println();
    
        //using for each loop
        for (int val : brr){     // print each int value in brr array
            System.out.print(val+" ");
        }
        System.out.println("\n");

        //taking input in java
        System.out.print("Enter your arr (array) :");
        for(int index = 0; index<arr.length;index++){
            arr[index] = sc.nextInt();
        }
        System.out.println();

        //printing arr
        System.out.print("Your entered arr (array) is :");
        for(int index = 0; index<arr.length;index++){
            System.out.print(arr[index]+" ");
        }
        System.out.println();
        sc.close();
}
}
