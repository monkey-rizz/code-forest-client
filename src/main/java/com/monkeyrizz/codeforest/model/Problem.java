package com.monkeyrizz.codeforest.model;

public class Problem {
    private Long id;
    private String title;
    private String description;
    private Long authorId;

    public Long getAuthorId() {
        return authorId;
    }

    public Problem(String title, String description, Long authorId) {
        this.title = title;
        this.description = description;
        this.authorId = authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}