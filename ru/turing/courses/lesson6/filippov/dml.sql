-- Table: public.users

-- DROP TABLE IF EXISTS public.users;

CREATE TABLE IF NOT EXISTS public.users
(
    id integer NOT NULL DEFAULT nextval('users_id_seq'::regclass),
    avatar bytea,
    description character varying(250) COLLATE pg_catalog."default",
    username character varying(50) COLLATE pg_catalog."default",
    fullname character varying(150) COLLATE pg_catalog."default",
    email character varying(100) COLLATE pg_catalog."default",
    password character varying(100) COLLATE pg_catalog."default",
    age integer,
    CONSTRAINT users_pkey PRIMARY KEY (id),
    CONSTRAINT users_username_email_key UNIQUE (username, email),
    CONSTRAINT users_check CHECK (age > 0 AND age <= 130 AND email::text <> ''::text AND username::text <> ''::text AND fullname::text <> ''::text)
    )

    TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.users
    OWNER to postgres;

INSERT INTO users(Description,Username,Fullname,Email,Password,Age)
VALUES
    ('я сабинина мама','Мария','Сабигига мама витальевна','dimon.neet12@gmail.com','qwerty12345',33),
    ('нагибатор','антон','васильев антон юрьевич','mastertrsah@mail.ru','wrweqr',18),
    ('пошли все нафиг у меня 100 битков','голддигер','Зубенко Михаил Петрович','bitsmylife@mail.ru','bit123123',45),
    ('инкогнито','meow','васильева мария дмитриеевна','meowcat','meow21@gmail.com','cats2222',19);

SELECT * FROM users;

SELECT * FROM users
WHERE age<30;

SELECT Email FROM users
where username='антон';

SELECT* FROM users
WHERE LENGTH(Password)<10;

UPDATE users
SET Age=Age+20;

SELECT * FROM users;