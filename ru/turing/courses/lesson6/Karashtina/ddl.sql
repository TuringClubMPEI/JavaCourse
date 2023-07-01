-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler version: 1.0.4
-- PostgreSQL version: 15.0
-- Project Site: pgmodeler.io
-- Model Author: ---

-- Database creation must be performed outside a multi lined SQL file.
-- These commands were put in this file only as a convenience.
--
-- object: blog | type: DATABASE --


-- object: public."user" | type: TABLE --
-- DROP TABLE IF EXISTS public."user" CASCADE;
CREATE TABLE public."user" (
                               id bigint NOT NULL,
                               avatar bytea,
                               description varchar(250),
                               username varchar(100) NOT NULL,
                               full_name varchar(250),
                               email varchar(250) NOT NULL,
                               password varchar(200) NOT NULL,
                               birth_date date,
                               CONSTRAINT id_pk PRIMARY KEY (id) );
-- ddl-end --
ALTER TABLE public."user" OWNER TO postgres;
-- ddl-end --

-- object: public.article | type: TABLE --
-- DROP TABLE IF EXISTS public.article CASCADE;
CREATE TABLE public.article (
                                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ,
                                id_user bigint,
                                title varchar(200) NOT NULL DEFAULT 'Без темы',
                                text text NOT NULL,
                                "like" smallint DEFAULT 0,
                                thumbnail bytea,
                                created_date timestamp NOT NULL DEFAULT NOW(),
                                CONSTRAINT article_pk PRIMARY KEY (id) );
-- ddl-end --
ALTER TABLE public.article OWNER TO postgres;
-- ddl-end --

-- object: public.comment | type: TABLE --
-- DROP TABLE IF EXISTS public.comment CASCADE;
CREATE TABLE public.comment (
                                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ,
                                id_article bigint,
                                id_user bigint,
                                text varchar(240) NOT NULL,
                                "like" smallint DEFAULT 0,
                                created_date timestamp NOT NULL DEFAULT NOW(),
                                number bigint NOT NULL DEFAULT 1,
                                CONSTRAINT comment_pk PRIMARY KEY (id) );
-- ddl-end --
ALTER TABLE public.comment OWNER TO postgres;
-- ddl-end --

-- object: user_fk | type: CONSTRAINT --
-- ALTER TABLE public.article DROP CONSTRAINT IF EXISTS user_fk CASCADE;
ALTER TABLE public.article ADD CONSTRAINT user_fk FOREIGN KEY (id_user)
    REFERENCES public."user" (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: public.tag | type: TABLE --
-- DROP TABLE IF EXISTS public.tag CASCADE;
CREATE TABLE public.tag (
                            id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ,
                            parent_id bigint,
                            name varchar(100) NOT NULL,
                            CONSTRAINT tag_pk PRIMARY KEY (id) );
-- ddl-end --
ALTER TABLE public.tag OWNER TO postgres;
-- ddl-end --

-- object: public.many_article_has_many_tag | type: TABLE --
-- DROP TABLE IF EXISTS public.many_article_has_many_tag CASCADE;
CREATE TABLE public.many_article_has_many_tag (
                                    id_article bigint NOT NULL,
                                    id_tag bigint NOT NULL,
                                    CONSTRAINT many_article_has_many_tag_pk PRIMARY KEY (id_article,id_tag) );
-- ddl-end --

-- object: article_fk | type: CONSTRAINT --
-- ALTER TABLE public.many_article_has_many_tag DROP CONSTRAINT IF EXISTS article_fk CASCADE;
ALTER TABLE public.many_article_has_many_tag ADD CONSTRAINT article_fk FOREIGN KEY (id_article)
    REFERENCES public.article (id) MATCH FULL
    ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: tag_fk | type: CONSTRAINT --
-- ALTER TABLE public.many_article_has_many_tag DROP CONSTRAINT IF EXISTS tag_fk CASCADE;
ALTER TABLE public.many_article_has_many_tag ADD CONSTRAINT tag_fk FOREIGN KEY (id_tag)
    REFERENCES public.tag (id) MATCH FULL
    ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: article_fk | type: CONSTRAINT --
-- ALTER TABLE public.comment DROP CONSTRAINT IF EXISTS article_fk CASCADE;
ALTER TABLE public.comment ADD CONSTRAINT article_fk FOREIGN KEY (id_article)
    REFERENCES public.article (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: user_fk | type: CONSTRAINT --
-- ALTER TABLE public.comment DROP CONSTRAINT IF EXISTS user_fk CASCADE;
ALTER TABLE public.comment ADD CONSTRAINT user_fk FOREIGN KEY (id_user)
    REFERENCES public."user" (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: parent_tag_pk | type: CONSTRAINT --
-- ALTER TABLE public.tag DROP CONSTRAINT IF EXISTS parent_tag_pk CASCADE;
ALTER TABLE public.tag ADD CONSTRAINT parent_tag_pk FOREIGN KEY (id)
    REFERENCES public.tag (id) MATCH SIMPLE
    ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --
