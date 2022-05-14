package com.bridgelabz.BasicFunctionalPrograms;

public class SumOfThreeIntegers {
    public static void main(String[] args)
    {
        int arrayOfIntegers[] = { 1, 2, -3, 1, 0 };
        int sizeOfArray = arrayOfIntegers.length;
        int tripletsCount = 0;
        for (int firstIndex = 0; firstIndex < sizeOfArray - 2; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < sizeOfArray - 1; secondIndex++) {
                for (int thirdIndex = secondIndex + 1; thirdIndex < sizeOfArray; thirdIndex++) {
                    if (arrayOfIntegers[firstIndex] + arrayOfIntegers[secondIndex] + arrayOfIntegers[thirdIndex] == 0) {
                        System.out.println(arrayOfIntegers[firstIndex] + " " + arrayOfIntegers[secondIndex] + " "
                                + arrayOfIntegers[thirdIndex]);
                        tripletsCount++;

                    }
                }
            }
        }
        System.out.println("The total number of triplets that add to 0 are: " + tripletsCount);
    }
}

