public class Function {
      
      static int add(int a ,int b){    // since we run our program without creating object through-
            int sum = a + b;           //static main fn so we have to create static fn to call
            return sum;
     
      }

      static void multiples(int x){  // void fn does not return anything
            System.out.println("Tables of " + x + " :");
            for(int i=1;i<=10;i++){
                  System.out.println(x*i);
            }
      }
      static void main(){
            int sumOfNumbers = add(2,5);
            System.out.println("Sum of the number : " + sumOfNumbers);

            multiples(5);

      }
}
