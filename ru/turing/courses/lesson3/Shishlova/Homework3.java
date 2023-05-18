package ru.turing.courses.lesson3.Shishlova;

import java.util.List;


public class Homework3 {
    public static void main(String[] args) {
        // Создаем реестр, в котором хранятся объекты типа Product
        Registry<Product> productRegistry = new Registry<>();

        // Добавляем новые объекты в реестр
        Product product1 = new Product("Apple", 1.0);
        Product product2 = new Product("Banana", 2.0);
        Product product3 = new Product("Cherry", 3.0);

        productRegistry.add("apple", product1);
        productRegistry.add("banana", product2);
        productRegistry.add("cherry", product3);

        // Получаем объекты из реестра по ключу
        Product productByKey = productRegistry.getByKey("apple");
        System.out.println(productByKey); // Output: Product{name='Apple', price=1.0}

        // Получаем объекты из реестра по имени
        List<Product> productsByName = productRegistry.getByName("B");
        System.out.println(productsByName); // Output: [Product{name='Banana', price=2.0}]

        // Удаляем объекты из реестра по ключу
        Product removedProductByKey = productRegistry.removeByKey("banana");
        System.out.println(removedProductByKey); // Output: Product{name='Banana', price=2.0}

        // Удаляем объекты из реестра по значению
        List<String> removedProductsByValue = productRegistry.removeByValue(product3);
        System.out.println(removedProductsByValue); // Output: [cherry]

        // Очищаем реестр
        productRegistry.clear();
        System.out.println(productRegistry.getByKey("apple")); // Output: null
    }
}
