import java.util.Random;

/**
 * Usage of Conditional Statements and Iterations
 * <p>
 * Keywords used : if,else, switch,case,break,default,for,do,while,continue
 */
public class Main {

    public static void main(String[] args) {


        demoIfElse();

        demoSwitch();

        demoForLoop();

        demoWhileLoop();

        demoDoWhileLoop();
    }

    /**
     *
     */
    private static void printStar() {
        System.out.println("************************************************************");
    }

    private static void demoIfElse() {

        int a = new Random().nextInt(20);

        System.out.println("a " + a);
        printStar();
        //Only if
        if (a > 0) {
            System.out.println("Only if ::  a  is greater than 0  ");
        }
        printStar();
        //if...else
        if (a % 2 == 0) {
            System.out.println("if...else:: a is even number");
        } else {
            System.out.println("if...else::  a is odd number");
        }

        printStar();
        //if...else if ... else
        if (a > 0) {
            System.out.println("if...else if ... else:: a is greater than zero ");
        } else if (a < 0) {
            System.out.println("if...else if ... else:: a is less than zero");
        } else {
            System.out.println("if...else if ... else:: a is equal to  zero");
        }
        printStar();
        // nested if...else
        if (a > 0) {
            System.out.println("nested if...else ::  a is grater than zero ");
            if (a < 10) {
                System.out.println("nested if...else :: a is less than 10 ");
            } else {
                System.out.println("nested if...else :: a is less than or equal to 10 ");
            }
        }
    }


    private static void demoSwitch() {

        printStar();

        int dayOfWeek = new Random().nextInt(10);

        System.out.println(" Day of Week " + dayOfWeek + " ");
        switch (dayOfWeek) {
            case 1:

                System.out.println(" Its Monday");
                break;
            case 2:

                System.out.println(" Its Tuesday");
                break;
            case 3:

                System.out.println(" Its Wensday");
                break;
            case 4:

                System.out.println(" Its Thursday");
                break;
            case 5:

                System.out.println(" Its Friday ");
                break;
            case 6:
            case 7:

                System.out.println(" Its  week end ");
                break;
            default:
                System.out.println(" Invalid Input");
                break;
        }


    }


    private static void demoForLoop() {
        printStar();
        System.out.println(" Demo For Loop :: Initialization,Condition,expression ");

        for (int i = 1; i <= 5; i++) {
            System.out.println(" i = " + i);
        }

        printStar();
        System.out.println(" Demo For Loop :: continue & break");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("called continue for i = " + i);
                continue;
            }
            if (i == 5) {
                System.out.println(" called Break for i = " + i);
                break;
            }
            System.out.println(" i = " + i);
        }

        printStar();
        System.out.println(" Demo For Loop :: optional initialization ");
        int i = 5;
        for (; i > 0; i--) {
            System.out.println(" i = " + i);
        }

        printStar();
        System.out.println(" Demo For Loop :: optional initialization & expression");
        int j = 1;
        for (; j <= 5; ) {
            System.out.println(" j = " + j);
            j++;
        }

        printStar();
        System.out.println(" Demo For Loop :: optional initialization , condition &  expression, Use if & break statements to terminate loop");
        j = 1;
        for (; ; ) {
            System.out.println(" j = " + j);
            j++;

            if (j > 5) {
                break;
            }
        }
        printStar();
        System.out.println(" Nested for loop");

        System.out.println(" Lets have fun while printing patterns");
        int max = 11;
        int min = 0;

        for (int x = min; x < max; x++) {
            for (int y = min; y < max; y++) {
                if (x == y && x + y == max - 1) {
                    System.out.print("X");
                } else if ((y == min || y == max - 1) && (x != y) && (x + y != max - 1)) {
                    System.out.print("|");
                } else if ((x == min || x == max - 1) && (x != y) && (x + y != max - 1)) {
                    System.out.print("-");
                } else if (x == y) {
                    System.out.print("\\");
                } else if (x + y == max - 1) {
                    System.out.print("/");
                } else if (x > y && x + y < max) {
                    System.out.print("$");
                } else if (x > y && x + y >= max) {
                    System.out.print("@");
                } else if (x < y && x + y < max) {
                    System.out.print("#");
                } else if (x < y && x + y >= max) {
                    System.out.print("%");
                }

            }
            System.out.println("");

        }
    }

    private static void demoWhileLoop() {

        printStar();
        //intialization
        int i = 0;

        //Condition
        while (i <= 5) {

            //change loop variable
            i++;

            if (i % 2 == 0) {
                System.out.println("called continue for i = " + i);
                continue;
            }
            if (i == 3) {
                System.out.println("called break for i = " + i);
                break;
            }

            System.out.println(" i = " + i);


        }
    }


    private static void demoDoWhileLoop() {

        printStar();
        //intialization
        int i = 0;

        //at least once execution is guaranteed
        do {
            //change loop variable
            i++;

            if (i % 2 == 0) {
                System.out.println("called continue for i = " + i);
                continue;
            }
            if (i == 3) {
                System.out.println("called break for i = " + i);
                break;
            }

            System.out.println(" i = " + i);

            //change loop variable
            i++;
        } while (i <= 5);//Condition is checked after execution of loop body
    }
}
