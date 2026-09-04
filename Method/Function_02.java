public class Function_02 {
    
    static void square(int num){
         System.out.println("Num inside fun :" + num);

        num = num*num;

        System.out.println("Num inside fn :" + num);

    }



    static void main(){
        int num = 5;
        System.out.println("Num inside main :" + num);
        square(num);
        System.out.println("Num inside main :" + num);  //since  it still print 5 after updating num to 25 
            //is because it was 'call by value' which send copy of num ,it does not change the actual memory.

    }
}
