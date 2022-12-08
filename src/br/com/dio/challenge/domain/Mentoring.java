package br.com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Content{
    private LocalDate date;

    public Mentoring() {
    }

    @Override
    public double calculate_xp() {
        return XP_PADRAO + 20d;
    }


    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    public Mentoring(LocalDate date) {
        this.date = date;
    }


}
