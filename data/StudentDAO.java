package com.example.dandanhome.www.homework20170822.data;

/**
 * Created by Vincent Li on 2017/8/20.
 */

public interface StudentDAO {
    public void add(Student s);
    public Student[] getAllStudents();
    public Student getOneStudent(int ID);
}
