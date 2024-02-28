--добавление ролей
--INSERT INTO usr_role(id,name) VALUES (1,'Участник'), (2,'Ассистент'), (3,'Администратор');
--select * from usr_role;

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
--INSERT INTO elective_course(id,name,begin_date,begin_time,cabinet,id_day_week) VALUES (1,'Олимпиадная физика','2024-02-10','17:30','Б-200',2),(2,'Олимпиадная математика','2024-02-05','18:30','М-710',4),(3,'Подготовка к олимпиадам по ТОЭ','2024-02-15','18:00','Д-207',4);
--select * from elective_course;

--распределение дисциплин по курсам
--INSERT INTO elective_course_discipline(id_elective_course,id_discipline) VALUES (1,1),(2,2),(3,3);
--select * from elective_course_discipline;

--добавление первого этапа олимпиады
--INSERT INTO olymp_tour(id,name,olymp_url,organizer,tours_amount,tour_number,start_reg,end_reg,is_open_for_requests,begin_tour,end_tour,address,id_olymp_level,id_olymp_format) VALUES (1,'Всероссийская студенческая олимпиада по математике памяти А.П. Юшкевича','https://studolymp.bmstu.ru/ru/vsomatem','МГТУ им. Баумана',1,1,'2024-10-30','2024-11-15','false','2024-11-17','2024-11-20','Россия, г. Москва, МГТУ им. Баумана',3,1),(2,'Всероссийская студенческая олимпиада по основам инженерного конструирования','https://studolymp.bmstu.ru/ru/vsooik','МГТУ им. Баумана',1,1,'2024-04-20','2024-05-14','false','2024-05-16','2024-05-20','Россия, г. Москва, МГТУ им. Баумана',3,1);
--select * from olymp_tour;

--распределение факультативов по олимпиадам
--INSERT INTO elective_course_olymp_tour(id_elective_course,id_olymp_tour) VALUES (3,2),(2,1);
--select * from elective_course_olymp_tour;

--добавление языка олимпиады
--INSERT INTO lang_olymp_tour(id_lang,id_olymp_tour) VALUES (1,1),(1,2);
--select * from lang_olymp_tour;

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


--добавление ссылок на преподавателей
--INSERT INTO teacher(id,mpei_url,id_usr) VALUES (1,'https://mpei.ru/personal/Pages/default.aspx',3),(2,'https://mpei.ru/personal/Pages/default.aspx',7),(3,'https://mpei.ru/personal/Pages/default.aspx',8);
--INSERT INTO teacher(id,mpei_url,id_usr) VALUES (4,'https://mpei.ru/personal/Pages/default.aspx',11),(5,'https://mpei.ru/personal/Pages/default.aspx',15);
--select * from teacher;


--добавление роли пользователям
--INSERT INTO usr_usr_role(id_usr,id_usr_role) VALUES (1,1),(1,2), (2,1), (3,3), (4,2),(4,1),(5,1),(6,1),(7,3),(8,3),(9,1),(10,1),(11,3),(12,1),(13,1),(13,2),(14,1),(15,3),(16,1);
--select * from usr_usr_role;

--распределение преподавателей по курсам
--INSERT INTO teacher_elective_course(id_teacher,id_elective_course) VALUES (1,1),(2,2),(3,3),(4,1);
--select * from teacher_elective_course;

--распределение пользователей на студентов
--INSERT INTO stud(id,stud_group,id_dept,id_usr) VALUES (1,'ТФ-13м-23',3,1),(2,'А-14-21',2,2),(4,'ТФ-1-21',3,4),(5,'А-14м-23',2,5),(6,'ТФ-2-22',3,6),(9,'Э-2-23',1,9),(10,'Э-4-23',1,10);
--select * from stud;

--распределение студентов на курсы
--INSERT INTO stud_elective_course(id_stud,id_elective_course) VALUES (1,1),(2,2),(4,3),(5,2),(6,3),(9,1),(10,1),(9,2),(10,2);
--select * from stud_elective_course;

--команды
--INSERT INTO team(id,name,id_teacher) VALUES (1,'Общая команда на олимпиаду по матем (МГТУ им Баумана)',1), (2,'Общая команда на олимпиаду по ТОЭ',3);
--select * from team;

--связь команд с олимпиадами
--INSERT INTO team_olymp_tour(id_team,id_olymp_tour) VALUES (1,1), (2,2);
--select * from team_olymp_tour;

--Выведем кафедры с институтами
--select dept.name,orgn.name from dept
--left join orgn on dept.id_orgn=orgn.id;

--Выведем студентов с инфой о группе, кафедре, институтом
--select usr.surname,usr.usrname,usr.patronymic,stud.stud_group,dept.name from stud
--left join usr on (stud.id_usr=usr.id)
--left join dept on (stud.id_dept=dept.id);

--Выведем студентов, которые посещают факультатив по олимпиадной физике
--select usr.surname,usr.usrname,usr.patronymic,stud.stud_group from stud
--left join usr on (stud.id_usr=usr.id)
--left join stud_elective_course on (stud.id=stud_elective_course.id_stud)
--left join elective_course on (stud_elective_course.id_elective_course=elective_course.id)
--WHERE (elective_course.name = 'Олимпиадная физика');

--Выведем факультативы с преподавателями-организаторами (с ссылками на страничку МЭИ)
--select elective_course.name,usr.surname,usr.usrname,usr.patronymic,teacher.mpei_url from elective_course
--left join teacher_elective_course on (elective_course.id=teacher_elective_course.id_elective_course)
--left join teacher on (teacher_elective_course.id_teacher=teacher.id)
--left join usr on (teacher.id_usr=usr.id)
--ORDER BY elective_course.name ASC;


--Выведем команды со студентами и олимпиадами
--select team.name,olymp_tour.name,usr.surname,usr.usrname,usr.patronymic from team
--left join team_olymp_tour on (team.id=team_olymp_tour.id_olymp_tour)
--left join olymp_tour on (team_olymp_tour.id_olymp_tour=olymp_tour.id)
--left join stud_team on (team.id=stud_team.id_team)
--left join stud on (stud_team.id_stud=stud.id_usr)
--left join usr on (stud.id_usr=usr.id)
--ORDER BY team.name ASC;