package com.company;

import javax.sql.rowset.BaseRowSet;

public class SwichCase {
    public static void main(String[] args) {

//        int grade = 75;
//        char letterGrade;
//        if (grade > 89) {
//            letterGrade = 'A';
//        } else if (grade > 79) {
//            letterGrade = 'B';
//        } else if (grade > 69) {
//            letterGrade = 'C';
//        } else {
//            letterGrade = 'F';
//        }
//
//        switch (letterGrade) {
//            case 'A':
//                System.out.println("You got an A. Great job!");
//                break;
//            case 'B':
//                System.out.println("You got a B. Good work!");
//                break;
//            case 'C':
//                System.out.println("You got a C. You'll never get into a good college!");
//                break;
//            default:
//                System.out.println("You got an F. You'll do well in Congress!");
//        }
//
        int count = 2;
        int value = switch (count) {
            case 1:
                yield 12;
            case 2:
                yield 32;
            case 3:
                yield 52;
            default:
                yield 0;
        };
        System.out.println(value);
    }
}






      





















