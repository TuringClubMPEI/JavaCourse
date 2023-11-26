package ru.turing.courses.lesson3.VersionA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class Registry {
    private Map<String, Animal> storage = new HashMap<>();
        /**
         * add(name, animal)
         * добавить в реестр новую запись
         *
         * @param name
         * @param animal
         */
        public void add(String name, Animal animal) {
            storage.put(name, animal);
        }

        /**
         * removeByKey(String name)
         * удалить из реестра запись по заданному ключу. Возвращать должен значение записи
         *
         * @param name
         * @param <T>
         * @return
         */
        public <T> T removeByKey(String name) {
            T value = (T) storage.get(name);
            storage.remove(name);
            return value;
        }

        /**
         * clear() - полностью очистить реестр
         */
        public void clear() {
            storage.clear();
        }

        /**
         * removeByValue(animal)
         * удалить из реестра все записи по заданному значению
         * Возвращать должен List ключей удаленных записей
         *
         * @param animal
         * @return
         */
        public List<String> removeByValue(Animal animal) {
            //Список ключей удаленных записей по заданному значению
            List<String> list = storage.entrySet().stream()
                    .filter(a -> a.getValue().equals(animal))
                    .map(e -> e.getKey()).collect(Collectors.toList());
             //удаление из реестра
            storage.keySet().removeAll(list);
            return list;
        }

        /**
         * getByKey(key)
         * найти значение по id. Возвращать значение
         *
         * @param name
         * @param <T>
         * @return
         */
        public <T> T getByKey(String name) {
            return (T)storage.get(name);
        }

        /**
         * Пустой ли регистр
         *
         * @return
         */
        public boolean isEmpty() {
            return storage.isEmpty();
        }

        /**
         * Кол-во записей
         *
         * @return
         */
        public int size() {
            return storage.size();
        }

        /**
         * Getter and Setter
         *
         * @return
         */
        public Map<String, Animal> getStorage() {
            return storage;
        }

        public void setStorage(Map<String, Animal> storage) {
            this.storage = storage;
        }

}