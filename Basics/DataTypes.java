public class DataTypes {
    static void main(){
        System.out.println("byte :");
        byte num_1 = 66;  // range of byte datatype is -128 to 127 
        byte num_2 = 127;

        System.out.println(num_1);
        System.out.println(num_2);
        System.out.println(num_1+num_2);
        System.out.println();

        System.out.println("short : ");
        short num_3 = 120;
        short num_4 = 30000;
        short num_5 = 32767;  // range of short datatype is -32768 to 32767

        System.out.println(num_3);
        System.out.println(num_4);
        System.out.println(num_5);
        System.out.println();

        System.out.println("int : ");
        int num_6 = 24545;
        int num_7 = 2147483647; //Range of int datatype is -2^311 to (2^31 -1)

        System.out.println(num_6);
        System.out.println(num_7);
        System.out.println();

        System.out.println("long : ");
        long num_8= 466788892; // Range of long datatype is -2^63 to (2^63-1)
        System.out.println(num_8);
        System.out.println();

        System.out.println("float : ");
        float num_9 = 83.267856f;         //print 6 decimal precesion
        System.out.println(num_9);
        System.out.println( );

        System.out.println("double : ");
        double num_10 = 345.789907945665679;     // print 15 decimal presion
        System.out.println(num_10);
        System.out.println();

        System.out.println("boolean : ");
        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);
        System.out.println();

        System.out.println("char : ");
        char firstCharacter = 'A';
        System.out.println("My first character is:"+firstCharacter);
        System.out.println("Character next to it : " +(char)(firstCharacter + 1));
        System.out.println();


        // Typecasting
        System.out.println("Typecasting : ");

        int newnum = (int)num_8;        // long to int
        System.out.println(newnum);

        byte new_num3 = (byte)num_3;    // short to byte
        System.out.println(new_num3);

        short new_num6 = (short)num_6;  // int to short
        System.out.println(new_num6);

 
    }
}
