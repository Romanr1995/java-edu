package com.metanit.jdbc.dao;

public abstract class AbstractEntity<P> {
    private P id;

    public AbstractEntity(P id) {
        this.id = id;
    }

    void setId(P id) {
        this.id = id;
    }

    public P getId() {
        return id;
    }
}
