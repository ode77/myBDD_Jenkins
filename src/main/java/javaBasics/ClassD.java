package javaBasics;

public class ClassD {
    //    CREATING A METHOD

    private  int multiplication (int x, int y){
        return (x*y);
    }
    private  int division (int x, int y) {
        return (x / y);
    }

    private  int addition (int x, int y) {
        return (x + y);
    }
    // WITH STATIC I CAN CALL IT DIRECTLY TO RUN WITHOUT DECLARING AN OBJECTS OF THE CLASS.
    private static int subtraction (int x, int y) {
        return (x - y);
    }

    public static void main(String[] args) {
        ClassD classD = new ClassD();
        System.out.println(classD.addition(40, 10));
        System.out.println(classD.multiplication(20,70));
        System.out.println(classD.division(44, 12));
        System.out.println(subtraction(109, 47));

    }
}

