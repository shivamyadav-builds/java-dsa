import java.util.Scanner;
public class Two_D_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][];
        arr = new int [3][4];

        int brr[][] = {
                        {2,5,9},
                        {1,3,4},
                        {6,8,7}
                      };

        //printing 2D Array
        System.out.println("Your 2D Array :");
        for(int i = 0 ; i<brr.length ;i++){
            for(int j =0 ; j<brr[i].length ;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
        
        //taking input of 2d array :
        System.out.println("\nEnter Your Array :");
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nArr :");
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
