-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- PostgreSQL version: 9.2
-- Project Site: pgmodeler.com.br
-- Model Author: ---

-- Database creation must be done outside an multicommand file.
-- These commands were put in this file only for convenience.
-- -- object: new_database | type: DATABASE --
-- CREATE DATABASE new_database
-- ;
-- -- ddl-end --
--

-- object: public.usr | type: TABLE --
CREATE TABLE public.usr(
                           id bigint,
                           surname varchar(40) NOT NULL,
                           usrname varchar(40) NOT NULL,
                           patronymic varchar(40) NOT NULL,
                           created_on date NOT NULL DEFAULT CURRENT_DATE,
                           email varchar(150) NOT NULL,
                           usr_psw varchar(150) NOT NULL,
                           id_stud bigint,
                           id_teacher bigint,
                           CONSTRAINT usr_id PRIMARY KEY (id),
                           CONSTRAINT email_unique UNIQUE (email)

);
-- ddl-end --
-- object: public.usr_role | type: TABLE --
CREATE TABLE public.usr_role(
                                id bigint,
                                name varchar(50) NOT NULL,
                                CONSTRAINT usr_role_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.course | type: TABLE --
CREATE TABLE public.course(
                              id bigint,
                              name varchar(150) NOT NULL,
                              begin_date date NOT NULL,
                              begin_time time NOT NULL,
                              cabinet varchar(10) NOT NULL,
                              description varchar(512),
                              id_day_week bigint,
                              CONSTRAINT course_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.first_olymptour | type: TABLE --
CREATE TABLE public.first_olymptour(
                                       id bigint,
                                       name varchar(150) NOT NULL,
                                       olymp_url varchar(200),
                                       address varchar(512) NOT NULL,
                                       start_reg date NOT NULL,
                                       end_reg date NOT NULL,
                                       begin_stage date NOT NULL,
                                       end_stage date NOT NULL,
                                       is_open_for_requests boolean NOT NULL,
                                       stages_count integer NOT NULL,
                                       comment_text text,
                                       id_olymp_format bigint,
                                       id_olymp_level bigint,
                                       CONSTRAINT first_olymptour_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.stud | type: TABLE --
CREATE TABLE public.stud(
                            id bigint,
                            stud_group varchar(15) NOT NULL,
                            id_dept bigint,
                            CONSTRAINT stud_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.teacher | type: TABLE --
CREATE TABLE public.teacher(
                               id bigint,
                               mpei_url varchar(200) NOT NULL,
                               CONSTRAINT teacher_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.course_teacher | type: TABLE --
CREATE TABLE public.course_teacher(
                                      id_course bigint,
                                      id_teacher bigint,
                                      CONSTRAINT course_teacher_pk PRIMARY KEY (id_course,id_teacher)

);
-- ddl-end --
-- object: course_fk | type: CONSTRAINT --
ALTER TABLE public.course_teacher ADD CONSTRAINT course_fk FOREIGN KEY (id_course)
    REFERENCES public.course (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: teacher_fk | type: CONSTRAINT --
ALTER TABLE public.course_teacher ADD CONSTRAINT teacher_fk FOREIGN KEY (id_teacher)
    REFERENCES public.teacher (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: public.discipline | type: TABLE --
CREATE TABLE public.discipline(
                                  id bigint,
                                  name varchar(70) NOT NULL,
                                  CONSTRAINT discipline_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.course_discipline | type: TABLE --
CREATE TABLE public.course_discipline(
                                         id_course bigint,
                                         id_discipline bigint,
                                         CONSTRAINT course_discipline_pk PRIMARY KEY (id_course,id_discipline)

);
-- ddl-end --
-- object: course_fk | type: CONSTRAINT --
ALTER TABLE public.course_discipline ADD CONSTRAINT course_fk FOREIGN KEY (id_course)
    REFERENCES public.course (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: discipline_fk | type: CONSTRAINT --
ALTER TABLE public.course_discipline ADD CONSTRAINT discipline_fk FOREIGN KEY (id_discipline)
    REFERENCES public.discipline (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: public.usr_usr_role | type: TABLE --
CREATE TABLE public.usr_usr_role(
                                    id_usr bigint,
                                    id_usr_role bigint,
                                    CONSTRAINT usr_usr_role_pk PRIMARY KEY (id_usr,id_usr_role)

);
-- ddl-end --
-- object: usr_fk | type: CONSTRAINT --
ALTER TABLE public.usr_usr_role ADD CONSTRAINT usr_fk FOREIGN KEY (id_usr)
    REFERENCES public.usr (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: usr_role_fk | type: CONSTRAINT --
ALTER TABLE public.usr_usr_role ADD CONSTRAINT usr_role_fk FOREIGN KEY (id_usr_role)
    REFERENCES public.usr_role (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: public.dept | type: TABLE --
CREATE TABLE public.dept(
                            id bigint,
                            name varchar(100) NOT NULL,
                            id_orgn bigint,
                            CONSTRAINT dept_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: stud_fk | type: CONSTRAINT --
ALTER TABLE public.usr ADD CONSTRAINT stud_fk FOREIGN KEY (id_stud)
    REFERENCES public.stud (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: usr_uq | type: CONSTRAINT --
ALTER TABLE public.usr ADD CONSTRAINT usr_uq UNIQUE (id_stud);
-- ddl-end --


-- object: teacher_fk | type: CONSTRAINT --
ALTER TABLE public.usr ADD CONSTRAINT teacher_fk FOREIGN KEY (id_teacher)
    REFERENCES public.teacher (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: usr_uq1 | type: CONSTRAINT --
ALTER TABLE public.usr ADD CONSTRAINT usr_uq1 UNIQUE (id_teacher);
-- ddl-end --


-- object: public.olymp_level | type: TABLE --
CREATE TABLE public.olymp_level(
                                   id bigint,
                                   name varchar(40) NOT NULL,
                                   CONSTRAINT olymp_level_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.lang | type: TABLE --
CREATE TABLE public.lang(
                            id bigint,
                            name varchar(50) NOT NULL,
                            CONSTRAINT lang_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.orgn | type: TABLE --
CREATE TABLE public.orgn(
                            id bigint,
                            name varchar(50) NOT NULL,
                            CONSTRAINT orgn_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.day_week | type: TABLE --
CREATE TABLE public.day_week(
                                id bigint,
                                name varchar(11) NOT NULL,
                                CONSTRAINT day_week_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.olymp_format | type: TABLE --
CREATE TABLE public.olymp_format(
                                    id bigint,
                                    name varchar(60) NOT NULL,
                                    CONSTRAINT olymp_format_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: orgn_fk | type: CONSTRAINT --
ALTER TABLE public.dept ADD CONSTRAINT orgn_fk FOREIGN KEY (id_orgn)
    REFERENCES public.orgn (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: dept_fk | type: CONSTRAINT --
ALTER TABLE public.stud ADD CONSTRAINT dept_fk FOREIGN KEY (id_dept)
    REFERENCES public.dept (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: public.stud_course | type: TABLE --
CREATE TABLE public.stud_course(
                                   id_stud bigint,
                                   id_course bigint,
                                   CONSTRAINT stud_course_pk PRIMARY KEY (id_stud,id_course)

);
-- ddl-end --
-- object: stud_fk | type: CONSTRAINT --
ALTER TABLE public.stud_course ADD CONSTRAINT stud_fk FOREIGN KEY (id_stud)
    REFERENCES public.stud (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: course_fk | type: CONSTRAINT --
ALTER TABLE public.stud_course ADD CONSTRAINT course_fk FOREIGN KEY (id_course)
    REFERENCES public.course (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: day_week_fk | type: CONSTRAINT --
ALTER TABLE public.course ADD CONSTRAINT day_week_fk FOREIGN KEY (id_day_week)
    REFERENCES public.day_week (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: public.other_olymptour | type: TABLE --
CREATE TABLE public.other_olymptour(
                                       id bigint,
                                       begin_date date NOT NULL,
                                       end_date date NOT NULL,
                                       address varchar(512) NOT NULL,
                                       description varchar(512),
                                       id_stage bigint,
                                       id_first_olymptour bigint,
                                       id_olymp_level bigint,
                                       CONSTRAINT other_olymptour_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.stage | type: TABLE --
CREATE TABLE public.stage(
                             id bigint,
                             name varchar(50) NOT NULL,
                             CONSTRAINT stage_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.team | type: TABLE --
CREATE TABLE public.team(
                            id bigint,
                            name varchar(150) NOT NULL,
                            description varchar(512),
                            id_first_olymptour bigint,
                            CONSTRAINT team_id PRIMARY KEY (id)

);
-- ddl-end --
-- object: public.stud_team | type: TABLE --
CREATE TABLE public.stud_team(
                                 id_stud bigint,
                                 id_team bigint,
                                 CONSTRAINT stud_team_pk PRIMARY KEY (id_stud,id_team)

);
-- ddl-end --
-- object: stud_fk | type: CONSTRAINT --
ALTER TABLE public.stud_team ADD CONSTRAINT stud_fk FOREIGN KEY (id_stud)
    REFERENCES public.stud (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: team_fk | type: CONSTRAINT --
ALTER TABLE public.stud_team ADD CONSTRAINT team_fk FOREIGN KEY (id_team)
    REFERENCES public.team (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: first_olymptour_fk | type: CONSTRAINT --
ALTER TABLE public.team ADD CONSTRAINT first_olymptour_fk FOREIGN KEY (id_first_olymptour)
    REFERENCES public.first_olymptour (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: public.lang_first_olymptour | type: TABLE --
CREATE TABLE public.lang_first_olymptour(
                                            id_lang bigint,
                                            id_first_olymptour bigint,
                                            CONSTRAINT lang_first_olymptour_pk PRIMARY KEY (id_lang,id_first_olymptour)

);
-- ddl-end --
-- object: lang_fk | type: CONSTRAINT --
ALTER TABLE public.lang_first_olymptour ADD CONSTRAINT lang_fk FOREIGN KEY (id_lang)
    REFERENCES public.lang (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: first_olymptour_fk | type: CONSTRAINT --
ALTER TABLE public.lang_first_olymptour ADD CONSTRAINT first_olymptour_fk FOREIGN KEY (id_first_olymptour)
    REFERENCES public.first_olymptour (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: olymp_format_fk | type: CONSTRAINT --
ALTER TABLE public.first_olymptour ADD CONSTRAINT olymp_format_fk FOREIGN KEY (id_olymp_format)
    REFERENCES public.olymp_format (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: olymp_level_fk | type: CONSTRAINT --
ALTER TABLE public.first_olymptour ADD CONSTRAINT olymp_level_fk FOREIGN KEY (id_olymp_level)
    REFERENCES public.olymp_level (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: public.course_first_olymptour | type: TABLE --
CREATE TABLE public.course_first_olymptour(
                                              id_course bigint,
                                              id_first_olymptour bigint,
                                              CONSTRAINT course_first_olymptour_pk PRIMARY KEY (id_course,id_first_olymptour)

);
-- ddl-end --
-- object: course_fk | type: CONSTRAINT --
ALTER TABLE public.course_first_olymptour ADD CONSTRAINT course_fk FOREIGN KEY (id_course)
    REFERENCES public.course (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: first_olymptour_fk | type: CONSTRAINT --
ALTER TABLE public.course_first_olymptour ADD CONSTRAINT first_olymptour_fk FOREIGN KEY (id_first_olymptour)
    REFERENCES public.first_olymptour (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: stage_fk | type: CONSTRAINT --
ALTER TABLE public.other_olymptour ADD CONSTRAINT stage_fk FOREIGN KEY (id_stage)
    REFERENCES public.stage (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: first_olymptour_fk | type: CONSTRAINT --
ALTER TABLE public.other_olymptour ADD CONSTRAINT first_olymptour_fk FOREIGN KEY (id_first_olymptour)
    REFERENCES public.first_olymptour (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


-- object: other_olymptour_uq | type: CONSTRAINT --
ALTER TABLE public.other_olymptour ADD CONSTRAINT other_olymptour_uq UNIQUE (id_first_olymptour);
-- ddl-end --


-- object: olymp_level_fk | type: CONSTRAINT --
ALTER TABLE public.other_olymptour ADD CONSTRAINT olymp_level_fk FOREIGN KEY (id_olymp_level)
    REFERENCES public.olymp_level (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --