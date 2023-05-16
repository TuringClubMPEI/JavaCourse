package ru.turing.courses.lesson4.Yemelyanov;

import java.util.Objects;

/**
 * Пол человека
 *
 * @author SteklotaraBLizz
 */
public enum Gender {
    MALE("Male", 'M', "Мужской пол", true),
    FEMALE("Female", 'F', "Женский пол", false),
    LIGHTNING_MCQUEEN("McQueen", 'Q', "Молния Маккуин", false),
    FAIRY("Fairy", 'W', "Феечка Винкс", true),
    PANZERKAMPFWAGEN_AUSF_VI_TIGER("Tiger", 'T', "Тигр I", false);



    /** Техническое название */
    private final String name;
    /** Символьное представление */
    private final char shortNameRepr;
    /** Описание */
    private final String description;
    /** Сущность человека*/
    private final boolean isBeingHuman;

    Gender(String name, char shortNameRepr, String description, boolean isBeingHuman) {
        this.name = name;
        this.shortNameRepr = shortNameRepr;
        this.description = description;
        this.isBeingHuman = isBeingHuman;
    }

    /**
     * Поиск гендера по имени
     * @param name имя, по которому происходит поиск гендера
     */
    public static Gender ofName(String name) {

        if(name == null){
            throw new UnknownGenderException("Gender name is unknown or missing");
        }

        for(Gender currentGender : Gender.values()){
            if(currentGender.name.toUpperCase().equals(name.toUpperCase())){
                return currentGender;
            }
        }

        return null;
    }

    /**
     * Поиск гендера по краткому обозначению
     * @param shortNameRepr символ, по которому производится поиск гендера
     */
    public static Gender ofShortNameRepr(Character shortNameRepr) {

        if(shortNameRepr == null){
            throw new UnknownGenderException("Gender name is unknown or missing");
        }

        for(Gender currentGender : Gender.values()){
            if(Objects.equals(shortNameRepr, currentGender.shortNameRepr)){
                return currentGender;
            }
        }

        return null;
    }

    public String getName() {
        return name;
    }

    public char getShortNameRepr() {
        return shortNameRepr;
    }

    public String getDescription() {
        return description;
    }

    public boolean getIsBeingHuman() {
        return isBeingHuman;
    }
}
