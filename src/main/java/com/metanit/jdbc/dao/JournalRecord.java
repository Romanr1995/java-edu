package com.metanit.jdbc.dao;

import java.sql.Date;

public class JournalRecord extends AbstractEntity<Long> {
    private String title;
    private String body;
    private String author;
    private Date fromDate;


    JournalRecord(Long id, String title, String body, String author, Date when) {
        super(id);
        this.title = title;
        this.body = body;
        this.author = author;
        this.fromDate = when;
    }

    public JournalRecord(String title, String body, String author, Date fromDate) {
        super(null);
        this.title = title;
        this.body = body;
        this.author = author;
        this.fromDate = fromDate;
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
                "id=" + getId() +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", fromDate=" + fromDate +
                '}';
    }
}
