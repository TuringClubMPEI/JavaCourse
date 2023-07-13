INSERT INTO public.usr
    (description, username, full_name, email, password, birth_date)
VALUES ('Студентка первого курса НИУ МЭИ', 'ttaiika', 'Татьяна', 'ttaiika@mail.ru', '12345', '17/08/2004'),
       ('Студент первого курса НИУ МЭИ', 'daniel', 'Даниил', 'daniel@mail.ru', '777dz', '01/03/2004'),
       ('Студентка второго курса НИУ МЭИ', 'alin4ik', 'Алина', 'alinal@mail.ru', 'alina2003', '30/12/2003'),
       ('Студент третьего курса НИУ МЭИ', 'matthew', 'Матвей', 'matthew@mail.ru', '987654', '10.09.2002');

INSERT INTO public.article
(id_author, title, content, "like", created_date)
VALUES (1, 'Лекции по математическому анализу за первый курс', 'Название «Математический анализ» исторически восходит к первоначальному наименованию «Анализ бесконечно малых».', 150, NOW()),
       (2, 'Практические задания по техническому английскому', 'В Интернете не так просто найти материалы для изучения технического английского языка. Но я потратил определенное время и собрал для вас полезные обучающие ресурсы.', 389, '02/07/2023'),
       (3, 'Краткая история России', 'История России - самое краткое содержание основных событий от древности до нашего времени.', 247, NOW()),
       (4, 'ООП на языке программирования C++', 'C++ — компилируемый, статически типизированный язык программирования общего назначения.', 512, '05/07/2023'),
       (3, 'Язык программирования Java', 'Java — строго типизированный объектно-ориентированный язык программирования общего назначения, разработанный компанией Sun Microsystems (в последующем приобретённой компанией Oracle).', 600, '01/07/2023'),
       (2, 'Практические задания по дискретной математике', 'Что такое дискретная математика? Это область математики, изучающая объекты, которые могут принимать только уникальные отдельные значения. ', 100, NOW());

INSERT INTO public.comment(
    id_article, id_author, content, "like", created_date, ordinal_number)
VALUES (6, 2, 'Очень познавательно', 10, '01/07/2023', 1),
       (2, 1, 'Можно еще для немецкого?', 3, '30/06/2023', 1),
       (4, 4, 'Могли и получше написать', 7, '03/07/2023', 1),
       (1, 3, 'Не люблю вышмат', 16, '30/06/2023', 1),
       (3, 2, 'Спасибо!', 8, '30/06/2023', 1);

INSERT INTO public.tag(
    name)
VALUES ('Высшая математика'), ('Программирование');

INSERT INTO public.tag(
    parent_id, name)
VALUES (3, 'C++'), (3, 'Java'), (4, 'Математический анализ'), (4, 'Дискретная математика');

INSERT INTO public.articles_tags(
    id_article, id_tag)
VALUES (6, 1),
       (6, 6),
       (4, 3),
       (4, 2),
       (1, 1),
       (1, 5),
       (5, 4),
       (5, 2);

//Вывести всех пользователей
SELECT *
FROM public.usr

//Вывести всех авторов с названиями статей
SELECT username, full_name, a.id, title
FROM usr u, article a
WHERE (u.id = a.id_author);

//Вывести список авторов статей с тегом 'Программирование'
SELECT username, full_name, title, tag.name
FROM usr u
         JOIN article ON u.id = article.id_author
         JOIN articles_tags ON article.id = articles_tags.id_article
         JOIN tag ON articles_tags.id_tag = tag.id
WHERE tag.name = 'Программирование';

//Вывести список пользователей, их комментарии, заголовок и текст статей
SELECT username, full_name, title, article.content article_content, comment.content comment_content
FROM usr u
         JOIN article ON u.id = article.id_author
         JOIN comment ON article.id = comment.id_article;

//Вывести название тега и количество статей с этим тегом
SELECT tag.name, COUNT(*) AS article_count
FROM article a
         JOIN articles_tags on a.id = articles_tags.id_article
         JOIN tag on articles_tags.id_tag = tag.id
GROUP BY tag.name;
