package com.metanit.classes.abstraction;

public class REAnnouncement extends Announcement {

    public REAnnouncement(String header, String body) {
        super(header, body);
    }

    @Override
    public String render() {
        return "^^^^^ " + getHeader() + '\n' + getBody() + '\n';
    }
}
