package com.metanit.classes.abstraction;

public class ZooAnnouncement extends Announcement {

    public ZooAnnouncement(String header, String body) {
        super(header, body);
    }

    @Override
    public String render() {
        return ";) ;) ;) " + getHeader() + '\n' + getBody() + '\n';
    }
}
