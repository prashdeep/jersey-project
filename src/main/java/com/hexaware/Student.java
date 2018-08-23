package com.hexaware;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonFormat;


@XmlRootElement(name="student")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Student {

    @XmlElement(name="id")
    private int id;
    @XmlElement(name="name")
    private String name;
    @XmlElement(name="grade")
    private int grade;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MMM-yyyy")
    private Date joiningDate;
   
    @JsonCreator
    protected Student(@JsonProperty("id")int id, 
        @JsonProperty("name")String name, @JsonProperty("grade")int grade){
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