import java.util.Scanner;
public class Max_MinOf2Darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][5];

        System.out.println("Enter element of your 2d array :");
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[i].length ; j++ ){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n\nArray :");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Max of 2d Array
        int max = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum of (arr) Array : "+ max);
        System.out.println();

        //Min of 2D Array
        int min = arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }
        System.out.println("Minimum of (arr) Array :"+ min);
        sc.close(); 
    }
}
