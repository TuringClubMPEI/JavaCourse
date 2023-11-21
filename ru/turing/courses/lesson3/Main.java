package ru.turing.courses.lesson3;

import ru.turing.courses.lesson2.User;

public class Main {
    public static void main(String[] args){
        Registry<User> registry = new Registry<>();
        User mike = new User("Майк", "20.01.1998" ,"Россия, г. Йошкар-Ола, Весенняя ул., д. 17 кв.96");
        registry.add(1, mike);
        User kate = new User("Кейт" , "03.04.2000" , "Россия, г. Череповец, Минская ул., д. 10 кв.176");
        registry.add(2, kate);
        User nikolai = new User("Николай", "04.10.2001", "Россия, г. Череповец, Минская ул., д. 10 кв.176");
        registry.add(3, nikolai);
        User oleg = new User("Олег", "25.03.1999", "Россия, г. Евпатория, Молодежный пер., д. 14 кв.40");
        registry.add(4, oleg);
        User max = new User("Макс", "11.10.2003", "Россия, г. Норильск, Новоселов ул., д. 9 кв.37");
        registry.add(5, max);
        User pavel = new User("Макс", "29.11.2002", "Россия, г. Ставрополь, Весенняя ул., д. 18 кв.171");
        registry.add(6, pavel);
        registry.printList(registry.getByName("Макс"));
        registry.print();
        //registry.getByName("Макс");
    }
}
