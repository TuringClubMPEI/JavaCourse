package ru.turing.courses.lesson4;

/**
 * Пол человека
 *
 * @author diagorn
 */
public enum Gender {
    MALE("Male", 'M', "Мужской пол"),
    FEMALE("Female", 'F', "Женский пол");


    /** Техническое название */
    private final String name;
    /** Символьное представление */
    private final char shortNameRepr;
    /** Описание */
    private final String description;

    Gender(String name, char shortNameRepr, String description) {
        this.name = name;
        this.shortNameRepr = shortNameRepr;
        this.description = description;
    }

    public static Gender ofName(String name) throws GenderNotFoundException, NullPointerException{
        if(name == null) {
            throw new NullPointerException();
        }
        else{
            for(Gender gender: Gender.values()){
                if(name.equalsIgnoreCase(gender.getName())){
                    return gender;
                }
            }
        }
        return null;
    }

    public static Gender ofShortNameRepr(Character shortNameRepr) throws GenderNotFoundException, NullPointerException{
        if(shortNameRepr == null) {
            throw new NullPointerException();
        }
        else{
            for(Gender gender: Gender.values()){
                if(shortNameRepr.equals(gender.getShortNameRepr())){
                    return gender;
                }
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
}
