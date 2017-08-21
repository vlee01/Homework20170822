package com.example.dandanhome.www.homework20170822.data;

import java.util.ArrayList;

/**
 * Created by Vincent Li on 2017/8/20.
 */

public class StudentDAOMemoryImpl implements StudentDAO {
    public static ArrayList<Student> mylist = new ArrayList();
    public StudentDAOMemoryImpl()
    {
    }

    @Override
    public void add(Student s) {
        mylist.add(s);
    }

    @Override
    public Student[] getAllStudents() {
        return mylist.toArray(new Student[0]);
    }

    @Override
    public Student getOneStudent(int ID) {
        for (Student s : mylist)
        {
            if (s.ID == ID)
            {
                return s;
            }
        }
        return null;
    }
}
