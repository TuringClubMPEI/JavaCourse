-- Database generated with pgModeler (PostgreSQL Database Modeler).
-- pgModeler version: 1.0.4
-- PostgreSQL version: 15.0
-- Project Site: pgmodeler.io
-- Model Author: ---

-- Database creation must be performed outside a multi lined SQL file.
-- These commands were put in this file only as a convenience.
-- object: blog | type: DATABASE --


-- object: public.usr | type: TABLE --
-- DROP TABLE IF EXISTS public.usr CASCADE;
CREATE TABLE public.usr (
                               id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
                               avatar bytea,
                               description varchar(250) NOT NULL,
                               username varchar(100) NOT NULL,
                               full_name varchar(250) NOT NULL,
                               email varchar(250) NOT NULL,
                               password varchar(200) NOT NULL,
                               birth_date date,
                               CONSTRAINT id_pk PRIMARY KEY (id) );
-- ddl-end --
ALTER TABLE public.usr OWNER TO postgres;
-- ddl-end --

-- object: public.article | type: TABLE --
-- DROP TABLE IF EXISTS public.article CASCADE;
CREATE TABLE public.article (
                                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY ,
                                id_author bigint NOT NULL,
                                title varchar(200) NOT NULL DEFAULT 'Без темы',
                                content text NOT NULL,
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
                                id bigint NOT NULL GENERATED ALWAYS AS IDENTITY,
                                id_article bigint NOT NULL,
                                id_author bigint NOT NULL,
                                content varchar(240) NOT NULL,
                                "like" smallint DEFAULT 0,
                                created_date timestamp NOT NULL DEFAULT NOW(),
                                ordinal_number bigint NOT NULL DEFAULT 1,
                                CONSTRAINT comment_pk PRIMARY KEY (id) );
-- ddl-end --
ALTER TABLE public.comment OWNER TO postgres;
-- ddl-end --

-- object: user_fk | type: CONSTRAINT --
-- ALTER TABLE public.article DROP CONSTRAINT IF EXISTS user_fk CASCADE;
ALTER TABLE public.article ADD CONSTRAINT user_fk FOREIGN KEY (id_author)
    REFERENCES public.usr (id) MATCH FULL
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

-- object: public.articles_tags | type: TABLE --
-- DROP TABLE IF EXISTS public.articles_tags CASCADE;
CREATE TABLE public.articles_tags (
                                    id_article bigint NOT NULL,
                                    id_tag bigint NOT NULL,
                                    CONSTRAINT articles_tags_pk PRIMARY KEY (id_article,id_tag) );
-- ddl-end --

-- object: article_fk | type: CONSTRAINT --
-- ALTER TABLE public.articles_tags DROP CONSTRAINT IF EXISTS article_fk CASCADE;
ALTER TABLE public.articles_tags ADD CONSTRAINT article_fk FOREIGN KEY (id_article)
    REFERENCES public.article (id) MATCH FULL
    ON DELETE RESTRICT ON UPDATE CASCADE;
-- ddl-end --

-- object: tag_fk | type: CONSTRAINT --
-- ALTER TABLE public.articles_tags DROP CONSTRAINT IF EXISTS tag_fk CASCADE;
ALTER TABLE public.articles_tags ADD CONSTRAINT tag_fk FOREIGN KEY (id_tag)
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
ALTER TABLE public.comment ADD CONSTRAINT user_fk FOREIGN KEY (id_author)
    REFERENCES public.usr (id) MATCH FULL
    ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: parent_tag_pk | type: CONSTRAINT --
-- ALTER TABLE public.tag DROP CONSTRAINT IF EXISTS parent_tag_pk CASCADE;
ALTER TABLE public.tag ADD CONSTRAINT parent_tag_pk FOREIGN KEY (id)
    REFERENCES public.tag (id) MATCH SIMPLE
    ON DELETE NO ACTION ON UPDATE NO ACTION;
-- ddl-end --