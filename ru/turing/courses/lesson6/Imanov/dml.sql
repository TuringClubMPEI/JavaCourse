INSERT INTO public.user(decription, username, full_name, email, password)
VALUES ('Придумываю сложные пароли', 'PashaPythonDestroyer', 'Павел', 'BezBab@mail.ru', '12345'),
       ('Переменные с маленькой буквы', 'Шиша', 'Михаил', 'Sasin@mail.ru', '112358'),
       ('Забываю сказать тост перед тем как выпить', 'giTimur', 'Тимур', 'SNP@mail.ru', '777');

INSERT INTO public.article(title, text, id_user)
VALUES ('Что делать, если у вас не запускается sql скрипт', 'Сказать "отлично" и попытаться запустить еще раз', 2),
       ('Методика обучения студентов с помощью мангала', 'Окунуть за каждую переменную с большой буквы', 3),
       ('Как писать код, чтобы ПРы сразу же мержили', 'Никак', 4);

INSERT INTO public.tag(name)
VALUES ('программирование');

INSERT INTO public.article_tag(id_article, id_tag)
VALUES (1, 1),
       (2, 1),
       (3, 1);

/*
select запросы
*/

SELECT title FROM public.article;

/*
просто посмотрел на квадраты id :)
*/
SELECT id * id FROM public.article;

INSERT INTO public.article(title, text, id_user)
       VALUES ('Навыки которые пригодятся в жизни', 'знать первые 100 чисел, которые либо кратны 7, либо содержат 7', 3);

SELECT DISTINCT id_user FROM public.article;

SELECT title FROM public.article WHERE id_user = 3;

SELECT COUNT(*) FROM public.user;

SELECT COUNT(DISTINCT full_name) FROM public.user;

SELECT title FROM public.article ORDER BY id_user;;

UPDATE public.user SET "password" = '777777' WHERE full_name ='Тимур'

SELECT full_name, title FROM public.user u
    LEFT JOIN public.article a on u.id = a.id_user;








