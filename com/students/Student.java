package com.students;

/**
 * Student.java creates the student class
 *
 * @author Mr. Riscalas
 * @version 1.0
 * @since 2023-06-07
 */
public final class Student {
  // fields
  String _firstName;
  String _lastName;
  String _midInitial;
  int _grade;
  boolean _iep;

  /**
   * This is a constructor
   *
   * @param firstName // firstName
   * @param midInitial // midInitial
   * @param lastName // lastName
   * @param grade // grade
   * @param iep // iep
   */
  public Student(String firstName, String midInitial, String lastName, int grade, boolean iep) {
    this._firstName = firstName;
    this._midInitial = midInitial;
    this._lastName = lastName;
    this._grade = grade;
    this._iep = iep;
  }

  /**
   * This is a constructor
   *
   * @param firstName // firstName
   * @param lastName // lastName
   * @param grade // grade
   * @param iep // iep
   */
  public Student(String firstName, String lastName, int grade, boolean iep) {
    this._firstName = firstName;
    this._lastName = lastName;
    this._midInitial = "";
    this._grade = grade;
    this._iep = iep;
  }

  public void print() {
    // print all the attributes making sure to check if they have a middle name or an IEP
    System.out.print(this._firstName + " ");
    if (!this._midInitial.equals("")) {
      System.out.print(this._midInitial + ". ");
    }
    System.out.print(this._lastName + " ");
    System.out.print(this._grade + " ");
    if (this._iep) {
      System.out.print("and has an IEP\n");
    } else {
      System.out.print("and does not have an IEP\n");
    }
  }
}
