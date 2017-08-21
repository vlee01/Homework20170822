package com.example.dandanhome.www.homework20170822.data;

/**
 * Created by Vincent Li on 2017/8/20.
 */

public class Student {
    public int ID;
    public String name;
    public String tel;
    public Student(int ID, String name, String tel)
    {
        this.ID = ID;
        this.name = name;
        this.tel = tel;
    }
    public String toString()
    {
        return ID + "," + name + "," + tel;
    }
}