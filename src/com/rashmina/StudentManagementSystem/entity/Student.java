/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rashmina.StudentManagementSystem.entity;

/**
 *
 * @author Rashu
 */
public class Student {

    private String name, faculty;
    private int id, year;
    private boolean status;
    public int getId;

    public Student() {
    }

    public Student(String name, String faculty, int id, int year, boolean status) {
        this.name = name;
        this.faculty = faculty;
        this.id = id;
        this.year = year;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
