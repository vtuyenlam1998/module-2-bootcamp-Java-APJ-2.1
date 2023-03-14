package com.codegym;

public class Student {
    private String name ="John";
    private String classes ="CO2";
    public Student(){};
    void setName(String name){
        this.name=name;
    }
    void setClasses(String classes){
        this.classes=classes;
    }
    public String getName(){
        return name;
    }
    public String getClasses(){
        return classes;
    }
}
