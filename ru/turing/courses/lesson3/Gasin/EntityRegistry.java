package ru.turing.courses.lesson3.Gasin;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Реестр доменных записей
 *
 * @param <T> - тип значения
 *
 * @author diagorn
 */
public class EntityRegistry<T extends AbstractEntity> {
    /**
     * Контейнер с записями
     */
    private final Map<String, T> data = new HashMap<>();

    /**
     * Сгенерировать новый айдишник к записи
     * @return уникальный гуид
     */
    private String generateNewId() {
        return UUID.randomUUID().toString();
    }

    /**
     * Удалить записи с value == null
     * @return множество ключей таких записей
     */
    public Set<String> clearNullValues() {
        return data.keySet().stream()
                .filter(key -> data.get(key) == null)
                .peek(data::remove)
                .collect(Collectors.toSet());
    }

    /**
     * Добавить новую запись в реестр
     * @param value - доменный объект
     */
    public void add(T value) {
        data.put(generateNewId(), value);
    }

    /**
     * Удалить запись по ключу
     * @param key ключ
     * @return значение удаленной записи
     */
    public T removeByKey(String key) {
        return data.remove(key);
    }

    /**
     * Удалить записи по значению
     * @param value - значение, которое удаляется
     * @return ключи удаленных записей
     */
    public Set<String> removeByValue(T value) {
        if (value == null) {
            return clearNullValues();
        }

        return data.keySet().stream()
                .filter(key -> Objects.equals(value, data.get(key)))
                .peek(data::remove)
                .collect(Collectors.toSet());
    }

    /**
     * Полностью очистить реестр
     */
    public void clear() {
        data.clear();
    }

    /**
     * Получить значение записи по ключу
     * @param key ключ записи
     * @return Optional значения
     */
    public Optional<T> getByKey(String key) {
        return Optional.ofNullable(data.get(key));
    }

    /**
     * Найти записи по имени
     * @param name - имя доменного объекта
     * @return список доменных объектов с таким именем
     */
    public List<T> getByName(String name) {
        return data.values().stream()
                .filter(value -> value != null && Objects.equals(value.getName(), name))
                .collect(Collectors.toList());
    }

    /**
     * Найти записи по именам
     * @param names - коллекция имен доменных объектов
     * @return список доменных объектов с такими именами
     */
    public List<T> getByNames(Collection<String> names) {
        if (names == null) {
            return Collections.emptyList();
        }

        return data.values().stream()
                .filter(value -> value != null && names.contains(value.getName()))
                .collect(Collectors.toList());
    }

    /**
     * Получить записи по айдишникам
     * @param ids - коллекция идентификаторов доменных объектов
     * @return список доменных объектов с такими айдишниками
     */
    public List<T> getByIds(Collection<Long> ids) {
        if (ids == null) {
            return Collections.emptyList();
        }

        return data.values().stream()
                .filter(value -> value != null && ids.contains(value.getId()))
                .collect(Collectors.toList());
    }

    /**
     * Получить запись по идентификатору
     * @param id идентификатор
     * @return доменный объект с таким идентификатором
     */
    public List<T> getById(Long id) {
        return data.values().stream()
                .filter(value -> value != null && Objects.equals(value.getId(), id))
                .collect(Collectors.toList());
    }
}
