package com.monkeyrizz.codeforest.model;

public class Solution {
    private Long id;
    private String title;
    private String description;
    private Long authorId;
    private Long problemId;

    public Solution(String title,
                    String description,
                    Long authorId,
                    Long problemId) {
        this.title = title;
        this.description = description;
        this.authorId = authorId;
        this.problemId = problemId;
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

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getProblemId() {
        return problemId;
    }

    public void setProblemId(Long problemId) {
        this.problemId = problemId;
    }
}

