INSERT INTO public.currency(
	id, "name", course_to_rubble)
	VALUES (1, 'rouble', 1),
	(2, 'dollar', 70.25);

INSERT INTO public.contact(
	id, "name", surname, ph_number, bank_card_number, note)
	VALUES 
	(1, 'Левый', 'Чел', '+79096969069', 2200220022002200, null),
	(2, 'Правый', 'Челик', '+71414141488', 2202220222022202, null);

INSERT INTO public.debt_type(
	id, "name", note)
	VALUES 
	(1, 'исходящий', 'пользователю должны денег'),
	(2, 'входящий', 'пользователь должен денег');

INSERT INTO public.transaction_type(
	id, "name", note)
	VALUES 
	(1, 'Пополнение', null),
	(2, 'Покупка', null),
	(3, 'Долг', null),
	(4, 'Оплата долга', null),
	(5, 'Ежемесячное списание', null),
    (6, 'Перевод между счетами', null);

INSERT INTO public.account(
	id, "name", amount, currency_id, bank_name)
	VALUES 
	(1, 'Мэишная карта', 12500, 1, 'Сбер'),
	(2, 'Основная карта', 1520.73, 1, 'Тинькофф'),
	(3, 'Накопительный счет', 102000, 1, 'Тинькофф'),
	(4, 'Долларовый счет', 2.36, 2, 'Тинькофф');

INSERT INTO public.transaction(
	id, "name", amount, currency_id, date_time, type_id, from_acc_id, to_acc_id)
	VALUES 
	(1, 'Пятерочка', 540.23, 1, '10.06.2023', 2, 1, null),
	(2, 'Табачка', 179, 1, '11.06.2023', 2, 2, null),
	(3, 'Стипендия', 4800, 1, '23.06.2023', 1, null, 1),
	(5, 'Перевод между счетами', 4800, 1, '24.06.2023', 6, 1, 2),
	(4, 'Долг за еду', 365.24, 1, '12.06.2023', 4, 2, null),
	(6, 'Перевод долга', 3000, 1, '20.06.2023', 4, null, 1);

INSERT INTO public.debt(
	id, "name", amount, currency_id, date_start, date_due, contact_id, type_id)
	VALUES 
	(1, 'Долг за пиццерию', 4000, 1, null, '1.7.2023', 1, 2),
	(2, 'За еду', 269.60, 1, '10.06.2023', '15.06.2023', 1, 1);

INSERT INTO public.debt_history(
	debt_id, transact_id)
	VALUES (2, 1),
	(1, 6);





select cont."name"||' '||cont.surname as FI, 
	sum(debt.amount), dt."name"
from public.contact as cont, public.debt as debt, public.debt_type as dt
where cont.id=debt.contact_id and dt.id=debt.type_id
group by FI, dt."name";

select tt."name", sum(tr.amount)
from public.transaction as tr, public.transaction_type as tt
where tr.type_id=tt.id
group by 1
order by 2 desc;

select acc."name", count(tr.id)
from public.account as acc, public.transaction as tr
where acc.id=tr.from_acc_id or acc.id=tr.to_acc_id
group by 1
order by 2 desc;

select dt."name"||' долг', sum(d.amount)
from public.debt_type as dt, public.debt as d
where dt.id=d.type_id
group by 1
order by 2 desc;

select tt."name", count(tr.id)
from public.transaction as tr, public.transaction_type as tt
where tr.type_id=tt.id and tr.type_id=2
group by 1;

select tr."name", tr.amount, tr.date_time, debt."name"
from public.transaction as tr, public.debt as debt, public.debt_history as dh
where tr.id=dh.transact_id and dh.debt_id=debt.id and debt.id=1
order by 3 desc;