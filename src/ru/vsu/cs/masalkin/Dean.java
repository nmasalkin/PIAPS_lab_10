package ru.vsu.cs.masalkin;

public class Dean extends Employee {

    public Dean(String name, double salary, String email, int counter, int ssNo) {
        this.name = name;
        this.email = email;
        this.counter = counter;
        this.ssNo = ssNo;
    }

    public void processCertificationResults() {
    }

    @Override
    public String toString() {
        return "src.Dean{" +
                "counter=" + counter +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", ssNo=" + ssNo +
                '}';
    }
}