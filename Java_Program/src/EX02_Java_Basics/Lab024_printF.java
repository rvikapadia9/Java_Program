package EX02_Java_Basics;

public class Lab024_printF {
    public static void main(String[] args) {

        int a= 10;
        int b = 20;
//        System.out.println(a);
//        System.out.println(b);

//        System.out.print(a);
//        System.out.print(b);

        System.out.printf("Value of a=%d",a);
        System.out.println();
        System.out.printf("Value of b=%d",b);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        System.out.println();
        int table = 9;
        System.out.printf("%dx1=%d %n", table, table*1);
        System.out.printf("%dx2=%d %n", table, table*2 );
        System.out.printf("%dx3=%d %n", table, table*3);
        System.out.printf("%dx4=%d %n", table, table*4);
        System.out.printf("%dx5=%d %n", table, table*5);
        System.out.printf("%dx6=%d %n", table, table*6);
        System.out.printf("%dx7=%d %n", table, table*7);
        System.out.printf("%dx8=%d %n", table, table*8);
        System.out.printf("%dx9=%d %n", table, table*9);
        System.out.printf("%dx10=%d %n", table, table*10);








    }
}