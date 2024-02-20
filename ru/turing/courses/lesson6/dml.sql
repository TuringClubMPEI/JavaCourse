--добавление ролей
--INSERT INTO usr_role(id,name) VALUES (1,'Участник'), (2,'Ассистент'), (3,'Администратор');
--select * from usr_role;

--добавление пользователей
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (1,'Иванов', 'Иван', 'Иванович','IvanovII@mpei.ru','1g2Wf!B'),(2,'Рыжова', 'Наталья', 'Сергеевна','RyzhovaNS@mpei.ru','rB1pZ%q');
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (3,'Шуварина', 'Екатерина', 'Петровна','ShuvarinaEP@mpei.ru','f5nQ*Pv'),(4,'Галоян', 'Петр', 'Алексеевич','GaloyanPA@mpei.ru','rBa#pG!');
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (5,'Еремина', 'Людмила', 'Александровна','EreminaLA@mpei.ru','uCZ)iD'),(6,'Кузнецова', 'Яна', 'Ивановна','KuznetsovaYI@mpei.ru','tB@zPh');
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (7,'Волков', 'Илья', 'Игоревич','VolkovII@mpei.ru','1f5Tn_S'),(8,'Смирнов', 'Юрий', 'Петрович','SmirnovYP@mpei.ru','u_T#z%QT^');
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (9,'Лебедева', 'Светлана', 'Александровна','LebedevaSA@mpei.ru','uCZ)iD'),(10,'Кузнецов', 'Никита', 'Сергеевич','KuznetsovNS@mpei.ru','Yc%aM!');
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (11,'Морозов', 'Егор', 'Алексеевич','MorozovEA@mpei.ru','tHC*Z)iU'),(12,'Квасникова', 'Евгения', 'Игоревна','KvasnikovaEI@mpei.ru','yV%zQCr*L');
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (13,'Морозова', 'Юлия', 'Степанова','MorozovaJS@mpei.ru','tHC*Z)iU'),(14,'Васильев', 'Евгений', 'Юрьевич','VasilievEY@mpei.ru','yV%zQCr*L');
--INSERT INTO usr(id,surname,usrname,patronymic,email,usr_psw) VALUES (15,'Попов', 'Игорь', 'Александров','PopovIA@mpei.ru','tHC*Z)iU'),(16,'Виноградова', 'Мария', 'Игоревна','VinogradovaMI@mpei.ru','yV%zQCr*L');
--select * from usr;

--добавление роли пользователям
--INSERT INTO usr_usr_role(id_usr,id_usr_role) VALUES (1,1),(1,2), (2,1), (3,3), (4,2),(4,1),(5,1),(6,1),(7,3),(8,3),(9,1),(10,1),(11,3),(12,1),(13,1),(13,2),(14,1),(15,3),(16,1);
--select * from usr_usr_role;

--добавление этапов олимпиад
--INSERT INTO stage(id,name) VALUES (1,'Финал'),(2,'Суперфинал');
--select * from stage;

--добавление институтов
--INSERT INTO orgn(id,name) VALUES (1,'ЭнМИ'), (2,'ИГВИЭ'), (3,'ИТАЭ'),(4,'ИЭВТ'),(5,'ИЭТЭ'),(6,'ИЭЭ'),(7,'ИВТИ'),(8,'ИРЭ'),(9,'ВИИ'),(10,'ИнЭИ'),(11,'ГПИ'),(12,'ИДДО');
--select * from orgn;

--добавление кафедр
--INSERT INTO dept(id,name,id_orgn) VALUES (1,'Кафедра теоретических основ электротехники',6), (2,'Кафедра математического и компьютерного моделирования',7), (3,'Кафедра Общей физики и ядерного синтеза',3);
--select * from dept;

--уровни олимпиад
--INSERT INTO olymp_level(id,name) VALUES (1,'Внутривузовский'), (2,'Межвузовский'), (3,'Всероссийский'),(4,'Международный');
--select * from olymp_level;

--формат олимпиад
--INSERT INTO olymp_format(id,name) VALUES (1,'Очный'), (2,'Смешанный'), (3,'Дистанционный');
--select * from olymp_format;

--языки
--INSERT INTO lang(id,name) VALUES (1,'Русский'), (2,'Английский'), (3,'Немецкий');
--select * from lang;

--дисциплины
--INSERT INTO discipline(id,name) VALUES (1,'Физика'), (2,'Математика'), (3,'ТОЭ'), (4,'Программирование');
--select * from discipline;

--добавление дней недели
--INSERT INTO day_week(id,name) VALUES (1,'Понедельник'), (2,'Вторник'), (3,'Среда'), (4,'Четверг'), (5,'Пятница'), (6,'Суббота'), (7,'Воскресенье');
--select * from day_week;

--добавление курсов
--INSERT INTO course(id,name,begin_date,begin_time,cabinet,id_day_week) VALUES (1,'Олимпиадная физика','2024-02-10','17:30','Б-200',2),(2,'Олимпиадная математика','2024-02-05','18:30','М-710',4),(3,'Подготовка к олимпиадам по ТОЭ','2024-02-15','18:00','Д-207',4);
--select * from course;

--добавление ссылок на преподавателей
--INSERT INTO teacher(id,mpei_url) VALUES (1,'https://mpei.ru/personal/Pages/default.aspx'),(2,'https://mpei.ru/personal/Pages/default.aspx'),(3,'https://mpei.ru/personal/Pages/default.aspx');
--INSERT INTO teacher(id,mpei_url) VALUES (4,'https://mpei.ru/personal/Pages/default.aspx'),(5,'https://mpei.ru/personal/Pages/default.aspx');
--select * from teacher;

