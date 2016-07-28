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
public interface StudentDAO {

    boolean insertInfo(Student s);

    

   boolean deleteStudent(int id);
    
    Student getById(int id);

    Student[] getAll();

}
