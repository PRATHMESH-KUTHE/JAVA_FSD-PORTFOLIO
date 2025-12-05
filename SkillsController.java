package com.portfolio.controller;

import com.portfolio.model.SkillCategory;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/skills")
@CrossOrigin("*")
public class SkillsController {

    @GetMapping
    public List<SkillCategory> getSkills() {

        SkillCategory backend = new SkillCategory("Backend", Map.of(
                "Java", 95,
                "Spring Boot", 92,
                "Hibernate", 88,
                "Microservices", 85,
                "REST APIs", 90
        ));

        SkillCategory frontend = new SkillCategory("Frontend", Map.of(
                "React", 88,
                "TypeScript", 85,
                "JavaScript", 90,
                "HTML/CSS", 92,
                "Tailwind CSS", 87
        ));

        SkillCategory devops = new SkillCategory("DevOps", Map.of(
                "Git", 92,
                "Docker", 85,
                "AWS", 80,
                "Jenkins", 78,
                "Kubernetes", 72
        ));

        return Arrays.asList(backend, frontend, devops);
    }
}
