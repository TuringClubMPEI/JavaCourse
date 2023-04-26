package ru.turing.courses.lesson3.privalov.engines;

import java.util.Objects;

/**
 * Класс твердотопливного ракетного движка
 */
public class SolidPropellantRocketEngine extends RocketEngine {
    /**
     * Длительность прожига, в секундах
     */
    protected int fireDuration;

    public SolidPropellantRocketEngine(String serialName, int specificImpulse, String fuel, String oxidizer, int fireDuration) {
        super(serialName, specificImpulse, fuel, oxidizer);
        this.fireDuration = fireDuration;
    }

    /**
     * Переопределенный метод equals с добавленными полями из родительского класса
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SolidPropellantRocketEngine that = (SolidPropellantRocketEngine) o;
        return fireDuration == that.fireDuration && Objects.equals(serialName, that.serialName)
                && specificImpulse == that.specificImpulse && Objects.equals(fuel, that.fuel)
                && Objects.equals(oxidizer, that.oxidizer);
    }

    /**
     * Получить хэш. Использовал для задания ключей, поэтому дабавил в хеширование серийное наименование двигателя,
     * чтобы двигатели с одинаковой длительностью прожига 100% получили разные хэши
     */
    @Override
    public int hashCode() {
        return Objects.hash(fireDuration + serialName);
    }
}
