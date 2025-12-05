package com.portfolio.model;

public class Project {
    private String name;
    private String description;
    private String githubLink;

    public Project(String name, String description, String githubLink) {
        this.name = name;
        this.description = description;
        this.githubLink = githubLink;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getGithubLink() { return githubLink; }
}
