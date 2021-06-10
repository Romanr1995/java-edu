package com.metanit.classes.abstraction;

public class Demo {
    public static void main(String[] args) {
        AutoAnnouncement aa = new AutoAnnouncement("NEW BMW", "for one bag of chips!", "No info found!");
        ZooAnnouncement za = new ZooAnnouncement("Kittens!", "100$");
        REAnnouncement ra = new REAnnouncement("New clean house", "for zoomers only!");

//        checkAnnouncement(aa);
//        checkAnnouncement(za);
//        checkAnnouncement(ra);
        renderAnnouncements(aa, za, ra);

    }

    public static void renderAnnouncements(Announcement... announcements) {
        for (int i = 0; i < announcements.length; i++) {
            System.out.println(announcements[i].render());
        }
    }

    public static void printNumber(int a) {
        System.out.println("Integer = " + a);
    }

    public static void printNumber(double d) {
        System.out.println("Float = " + d);
    }

    public static void checkAnnouncement(AutoAnnouncement autoAnnouncement) {
        System.out.println("it was " + AutoAnnouncement.class.getCanonicalName());
    }

    public static void checkAnnouncement(ZooAnnouncement zooAnnouncement) {
        System.out.println("it was " + ZooAnnouncement.class.getCanonicalName());
    }

    public static void checkAnnouncement(Announcement announcement) {
        System.out.println("it was " + Announcement.class.getCanonicalName());
    }
}
