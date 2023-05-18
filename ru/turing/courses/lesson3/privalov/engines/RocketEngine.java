package ru.turing.courses.lesson3.privalov.engines;

/**
 * Базовый класс ракетных двигателей
 */
public class RocketEngine {
    /**
     * Серийное наименование двигателя
     */
    public String serialName;
    /**
     * Удельный импульс, в секундах
     */
    protected int specificImpulse;
    /**
     * Тип используемого топлива
     */
    protected String fuel;
    /**
     * Тип используемого окислителя
     */
    protected String oxidizer;

    public RocketEngine(String serialName, int specificImpulse, String fuel, String oxidizer) {
        this.serialName = serialName;
        this.specificImpulse = specificImpulse;
        this.fuel = fuel;
        this.oxidizer = oxidizer;
    }

    public String getSerialName() {
        return serialName;
    }
}
