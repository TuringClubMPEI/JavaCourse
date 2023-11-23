package ru.turing.courses.lesson3.VersionA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


public class Registry {
    public static class Animal {
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
            /**
             * Список ключей удаленных записей по заданному значению
             */
            List<String> list = storage.entrySet().stream()
                    .filter(a -> a.getValue().equals(animal))
                    .map(e -> e.getKey()).collect(Collectors.toList());
            /**
             * удаление из реестра
             */
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

    public static class Panda extends Animal {
        /**
         * регион Китая
         */
        private String regionOfChina;

        /**
         * конструктор
         *
         * @param regionOfChina
         */
        public Panda(String regionOfChina) {
            this.regionOfChina = regionOfChina;
        }

        /**
         * рацион
         */
        public void printFood() {
            System.out.println("бамбук, луковицы (например, ириса и шафрана), травы");
        }

        /**
         * Getter and Setter
         *
         * @return
         */
        public String getRegionOfChina() {
            return regionOfChina;
        }

        public void setRegionOfChina(String regionOfChina) {
            this.regionOfChina = regionOfChina;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Panda panda = (Panda) o;
            return Objects.equals(regionOfChina, panda.regionOfChina);
        }

        @Override
        public int hashCode() {
            return Objects.hash(regionOfChina);
        }
    }

    public static class Stork extends Animal {
        /**
         * размах крыльев
         */
        private int wingspan;

        /**
         * конструктор
         *
         * @param wingspan
         */
        public Stork(int wingspan) {
            this.wingspan = wingspan;
        }

        /**
         * Продолжительность жизни
         */
        public void printLifeTime() {
            System.out.println("примерно 20-21 год");
        }

        /**
         * Getter and Setter
         *
         * @return
         */
        public int getWingspan() {
            return wingspan;
        }

        public void setWingspan(int wingspan) {
            this.wingspan = wingspan;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Stork stork = (Stork) o;
            return wingspan == stork.wingspan;
        }

        @Override
        public int hashCode() {
            return Objects.hash(wingspan);
        }
    }

    public static void main(String[] args) {

        Animal animals = new Animal();
        /**
         * Добавление записей
         */
        animals.add("панда", new Panda("Сычуань"));
        animals.add("аист", new Stork(120));
        animals.add("панда1", new Panda("Ганьсу"));
        animals.add("аист1", new Stork(130));
        animals.add("панда2", new Panda("Ганьсу"));
        animals.add("аист2", new Stork(125));
        animals.add("панда3", new Panda("Ганьсу"));
        animals.add("аист3", new Stork(140));

        System.out.println("Кол-во записей = " + animals.size());
        Panda panda = animals.removeByKey("панда");

        System.out.println("Удаленная запись: панда, которая проживала в " + panda.getRegionOfChina());
        System.out.println("Кол-во записей = " + animals.size());

        Stork stork = animals.removeByKey("аист2");
        System.out.println("Удаленная запись: аист, у которого размах крыльев = " + stork.getWingspan());
        System.out.println("Кол-во записей = " + animals.size());

        panda = animals.getByKey("панда1");
        System.out.println("Поиск и нахождение записи: панда, которая проживала в " + panda.getRegionOfChina());

        stork = animals.getByKey("аист");
        System.out.println("Поиск и нахождение записи: аист, у которого размах крыльев =  " + stork.getWingspan());

        System.out.println("Список ключей удаленных записей по значению: " + animals.removeByValue(panda));
        System.out.println("Кол-во записей = " + animals.size());
        System.out.println("Чистка реестра ");
        animals.clear();
        if (animals.isEmpty())
            System.out.println("Записей нет");
        else System.out.println("Записи есть");

    }

}