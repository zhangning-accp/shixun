package com.shixun.c15;

/**
 * Created by zn on 2016/1/4.
 */
public class Student {
    private String name;
    private String classNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classNumber='" + classNumber + '\'' +
                '}';
    }
}
