package com.company;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
    private String name;
    private String patronymic;
    private String lastName;
    private boolean gender;
    private int cours;
    private String cafedrial;
    private LocalDate birthday;

    public Student() {
    }

    public Student(String name, String patronymic, String lastName, boolean gender, int cours, String cafedrial) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.gender = gender;
        this.cours = cours;
        this.cafedrial = cafedrial;
    }

    public Student(String name, String patronymic, String lastName, boolean gender, int cours, String cafedrial, LocalDate birthday) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.gender = gender;
        this.cours = cours;
        this.cafedrial = cafedrial;
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getCours() {
        return cours;
    }

    public void setCours(int cours) {
        this.cours = cours;
    }

    public String getCafedrial() {
        return cafedrial;
    }

    public void setCafedrial(String cafedrial) {
        this.cafedrial = cafedrial;
    }

    //--------------------------------------------------------------------------

    public boolean isAdult(){
        long hisYears =
                ChronoUnit.YEARS.between(this.getBirthday(),LocalDate.now());
        System.out.println("His Years " + hisYears + " ");
        if (hisYears >= 18){
            return true;
        }else {
            return false;
        }

    }


    @Override
    public String toString() {
        String buffer = "";
        if (gender==true){
            buffer = "Male";
        }else {
            buffer = "Female";
        }
        String buffer2 = "";
        if (this.isAdult()==true){
            buffer2 = " Взрослый";
        }else {
            buffer2 = " Шмарок";
        }


        return "Student{" +
                "name= " + name +
                ", patronymic= " + patronymic +
                ", lastName= " + lastName +
                ", gender= " + buffer +
                ", cours= " + cours +
                ", cafedrial= " + cafedrial +
                ", Birthday= " + birthday +
                ", " + buffer2 +
                '}';
    }

}
