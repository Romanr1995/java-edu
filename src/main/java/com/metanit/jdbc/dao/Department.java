package com.metanit.jdbc.dao;

public class Department extends AbstractEntity<Long> {

    private String name;
    //private Employee manager;
    private Category category;


    public Department(String name, Category category) {
        super(null);
        this.name = name;
        this.category = category;
    }

    Department(Long id, String name, Category category) {
        super(id);
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Department{" +
               "id=" + getId() +
               ", name='" + name + '\'' +
               //", manager=" + manager +
               ", category=" + category +
               '}';
    }
}
