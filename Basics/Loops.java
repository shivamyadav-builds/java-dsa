public class Loops {
    static void main(){
    // Print numbers in range 50 to 100 which are divisible by 7

    for (int i=50; i<=100;i++){
        if(i%7 == 0){
            System.out.print(i+"  ");
           }
        } 
    System.out.println();

    // print even numbers
    System.out.print("Even Numbers : ");
    for(int i =2 ;i<100; i+=2){
        System.out.print(i + " ");
    }
  }
}
