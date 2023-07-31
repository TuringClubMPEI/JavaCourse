INSERT INTO public.guitar
(price, id, producer, year_of_release, "condition", "type", "name", id_client, id_employee)
VALUES(600, 78965, 'Fender', 1998, 'new', 'electric guitar', 'Stratocaster', 10987, 0),
      (1450, 78087, 'Jackson', 2011, 'new', 'electric guitar', 'Randy Rhoads', 67009, 0),
      (990, 56013, 'Crafter', 2000, 'used', 'acoustic guitar', 'D7', 11345, 00098);

INSERT INTO public.employee
(id, salary, date_of_birth, post, fio, email)
VALUES(00098, 1190, '09.11.1987', 'guitar master', 'Че Гевара Альбертович', 'demolisher666@pentagon.com'),
      (00097, 1090, '17.02.1993', 'guitar master', 'Гвоздюков Панкратий Акакиевич', 'yasosu@mail.ru'),
      (70092, 800, '30.06.1980', 'shop assistant', 'Вычо Нахрен Блинович', 'smetankay00u@gmail.com');

INSERT INTO public.client
(id, email, username, fio, date_of_birth, "password", status)
VALUES(10987, 'fkjghjk@dgfhjklk.com', 'zabiyaka228', 'Зубенко Михаил Петрович', '01.01.1701', '1111', 'regular client'),
      (11345, 'syberia@yandex.ru', 'ghjkl;', 'Олейник Глеб Викторович', '16.07.1983', 'qwerty1234', 'VIP client'),
      (67009, 'zuxxlyes2015@gmail.com', 'SteklotaraBlizz', 'Емельянов Дмитрий Андреевич', '09.11.2002', 'qwerty098', 'regular client');


//Вывести все гитары в базе
SELECT *
FROM public.guitar;

SELECT email, fio, date_of_birth WHERE username = "SteklotaraBlizz";

SELECT id, salary, post
FROM public.employee;

SELECT producer FROM public.guitar ORDER BY price;;

UPDATE client SET "password" = 'ashgkasmio90908198' WHERE username = "SteklotaraBlizz"

SELECT * FROM client c
                  LEFT JOIN guitar g ON c.id = g.id_client;

SELECT id, salary, date_of_birth, post FROM employee e
                                                LEFT JOIN guitar g ON e.id = g.id_employee