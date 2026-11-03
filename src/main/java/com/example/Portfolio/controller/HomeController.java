
package com.example.Portfolio.controller;

import com.example.Portfolio.model.Skill;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        // ---- Hero ----
        model.addAttribute("name", "Roshan 😎");
        model.addAttribute("title", "Java Backend Developer");
        model.addAttribute("tagline",
                "I build web applications with Java and Spring Boot - "
                + "and I'm looking for my first role as a backend developer.");

        // ---- About ----
        model.addAttribute("about",
                "I'm a third-year BCA student from Varanasi, India. "
                + "I enjoy building web applications and learning "
                + "Java and Spring Boot to grow as a backend developer.");

        // ---- Contact Details ----
        model.addAttribute("location", "Varanasi, India");
        model.addAttribute("email", "roshangupta112113@gmail.com");
        model.addAttribute("github", "https://github.com/roshangupta7755");
        model.addAttribute("linkedin",
                "https://www.linkedin.com/in/roshan-gupta-rg7755");

        // ---- Resume ----
        model.addAttribute("resumeUrl", "https://drive.google.com");

        // ---- Skills ----

        // Step 1: Create one list with every skill
        List<Skill> skills = new ArrayList<>();

        skills.add(new Skill("HTML", "Frontend"));
        skills.add(new Skill("CSS", "Frontend"));
        skills.add(new Skill("JavaScript", "Frontend"));
        skills.add(new Skill("Thymeleaf", "Frontend"));

        skills.add(new Skill("Java", "Backend"));
        skills.add(new Skill("Spring Boot", "Backend"));
        skills.add(new Skill("Spring MVC", "Backend"));
        skills.add(new Skill("Spring Data JPA", "Backend"));
        skills.add(new Skill("REST APIs", "Backend"));
        skills.add(new Skill("MySQL", "Backend"));

        skills.add(new Skill("Git & GitHub", "Tools"));
        skills.add(new Skill("IntelliJ IDEA", "Tools"));
        skills.add(new Skill("Maven", "Tools"));
        skills.add(new Skill("Postman", "Tools"));

        // Step 2: Group skills by category
        Map<String, List<Skill>> skillsByCategory =
                new LinkedHashMap<>();

        for (Skill skill : skills) {

            // Create category list if it does not exist
            skillsByCategory.putIfAbsent(
                    skill.getCategory(),
                    new ArrayList<>()
            );

            // Add skill to its category
            skillsByCategory.get(skill.getCategory()).add(skill);
        }

        // Send grouped skills to HTML
        model.addAttribute("skillsByCategory", skillsByCategory);

        return "index";
    }
}
