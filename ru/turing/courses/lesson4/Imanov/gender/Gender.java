package ru.turing.courses.lesson4.Imanov.gender;

import java.util.Arrays;
import java.util.Optional;


/**
 * Пол человека
 *
 * @author itimur
 */

public enum Gender {
    IVTISTRUDENT("IVTI STUDENT", "gay", "студент ивти", 1),
    MALE("Male", "M", "Мужской пол", 2),
    FEMALE("Female", "F", "Женский пол", 3),
    AGENDER("Agender","Agende","бесполый", 4),
    ANDROGYNE("Androgyne", "Androg", "андроген, гермафродит (мужчиноженщина)", 5),
    ANDROGYNOUS("Androgynous", "Androgy", "мужеженственный (внутренне, по ощущениям)", 6),
    BIGENDER("Bigender", "Bigend", "ощущающие себя в разное время то мужчиной, то женщиной", 7),
    CIS("Cis", "Cis", "латинск. 'пред-', т.е. 'недо-' (без негативной коннотации)", 8),
    CISFEMALE("Cis Female", "Cisfe", "предженский, недоженский", 9),
    CISMALE("Cis Male", "Cisma", "предмужской, недомужской", 10),
    CISMAN("Cis Man", "Cisma", "предмужчина, недомужчина", 11),
    CISWOMAN("Cis Woman", "Ciswo", "предженщина, недоженщина", 12),
    CISGENDER("Cisgender", "Cisgen", "предполовой, недополовой", 13),
    CISGENDERFEMALE("Cisgender Female", "Cisgenf", "женский предпол, недополовой женский", 14),
    CISGENDERMALE("Cisgender Male", "Cisgenm", "мужской предпол, недополовой мужской", 15),
    CISGENDERMAN("Cisgender Man", "Cisgenma", "предполовой мужчина, недополовой мужчина", 16),
    CISGENDERWOMAN("Cisgender Woman", "Cisgenwo", "предполовая женщина, недополовая женщина", 17),
    FEMALETOMALE("Female to Male", "Femaleto", "от женского к мужскому", 18),
    FTM("FTM", "Ftm", "женщина, хирургически, внешне, принявшая облик мужчины", 19),
    GENDERFLUID("Gender Fluid", "Genderf", "неустойчивый, «текучий»", 20),
    GENDERNONCONFORMING("Gender Nonconforming", "Gendern", "отрицающий традиционную классификацию", 21),
    GENDERQUESTIONING("Gender Questioning", "Genderq", "пол, остающийся под вопросом", 22),
    GENDERVARIANT("Gender Variant", "Genderv", "пол, допускающий несколько вариантов",23),
    GENDERQUEER("Genderqueer", "Genderqu", "свой особенный, своеобычный", 24),
    INTERSEX("Intersex", "Inters", "межполовой", 25),
    MALETOFEMALE("Male to Female", "Malet", "от мужчины к женщине", 26),
    MTF("MTF", "Mtf", "мужчина, хирургически, внешне, принявший облик женщины", 27),
    NEITHER("Neither", "Neithe", "ни тот, ни другой (из двух традиционных)", 28),
    NEUTROIS("Neutrois", "Neutro", "стремящиеся устранить половые признаки во внешнем виде", 29),
    NONBINARY("Non-binary", "Non-bi", "отрицающий систему двух полов", 30),
    OTHER("Other", "Other", "другое", 30),
    PANGENDER("Pangender", "Pangen", "всеобщеполовой", 31),
    TRANS("Trans", "Trans", "переходной к другому полу", 32),
    TRANSFEMALE("Trans Female", "Transf", "переходной к женскому половому состоянию", 33),
    TRANSMALE("Trans Male", "Transm", "переходной к мужскому половому состоянию", 34),
    TRANSMAN("Trans Man", "Transma", "переходной к мужчине", 35),
    TRANSPERSON("Trans Person", "Transp", "переходной к лицу, вне половой классификации", 36),
    TRANSWOMAN("Trans Woman", "Transw", "переходной к женщине", 37),
    TRANSASTERISK("Trans(asterisk)", "Transas", "переходной к другому полу (*", 38),
    TRANSASTERISKFEMALE("Trans(asterisk)Female", "Transasf", "переходной к женскому половому состоянию (*)", 39),
    TRANSASTERISKMALE("Trans(asterisk)Male", "Transasm", "переходной к мужскому половому состоянию(*)", 40),
    TRANSASTERISKMAN("Trans(asterisk)Man", "Transasma", "переходной к мужчине(*)", 41),
    TRANSASTERISKPERSON("Trans(asterisk)Person", "Transasp", "переходной к лицу, вне половой классификации(*)", 42),
    TRANSASTERISKWOMAN("Trans(asterisk)Woman", "Transasw", "переходной к женщине(*)", 43),
    TRANSEXUAL("Transexual", "Transe", "транссексуальный", 44),
    TRANSEXUALFEMALE("Transexual Female", "Transef", "женский траннсексуальный", 45),
    TRANSEXUALMALE("Transexual Male", "Transem", "мужской транссексуальный", 46),
    TRANSEXUALMAN("Transexual Man", "Transema", "мужчина транссексуал", 48),
    TRANSEXUALPERSON("Transexual Person", "Transep", "лицо траннсексуал", 49),
    TRANSEXUALWOMAN("Transexual Woman", "Transew", "женщина транссексуал", 50);

