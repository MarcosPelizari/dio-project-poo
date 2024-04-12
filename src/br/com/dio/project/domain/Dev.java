package br.com.dio.project.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Content> contentSet = new LinkedHashSet<>();
    private Set<Content> contentEnded = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.contentSet.addAll(bootcamp.getContents());
        bootcamp.getDevsSubscribe().add(this);
    }

    public void progress() {
        Optional<Content> contentProgress = this.contentSet.stream()
                .findFirst();
        if (contentProgress.isPresent()) {
            this.contentEnded.add(contentProgress.get());
            this.contentSet.remove(contentProgress.get());
        } else
            System.out.println("Você não está matriculado em nenhum Bootcamp!");
    }

    public double gainXP() {
        return this.contentEnded.stream()
                .mapToDouble(contentEnded -> contentEnded.calculateXP()).sum();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getContentSet() {
        return contentSet;
    }

    public void setContentSet(Set<Content> contentSet) {
        this.contentSet = contentSet;
    }

    public Set<Content> getContentEnded() {
        return contentEnded;
    }

    public void setContentEnded(Set<Content> contentEnded) {
        this.contentEnded = contentEnded;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(name, dev.name) && Objects.equals(contentSet, dev.contentSet) && Objects.equals(contentEnded, dev.contentEnded);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contentSet, contentEnded);
    }
}
