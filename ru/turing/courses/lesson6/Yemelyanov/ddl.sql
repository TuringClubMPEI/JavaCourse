-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler version: 1.0.4
-- PostgreSQL version: 15.0
-- Project Site: pgmodeler.io
-- Model Author: ---

-- Database creation must be performed outside a multi lined SQL file.
-- These commands were put in this file only as a convenience.
--
-- object: new_database | type: DATABASE --

-- object: public.guitar | type: TABLE --
-- DROP TABLE IF EXISTS public.guitar CASCADE;
CREATE TABLE public.guitar (
                               price bigint NOT NULL,
                               id bigint NOT NULL,
                               producer varchar(75) NOT NULL,
                               year_of_release smallint,
                               condition varchar(25),
                               type varchar(50) NOT NULL,
                               name varchar(100) NOT NULL,
                               id_client bigint,
                               id_employee bigint,
                               CONSTRAINT guitarpk PRIMARY KEY (id)
);
-- ddl-end --
ALTER TABLE public.guitar OWNER TO postgres;
-- ddl-end --

-- object: public.client | type: TABLE --
-- DROP TABLE IF EXISTS public.client CASCADE;
CREATE TABLE public.client (
                               id bigint NOT NULL,
                               email varchar(100) NOT NULL,
                               username varchar(150) NOT NULL,
                               fio varchar(250),
                               date_of_birth date,
                               password varchar(50) NOT NULL,
                               status varchar(20),
                               CONSTRAINT clientid_pk PRIMARY KEY (id)
);
-- ddl-end --
ALTER TABLE public.client OWNER TO postgres;
-- ddl-end --

-- object: public.employee | type: TABLE --
-- DROP TABLE IF EXISTS public.employee CASCADE;
CREATE TABLE public.employee (
                                 id bigint NOT NULL,
                                 salary bigint,
                                 date_of_birth date NOT NULL,
                                 post varchar(100) NOT NULL,
                                 fio varchar(250) NOT NULL,
                                 email varchar(100) NOT NULL,
                                 CONSTRAINT employeepk PRIMARY KEY (id)
);
-- ddl-end --
ALTER TABLE public.employee OWNER TO postgres;
-- ddl-end --

-- object: client_fk | type: CONSTRAINT --
-- ALTER TABLE public.guitar DROP CONSTRAINT IF EXISTS client_fk CASCADE;
ALTER TABLE public.guitar ADD CONSTRAINT client_fk FOREIGN KEY (id_client)
    REFERENCES public.client (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: employee_fk | type: CONSTRAINT --
-- ALTER TABLE public.guitar DROP CONSTRAINT IF EXISTS employee_fk CASCADE;
ALTER TABLE public.guitar ADD CONSTRAINT employee_fk FOREIGN KEY (id_employee)
    REFERENCES public.employee (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


