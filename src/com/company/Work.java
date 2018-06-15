package com.company;

import java.util.ArrayList;

public class Work {

    String position;
    String companyName;
    String startMonthYear;
    String endMonthYear;
    ArrayList<Duty> duties;

    public Work() {
    }

    public Work(String position, String companyName, String startYear, String endYear, ArrayList<Duty> duties) {
        this.position = position;
        this.companyName = companyName;
        this.startMonthYear = startYear;
        this.endMonthYear = endYear;
        this.duties=duties;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStartMonthYear() {
        return startMonthYear;
    }

    public void setStartMonthYear(String startYear) {
        this.startMonthYear = startYear;
    }

    public String getEndMonthYear() {
        return endMonthYear;
    }

    public void setEndMonthYear(String endYear) {
        this.endMonthYear = endYear;
    }

    public ArrayList<Duty> getDuties() {
        return duties;
    }

    public void setDuties(ArrayList<Duty> duties) {
        this.duties = duties;
    }

    public String displayDuty()
    {
        String display="";
        for(Duty duty : duties)
        {
            display =display+"\r\n"+duty.toString();
        }
        return display;
    }

    public String toString()
    {
        String display = position+"\r\n"+companyName+", "+startMonthYear
                +" - "+endMonthYear+"\r\n"+displayDuty();
        return display;
    }
}
