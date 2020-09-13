package com.example.predictionapp;

public class Disease {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Disease(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
