package br.com.dio.challenge.domain;

import java.time.LocalDate;
import java.util.*;

import static br.com.dio.challenge.domain.Content.XP_PADRAO;

public class Bootcamp {

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Bootcamp() {
    }

    private String name;
    private String description;
    private LocalDate startData = LocalDate.now();
    private final LocalDate finalDate = startData.plusDays(45);

    private Set<Dev> subscribedDevs = new HashSet<>();
    private Set<Content> contents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartData() {
        return startData;
    }

    public void setStartData(LocalDate startData) {
        this.startData = startData;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public Set<Dev> getSubscribedDevs() {
        return subscribedDevs;
    }

    public void setSubscribedDevs(Set<Dev> subscribedDevs) {
        this.subscribedDevs = subscribedDevs;
    }

    public Set<Content> getContents() {
        return contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(name, bootcamp.name) && Objects.equals(description, bootcamp.description) && Objects.equals(startData, bootcamp.startData) && Objects.equals(finalDate, bootcamp.finalDate) && Objects.equals(subscribedDevs, bootcamp.subscribedDevs) && Objects.equals(contents, bootcamp.contents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, startData, finalDate, subscribedDevs, contents);
    }




}
