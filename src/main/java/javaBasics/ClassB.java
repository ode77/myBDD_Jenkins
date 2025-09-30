package javaBasics;


// A VARIABLE IS A WAY TO REPRESENT A VALUE
public class ClassB {
    public static void main(String[] args) {

        // Arithmetic operators
        int A = 10;
        int B = 20, C=22, D=33;
        int F = B*C;

        // Addition Operators
        System.out.println(A+B);

        // Subtraction Operator
        System.out.println( D-A);

        //Multiplication Operator
        System.out.println("Multiplication is :" + D*A);
        System.out.println("Multiplication is :" + F);

        //Division Operator
        System.out.println("Division is :" + D/A);

        // Modulo Operator
        System.out.println("Modulo is :" + D%A);

        // Increment Operator
        int H = 23;
        System.out.println(H);
        int HIncrement = (H++);
        System.out.println(H);
        int NewH = (H);
        System.out.println(NewH);

        // Decrement Operator
        int J = 40;
        System.out.println(J);
        int JDecrement = (J--);
        System.out.println(J);
        int NewJ = (J);
        System.out.println(NewJ);
    }
}
