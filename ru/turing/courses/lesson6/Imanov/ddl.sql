--
-- PostgreSQL database dump
--

-- Dumped from database version 14.7 (Ubuntu 14.7-0ubuntu0.22.04.1)
-- Dumped by pg_dump version 14.7 (Ubuntu 14.7-0ubuntu0.22.04.1)

-- Started on 2023-05-24 00:48:39 MSK

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 210 (class 1259 OID 16405)
-- Name: article; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.article (
                                id bigint NOT NULL,
                                title character varying(200) NOT NULL,
                                text text NOT NULL,
                                "like" smallint,
                                thumbnail bytea,
                                created_date timestamp without time zone,
                                id_user bigint
);


ALTER TABLE public.article OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 16477)
-- Name: article_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.article ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.article_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 217 (class 1259 OID 16481)
-- Name: article_tag; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.article_tag (
                                    id_article bigint NOT NULL,
                                    id_tag bigint NOT NULL
);


ALTER TABLE public.article_tag OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 16412)
-- Name: comment; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.comment (
                                id bigint NOT NULL,
                                text character varying(240) NOT NULL,
                                "like" smallint,
                                created_date timestamp without time zone,
                                number bigint NOT NULL,
                                id_article bigint,
                                id_user bigint
);


ALTER TABLE public.comment OWNER TO postgres;

--
-- TOC entry 214 (class 1259 OID 16478)
-- Name: comment_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.comment ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.comment_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 212 (class 1259 OID 16417)
-- Name: tag; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.tag (
                            id bigint NOT NULL,
                            name character varying(100) NOT NULL,
                            parent_id bigint
);


ALTER TABLE public.tag OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16479)
-- Name: tag_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.tag ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.tag_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 209 (class 1259 OID 16393)
-- Name: usr; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.usr (
                            id bigint NOT NULL,
                            avatar bytea,
                            decription character varying(250),
                            username character varying(100) NOT NULL,
                            full_name character varying(250),
                            email character varying(250),
                            password character varying(250),
                            brith_date date
);


ALTER TABLE public.usr OWNER TO postgres;

--
-- TOC entry 216 (class 1259 OID 16480)
-- Name: user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.usr ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);

-- TOC entry 3394 (class 0 OID 0)
-- Dependencies: 213
-- Name: article_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.article_id_seq', 4, true);


--
-- TOC entry 3395 (class 0 OID 0)
-- Dependencies: 214
-- Name: comment_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.comment_id_seq', 1, false);


--
-- TOC entry 3396 (class 0 OID 0)
-- Dependencies: 215
-- Name: tag_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.tag_id_seq', 1, true);


--
-- TOC entry 3397 (class 0 OID 0)
-- Dependencies: 216
-- Name: user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user_id_seq', 4, true);


--
-- TOC entry 3229 (class 2606 OID 16411)
-- Name: article id_article_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.article
    ADD CONSTRAINT id_article_pk PRIMARY KEY (id);


--
-- TOC entry 3231 (class 2606 OID 16416)
-- Name: comment id_comment_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT id_comment_pk PRIMARY KEY (id);


--
-- TOC entry 3227 (class 2606 OID 16399)
-- Name: usr id_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.usr
    ADD CONSTRAINT id_pk PRIMARY KEY (id);


--
-- TOC entry 3233 (class 2606 OID 16421)
-- Name: tag id_tag_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.tag
    ADD CONSTRAINT id_tag_pk PRIMARY KEY (id);


--
-- TOC entry 3235 (class 2606 OID 16485)
-- Name: article_tag many_article_has_many_tag_pk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.article_tag
    ADD CONSTRAINT many_article_has_many_tag_pk PRIMARY KEY (id_article, id_tag);


--
-- TOC entry 3239 (class 2606 OID 16486)
-- Name: article_tag article_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.article_tag
    ADD CONSTRAINT article_fk FOREIGN KEY (id_article) REFERENCES public.article(id);


--
-- TOC entry 3238 (class 2606 OID 24576)
-- Name: comment article_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT article_fk FOREIGN KEY (id_article) REFERENCES public.article(id);


--
-- TOC entry 3240 (class 2606 OID 16491)
-- Name: article_tag tag_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.article_tag
    ADD CONSTRAINT tag_fk FOREIGN KEY (id_tag) REFERENCES public.tag(id);


--
-- TOC entry 3236 (class 2606 OID 16422)
-- Name: article user_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.article
    ADD CONSTRAINT user_fk FOREIGN KEY (id_user) REFERENCES public.usr(id);


--
-- TOC entry 3237 (class 2606 OID 16432)
-- Name: comment user_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.comment
    ADD CONSTRAINT user_fk FOREIGN KEY (id_user) REFERENCES public.usr(id);


-- Completed on 2023-05-24 00:48:40 MSK

--
-- PostgreSQL database dump complete
--
