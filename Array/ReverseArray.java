public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};

        int[] reverse = new int[arr.length];

        int j = 0;
        for(int i = arr.length - 1; i >= 0; i--) {
            reverse[j] = arr[i];
            j++;
        }

        System.out.println("Reverse of Array:");

        for(int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }
}