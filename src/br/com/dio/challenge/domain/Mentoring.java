package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Mentoring {
    private String title;
    private String description;
    private LocalDate date;

    public Mentoring() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                '}';
    }

    public Mentoring(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mentoring mentoring = (Mentoring) o;
        return Objects.equals(title, mentoring.title) && Objects.equals(description, mentoring.description) && Objects.equals(date, mentoring.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, date);
    }
}
