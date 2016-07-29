/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rashmina.StudentManagementSystem.dao;

import com.rashmina.StudentManagementSystem.entity.Student;

/**
 *
 * @author Rashu
 */
public class StudentDAOImpl implements StudentDAO {

    private int counter = 0;
    private Student[] studentList = new Student[5];

    @Override
    public boolean insertInfo(Student s) {
        if (studentList.length == counter) {
            return false;
        }
        studentList[counter] = s;
        counter++;
        return true;

    }

   
    @Override
    public boolean deleteStudent(int id) {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null && s.getId() == id) {
               studentList[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Student getById(int id) {
        for (int i = 0; i < studentList.length; i++) {
            Student s = studentList[i];
            if (s != null && s.getId() == id) {
               
                return s;
            }
        }
        return null;
    }

    @Override
    public Student[] getAll() {
        return studentList;
    }

    

}
