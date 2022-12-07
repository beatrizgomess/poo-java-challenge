package br.com.dio.challenge.domain;

import java.util.Objects;

public class Course {
    private String title;
    private String description;
    private int workload;


    public Course(String title, String description, int workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
    }

    public Course() {
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

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", workload='" + workload + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) && Objects.equals(description, course.description) && Objects.equals(workload, course.workload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, workload);
    }
}
