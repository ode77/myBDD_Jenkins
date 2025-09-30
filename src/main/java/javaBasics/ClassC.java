package javaBasics;

public class ClassC {
    public static void main(String[] args) {
        /*
        RELATIONAL OR COMPARISON OPERATORS
        Less than : a < b;
        Less than or equalTo : a <= b;
        Greater than : a > b;
        Greater than or equalTo: a >= b;
        EqualTo : a == b;
        Not EqualTo : a != b;
         */
        // A VARIABLE IS A WAY TO REPRESENT A VALUE

// Less than : a < b;
        int a = 30;
//        int a = 60;
        int b = 60;
        boolean c = (a<b);
        boolean d = (b<a);
        System.out.println(c);
        System.out.println(d);

// Less than or equalTo : a <= b;
        boolean e = (a<=b);
        boolean f = (b<=a);
        System.out.println(e);
        System.out.println(f);

//        Not EqualTo : a != b;
        boolean g = (a!=b);
        System.out.println(g);

//        EqualTo : a != b;
        boolean k = (a==b);
        System.out.println(k);
    }
}

