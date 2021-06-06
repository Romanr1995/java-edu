package com.metanit.classes.abstraction;

import java.awt.*;

public abstract class Announcement {
    private String header;
    private String body;
    private Image[] images;
    private Object contacts;

    public Announcement(String header, String body) {
        this.header = header;
        this.body = body;
    }

    public abstract String render();

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }
}
