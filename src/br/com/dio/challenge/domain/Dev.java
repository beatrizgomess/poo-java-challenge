package br.com.dio.challenge.domain;

import br.com.dio.challenge.pattern.Observador;

import java.util.*;

public class Dev implements Observador {

    private String name;
    private Set<Content> subscribedContent =  new LinkedHashSet<>(); //LinkedHashSet para que os valores sejam ordenados pelo inserção
    private Set<Content>  completedContents = new LinkedHashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSubscribedContent() {
        return subscribedContent;
    }

    public void setSubscribedContent(Set<Content> subscribedContent) {
        this.subscribedContent = subscribedContent;
    }

    public Set<Content> getCompletedContents() {
        return completedContents;
    }

    public void setCompletedContents(Set<Content> completedContents) {
        this.completedContents = completedContents;
    }

    public void signedUpBootcamp(Bootcamp bootcamp){
        this.subscribedContent.addAll(bootcamp.getContents());
    }

    public void toProgress(){
        Optional<Content> content = this.subscribedContent.stream().findFirst();
        if(content.isPresent()){
            this.completedContents.add(content.get());
            this.subscribedContent.remove(content.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }

    }

    public double calculateXP(){
        return this.completedContents.stream()
                .mapToDouble(Content::calculate_xp)
                .sum();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(subscribedContent, dev.subscribedContent) && Objects.equals(completedContents, dev.completedContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContent, completedContents);
    }

    @Override
    public void enviarNotificacao(Bootcamp bootcamp) {
        System.out.println("==== Novo Bootcamp na plataforma ====");
        System.out.println("Inscreva-se agora no " + bootcamp.getName() + "!!!");
    }
}
