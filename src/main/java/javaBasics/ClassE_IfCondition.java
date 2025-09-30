package javaBasics;

// USE IF TO SPECIFY A BLOCK OF CODE TO BE EXECUTED IF A SPECIFIED CONDITION IS TRUE.

public class ClassE_IfCondition {

    public static void main(String[] args) {

        int Day = 4;
        if (Day == 1) {
            System.out.println("Sunday");
        }
        else if (Day == 2) {
            System.out.println("Monday");
        }
        else if(Day == 3){
            System.out.println("Tuesday");
        }
        else if(Day == 4){
            System.out.println("Wednesday");
        }
        else if(Day == 5){
            System.out.println("Thursday");
        }
        else if(Day == 6){
            System.out.println("Friday");
        }
        else if(Day == 7){
            System.out.println("Saturday");
        }
        else {
            System.out.println("Please Enter a value between 1 and 7");
        }
    }

}

