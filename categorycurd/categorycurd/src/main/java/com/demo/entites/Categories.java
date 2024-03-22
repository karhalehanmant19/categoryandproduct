package com.demo.entites;

public class Categories {

    private long id;
    private String name;
    private String description;

    public Categories() {
        // Default constructor
    }

    public Categories(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}
