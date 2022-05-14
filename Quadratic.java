package com.bridgelabz.BasicFunctionalPrograms;

public class Quadratic {
    public static void main(String[] args)
    {
        int a = 1;
        int b = 1;
        int c = 1;
        double realRoot1, realRoot2, complexRoot;

        if (a == 0) {
            System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Invalid");
            return;
        }
        int delta = b * b - 4 * a * c;
        if (delta > 0) {
            System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Real and Unique");
            realRoot1 = (-b + Math.sqrt(delta)) / (2 * a);
            realRoot2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1: " + realRoot1);
            System.out.println("Root 2: " + realRoot2);
        }
        else if (delta == 0) {
            System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Real and Equal");
            realRoot1 = (-b / (2 * a));
            System.out.println("Root 1 and Root 2: " + realRoot1);

        }
        else {// d>0
            System.out.println("The roots of the equation " + a + "*x^2 + " + b + "*x + " + c + " are Complex");
            realRoot1 = -b / (2 * a);
            complexRoot = Math.sqrt(Math.abs(delta));
            System.out.println("Root 1: " + realRoot1 + " + i" + complexRoot);
            System.out.println("Root 1: " + realRoot1 + " - i" + complexRoot);
        }
    }
}

