package com.metanit.jdbc.dao;

public class Department extends AbstractEntity<Long>{

    private String name;
    private Employee manager;
    private Category category;

    public Department(Long id, String name, Employee manager, Category category) {
        super(id);
        this.name = name;
        this.manager = manager;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Employee getManager() {
        return manager;
    }

    public Category getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                ", category=" + category +
                '}';
    }
}
