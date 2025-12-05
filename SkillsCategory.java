package com.portfolio.model;

import java.util.Map;

public class SkillCategory {
    private String category;
    private Map<String, Integer> skills;

    public SkillCategory(String category, Map<String, Integer> skills) {
        this.category = category;
        this.skills = skills;
    }

    public String getCategory() { return category; }
    public Map<String, Integer> getSkills() { return skills; }
}
