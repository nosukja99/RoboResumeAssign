package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MakeResume {

    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);
        ArrayList<Education> eduHistory = new ArrayList<>();
        
        ArrayList<Work> works = new ArrayList<>();
        ArrayList<Skills> skills = new ArrayList<>();

        System.out.println("This program is for making resume.");
        //////////////////////////name
        System.out.println("What is your name? ");
        String name;
        name = br.readLine();
        while(name.equals(""))
        {
            System.out.println("Please input valid name.");
            System.out.println("What is your name? ");
            name = br.readLine();
        }
        ////////////////////////////////////email
        System.out.println("What is your email address? ");
        String email = br.readLine();
        while(!email.contains("@")||email.equals(null))
        {
            System.out.println("This is not valid email address.");
            System.out.println("What is your email address? ");
            email = br.readLine();
        }


        //////////////////////////////education
        System.out.println("Please input your education history.");
        String moreSchool ="y";

        while(!moreSchool.equalsIgnoreCase("n")||eduHistory.size()<1)
        {
            System.out.println("What is the school name you attended? ");
            String schoolName = br.readLine();
            while(schoolName.equals(""))
            {
                System.out.println("Please enter valid school name.");
                System.out.println("What is the school name you attended? ");
                schoolName = br.readLine();
            }
            System.out.println("What is your degree and major at the school?<Degree in Major>");
            String major = br.readLine();
            while(major.equals(""))
            {
                System.out.println("Please enter valid degree and major.");
                System.out.println("What is your degree and major at the school?<Degree in Major>");
                major = br.readLine();
            }
            System.out.println("What year did you graduate?");
            int graduateYear = scanner.nextInt();
            Calendar now = Calendar.getInstance();
            while(graduateYear<1900||graduateYear>now.get(Calendar.YEAR))
            {
                System.out.println("Please enter valid graduate year");
                System.out.println("What year did you graduate?");
                graduateYear = scanner.nextInt();
            }
            Education edu = new Education(schoolName,major,graduateYear);
            eduHistory.add(edu);
            if(eduHistory.size()>9)
            {
                System.out.println("Maximum education history is 10. You already added all 10.");
                break;
            }
            System.out.println("Do you want to input more school info? <y/n>");
            moreSchool = br.readLine();
        }
        ///////////////////////////////////work history

        System.out.println("From now on,Please add your work experience.");
        System.out.println("Do you want to add work experience?");
        String moreWork = br.readLine();
        while(!moreWork.equalsIgnoreCase("n"))
        {
            System.out.println("What is the company name?");
            String companyName = br.readLine();
            while(companyName.equals(""))
            {
                System.out.println("Please enter valid company name.");
                System.out.println("What is the company name?");
                companyName = br.readLine();
            }
            System.out.println("What is the your position at the company?");
            String position=br.readLine();
            System.out.println("From when did you start to?<Month Year>");
            String startMonthYear = br.readLine();
            System.out.println("Until when did you work?<Month Year>");
            String ednMonthYear = br.readLine();

            ////////////////////////duties
            String moreDuty ="y";
            int dutyNum=0;
            ArrayList<Duty> duties = new ArrayList<>();
            while(!moreDuty.equalsIgnoreCase("n"))
            {
                System.out.println("What was your duty at the company?");
                String dutyName = br.readLine();
                dutyNum++;
                Duty duty = new Duty(dutyNum, dutyName);
                duties.add(duty);
                System.out.println("Do you have more duty<y/n>?");
                moreDuty =br.readLine();
            }
            Work work = new Work(position, companyName,startMonthYear, ednMonthYear, duties);
            //System.out.println("Work and duties @@@@@@@@@@@@@@@@@@@@@@"+work.toString());
            works.add(work);
            if(works.size()>9)
            {
                System.out.println("Maximum work experience is 10. You already added all 10.");
                break;
            }
            System.out.println("Do you want to add more work experience<y/n>?");
            moreWork = br.readLine();
        }

        ///////////////////////////skills
        System.out.println("From now on,Please add your work skills.");
        String moreSkills ="y";
        while(!moreSkills.equalsIgnoreCase("n")||skills.size()<1) {
            System.out.println("What skill do you have?");
            String skillName = br.readLine();
            System.out.println("which rating do you have with the skill <highly skilled, proficients, familiar, beginner>");
            String skillRating = br.readLine();
            Skills skill = new Skills(skillName,skillRating);
            skills.add(skill);
            if(skills.size()>19)
            {
                System.out.println("Maximum skills is 20. You already added all 20.");
                break;
            }
            System.out.println("Do you want to add more skill?<y/n>");
            moreSkills =br.readLine();
        }
        //////////////////////////////Person
        Person person = new Person(name, email, eduHistory, works, skills);
        System.out.println("============================================================");
        System.out.println(person.toString());
    }
}
