package com.company;

public class Main {
    public static void main(String[] args) {

    }

    public static void homework2() {
        int w = 11;
        int output;

        if (w <= 2) {
            output = 3;
        } else if (w <= 5) {
            output = (w - 2) * 2 + 3;
        } else {
            output = (w - 5) * 3 + 9;
        }
        System.out.println(output);
    }

    public static void homework3_1() {
        int a = 0;

        int p = 1;

        for (int i = 0; i < a; i++) {
            p *= 3;
        }
        System.out.println(p);
    }

    public static void homework3_2() {
        int a = 0;
        int b = 0;

        int p = 1;

        for (int i = 0; i < a; i++) {
            p *= b;
        }
        System.out.println(p);
    }

    public static void homework4() {
        int i = 0;
        boolean found = false;

        while (!found) {
            if ((i * i * i + 91) % 47 == 0) {
                System.out.print(i);
                found = true;
            }
            i += 1;
        }
    }

    public static void homework5() {
        long max = 0;
        for (long t = 0; t <= 100 - 1; t++) {
            long first = t * (t - 20) * (t - 100) + 120000;
            long second = (t + 1) * ((t + 1) - 20) * ((t + 1) - 100) + 120000;

            long decrease = first - second;
            if (decrease > max) {
                max = t;
            }


        }
        System.out.printf("From hour %d to hour %d\n", max, max + 1);
    }
}
