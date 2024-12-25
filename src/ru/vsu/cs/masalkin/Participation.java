package ru.vsu.cs.masalkin;

public class Participation {

    public Double hours;

    public Double getHours() {
        return this.hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Participation(Double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "src.Participation{" +
                "hours=" + hours +
                '}';
    }
}