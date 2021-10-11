insert into user(email, city, country, pincode, street, password) values('abc@gmail.com','kokata','india', 710001,'office para, sector 5','123');
insert into user(email, city, country, pincode, street, password) values('xyz@gmail.com','london','UK', 123456,'garrison pub','123');

insert into item(id, img, name, price, category) values(1, 'sfd','banana','100','fruits');
insert into item(id, img, name, price, category) values(2, 'sfd','monitor','10000','electronics');
insert into item(id, img, name, price, category) values(3, 'sfd','bike','50000','vehicle');
insert into item(id, img, name, price, category) values(4, 'sfd','plane','999999','vehicle');

insert into order_item(user_id, item_id, order_time, delivery_time, payment_mode) values('abc@gmail.com', 1, '08-10-2021 22:29:38', '09-10-2021 2:29:38', 'cod');
insert into order_item(user_id, item_id, order_time, delivery_time, payment_mode) values('abc@gmail.com', 3, '08-10-2021 22:29:38', '09-10-2021 2:29:38', 'online');
