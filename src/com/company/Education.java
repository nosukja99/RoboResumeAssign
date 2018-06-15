package com.company;

import java.util.ArrayList;

public class Education {

    String schloolName;
    String major;
    int graduateYear;

    public Education() {
    }

    public Education(String schloolName, String major, int year) {
        this.schloolName = schloolName;
        this.major = major;
        this.graduateYear = year;
    }

    public String getSchloolName() {
        return schloolName;
    }

    public void setSchloolName(String schloolName) {
        this.schloolName = schloolName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return graduateYear;
    }

    public void setYear(int year) {
        this.graduateYear = year;
    }


    public String toString()
    {
        String display = major+",\n"+schloolName+", "+graduateYear;
        return display;
    }
}
