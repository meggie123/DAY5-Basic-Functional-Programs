package com.bridgelabz.BasicFunctionalPrograms;

public class Distance {
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double euclideanDistance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The Euclidean Distance from the point(" + x + "," + y + ") to the origin(0,0) is: "
                + euclideanDistance);
    }
}

