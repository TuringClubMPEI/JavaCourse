package ru.turing.courses.lesson3;

import java.util.*;

import ru.turing.courses.lesson2.animals.Person;

/**
 * Класс реестра.
 *
 * @param <Key>   тип ключа реестра.
 * @param <Value> тип значения записи реестра.
 */
public class Registry<Key extends Number, Value extends Person> {
    private final Map<Key, Value> storage = new HashMap<>();

    /**
     * Добавление или обновление записи в реестре.
     *
     * @param key   ключ, по которому будем добавлять запись в реестр.
     * @param value значение, которое будем добавлять в реестр.
     * @return значение предыдущей записи по этому ключу, или null, если по такому ключу записей не было.
     */
    public Value add(Key key, Value value) {
        return this.storage.put(key, value);
    }

    /**
     * Удаляет запись из реестра.
     *
     * @param key ключ, по которому удаляется запись из реестра.
     * @return значение удалённой записи реестра, или null, если по такому ключу записей не было.
     */
    public Value removeByKey(Key key) {
        return this.storage.remove(key);
    }

    /**
     * Очистка реестра.
     */
    public void clear() {
        this.storage.clear();
        ;
    }

    /**
     * Получение значения по ключу из реестра.
     *
     * @param key ключ, по которому получаем запись из реестра.
     * @return значение записи по данному ключу, или null, если по такому ключу записей не было.
     */
    public Value getByKey(Key key) {
        return this.storage.get(key);
    }

    /**
     * Получение всех значений по имени человека из реестра.
     *
     * @param name имя, по которому получаюся все записи из реестра.
     * @return множество всех записей с подходящим именем.
     */
    public Set<Value> getByName(String name) {
        Set<Value> result = new HashSet<>();
        for (Map.Entry<Key, Value> entry : this.storage.entrySet()) {
            if (entry.getValue().getName().equals(name)) {
                result.add(entry.getValue());
            }
        }
        return result;
    }

    /**
     * Вывод всех записей реестра.
     *
     * @param regexBirthday формат даты рождения людей.
     * @param regexAddress  формат адреса людей.
     */
    public void printStorage(String regexBirthday, String regexAddress) {
        for (Map.Entry<Key, Value> entry : this.storage.entrySet()) {
            entry.getValue().printPerson(regexBirthday, regexAddress);
        }
    }

    /**
     * Удаление записей по значению.
     *
     * @param value значение, записи скоторым нужно удалить.
     * @return список ключей, удаленных записей.
     */
    public List<Key> removeByValue(Value value) {
        Iterator<Map.Entry<Key, Value>> iterator = this.storage.entrySet().iterator();
        List<Key> result = new ArrayList<>();
        while(iterator.hasNext()) {
            Map.Entry<Key, Value> entry = iterator.next();
            if (entry.getValue().equals(value)) {
                result.add(entry.getKey());
                iterator.remove();
            }
        }
        return result;
    }
}
