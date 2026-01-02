package Day3;

public class OperatorsDemo {

    public static void main(String[] args) {
        // 1) Arithmetic operators: + - * / %

        int a = 20, b = 10;

        int result = a + b; // Addition
        System.out.println("Sum of a and b is:" + result);

        // Direct addition inside println
        System.out.println("Sum of a and b is:" + (a + b));

        // Subtraction
        System.out.println("Diff of a and b is:" + (a - b));

        // Multiplication
        System.out.println("Multiplication of a and b is: " + (a * b));

        // Division (integer division)
        System.out.println("Division of a and b is: " + (a / b));

        // Modulo (remainder)
        System.out.println("Modulo division of a and b is:" + (a % b));
        
        //2)Relational/comparison operators > >= < <= !+ ==
        //Return Boolean Value -True/False
       
        System.out.println(a>b); //true
        System.out.println(a<b); //false
        System.out.println(a>=b); //true
        System.out.println(a<=b); //false
        b=20;
     
        System.out.println(a<=b); //true
        System.out.println(a>=b); //true
        
        
        System.out.println(a!=b); //false
        System.out.println(a==b); //true
    }
}