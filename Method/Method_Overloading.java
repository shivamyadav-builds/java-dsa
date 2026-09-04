public class Method_Overloading {
    static void display(int x){

        System.out.println("Value of x is "+x);

    }
    static void display(String str){

        System.out.println("Name : "+ str);

    }
    static int display(int a,int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        display(2026);
        display("Shivam");
        System.out.println("Sum of Nums : " + display(9,9));
    }
}
