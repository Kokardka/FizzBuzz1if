package pl.wsis.java;

public class Main {

    public static void main(String[] args) {

        for (var i = 1; i < 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i + (i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : ""));
            } else {
                System.out.println(i);
            }
        }
    }
}