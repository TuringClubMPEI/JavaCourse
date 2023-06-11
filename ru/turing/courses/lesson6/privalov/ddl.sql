

-- object: public.debt | type: TABLE --
-- DROP TABLE IF EXISTS public.debt CASCADE;
CREATE TABLE public.debt (
	debt_id numeric(10) NOT NULL,
	debt_name varchar(100),
	amount numeric(10,2),
	currency_id_currency numeric(10),
	date_start date,
	date_due date,
	contact_id_contact numeric(10),
	transact_id_transaction numeric(10),
	type_id_debt_type numeric(10),
	CONSTRAINT debt_pk PRIMARY KEY (debt_id)
);
-- ddl-end --
ALTER TABLE public.debt OWNER TO postgres;
-- ddl-end --

-- object: public.currency | type: TABLE --
-- DROP TABLE IF EXISTS public.currency CASCADE;
CREATE TABLE public.currency (
	currency_id numeric(10) NOT NULL,
	currency_name varchar(70),
	course_to_rubble numeric(10,7),
	CONSTRAINT currency_pk PRIMARY KEY (currency_id)
);
-- ddl-end --
ALTER TABLE public.currency OWNER TO postgres;
-- ddl-end --

-- object: public.account | type: TABLE --
-- DROP TABLE IF EXISTS public.account CASCADE;
CREATE TABLE public.account (
	acc_id numeric(10) NOT NULL,
	acc_name varchar(50),
	amount numeric(10,2),
	currency_id_currency numeric(10),
	bank_name varchar(50),
	CONSTRAINT account_pk PRIMARY KEY (acc_id)
);
-- ddl-end --
ALTER TABLE public.account OWNER TO postgres;
-- ddl-end --

-- object: public.debt_type | type: TABLE --
-- DROP TABLE IF EXISTS public.debt_type CASCADE;
CREATE TABLE public.debt_type (
	type_id numeric(10) NOT NULL,
	type_name varchar(100),
	type_note varchar(240),
	CONSTRAINT debt_type_pk PRIMARY KEY (type_id)
);
-- ddl-end --
ALTER TABLE public.debt_type OWNER TO postgres;
-- ddl-end --

-- object: public.contact | type: TABLE --
-- DROP TABLE IF EXISTS public.contact CASCADE;
CREATE TABLE public.contact (
	contact_id numeric(10) NOT NULL,
	contact_name varchar(70),
	contact_surname varchar(70),
	contact_ph_number varchar(20),
	primary_card_number numeric(16),
	contact_notes varchar(500),
	CONSTRAINT contact_pk PRIMARY KEY (contact_id)
);
-- ddl-end --
COMMENT ON COLUMN public.contact.contact_ph_number IS E'Mobile phone number of contact';
-- ddl-end --
COMMENT ON COLUMN public.contact.primary_card_number IS E'Номер приоритетной банковской карточки';
-- ddl-end --
ALTER TABLE public.contact OWNER TO postgres;
-- ddl-end --

-- object: public.transaction | type: TABLE --
-- DROP TABLE IF EXISTS public.transaction CASCADE;
CREATE TABLE public.transaction (
	transact_id numeric(10) NOT NULL,
	transact_name varchar(50),
	amount numeric(10,2),
	currency_id_currency numeric(10),
	date_time date,
	type_id_transaction_type numeric(10),
	acc_id_account numeric(10),
	acc_id_account1 numeric(10),
	CONSTRAINT transaction_pk PRIMARY KEY (transact_id)
);
-- ddl-end --
ALTER TABLE public.transaction OWNER TO postgres;
-- ddl-end --

-- object: public.transaction_type | type: TABLE --
-- DROP TABLE IF EXISTS public.transaction_type CASCADE;
CREATE TABLE public.transaction_type (
	type_id numeric(10) NOT NULL,
	type_name varchar(50),
	type_description varchar(240),
	CONSTRAINT transaction_type_pk PRIMARY KEY (type_id)
);
-- ddl-end --
ALTER TABLE public.transaction_type OWNER TO postgres;
-- ddl-end --

-- object: transaction_type_fk | type: CONSTRAINT --
-- ALTER TABLE public.transaction DROP CONSTRAINT IF EXISTS transaction_type_fk CASCADE;
ALTER TABLE public.transaction ADD CONSTRAINT transaction_type_fk FOREIGN KEY (type_id_transaction_type)
REFERENCES public.transaction_type (type_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: currency_fk | type: CONSTRAINT --
-- ALTER TABLE public.debt DROP CONSTRAINT IF EXISTS currency_fk CASCADE;
ALTER TABLE public.debt ADD CONSTRAINT currency_fk FOREIGN KEY (currency_id_currency)
REFERENCES public.currency (currency_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: currency_fk | type: CONSTRAINT --
-- ALTER TABLE public.account DROP CONSTRAINT IF EXISTS currency_fk CASCADE;
ALTER TABLE public.account ADD CONSTRAINT currency_fk FOREIGN KEY (currency_id_currency)
REFERENCES public.currency (currency_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: account_fk | type: CONSTRAINT --
-- ALTER TABLE public.transaction DROP CONSTRAINT IF EXISTS account_fk CASCADE;
ALTER TABLE public.transaction ADD CONSTRAINT account_fk FOREIGN KEY (acc_id_account)
REFERENCES public.account (acc_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: account_fk1 | type: CONSTRAINT --
-- ALTER TABLE public.transaction DROP CONSTRAINT IF EXISTS account_fk1 CASCADE;
ALTER TABLE public.transaction ADD CONSTRAINT account_fk1 FOREIGN KEY (acc_id_account1)
REFERENCES public.account (acc_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: currency_fk | type: CONSTRAINT --
-- ALTER TABLE public.transaction DROP CONSTRAINT IF EXISTS currency_fk CASCADE;
ALTER TABLE public.transaction ADD CONSTRAINT currency_fk FOREIGN KEY (currency_id_currency)
REFERENCES public.currency (currency_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: transaction_fk | type: CONSTRAINT --
-- ALTER TABLE public.debt DROP CONSTRAINT IF EXISTS transaction_fk CASCADE;
ALTER TABLE public.debt ADD CONSTRAINT transaction_fk FOREIGN KEY (transact_id_transaction)
REFERENCES public.transaction (transact_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: contact_fk | type: CONSTRAINT --
-- ALTER TABLE public.debt DROP CONSTRAINT IF EXISTS contact_fk CASCADE;
ALTER TABLE public.debt ADD CONSTRAINT contact_fk FOREIGN KEY (contact_id_contact)
REFERENCES public.contact (contact_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --

-- object: debt_type_fk | type: CONSTRAINT --
-- ALTER TABLE public.debt DROP CONSTRAINT IF EXISTS debt_type_fk CASCADE;
ALTER TABLE public.debt ADD CONSTRAINT debt_type_fk FOREIGN KEY (type_id_debt_type)
REFERENCES public.debt_type (type_id) MATCH FULL
ON DELETE SET NULL ON UPDATE CASCADE;
-- ddl-end --


