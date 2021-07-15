package com.metanit.jdbc.dao;

import java.sql.Date;

public class JournalRecord {
    private long id;
    private String title;
    private String body;
    private String author;
    private Date fromDate;


    public JournalRecord(long id, String title, String body, String author, Date when) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.author = author;
        this.fromDate = when;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public String getAuthor() {
        return author;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Override
    public String toString() {
        return "JournalRecord{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", fromDate=" + fromDate +
                '}';
    }
}
