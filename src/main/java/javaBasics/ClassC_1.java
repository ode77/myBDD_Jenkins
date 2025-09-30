package javaBasics;

public class ClassC_1 {

    public static void main(String[] args) {
        int sumA = 10+20;
        System.out.println(sumA);

        int sumB = sumA + 40;
        System.out.println(sumB);

//        LOGICAL AND [ Return True if statement is all true].
        int x = 9;
        System.out.println(x<10 && x <20);

//        LOGICAL OR [ Return True if one of the  statement is true].
        int y = 15;
        System.out.println(y<10 || y <20);

//        LOGICAL NOT [ Return False if the result is true].
        System.out.println(!(y<10 || y <20));
    }
}
