package javaBasics;

public class ClassH_WhileLoops {
 //    while loops are used to execute a block of code repeatedly as long as a specified condition is true.

    public static void main(String[] args) {
        int a = 10;
        while (a <= 20){
            System.out.println(a);
            a++;
        }


//        DO WHILE loop executes a block of code once, and then repeats the loop as long as a specified condition is true.
        int b = 5;
        do {
            System.out.println(b);
            b++;
        }while (b<10);
    }

}

