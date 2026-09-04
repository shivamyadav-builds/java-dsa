public class Operator {
    static void main(){

    // Assignment Operator: = , += , -= , *= , /= ,%=    
        int a = 5 ,b = 2;

    // Airthematic Operators
        int sum = a+b ;
        int diff = a-b;
        int product = a*b;
        float quotient = (float)a/b;
        int remainder = a%b;

        System.out.println("Sum is = "+ sum);
        System.out.println("Difference is = "+diff);
        System.out.println("Product is = "+product);
        System.out.println("Division is = "+quotient);
        System.out.println("Remainder is ="+remainder);
        System.out.println();

    // Relational Operator
      System.out.println(a==b);
      System.out.println(a!=b);
      System.out.println(a>b);
      System.out.println(a<b);
      System.out.println(a>=b);
      System.out.println(a<=b);
      System.out.println();

    // Logical Operator
    boolean isMale = true;
    boolean isFemale = false;
      System.out.println(isMale && isFemale);   // AND
      System.out.println(isMale || isFemale);   // OR
      System.out.println(!isFemale);// NOT
      System.out.println();

    //Unary Operator    
     int num= 10;
        boolean value = true;

        System.out.println("UNARY OPERATOR:");
        System.out.println("Original value of num: " + num);

        // Unary plus
        System.out.println("+num = " + (+num));

        // Unary minus
        System.out.println("-num = " + (-num));

        // Pre-increment
        System.out.println("++num = " + (++num));

        // Post-increment
        System.out.println("num++ = " + (num++));
        System.out.println("After num++ = " + num);

        // Pre-decrement
        System.out.println("--num = " + (--num));

        // Post-decrement
        System.out.println("num-- = " + (num--));
        System.out.println("After num-- = " + num);

        // Logical NOT
        System.out.println("!value = " + (!value));

        // Bitwise complement
        System.out.println("~num = " + (~num));
    }
}
    