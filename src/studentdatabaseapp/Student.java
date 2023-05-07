package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    //ZMIENNE KTÓRE MUSI WIEDZIEĆ
        private String name;
        private String lastName;
        private int year;
        private int id;
    //kursy na które jest zapisany
       private double accountBalance;
        int gradeLvl;
        private int costOfCourse = 600;

    //to co musi robić - methods
    // Constructor - prompt user to enter student's name and year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.name=in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName= in.nextLine();

        System.out.println("Enter student year: ");
        this.year=in.nextInt();
        System.out.println(name+lastName+year);
}}