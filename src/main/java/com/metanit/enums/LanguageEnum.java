package com.metanit.enums;

public enum LanguageEnum {
    RUS("russian", "ru"),
    ENG("english", "en"),
    UZB("uzbek", "uz"),
    GER("german", "de"),
    FRE("french", "fr");

    private final String name;
    private final String code;

    LanguageEnum(String name, String code) {
        this.name = name;
        this.code = code;
    }
}
