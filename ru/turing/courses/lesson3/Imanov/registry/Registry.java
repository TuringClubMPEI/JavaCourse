package ru.turing.courses.lesson3.Imanov.registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import ru.turing.courses.lesson3.Imanov.user.User;

/**
 * @author itimur
 */

public class Registry<Type extends User> {

    /**
     * Структура, в которой хранятся записи
     */
    private final Map<Integer, Type> info = new HashMap<>();

    /**
     * Добавление записи в реестр
     *
     * @param key - ключ, по которому получаем доступ к значению
     * @param value - значение
     */
    public void add(Integer key, Type value) {
        if (key == null){
            System.out.println("key is null");
        } else if (value == null || key.equals(value.getUserId())) {
            info.put(key, value);
        } else {
            System.out.println("Wrong key for user");
        }
    }

    /**
     * Удаление записи по ключу
     * @param key - ключ, по которому мы будем удалять
     * @return значение которое соответствует key
     */
    public Type removeByKey(Integer key){
        if (key == null) {
            System.out.println("key is null");
            return null;
        } else if (info.containsKey(key)){
            return info.remove(key);
        } else {
            System.out.println("key not found");
            return null;
        }
    }

    /**
     * Удаление записей по значению
     *
     * @param value - значение, по которому мы будем удалять
     * @return список ключей, соответсвующих удаленным значениям
     */
    public List<Integer> removeByValue(Type value){
        List<Integer> keyForRemovedValues = new ArrayList<>();


        info.forEach((infoKey, infoValue) -> {
            if (value == null && infoValue == null || (infoValue != null && infoValue.equals(value))) {
                keyForRemovedValues.add(infoKey);
            }
        });

        keyForRemovedValues.forEach(this::removeByKey);

        return keyForRemovedValues;
    }

    /**
     * удаление всех записей
     */
    public void clear(){
        info.clear();
    }

    /**
     * Получение значения по ключу
     *
     * @param key - ключ, по которому получаем доступ к значению
     * @return значение соответствующее ключу
     */
    public Type getByKey(Integer key){
        if (info.containsKey(key)){
            return info.get(key);
        } else {
            System.out.println("key not found");
            return null;
        }
    }

    /**
     * Получение значений по имени
     *
     * @param name - имя, по которому мы будем искать значения
     * @return список значений с именем name
     */
    public List<Type> getByName(String name){
        List<Type> valuesWithTheGivenName = new ArrayList<>();


        info.forEach((infoKey, infoValue) -> {
            if (infoValue.getUserName().equals(name)) {
                valuesWithTheGivenName.add(infoValue);
            }
        });


        return valuesWithTheGivenName;
    }

    /**
     * Вывод содержимого реестра в консоль
     */
    public void printInfo(){
        if (!info.isEmpty()) {
            info.forEach((InfoKey, InfoValue) -> {
                if (InfoValue != null) {
                    System.out.println(InfoValue.toString());
                } else {
                    System.out.println("id: " + InfoKey + ", Запись: null");
                }
            });
        } else {
            System.out.println("info is Empty");
        }
    }
}
