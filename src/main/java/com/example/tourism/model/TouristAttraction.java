package com.example.tourism.model;

public class TouristAttraction {
    private int id;
    private String name;
    private String description;

    public TouristAttraction() {
    }
    public TouristAttraction(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
