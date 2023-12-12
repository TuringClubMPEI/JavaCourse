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

    public static Gender ofName(String name) {
        try {
            if (name == null)
                throw new GenderNotFoundException("Null name!");

            String newName = name.toLowerCase();
            String myName;
            for (Gender obj : values()) {
                myName = obj.name.toLowerCase();
                if (myName.equals(newName)) {
                    System.out.println(name + " success!");
                    return obj;
                }
            }
            throw new GenderNotFoundException("Not found gender with name " + name);
        } catch (GenderNotFoundException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Gender ofShortNameRepr(Character shortNameRepr) {
        try {
            if (shortNameRepr == null)
                throw new GenderNotFoundException("Null short name!");

            String newShName = shortNameRepr.toString().toLowerCase();
            String myShName;
            for (Gender obj : values()) {
                myShName = (obj.shortNameRepr + "").toLowerCase();
                if (myShName.equals(newShName)) {
                    System.out.println(shortNameRepr + " success!");
                    return obj;
                }
            }
            throw new GenderNotFoundException("Not found gender with short name " + shortNameRepr);
        } catch (GenderNotFoundException e){
            System.out.println(e.getMessage());
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
