package com.wildcodeschool.myProject;

public class Doctor{
//Attributs
    private String name;
    private int number;
//Constructeur
    public Doctor( String name, int number){
        this.name = name;
        this.number = number;
    }
//Getters
    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
//Setters
    public void setName(String name){
        this.name = name;
    }
    public void setNumber(int number){
        this.number = number;
    }
}
