package br.com.dio.project.domain;

import java.time.LocalDate;

public class Mentor extends Content {

    private LocalDate date;

    public Mentor() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXP() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }
}
