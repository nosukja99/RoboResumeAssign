package com.company;

import java.util.ArrayList;

public class Person {

    String name;
    String email;
    ArrayList<Education> eduHistory;
    ArrayList<Work> works;
    ArrayList<Skills> skills;

    public Person() {
    }

    public Person(String name, String email, ArrayList<Education> eduHistory, ArrayList<Work> works,
                  ArrayList<Skills> skills) {
        this.name = name;
        this.email = email;
        this.eduHistory = eduHistory;
        this.works = works;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEduHistory() {
        return eduHistory;
    }

    public void setEduHistory(ArrayList<Education> eduHistory) {
        this.eduHistory = eduHistory;
    }

    public ArrayList<Work> getWorks() {
        return works;
    }

    public void setWorks(ArrayList<Work> works) {
        this.works = works;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }

    public String displayEdu()
    {
        String display="";
        for(Education edu : eduHistory) {
            display = display+"\n"+edu.toString()+"\n";
        }
        return display;
    }

    public String displayWork()
    {
        String display="";
        for(Work work : works)
        {
            display =display+"\n"+work.toString()+"\n";
        }
        return display;
    }

    public String displaySkill()
    {
        String display="";
        for(Skills skill : skills)
        {
            display =display+"\n"+skill.toString()+"\n";
        }
        return display;
    }

    public String toString()
    {
        String display = "RESUME\n"+name+"\n"+email+"\n\n"+"<Education>\n"
                +displayEdu()+"\n\n<Experience>\n"+displayWork()+"\n\n<Skills>\n"+displaySkill();
        return display;
    }
}
