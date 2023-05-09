package ru.turing.courses.lesson3.byazrov;

import java.util.*;

public class Registry<T extends FruitQuantity> {

    private static final Random rnd = new Random(); //final??
    private final Map<Integer, T> data = new HashMap<>();

    /**
     * Генерация ключа для записи в реестре (случайное значение от 1 до 100001)
     * @return сгенерированный ключ
     */
    private Integer generateKey() {
        return rnd.nextInt(100000) + 1;
    }

    /**
     * Добавление записи в реестр
     * @param value значение добавляемой записи
     */
    public void add(T value) {
        if (value != null) {
            data.putIfAbsent(generateKey(), value);
        }
    }

    /**
     * Удаление записи реестра по указанному ключу
     * @param key ключ, запись соответствующая которому будет удалена
     * @return  null, если передан ключ со значением null или ключу не соответствует ни одна запись,
     * или значение записи реестра, которой соответствовал указанный ключ
     */
    public T removeByKey(Integer key) {
        if (key != null) {
            return data.remove(key);
        }
        return null;
    }

    /**
     * Удаление записи реестра по указанному значению
     * @param value значение, записи соответствующие которому будут удалены
     * @return List удалённых ключей, соответствующих указанному значению или null, если передано значение null, либо
     * переданному значению не соответствует ни одной записи в реестре
     */
    public List<Integer> removeByValue(T value) {
        if (data.containsValue(value) && value != null) {
            List<Integer> deletedKeys = new ArrayList<>();
            for (Integer key : data.keySet()) {
                if (Objects.equals(data.get(key), value)) {
                    deletedKeys.add(key);
                    data.remove(key);
                }
            }
            return (deletedKeys);
        }
        return (null);
    }

    /**
     * Очистить реестр
     */
    public void clear() {
        data.clear();
    }

    /**
     * Найти значение в ресстре по ключу
     * @param key ключ
     * @return запись, соответствующую переданному key, либо null если переданному key не соответствует ни одной записи
     */
    public T getByKey(Integer key) {
        return data.getOrDefault(key, null);
    }

    /**
     * Найти значения записей реестра по имени
     * @param name передаваемое имя
     * @return значения, соответствующие переданному name, либо null если передано нулевое имя
     */
    public List<T> getByName(String name) {

        if (name != null) {
            List<T> nameEntries = new ArrayList<>();
            for (Integer key : data.keySet()) {
                if (Objects.equals(data.get(key).nameOfQuantity, name)) {
                    nameEntries.add(data.get(key));
                }
            }
            return (nameEntries);
        }
        return (null);
    }
}





