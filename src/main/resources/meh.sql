INSERT INTO customer (id, email_address, first_name, last_name) VALUES (1, 'joerogan@gmail.com', 'Joe', 'Rogan');
INSERT INTO customer (id, email_address, first_name, last_name) VALUES (2, 'wonderwoman@dc.com', 'Wonder', 'Woman');
INSERT INTO customer (id, email_address, first_name, last_name) VALUES (3, 'batman@dc.com', 'Bruce', 'Wayne');

INSERT INTO address (id, street_name, district, country, pin_code, customer_id, customer_email) VALUES (10, 'Mushroom Street', 'Umami', 'Uganda', '55555', 1, 'joerogan@gmail.com');
INSERT INTO address (id, street_name, district, country, pin_code, customer_id, customer_email) VALUES (20, 'Pasta Street', 'Ortisei', 'Italy', '12345', 2, 'wonderwoman@dc.com');
INSERT INTO address (id, street_name, district, country, pin_code, customer_id, customer_email) VALUES (30, 'Banana Street', 'Kochi', 'India', '67890', 1, 'joerogan@gmail.com');

INSERT INTO shop_order (id, amount, currency, customer_id, customer_email) VALUES (111, 20, 'EUR', 2, 'wonderwoman@dc.com');
INSERT INTO shop_order (id, amount, currency, customer_id, customer_email) VALUES (222, 22210, 'EUR', 3, 'batman@dc.com');

INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9999, 'Shield', 'Mars Tools', 'XYZ Description', 5, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9988, 'Bat Mobile', 'BMW', 'Super Car', 20000, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9986, 'Bat Suit', 'ABC Vendor', 'Leather Protection Suit', 2000, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9985, 'Kajal', 'XYZ Exporters', 'Black Kajal', 10, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9984, 'Bat Symbol', 'Someone from outerspace', 'Bat shaped piece', 200, 'EUR');
INSERT INTO item (id, item_name, seller_name, item_description, amount, currency) VALUES (9998, 'Lasso', 'Souled Store', 'ABC Description', 15, 'EUR');

INSERT INTO order_item (order_id, item_id) VALUES (111, 9999);
INSERT INTO order_item (order_id, item_id) VALUES (222, 9988);
INSERT INTO order_item (order_id, item_id) VALUES (222, 9986);
INSERT INTO order_item (order_id, item_id) VALUES (222, 9985);
INSERT INTO order_item (order_id, item_id) VALUES (222, 9984);
INSERT INTO order_item (order_id, item_id) VALUES (111, 9998);

