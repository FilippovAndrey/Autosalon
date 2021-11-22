insert into cars (name) values ('BMW X5');
insert into cars (name) values ('BMW X6');
insert into cars (name) values ('BMW X7');

insert into owner (fio, position) values ('Слава','Специалист');
insert into owner (fio, position) values ('Юра','Директор');

insert into clients (fio, phone) values ('Иванов Сергей','+79107891122');
insert into clients (fio, phone) values ('Коробкин Олег','+79107891155');
insert into clients (fio, phone) values ('Олейкин Роман','+79107891166');

insert into sold_cars (date_buy, price, count, car_id, client_id, owner_id) values ('01.10.2021', 2000000, 1, 1, 1, 1);
insert into sold_cars (date_buy, price, count, car_id, client_id, owner_id) values ('02.10.2021', 3500000, 2, 2, 2, 1);
insert into sold_cars (date_buy, price, count, car_id, client_id, owner_id) values ('02.10.2021', 2000000, 1, 3, 3, 1);
insert into sold_cars (date_buy, price, count, car_id, client_id, owner_id) values ('02.10.2021', 2000000, 1, 3, 2, 1);
insert into sold_cars (date_buy, price, count, car_id, client_id, owner_id) values ('02.10.2021', 2000000, 2, 1, 2, 1);
insert into sold_cars (date_buy, price, count, car_id, client_id, owner_id) values ('03.10.2021', 3000000, 1, 2, 1, 1);