--изменение ссылок на преподавателя
--UPDATE usr SET id_teacher = 1 WHERE id = 3;
--UPDATE usr SET id_teacher = 2 WHERE id = 7;
--UPDATE usr SET id_teacher = 3 WHERE id = 8;
--UPDATE usr SET id_teacher = 4 WHERE id = 11;
--UPDATE usr SET id_teacher = 5 WHERE id = 15;
--select * from usr;

--распределение преподавателей по курсам
--INSERT INTO course_teacher(id_course,id_teacher) VALUES (1,1),(2,2),(3,3),(1,4);
--select * from course_teacher;

--распределение дисциплин по курсам
--INSERT INTO course_discipline(id_course,id_discipline) VALUES (1,1),(2,2),(3,3);
--select * from course_discipline;

--добавление первого этапа олимпиады
--INSERT INTO first_olymptour(id,name,olymp_url,address,start_reg,end_reg,begin_stage,end_stage,is_open_for_requests,stages_count,id_olymp_format,id_olymp_level) VALUES (1,'Всероссийская студенческая олимпиада по математике памяти А.П. Юшкевича','https://studolymp.bmstu.ru/ru/vsomatem','Россия, Москва, МГТУ им. Баумана','2024-10-30','2024-11-15','2024-11-17','2024-11-20','false',1,1,3),(2,'Всероссийская студенческая олимпиада по основам инженерного конструирования','https://studolymp.bmstu.ru/ru/vsooik','Россия, Москва, МГТУ им. Баумана','2024-04-20','2024-05-14','2024-05-16','2024-05-20','false',1,1,3);
--select * from first_olymptour;

--распределение факультативов по олимпиадам
--INSERT INTO course_first_olymptour(id_course,id_first_olymptour) VALUES (3,2),(2,1);
--select * from course_first_olymptour;

--добавление языка олимпиады
--INSERT INTO lang_first_olymptour(id_lang,id_first_olymptour) VALUES (1,1),(1,2);
--select * from lang_first_olymptour;

--распределение пользователей на студентов
--INSERT INTO stud(id,stud_group,id_dept) VALUES (1,'ТФ-13м-23',3),(2,'А-14-21',2),(4,'ТФ-1-21',3),(5,'А-14м-23',2),(6,'ТФ-2-22',3),(9,'Э-2-23',1),(10,'Э-4-23',1);
--select * from stud;

--распределение студентов на курсы
--INSERT INTO stud_course(id_stud,id_course) VALUES (1,1),(2,2),(4,3),(5,2),(6,3),(9,1),(10,1),(9,2),(10,2);
--select * from stud_course;

--команды
--INSERT INTO team(id,name,id_first_olymptour) VALUES (1,'Общая команда на олимпиаду по матем (МГТУ им Баумана)',1), (2,'Общая команда на олимпиаду по ТОЭ',2);
--select * from team;

--распределение студентов по командам
--INSERT INTO stud_team(id_stud,id_team) VALUES (1,1),(5,1),(9,1),(10,1),(4,2),(1,2),(6,2);
--select * from stud_team;

--изменение ссылок на студентов
--UPDATE usr SET id_stud = 1 WHERE id = 1;
--UPDATE usr SET id_stud = 2 WHERE id = 2;
--UPDATE usr SET id_stud = 4 WHERE id = 4;
--UPDATE usr SET id_stud = 5 WHERE id = 5;
--UPDATE usr SET id_stud = 6 WHERE id = 6;
--UPDATE usr SET id_stud = 9 WHERE id = 9;
--UPDATE usr SET id_stud = 10 WHERE id = 10;
--select * from usr;

--Выведем кафедры с институтами
select dept.name, orgn.name
from dept
         left join orgn
                   on dept.id_orgn = orgn.id;

--Выведем студентов с инфой о группе, кафедре, институтом
select usr.surname, usr.usrname, usr.patronymic, stud.stud_group, dept.name
from stud
         left join usr on (stud.id = usr.id_stud)
         left join dept on (stud.id_dept = dept.id);

--Выведем студентов, которые посещают факультатив по олимпиадной физике
select usr.surname, usr.usrname, usr.patronymic, stud.stud_group
from stud
         left join usr on (stud.id = usr.id_stud)
         left join stud_course on (stud.id = stud_course.id_stud)
         left join course on (stud_course.id_course = course.id)
WHERE (course.name = 'Олимпиадная физика');

--Выведем факультативы с преподавателями-организаторами (с ссылками на страничку МЭИ)
select course.name, usr.surname, usr.usrname, usr.patronymic, teacher.mpei_url
from course
         left join course_teacher on (course.id = course_teacher.id_course)
         left join teacher on (course_teacher.id_teacher = teacher.id)
         left join usr on (teacher.id = usr.id_teacher)
ORDER BY course.name ASC;


--Выведем команды со студентами и олимпиадами
select team.name, first_olymptour.name, usr.surname, usr.usrname, usr.patronymic
from team
         left join first_olymptour on (team.id_first_olymptour = first_olymptour.id)
         left join stud_team on (team.id = stud_team.id_team)
         left join usr on (stud_team.id_stud = usr.id_stud)
ORDER BY team.name ASC;