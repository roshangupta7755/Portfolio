package com.example.Portfolio.model;

// A plain Java class that describes ONE skill.
public class Skill {

    private String name;
    private String category;

    // Constructor
    public Skill(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}