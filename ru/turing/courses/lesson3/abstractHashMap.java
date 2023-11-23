package ru.turing.courses.lesson3;

import java.awt.*;

public abstract class abstractHashMap {
    protected abstract void add();
    protected abstract <T extends Number> T removeByKey();
    protected abstract List removeByValue();
    protected abstract void clear();
    protected abstract <T extends Number> T getByKey();
    protected abstract List getByName();
}
