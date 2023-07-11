INSERT INTO public."user"
    (id, description, username, full_name, email, password, birth_date)
VALUES (1, 'Студентка первого курса НИУ МЭИ', 'ttaiika', 'Татьяна', 'ttaiika@mail.ru', '12345', '17/08/2004'),
       (2, 'Студент первого курса НИУ МЭИ', 'daniel', 'Даниил', 'daniel@mail.ru', '777dz', '01/03/2004'),
       (3, 'Студентка второго курса НИУ МЭИ', 'alin4ik', 'Алина', 'alinal@mail.ru', 'alina2003', '30/12/2003'),
       (4, 'Студент третьего курса НИУ МЭИ', 'matthew', 'Матвей', 'matthew@mail.ru', '987654', '10.09.2002');

INSERT INTO public.article
    (id_user, title, text, "like", created_date)
VALUES (1, 'Лекции по математическому анализу за первый курс', '', 0, NOW()),
       (2, 'Практические задания по техническому английскому', '', 0, '02/07/2023'),
       (3, 'Краткая история России', '', 0, NOW()),
       (4, 'ООП на языке программирования C++', '', 0, '05/07/2023'),
       (3, 'Язык программирования Java', '', 0, '01/07/2023'),
       (2, 'Практические задания по дискретной математике', '', 0, NOW());

INSERT INTO public.comment(
	id_article, id_user, text, "like", created_date, "number")
	VALUES (6, 2, 'Очень познавательно', 0, '01/07/2023', 1),
	(2, 1, 'Можно еще для немецкого?', 0, '30/06/2023', 1),
	(4, 4, 'Могли и получше написать', 0, '03/07/2023', 1),
	(1, 3, 'Не люблю вышмат', 0, '30/06/2023', 1),
	(3, 2, 'Спасибо!', 0, '30/06/2023', 1);

INSERT INTO public.tag(
    name)
VALUES ('Высшая математика'), ('Программирования');

INSERT INTO public.tag(
    parent_id, name)
VALUES (3, 'C++'), (3, 'Java'), (4, 'Математический анализ'), (4, 'Дискретная математика');

INSERT INTO public.many_article_has_many_tag(
	id_article, id_tag)
	VALUES (6, 4),
	(6, 8),
	(4, 3),
	(4, 5),
	(1, 4),
	(1, 7),
	(5, 3),
	(5, 6);

//Вывести всех пользователей
SELECT *
FROM public."user"
ORDER BY id ASC

//Вывести всех авторов с названиями статей
SELECT username, full_name, id, title
FROM "user" u, article a
WHERE (u.id_user = a.id);

//Вывести список авторов статей с тегом 'Программирование'
SELECT username, full_name, title, tag.name
FROM "user" u
         JOIN article ON u.id_user = article.id_user
         JOIN many_article_has_many_tag ON article.id = many_article_has_many_tag.id_article
         JOIN tag ON many_article_has_many_tag.id_tag = tag.id
WHERE tag.name = 'Программирование';

//Вывести список пользователей, их комментарии, заголовок и текст статей
SELECT username, full_name, title, article.text, comment.text
FROM "user" u
         JOIN article ON u.id_user = article.id_user
         JOIN comment ON article.id = comment.id_article;

//Вывести название тега и количество статей с этим тегом
SELECT name, COUNT(*) AS article_count
FROM article a
         join many_article_has_many_tag on a.id = many_article_has_many_tag.id_article
         join tag on many_article_has_many_tag.id_tag = tag.id
GROUP BY tag.name;
