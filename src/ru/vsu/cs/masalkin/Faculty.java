package ru.vsu.cs.masalkin;

import java.util.Collection;

public class Faculty {

    Employee dean;
    public Institute institutes;
    public String name;

    @Override
    public String toString() {
        return "src.Faculty{" +
                "dean=" + dean +
                ", institutes=" + institutes +
                ", name='" + name + '\'' +
                '}';
    }

    public Institute getInstitutes() {
        return this.institutes;
    }

    public void setInstitutes(Institute institutes) {
        this.institutes = institutes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Faculty(Dean dean, Institute institutes, String name) {
        this.dean = dean;
        this.institutes = institutes;
        this.name = name;
    }

    public void setSessionDate() {
    }

}