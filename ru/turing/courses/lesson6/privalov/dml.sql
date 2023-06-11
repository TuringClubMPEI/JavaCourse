INSERT INTO public.currency(
	currency_id, currency_name, course_to_rubble)
	VALUES (1, 'rouble', 1),
	(2, 'dollar', 70.25);

INSERT INTO public.contact(
	contact_id, contact_name, contact_surname, contact_ph_number, primary_card_number, contact_notes)
	VALUES 
	(1, 'Левый', 'Чел', '+79096969069', 2200220022002200, null),
	(2, 'Правый', 'Челик', '+71414141488', 2202220222022202, null);

INSERT INTO public.debt_type(
	type_id, type_name, type_note)
	VALUES 
	(1, 'исходящий', 'пользователю должны денег'),
	(2, 'входящий', 'пользователь должен денег');

INSERT INTO public.transaction_type(
	type_id, type_name, type_description)
	VALUES 
	(1, 'Пополнение', null),
	(2, 'Покупка', null),
	(3, 'Долг', null),
	(4, 'Оплата долга', null),
	(5, 'Ежемесячное списание', null),
    (6, 'Перевод между счетами', null);

INSERT INTO public.account(
	acc_id, acc_name, amount, currency_id_currency, bank_name)
	VALUES 
	(1, 'Мэишная карта', 12500, 1, 'Сбер'),
	(2, 'Основная карта', 1520.73, 1, 'Тинькофф'),
	(3, 'Накопительный счет', 102000, 1, 'Тинькофф'),
	(4, 'Долларовый счет', 2.36, 2, 'Тинькофф');

INSERT INTO public.transaction(
	transact_id, transact_name, amount, currency_id_currency, date_time, type_id_transaction_type, acc_id_account, acc_id_account1)
	VALUES 
	(1, 'Пятерочка', 540.23, 1, '10.06.2023', 2, 1, null),
	(2, 'Табачка', 179, 1, '11.06.2023', 2, 2, null),
	(3, 'Стипендия', 4800, 1, '23.06.2023', 1, null, 1),
	(5, 'Перевод между счетами', 4800, 1, '24.06.2023', 6, 1, 2),
	(4, 'Долг за еду', 365.24, 1, '12.06.2023', 4, 2, null);

INSERT INTO public.debt(
	debt_id, debt_name, amount, currency_id_currency, date_start, date_due, contact_id_contact, transact_id_transaction, type_id_debt_type)
	VALUES 
	(1, 'Долг за пиццерию', 4000, 1, null, '1.7.2023', 1, null, 2),
	(2, 'За еду', 269.60, 1, '10.06.2023', '15.06.2023', 1, 1, 1);





select cont.contact_name||' '||cont.contact_surname as FI, 
	sum(debt.amount), dt.type_name
from public.contact as cont, public.debt as debt, public.debt_type as dt
where cont.contact_id=debt.contact_id_contact and dt.type_id=debt.type_id_debt_type
group by FI, dt.type_name;

select trans_type.type_name, sum(trans.amount)
from public.transaction as trans, public.transaction_type as trans_type
where trans.type_id_transaction_type=trans_type.type_id
group by 1
order by 2 desc;

select acc.acc_name, count(trans.transact_id)
from public.account as acc, public.transaction as trans
where acc.acc_id=trans.acc_id_account or acc.acc_id=trans.acc_id_account1
group by 1
order by 2 desc;

select dt.type_name||' долг', sum(d.amount)
from public.debt_type as dt, public.debt as d
where dt.type_id=d.type_id_debt_type
group by 1
order by 2 desc;

select tt.type_name, count(trans.transact_id)
from public.transaction as trans, public.transaction_type as tt
where trans.type_id_transaction_type=tt.type_id and trans.type_id_transaction_type=2
group by 1;