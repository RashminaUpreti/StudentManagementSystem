/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rashmina.StudentManagementSystem;

import com.rashmina.StudentManagementSystem.dao.StudentDAO;
import com.rashmina.StudentManagementSystem.dao.StudentDAOImpl;
import com.rashmina.StudentManagementSystem.entity.Student;
import java.util.Scanner;

/**
 *
 * @author Rashu
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         StudentDAO studentDAO = new StudentDAOImpl();
        while (true) {
           
            System.out.println("1.Insert student's info:");
            System.out.println("2.Update student's info:");
            System.out.println("3.Delete student's record:");
            System.out.println("4.Search student by Id:");
            System.out.println("5.Get all students' info:");
            System.out.println("6.Exit:");
            System.out.println("Enter your choice[1-6]:");

            switch (input.nextInt()) {
                case 1:
                    Student s = new Student();
                    System.out.println("Insert student's info:");

                    System.out.println("Enter name:");
                    s.setName(input.next());
                    System.out.println("Enter faculty:");
                    s.setFaculty(input.next());
                    System.out.println("Enter id:");
                    s.setId(input.nextInt());
                    System.out.println("Enter year:");
                    s.setYear(input.nextInt());
                    System.out.println("Enter status:");
                    s.setStatus(input.nextBoolean());

                    if (studentDAO.insertInfo(s)) {
                        System.out.println("Inserted successfully!");
                    } else {
                        System.out.println("Data full!");
                    }

                    break;

                case 2:
                    System.out.println("Update student's info:");
                    System.out.println("Enter student's id to be updated:");
                    int id = input.nextInt();
                    Student update = studentDAO.getById(id);
                    if (update != null) {
                        System.out.println("Enter name:");
                        update.setName(input.next());
                        System.out.println("Enter faculty:");
                        update.setFaculty(input.next());
                        System.out.println("Enter id:");
                        update.setId(input.nextInt());
                        System.out.println("Enter year:");
                        update.setYear(input.nextInt());
                        System.out.println("Enter status:");
                        update.setStatus(input.nextBoolean());
                    }

                    break;
                case 3:
                    System.out.println("Delete student's record:");
                    System.out.println("Enter student's id to be deleted:");
                    if (studentDAO.deleteStudent(input.nextInt())) {
                        System.out.println("Deleted successfully!");
                    } else {
                        System.out.println("Can't delete!");
                    }

                    break;

                case 4:
                    System.out.println("Enter student's id to be searched:");
                    Student studentId = studentDAO.getById(input.nextInt());
                    if (studentId != null) {
                        System.out.println("Name:" + studentId.getName());
                        System.out.println("Faculty:" + studentId.getFaculty());
                        System.out.println("Id:" + studentId.getId());
                        System.out.println("Year:" + studentId.getYear());
                        System.out.println("Status:" + studentId.isStatus());
                    }
                break;

                case 5:
                    System.out.println("List all students");
                    Student[] students = studentDAO.getAll();
                    for (int i = 0; i < students.length; i++) {
                        Student studentAll = students[i];
                        if (studentAll != null) {
                            System.out.println("Name:" + studentAll.getName());
                            System.out.println("Faculty:" + studentAll.getFaculty());
                            System.out.println("Id:" + studentAll.getId());
                            System.out.println("Year:" + studentAll.getYear());
                            System.out.println("Status:" + studentAll.isStatus());
                        }
                    }
                    break;
                case 6:

                    System.out.println("Do you really wanna exit[y/n]?");
                    if (input.next().equalsIgnoreCase("y")) {
                        System.exit(0);
                    }

                    break;

            }

        }
    }

}
