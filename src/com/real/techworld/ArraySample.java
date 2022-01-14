package com.real.techworld;


import java.util.Collection;

/*
* When to Use Array?
* https://www.guru99.com/array-data-structure.html
*https://www.geeksforgeeks.org/arrays-in-java/
*Here, are some reasons for using arrays in data structure:

Arrays are best for storing multiple values in a single variable
Arrays are better at processing many values easily and quickly
Sorting and searching the values is easier in arrays
*
*
* One-Dimensional Arrays:
* The general form of a one-dimensional array declaration is
*
* type var-name[];
OR
type[] var-name;
*
* */
public class ArraySample {

    //Example:
    int intArray1[];
    // OR
    static int[] intArray2 = new int[20];

    byte[] byteArray;
    short[] shotArray;
    boolean[] booleanArray;
    long[] longArray;
    float[] floatArray;
    double[] doubleArray;
    char[] chaArray;


    // an array of references to objects of
// the class MyClass (a class created by
// user)
    ArraySample myClassArray[];

    Object[]  ao;      // array of Object
    Collection[] ca;  // array of Collection
    // of unknown type


    public ArraySample ()
    {



    }


    public static void printIntArray()
    {
        intArray2[0] =1;
        intArray2[1] =2;
        System.out.println(intArray2[0]);
        System.out.println(intArray2[1]);

    }

}
