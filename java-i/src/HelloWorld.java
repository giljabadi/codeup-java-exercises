public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Exercise 1
        int myFavoriteNumber = 7;
        System.out.println(myFavoriteNumber);

        // Exercise 2
        String myString = "This is a Java String";
        System.out.println(myString);

        // Exercise 3: M is a char not a string
        // myString = 'M';

        // Exercise 4: 3.14159 is a double not a string
        // myString = 3.14159;

        // Exercise 5: myNumber is not initialized
        // long myNumber;
        // System.out.println(myNumber);

        // Exercise 6: 3.14 is a double not a long EXPLICIT
        // myNumber = 3.14;

        // Exercise 7:
        // myNumber = 123L;
        // System.out.println(myNumber);

        // Exercise 8: IMPLICIT
        // myNumber = 123;
        // System.out.println(myNumber);

        // Exercise 9: float type can't be assigned a double value
        // float myNumber = 3.14F;
        // System.out.println(myNumber);

        // Exercise 10.1
        // int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        // Exercise 10.2
        // System.out.println(++x);
        // System.out.println(x);

        // Exercise 11: 'class' is a reserved word
        // int class;

        // Exercise 12
        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // int three = (int) "3";

        // Exercise 13
        int x = 4;
        x += 5;

        x = 3;
        int y = 4;
        y *= x;

        x = 10;
        y = 2;
        x /= y;
        y -= x;

        System.out.println(x);
        System.out.println(y);

        // Exercise 14
        System.out.println(Integer.MAX_VALUE);
    }
}
