package ru.turing.courses.lesson4.Byazrov;

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

    /**
     *Поиск константы гендера по переданному названию гендера
     * @param name название гендера без учета регистра
     * @return константа Gender соответствующая переданному параметру
     * @throws GenderNotFoundException если не была найдена соответствующая константа Gender
     */
    public static Gender ofName(String name) throws GenderNotFoundException {
        if (name==null){
            throw new GenderNotFoundException("Пустота - не гендер");
        }
        if (name.equalsIgnoreCase(MALE.name))
        {
            return MALE;
        } else if (name.equalsIgnoreCase(FEMALE.name)){
            return FEMALE;
        } else {
            throw new GenderNotFoundException("Введенного гендера не существует в нормальном мире");
        }
    }

    /**
     * Поиск константы гендера по переданному сокращенному названию гендера
     * @param shortNameRepr сокращенное название гендера без учета регистра
     * @return константа Gender соответствующая переданному параметру
     * @throws GenderNotFoundException если не была найдена соответствующая константа Gender
     */
    public static Gender ofShortNameRepr(Character shortNameRepr) throws GenderNotFoundException{
        if (shortNameRepr==null){
            throw new GenderNotFoundException("Пустота - не гендер");
        }
        if (Character.toUpperCase(shortNameRepr)==Character.toUpperCase(MALE.shortNameRepr))
        {
            return MALE;
        } else if (Character.toUpperCase(shortNameRepr)==Character.toUpperCase(FEMALE.shortNameRepr)){
            return FEMALE;
        } else {
            throw new GenderNotFoundException("Введенного гендера не существует в нормальном мире");
        }
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
