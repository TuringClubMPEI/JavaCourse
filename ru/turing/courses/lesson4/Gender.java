package ru.turing.courses.lesson4;

import ru.turing.courses.lesson3.z.Panda;

import java.util.Arrays;
import java.util.Objects;

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
     * метод поиска пола по наименованию
     * @param name
     * @return
     */
    public static Gender ofName(String name) {
        //исключение - входное данное имеет значение null
        if(name==null)
            throw new NullGenderException();
        //Вариант 1
        /**Gender result = null;
        for (Gender gender : values()) {
            if (gender.name().equalsIgnoreCase(name)) {
                result = gender;
                break;
            }
        }
         //по наименованию не найден пол
         if(result==null)
         throw new GengerNameNotFoundException();
        return result;**/

        //Вариант 2
        return Arrays.stream(values()).filter(gender -> gender.getName().equalsIgnoreCase(name)).findFirst().orElseThrow(GengerNameNotFoundException::new);
    }

    /**
     * метод поиска по символьному представлению
     * @param shortNameRepr
     * @return
     */
    public static Gender ofShortNameRepr(Character shortNameRepr) {
        //исключение - входное данное имеет значение null
        if(shortNameRepr==null)
            throw new NullGenderException();
        //Вариант 1
        /** Gender result = null;
        for (Gender gender : values()) {
        if(shortNameRepr.equals(gender.getShortNameRepr())){
                result = gender;
                break;
            }
        }
        if(result==null)
            throw new GengerShortNameNotFoundException();
        return result;**/
        //Вариант 2
        return Arrays.stream(values()).filter(gender -> shortNameRepr.equals(gender.getShortNameRepr())).findFirst().orElseThrow(GengerShortNameNotFoundException::new);
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
