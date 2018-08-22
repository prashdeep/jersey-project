package com.hexaware;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@JsonIgnoreProperties(ignoreUnknown = true)
@XmlRootElement(name="student")
public class Student {

    @XmlElement(name="id")
    private int id;
    @XmlElement(name="name")
    private String name;
    @XmlElement(name="grade")
    private int grade;

    public Student(){

    }

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    @Override
    public String toString(){
        return "{ id: "+this.id+", name: "+this.name+ " , grade: "+this.grade+" }";
    }
}