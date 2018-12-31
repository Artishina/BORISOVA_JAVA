package ru.itpark;

import java.util.*;

class Main {
    public static double f(double x) {
        return x * x;
    }

    public static double integralByRectangles(double a, double b, int n) {
        double result = 0, h, x;

        h = (b - a) / n;

        for (int i = 0; i < n; i++) {
            x = a + h * (i + 0.5);
            result += f(x);
        }

        result *= h;
        return result;
    }

    public static double integralBySimpson(double a, double b, int n) {
        double h, x, result, sum2x = 0, sum4x = 0;

        h = (b - a) / n;

        for (int i = 1; i < n; i += 2) {
            x = a + h * i;
            sum4x += f(x);
        }

        for (int i = 2; i < n - 1; i += 2) {
            x = a + h * i;
            sum2x += f(x);
        }

        result = f(a) + f(b);
        result = (h / 3) * (result + 4 * sum4x + 2 * sum2x);

        return result;
    }

    public static double integralByTrapezoid(double a, double b, int n) {
        double result = 0, y = 0, x, h;
        h = (b - a) / n;

        y += f(a) + f(b);

        for (int i = 1; i < n; i++) {
            x = a + h * i;
            y += 2 * f(x);
            result = (h / 2) * y;
        }

        return result;
    }


    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit");
        double a = scanner.nextDouble();
        System.out.println("Enter the upper limit");
        double b = scanner.nextDouble();
        System.out.println("Enter the step size");
        int n = scanner.nextInt();


        System.out.println(integralByRectangles(a, b, n));
        System.out.println(integralBySimpson(a, b, n));
        System.out.println(integralByTrapezoid(a, b, n));

    }
}