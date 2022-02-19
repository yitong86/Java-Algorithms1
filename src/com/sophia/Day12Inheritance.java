package com.sophia;
import java.util.*;
public class Day12Inheritance {


    class Person {
        protected String firstName;
        protected String lastName;
        protected int idNumber;

        // Constructor
        Person(String firstName, String lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.idNumber = identification;
        }

        // Print person data
        public void printPerson(){
            System.out.println(
                    "Name: " + lastName + ", " + firstName
                            + 	"\nID: " + idNumber);
        }

    }

    class Student extends Person{
        private int[] testScores;
        public Student(String firstName,String lastName,int idNumber,int[] scores){
            super(firstName, lastName, idNumber);
            this.testScores = scores;

        }
        public char calculate(){
            int sum = 0;
            for (int i:this.testScores){
                sum+=i;
            }
            double avg = sum /testScores.length;
            if (avg <= 100 && avg >= 90){
                return 'O';
            }else if (avg < 90 && avg >=80){
                return 'E';
            }else if (avg < 80 && avg >=70){
                return 'A';
            }else if (avg < 70 && avg >=55){
                return 'P';
            }else if (avg < 55 && avg >=40){
                return 'D';
            }else {
                return'T';
                /*
                 *   Class Constructor
                 *
                 *   @param firstName - A string denoting the Person's first name.
                 *   @param lastName - A string denoting the Person's last name.
                 *   @param id - An integer denoting the Person's ID number.
                 *   @param scores - An array of integers denoting the Person's test scores.
                 */
                // Write your constructor here

                /*
                 *   Method Name: calculate
                 *   @return A character denoting the grade.
                 */
                // Write your method here
            }
        }
    }
}
//    Sample Input
//
//    Heraldo Memelli 8135627
//        2
//        100 80
//        Sample Output
//
//        Name: Memelli, Heraldo
//        ID: 8135627
//        Grade: O