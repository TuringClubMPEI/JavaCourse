package ru.turing.courses.lesson3;

import ru.turing.courses.lesson2.User;
import ru.turing.courses.lesson2.animals.Animal;

import java.util.*;

//todo Задание со звездочкой - сделать Registry через generics.
// Для этого почитать, что такое дженерики и о том, как заставить класс с ними работать
// Сделать абстрактный доменный класс (похожий на Animal из прошлого урока для этого)
public class Registry<T extends User>{
    private final Map<Integer, T> storage = new HashMap<>(); //todo поменять Object, Object на то, что будет у вашего класса в примере

    /**
     *
     * @param key ключ
     * @param value значение
     */
    public void add(Integer key, T value){
        storage.put(key, value);
    }

    /**
     *
     * @param key ключ
     * @return возвращает значаение удаленной записи
     */
    public T removeByKey(Integer key){
        T value = storage.get(key);
        storage.remove(key);
        return value;
    }

    public List<Integer> removeByValue(T value){
        List<Integer> remoteKeys = new ArrayList<>();
        for (Integer key : storage.keySet()) {
            if (storage.get(key) == value){
                remoteKeys.add(key);
            }
        }
        for (Integer key : remoteKeys) {
            storage.remove(key);
        }
        return remoteKeys;
    }

    /**
     * вывод содержимого из регистра
     */
    public void print(){
        System.out.println();
        for (Integer key : storage.keySet()) {
            System.out.println(key + " : " + storage.get(key).getFio());
            System.out.println(storage.get(key).getDateOfBirth());
            storage.get(key).getAddress();
            System.out.println();
        }
    }

    public void clear(){
        storage.clear();
    }

    /**
     *
     * @param key ключ
     * @return возращает значение по ключу
     */
    public T getByKey(Integer key){
        return storage.get(key);
    }


    /**
     *
     * @param name имя по котором ищем значения
     * @return возвращает список объектов
     */
    public List<T> getByName(String name){
        List<T> values = new ArrayList<>();
        for (Integer key : storage.keySet()) {
            T user = storage.get(key);
            if (storage.get(key).getClass() != User.class){
                return null;
            }
            if (Objects.equals(user.getFio(), name)){
                values.add(user);
            }
        }
        return values;
    }

    /**
     *
     * выводит список полученный в методе getByName
     */
    public void printList(List<T> values){
        for (T key: values) {
            System.out.println(key.getFio());
            System.out.println(key.getDateOfBirth());
            key.getAddress();
        }
    }
}