public class Max_MinOfArray {
    public static void main(String[] args) {
        int arr[] = {11,3,45,78,55,23,89,7,8,33};
        int max = arr[0];
        int min = arr[0];

        //Maximum of array
        for(int i=0; i<arr.length ; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum of arr :" + max);

        //Minimum of Array
        for(int i= 0; i<arr.length ; i++){
            if(min>arr[i]){
                min =arr[i];
            }
        }
        System.out.println("Minimum of Array :" + min);
    }
}
