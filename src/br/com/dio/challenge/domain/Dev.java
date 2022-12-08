package br.com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> subscribedContent =  new LinkedHashSet<>();
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
    /*
    public void toProgressWithQuestion(){
        Optional<Content> questionsList = this.questions.stream().findFirst();
        if(questionsList.isPresent()){
            this.questionsAnswered.add(questionsList.get());
            this.questions.remove(questionsList.get());

        }else{
            System.err.println("Você não tem questões para responder");
        }

    }

     */
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
}
