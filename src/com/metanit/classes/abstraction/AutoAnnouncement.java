package com.metanit.classes.abstraction;

public class AutoAnnouncement extends Announcement {

    private final String autoInspectionInfo;

    public AutoAnnouncement(String header, String body, String autoInspectionInfo) {
        super(header, body);

        this.autoInspectionInfo = autoInspectionInfo;
    }

    @Override
    public String render() {
        return "\t" + getHeader() + "\n\n" +
                getBody() + '\n' +
                "Legal info: " + autoInspectionInfo + '\n';
    }
}
