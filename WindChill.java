package com.bridgelabz.BasicFunctionalPrograms;

public class WindChill {
    public static void main(String[] args)
    {
        double temperature = 20;
        double windSpeed = 110;

        if (Math.abs(temperature) > 50) {
            System.err.println("The value of temperature in Fahrenheit cannot be larger that 50");
            System.exit(0);
        }
        if (windSpeed > 120 || windSpeed < 3) {
            System.err.println("The value of Wind Speed in mph must be between 3 and 120");
            System.exit(0);
        }
        double windChill = 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        System.out.println("The Wind Chill Temperature is: " + Math.round(windChill) + " Fahrenheit");
    }
}

