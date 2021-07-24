package com.elvis.DSA;

import java.util.Arrays;

class Program{
    // To call a constructor within another constructor, use the this key
    // When *this* is used, make sure it comes first
    // Constructors have no return type

    public Program() {this(5);System.out.println("First Constructor!!!");}
    public Program(int value) {System.out.println("Second Constructor!!!");}
}

class Student{
    static final int MY_CONSTANT = 98; // For finals, values must be assigned on the same line that they were created
    String name;
    static String studentClass;

    void studentName(){System.out.println(name);}
    static void classInfo() {
        System.out.println(studentClass);
    }
//        System.out.println(name)//gives an error;}

    // Non-static variable are known as instance variables. This is because, each object
    // gets its own copy
    // For static variables, are known as class variables

    // For static variables, each object does not get its own copy
    // only one copy exists
    // Static methods can access static variables but cannot access non-static variables
    // Common use of static variables include counting

}


public class Main {

    public static void main(String[] args) {
	// write your code here

        // While loop Example
        int myNum = 23;
        while (myNum<34){
            System.out.println(myNum);
            myNum+=2;
        }

        System.out.println("*****************");

        // For loop
        for(int i=0;i<10;i++){
            System.out.printf("%d: I love my cat!!!\n", i); // Using printf
        }


        // While loop using for(;;)
        int amount = 0;
        for(;;){
            System.out.println("In the loop");
            amount++;
            if(amount == 6){break;}
        }

        //1-D arrays
        int numbers = 90;
        //2 ways of initializing an array
        int[] arrayOfNum = new int[5];
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};



        arrayOfNum[0] = 1;
        arrayOfNum[1] = 5;
        arrayOfNum[2] = 2;
        arrayOfNum[3] = 3;
        arrayOfNum[4] = 4;
        Arrays.stream(array2).forEach(System.out::print);
        System.out.println();

        // Multi-dimensional arrays in Java
        int[][] multi = {{1,2},{3,4},{5,6}};
        System.out.println(multi[0][1]);
        //looping through multi-dimensional array
        for(int arr1=0; arr1<multi.length;arr1++){
            for(int arr2=0;arr2<multi[arr1].length;arr2++){
                System.out.print(multi[arr1][arr2]);
            }
        }
        System.out.println();
        // Constructor showcase
        Program p1 = new Program();
        Program p2 = new Program(23);

        System.out.println();
        System.out.println("*******************");

        // static and final keywords
        Student s1 = new Student();
        Student s2 = new Student();
        Student.studentClass = "Webby";
        System.out.println(Student.studentClass);


        System.out.println(s1.name = "Andy");
        System.out.println(s2.name = "Dave");
        s2.studentName();
        Student.classInfo();

        // Final values
//        Math.E = 8; // You cant reassign finals
        System.out.println(Math.E);
        System.out.println(Student.MY_CONSTANT);



    }
}
