package com.students;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main.java
 *
 * @author Mr. Riscalas
 * @version 1.0
 * @since 2023-06-07
 */
public final class Main {

  /**
   * This is the main method.
   *
   * @param args //unused
   */
  public static void main(final String[] args) {
    // Set the input and output file paths
    final String inputFilePath = "input.txt";
    // Read input from file using Scanner
    try (Scanner inputFile = new Scanner(new File(inputFilePath)); ) {
      // Seperate each line and split it into an array
      while (inputFile.hasNextLine()) {
        // strip the string and convert to int
        final String studentInfo = inputFile.nextLine().strip();
        // check if empty
        if (studentInfo.equals("")) {
          System.out.println("Invalid Input: Empty value\n");
          continue;
        }
        // split the values by spaces
        final String[] studentInfoArr = studentInfo.split(" ");
        final String firstName = studentInfoArr[0];
        String middleInit = "";
        String lastName;
        int grade;
        boolean iep = false;
        // check if there is a middle name
        if (studentInfoArr.length >= 5) {
          middleInit = studentInfoArr[1];
          lastName = studentInfoArr[2];
          grade = Integer.parseInt(studentInfoArr[3]);
          // see if they have an IEP
          if (studentInfoArr[4].equals("y")) {
            iep = true;
          } else {
            iep = false;
          }
        } else {
          lastName = studentInfoArr[1];
          // convert the grade to a number
          grade = Integer.parseInt(studentInfoArr[2]);
          if (studentInfoArr[3].equals("y")) {
            iep = true;
          } else {
            iep = false;
          }
        }
        if (!middleInit.equals("")) {
          Student student = new Student(firstName, middleInit, lastName, grade, iep);
          student.print();
        } else {
          Student student = new Student(firstName, lastName, grade, iep);
          student.print();
        }
      }
    } catch (FileNotFoundException error) {
      System.err.println("File not found: " + error.getMessage());
    }
  }
}
