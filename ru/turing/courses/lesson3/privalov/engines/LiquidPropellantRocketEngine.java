package ru.turing.courses.lesson3.privalov.engines;

import java.util.Objects;

/**
 * Класс ракетного движка, работающего на дилком топливе
 */
public class LiquidPropellantRocketEngine extends RocketEngine {
    /**
     * Минимальный уровень тяги, на котором может работать двигатель, в процентах
     */
    protected int minimalThrottlingLevel;

    public LiquidPropellantRocketEngine(String serialName, int specificImpulse, String fuel, String oxidizer, int minimalThrottlingLevel) {
        super(serialName, specificImpulse, fuel, oxidizer);
        this.minimalThrottlingLevel = minimalThrottlingLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiquidPropellantRocketEngine that = (LiquidPropellantRocketEngine) o;
        return minimalThrottlingLevel == that.minimalThrottlingLevel && Objects.equals(serialName, that.serialName)
                && specificImpulse == that.specificImpulse && Objects.equals(fuel, that.fuel)
                && Objects.equals(oxidizer, that.oxidizer);
    }

    /**
     * Получить хэш. Использовал для задания ключей, поэтому дабавил в хеширование серийное наименование двигателя,
     * чтобы двигатели с одинаковым уровнем минимальной тяги 100% получили разные хэши
     */
    @Override
    public int hashCode() {
        return Objects.hash(minimalThrottlingLevel + serialName);
    }
}
