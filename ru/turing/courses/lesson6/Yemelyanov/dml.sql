INSERT INTO public.guitar
(price, id, "name", id_client, id_employee, guitar_type_id)
VALUES(600, 78965, 'Stratocaster', 10987, 0, 100),
      (1450, 78087,  'Randy Rhoads', 67009, 0, 101),
      (990, 56013, 'D7', 11345, 00098, 102);

INSERT INTO public.employee
(id, salary, date_of_birth, fio, email, employee_type_id)
VALUES(00098, 1190, '09.11.1987', 'Че Гевара Альбертович', 'demolisher666@pentagon.com', 1),
      (00097, 1090, '17.02.1993', 'Гвоздюков Панкратий Акакиевич', 'yasosu@mail.ru', 1),
      (70092, 800, '30.06.1980', 'Вычо Нахрен Блинович', 'smetankay00u@gmail.com', 3);

INSERT INTO public.client
(id, email, username, fio, date_of_birth, "password", bonus_points, client_type_id)
VALUES(10987, 'fkjghjk@dgfhjklk.com', 'zabiyaka228', 'Зубенко Михаил Петрович', '01.01.1701', '1111', 10, 1),
      (11345, 'syberia@yandex.ru', 'ghjkl;', 'Олейник Глеб Викторович', '16.07.1983', 'qwerty1234', 300, 2),
      (67009, 'zuxxlyes2015@gmail.com', 'SteklotaraBlizz', 'Емельянов Дмитрий Андреевич', '09.11.2002', 'qwerty098', 0, 3);

INSERT INTO public.guitar_type
(id, "producer", year_of_release, "condition", "type")
VALUES(100, 'Fender', 1990, 'new', 'electric'),
      (101, 'Jacson', 2011, 'new', 'electric'),
      (102, 'Crafter', 2020, 'used', 'acoustic');

INSERT INTO public.employee_type
(id, "employee_post")
VALUES(1, 'Guitar master'),
      (2, 'Manager'),
      (3, 'Shop assistant'),
      (4, 'Accountant'),
      (5, 'Director');

INSERT INTO public.client_type
(id, "client_status")
VALUES(1, 'Regular registered'),
      (2, 'VIP registered'),
      (3, 'Unregistered'),

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