    /** Техническое название */
    private final String name;
    /** короткое строковое представление */
    private final String shortNameRepr;
    /** Описание */
    private final String description;
    /** id гендера */
    private final int id;

    Gender(String name, String shortNameRepr, String description, int id) {
        this.name = name;
        this.shortNameRepr = shortNameRepr;
        this.description = description;
        this.id = id;
    }

    /**
     *
     * ofName("MALE") -> MALE
     * ofName("male") -> MALE
     * ofName(null) -> IllegalArgumentException
     * ofName("Шиша Сасин") -> GenderException
     *
     * @param name - имя по которому осуществляется поиск гендера
     * @return  гендер, соответсвующий name
     * @throws GenderException
     * @throws IllegalArgumentException
     */

    public static Gender ofName(String name) throws GenderException, IllegalArgumentException {
        if (name == null){
            throw new IllegalArgumentException("name is null");
        }

        String finalName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();

        Optional<Gender> genderWithGivenName = Arrays.stream(values())
                .filter(gender -> gender.name.equals(finalName))
                .findFirst();

        if (genderWithGivenName.isEmpty()){
            throw new GenderException("not found");
        }

        return genderWithGivenName.get();
    }

    /**
     * ofShortNameRepr("M") -> MALE
     * ofShortNameRepr("m") -> male
     * ofShortNameRepr(null) -> IllegalArgumentException
     * ofShortNameRepr("в 2002 году, в прекрасном городе Тамбов...") -> GenderException
     *
     *
     * @param shortNameRepr - короткое имя гендера
     * @return гендер, который соотвествует shortNameRepr
     * @throws GenderException
     * @throws IllegalArgumentException
     */

    public static Gender ofShortNameRepr(String shortNameRepr) throws GenderException, IllegalArgumentException{
        if (shortNameRepr == null){
            throw new IllegalArgumentException("shortNameRepr is null");
        }

        String finalShortName = shortNameRepr.substring(0, 1).toUpperCase() + shortNameRepr.substring(1).toLowerCase();

        Optional<Gender> genderWithGivenShortName = Arrays.stream(values())
                .filter(gender -> gender.shortNameRepr.equals(finalShortName))
                .findFirst();

        if (genderWithGivenShortName.isEmpty()){
            throw new GenderException("not found");
        }

        return genderWithGivenShortName.get();
    }

    /**
     *
     * ofId(2) -> MALE
     * ofId(-2002) -> IllegalArgumentException
     * ofId(null) -> IllegalArgumentException
     * ofId(120) -> GenderException
     *
     * @param id - id гендера
     * @return гендер, который соответсвует id
     * @throws GenderException
     * @throws IllegalArgumentException
     */

    public static Gender ofId(Integer id) throws GenderException, IllegalArgumentException {
        if (id == null) {
            throw new IllegalArgumentException("id is null");
        }

        if (id <= 0) {
            throw new IllegalArgumentException("id <= 0");
        }

        Optional<Gender> genderWithGivenShortName = Arrays.stream(values())
                .filter(gender -> id.equals(gender.id))
                .findFirst();

        if (genderWithGivenShortName.isEmpty()){
            throw new GenderException("not found");
        }

        return genderWithGivenShortName.get();

    }

    public String getName() {
        return name;
    }

    public String getShortNameRepr() {
        return shortNameRepr;
    }

    public String getDescription() {
        return description;
    }
}
