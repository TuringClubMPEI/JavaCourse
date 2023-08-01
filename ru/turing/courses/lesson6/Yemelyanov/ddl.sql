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
                               name varchar(100) NOT NULL,
                               id_client bigint,
                               id_employee bigint,
                               guitar_type_id bigint NOT NULL,
                               CONSTRAINT guitar_pk PRIMARY KEY (id)
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
                               password varchar(200) NOT NULL,
                               bonus_points double,
                               client_type_id bigint NOT NULL,
                               CONSTRAINT client_id_pk PRIMARY KEY (id)
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
                                 fio varchar(250) NOT NULL,
                                 email varchar(100) NOT NULL,
                                 employee_type_id bigint NOT NULL,
                                 CONSTRAINT employee_pk PRIMARY KEY (id)
);
-- ddl-end --
ALTER TABLE public.employee OWNER TO postgres;
-- ddl-end --

-- object: public.guitar_type | type: TABLE --
-- DROP TABLE IF EXISTS public.employee CASCADE;
CREATE TABLE public.guitar_type (
                                id bigint NOT NULL,
                                producer varchar(75) NOT NULL,
                                year_of_release smallint,
                                condition varchar(50),
                                type varchar(50) NOT NULL,
                                CONSTRAINT guitar_type_pk PRIMARY KEY (id)

);
-- ddl end --
ALTER TABLE public.guitar_type OWNER TO postgres;
-- ddl-end --

-- object: public.client_type | type: TABLE --
-- DROP TABLE IF EXISTS public.employee CASCADE;
CREATE TABLE public.client_type (
                                id bigint NOT NULL,
                                client_status varchar(250) NOT NULL,
                                CONSTRAINT client_type_pk PRIMARY KEY(id)
);
-- ddl end --
ALTER TABLE public.client_type OWNER TO postgres;
-- ddl-end --

-- object: public.client_type | type: TABLE --
-- DROP TABLE IF EXISTS public.employee CASCADE;
CREATE TABLE public.employee_type (
                                id bigint NOT NULL,
                                employee_post varchar(250) NOT NULL,
                                CONSTRAINT employee_type_pk PRIMARY KEY(id)
);
-- ddl end --
ALTER TABLE public.employee_type OWNER TO postgres;
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

-- object: guitar_type_fk | type: CONSTRAINT --
-- ALTER TABLE public.guitar DROP CONSTRAINT IF EXISTS client_fk CASCADE;
ALTER TABLE public.guitar ADD CONSTRAINT guitar_type_fk FOREIGN KEY (guitar_type_id)
    REFERENCES public.guitar_type (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: client_type_fk | type: CONSTRAINT --
-- ALTER TABLE public.guitar DROP CONSTRAINT IF EXISTS client_fk CASCADE;
ALTER TABLE public.client ADD CONSTRAINT client_type_fk FOREIGN KEY (client_type_id)
    REFERENCES public.client_type (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: employee_type_fk | type: CONSTRAINT --
-- ALTER TABLE public.guitar DROP CONSTRAINT IF EXISTS client_fk CASCADE;
ALTER TABLE public.employee ADD CONSTRAINT employee_type_fk FOREIGN KEY (employee_type_id)
    REFERENCES public.employee_type (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

