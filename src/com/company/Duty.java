package com.company;

public class Duty {

    int dutyNum;
    String dutyName;

    public Duty() {
    }

    public Duty(int dutyNum, String dutyName) {
        this.dutyNum = dutyNum;
        this.dutyName = dutyName;
    }

    public int getDutyNum() {
        return dutyNum;
    }

    public void setDutyNum(int dutyNum) {
        this.dutyNum = dutyNum;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }

    public String toString()
    {
        String display = "- Duty "+dutyNum+", "+dutyName;
        return display;
    }
}
