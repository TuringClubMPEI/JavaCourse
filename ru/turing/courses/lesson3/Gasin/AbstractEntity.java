package ru.turing.courses.lesson3.Gasin;

/**
 * Abstract entity class to be extended
 *
 * @author diagorn
 */
public abstract class AbstractEntity {
    /**
     * identifier
     */
    private long id;
    /**
     * entity name
     */
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
