package com.metanit.enums;

public class Language {
    public static final Language RUS = new Language("russian", "ru");
    public static final Language ENG = new Language("english", "en");
    public static final Language UZB = new Language("uzbek", "uz");


    private final String languageName;
    private final String languageCode;

    private Language(String languageName, String languageCode) {
        this.languageName = languageName;
        this.languageCode = languageCode;
    }
}
